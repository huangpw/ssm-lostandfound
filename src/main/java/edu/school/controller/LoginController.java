package edu.school.controller;

import edu.school.entity.Admin;
import edu.school.entity.User;
import edu.school.service.AdminService;
import edu.school.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author huangpw
 * @date 2024/8/9 9:54
 * 博客： https://blog.csdn.net/qq_18167779?type=blog
 * @description:
 */
@Controller
public class LoginController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private UserService userService;

    /**
     * 注册页面
     * @return
     */
    @RequestMapping(value = "/toRegister")
    public String toRegister(){
       return "register";
    }

    /**
     * 登录页面
     * @return
     */
    @RequestMapping(value = "/toLogin")
    public String toLogin(){
        return "login";
    }

    /**
     * 登录接口
     * @param admin
     * @param request
     * @param model
     * @return
     */
    //@RequestMapping(value = "/login")
    //public String login(Admin admin, HttpServletRequest request, Model model){
    //    // 管理员登录
    //    Admin a = new Admin();
    //    a.setUsername(admin.getUsername());
    //    a.setPwd(admin.getPwd());
    //    Admin record = adminService.login(a);
    //    if(admin != null) {
    //        HttpSession session = request.getSession();
    //        session.setAttribute("admin", record);
    //        session.setAttribute("type", 2);
    //        return "redirect:/toMain";
    //    }
    //    model.addAttribute("msg","管理员用户名或者密码错误");
    //    return "login";
    //}
    @RequestMapping(value = "/login")
    public String login(String username, String pwd, Integer type, HttpSession session, Model model){

        if(type == 1) {
            User user = userService.login(username, pwd);
            if(user != null) {
                session.setAttribute("user", user);
                session.setAttribute("type", 1);
                User record = userService.findById(user.getId());
                // 存储到session，才能使用redirect
                session.setAttribute("record", record);
                model.addAttribute("url", "info");
                //存储到model，删除redirect:
                //model.addAttribute("record", record);
                //return "redirect:/client/main";
                return "/client/main";
            }
            model.addAttribute("msg","学号或者密码错误");
            return "login";
        } else {
            // 管理员登录
            Admin admin = new Admin();
            admin.setUsername(username);
            admin.setPwd(pwd);
            Admin record = adminService.login(admin);
            if(admin != null) {
                session.setAttribute("admin", record);
                session.setAttribute("type", 4);
                return "redirect:/toMain";
            }
            model.addAttribute("msg","用户名或者密码错误");
            return "login";
        }
    }

    /**
     * 后台首页
     * @return
     */
    @RequestMapping("/toMain")
    public String toMain(){
        return "main";
    }

    /**
     * 控制台页面
     * @return
     */
    @RequestMapping("/toConsole")
    public String toConsole(){
        return "console";
    }

    /**
     * 退出登录
     * @param session
     * @return
     */
    @RequestMapping("/loginout")
    public String loginout(HttpSession session){
        session.invalidate();
        return "redirect:/toLogin";

    }

}
