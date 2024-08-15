package edu.school.controller;

import com.github.pagehelper.PageInfo;
import edu.school.entity.Admin;
import edu.school.entity.Tiezi;
import edu.school.entity.User;
import edu.school.service.TieziService;
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
public class TieziController {

    @Autowired
    TieziService service;

    @RequestMapping("/tiezi/toAdd")
    public String toAdd(Model model){
        model.addAttribute("url", "tiezi");
        return "client/add_tiezi";
    }

    // 分页查询
    @RequestMapping(value = "/tiezi/list", method = {RequestMethod.GET, RequestMethod.POST})
    public String pageList(Tiezi record, HttpSession session,
                           @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                           @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                           ModelMap modelMap) {
        User user = (User) session.getAttribute("user");
        if(user != null) {
            record.setUser_id(user.getId());
        }

        PageInfo<Tiezi> pageInfo = service.getPageList(pageNum, pageSize, record);
        modelMap.addAttribute("pageInfo", pageInfo);
        modelMap.addAttribute("record", record);

        if(user != null) {
            modelMap.addAttribute("url", "tiezi");
            return "/client/tiezi_list";
        }
        Admin admin = (Admin) session.getAttribute("admin");
        if(admin != null) {
            return "/tiezi/list";
        }
        return "redirect:/toLogin";
    }

    // 新增公告
    @RequestMapping(value = "/tiezi/add", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String add(Tiezi tiezi, HttpSession session) {
        User user = (User) session.getAttribute("user");
        if(user == null) {
            return "<script>alert('请重新登录');location.href='/toLogin';</script>";
        }

        Date date = new Date();
        // 得到一个Timestamp格式的时间，存入mysql中的时间格式“yyyy/MM/dd HH:mm:ss”
        Timestamp timeStamp = new Timestamp(date.getTime());
        tiezi.setCreate_time(timeStamp);
        tiezi.setUser_id(user.getId());
        if (service.save(tiezi)) {
            return "<script>alert('发布成功');location.href='/tiezi/list';</script>";
        } else {
            return "<script>alert('发布失败');history.go(-1);</script>";
        }
    }

    // 公告修改功能
    @RequestMapping(value = "/tiezi/edit", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String edit(Tiezi record, HttpSession session) {

        if (service.update(record)) {
            return "<script>alert('修改成功');location.href='/tiezi/list';</script>";
        } else {
            return "<script>alert('修改失败');history.go(-1);</script>";
        }
    }

    // 根据id查询
    @RequestMapping(value = "/tiezi/query")
    public String query(Integer id, Model model) {
        Tiezi record = service.findById(id);
        if (record != null) {
            model.addAttribute("record", record);
        }
        return "tiezi/edit";
    }

    //@RequestMapping("/tiezi/delete")
    //public String delete(Integer id, String filename) {
    //    boolean bool = service.deleteTiezi(id);
    //    if (bool) {
    //        System.out.println(filename + "文件名称");
    //        WebUtils.deleteImg(filename);
    //    }
    //    return "redirect:/tiezi/list";
    //}

    // ajax方式删除 根据 id 和 文件名
    @RequestMapping("tiezi/delete")
    @ResponseBody
    public String ajaxDelete(Integer id) {
        boolean bool = service.deleteTiezi(id);
        if (bool) {
            return "ok";
        }
        return "fail";
    }

    // 批量删除
    @RequestMapping("/tiezi/deletemany")
    @ResponseBody
    public String deleteMany(String ids) {
        String[] arrayIds = ids.split(",");//把数组里的值逗号隔开
        //批量删除数据
        service.deleteMany(arrayIds);
        System.out.println("批量删除成功");
        return "ok";//返回给ajax
    }

    // 根据id查询
    //@RequestMapping(value = "/tiezi/detail")
    //public String queryDetail(Integer id, Model model) {
    //    Tiezi record = service.findById(id);
    //    if (record != null) {
    //        model.addAttribute("record", record);
    //    }
    //    return "tiezi/detail";
    //}
    // 前台详情页
    @RequestMapping(value = "/tiezi/detail")
    public String queryDetail2(Integer id, Model model) {
        Tiezi record = service.findById(id);
        if (record != null) {
            model.addAttribute("record", record);
        }
        return "client/tiezi_detail";
    }
}
