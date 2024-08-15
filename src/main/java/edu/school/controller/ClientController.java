package edu.school.controller;

import com.github.pagehelper.PageInfo;
import edu.school.entity.Board;
import edu.school.entity.Goods;
import edu.school.entity.Tiezi;
import edu.school.entity.User;
import edu.school.service.BoardService;
import edu.school.service.GoodsService;
import edu.school.service.TieziService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author huangpw
 * @date 2024/8/13 11:02
 * 博客： https://blog.csdn.net/qq_18167779?type=blog
 * @description:
 */
@Controller
public class ClientController {

    @Autowired
    GoodsService service;

    @Autowired
    BoardService boardService;

    @Autowired
    TieziService tieziService;

    @RequestMapping("/client/main")
    public String toHome(Model model, HttpSession session){
        User user = (User) session.getAttribute("user");
        if(user == null) {
            return "redirect:/toLogin";
        }
        model.addAttribute("url", "info");
        return "client/main";
    }

    // 失物大厅
    @RequestMapping(value = "/client/swdt",method = {RequestMethod.GET,RequestMethod.POST})
    public String pageList(Goods record,
                           @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                           @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize,
                           ModelMap modelMap){

        PageInfo<Goods> pageInfo = service.getPageList(pageNum,pageSize,record);
        modelMap.addAttribute("pageInfo",pageInfo);
        modelMap.addAttribute("record",record);

        return "/client/goods_list";
    }

    // 公告列表
    @RequestMapping(value = "/client/boards",method = {RequestMethod.GET,RequestMethod.POST})
    public String boardPageList(Board record,
                                @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize,
                                ModelMap modelMap){

        PageInfo<Board> pageInfo = boardService.getPageList(pageNum,pageSize,record);
        modelMap.addAttribute("pageInfo",pageInfo);
        modelMap.addAttribute("record",record);

        return "/client/boards";
    }

    // 校园论坛
    @RequestMapping(value = "/client/tiezi",method = {RequestMethod.GET,RequestMethod.POST})
    public String tieziPageList(Tiezi record,
                                @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                                @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize,
                                ModelMap modelMap){

        PageInfo<Tiezi> pageInfo = tieziService.getPageList(pageNum,pageSize,record);
        modelMap.addAttribute("pageInfo",pageInfo);
        modelMap.addAttribute("record",record);

        return "/client/tiezis";
    }
}
