package edu.school.controller;

import com.github.pagehelper.PageInfo;
import edu.school.entity.Board;
import edu.school.entity.User;
import edu.school.service.BoardService;
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
public class BoardController {

    @Autowired
    BoardService service;

    @RequestMapping("/board/toAdd")
    public String toAdd(){
        return "board/add";
    }

    // 分页查询
    @RequestMapping(value = "/board/list", method = {RequestMethod.GET, RequestMethod.POST})
    public String pageList(Board record,
                           @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                           @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                           ModelMap modelMap) {
        PageInfo<Board> pageInfo = service.getPageList(pageNum, pageSize, record);
        modelMap.addAttribute("pageInfo", pageInfo);
        modelMap.addAttribute("record", record);
        return "/board/list";
    }

    // 新增公告
    @RequestMapping(value = "/board/add", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String add(Board board) {
        Date date = new Date();
        // 得到一个Timestamp格式的时间，存入mysql中的时间格式“yyyy/MM/dd HH:mm:ss”
        Timestamp timeStamp = new Timestamp(date.getTime());
        board.setCreate_time(timeStamp);
        if (service.save(board)) {
            return "<script>alert('发布成功');location.href='/board/list';</script>";
        } else {
            return "<script>alert('发布失败');history.go(-1);</script>";
        }
    }

    // 公告修改功能
    @RequestMapping(value = "/board/edit", method = RequestMethod.POST, produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String edit(Board record, HttpSession session) {
        if (service.update(record)) {
            return "<script>alert('修改成功');location.href='/board/list';</script>";
        } else {
            return "<script>alert('修改失败');history.go(-1);</script>";
        }
    }

    // 根据id查询
    @RequestMapping(value = "/board/query")
    public String query(Integer id, Model model) {
        Board record = service.findById(id);
        if (record != null) {
            model.addAttribute("record", record);
        }
        return "board/edit";
    }

    //@RequestMapping("/board/delete")
    //public String delete(Integer id, String filename) {
    //    boolean bool = service.deleteBoard(id);
    //    if (bool) {
    //        System.out.println(filename + "文件名称");
    //        WebUtils.deleteImg(filename);
    //    }
    //    return "redirect:/board/list";
    //}

    // ajax方式删除 根据 id 和 文件名
    @RequestMapping("board/delete")
    @ResponseBody
    public String ajaxDelete(Integer id) {
        boolean bool = service.deleteBoard(id);
        if (bool) {
            return "ok";
        }
        return "fail";
    }

    // 批量删除
    @RequestMapping("/board/deletemany")
    @ResponseBody
    public String deleteMany(String ids) {
        String[] arrayIds = ids.split(",");//把数组里的值逗号隔开
        //批量删除数据
        service.deleteMany(arrayIds);
        System.out.println("批量删除成功");
        return "ok";//返回给ajax
    }

    // 根据id查询
    @RequestMapping(value = "/board/detail")
    public String queryDetail(Integer id, Model model) {
        Board record = service.findById(id);
        if (record != null) {
            model.addAttribute("record", record);
        }
        return "board/detail";
    }
    // 前台详情页
    @RequestMapping(value = "/board/detail2")
    public String queryDetail2(Integer id, Model model) {
        Board record = service.findById(id);
        if (record != null) {
            model.addAttribute("record", record);
        }
        return "client/board_detail";
    }
}
