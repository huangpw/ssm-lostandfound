package edu.school.controller;

import com.github.pagehelper.PageInfo;
import edu.school.entity.User;
import edu.school.service.UserService;
import edu.school.utils.WebUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;

/**
 * @author huangpw
 * @date 2024/8/9 9:54
 * 博客： https://blog.csdn.net/qq_18167779?type=blog
 * @description:
 */
@Controller
public class UserController {

    @Autowired
    UserService service;

    /**
     * 用户列表
     *
     * @param record
     * @param pageNum
     * @param pageSize
     * @param modelMap
     * @return
     */
    @RequestMapping(value = "/user/list", method = {RequestMethod.GET, RequestMethod.POST})
    public String pageList(User record,
                           @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                           @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                           ModelMap modelMap) {
        PageInfo<User> pageInfo = service.getPageList(pageNum, pageSize, record);
        modelMap.addAttribute("pageInfo", pageInfo);
        modelMap.addAttribute("record", record);
        return "/user/list";
    }

    /**
     * 注册用户接口
     *
     * @param user
     * @return
     */
    @RequestMapping(value = "/user/add", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String add(User user) {
        Date date = new Date();
        // 得到一个Timestamp格式的时间，存入mysql中的时间格式“yyyy/MM/dd HH:mm:ss”
        Timestamp timeStamp = new Timestamp(date.getTime());
        user.setCreate_time(timeStamp);
        if (service.register(user)) {
            return "<script>alert('注册成功');location.href='/toLogin';</script>";
        } else {
            return "<script>alert('注册失败');history.go(-1);</script>";
        }
    }

    /**
     * 查询用户
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/user/query")
    public String query(Integer id, Model model) {
        User record = service.findById(id);
        if (record != null) {
            model.addAttribute("record", record);
        }
        return "user/edit";
    }

    /**
     * 我的个人信息查询
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "/user/info")
    public String query(Model model, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if(user != null) {
            User record = service.findById(user.getId());
            model.addAttribute("record", record);
            model.addAttribute("url", "info");
            return "client/main";
        }
        return "redirect:/toLogin";
    }

    /**
     * 修改用户
     *
     * @param record
     * @return
     */
    @RequestMapping(value = "/user/edit", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String edit(User record, HttpSession session) {
        if (service.update(record)) {
            Object user = session.getAttribute("user");
            if(user != null) {
                return "<script>alert('修改成功');location.href='/user/info';</script>";
            }
            return "<script>alert('修改成功');location.href='/user/list';</script>";
        } else {
            return "<script>alert('修改失败');history.go(-1);</script>";
        }
    }

    @RequestMapping("/user/delete")
    public String delete(Integer id, String filename) {
        boolean bool = service.deleteUserById(id);
        if (bool) {
            System.out.println(filename + "文件名称");
            WebUtils.deleteImg(filename);
        }
        return "redirect:/user/list";
    }

    /**
     * ajax方式删除
     *
     * @param id
     * @param filename
     * @return
     */
    @RequestMapping("user/delete1")
    @ResponseBody
    public String ajaxDelete(Integer id, String filename) {
        boolean bool = service.deleteUserById(id);
        if (bool) {
            System.out.println(filename + "文件名称");
            WebUtils.deleteImg(filename);
            return "ok";
        }
        return "fail";
    }

    /**
     * 批量删除
     *
     * @param ids
     * @return
     */
    @RequestMapping("/user/deletemany")
    @ResponseBody
    public String deletemany(String ids) {
        System.err.println(ids);
        String[] arrayIds = ids.split(",");//把数组里的值逗号隔开
        // 批量删除图片
        for (int i = 0; i < arrayIds.length; i++) {
            User user = service.findById(Integer.parseInt(arrayIds[i]));
            WebUtils.deleteImg(user.getPhoto());
        }
        //批量删除数据
        service.deleteMany(arrayIds);
        System.out.println("批量删除成功");
        return "ok";//返回给ajax
    }
}
