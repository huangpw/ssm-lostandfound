package edu.school.intercepter;

import edu.school.entity.Admin;
import edu.school.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author huangpw
 * @date 2024/8/12 14:41
 * 博客： https://blog.csdn.net/qq_18167779?type=blog
 * @description:
 */
public class LoginIntercepter implements HandlerInterceptor {
    /**
     * 请求处理之前调用
     * @param httpServletRequest
     * @param httpServletResponse
     * @param o
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object o) throws Exception {
        // 获取请求的URL
        String url = request.getRequestURI();
        // URL:除了login.jsp是可以公开访问的，其它的URL都进行拦截控制
        if(url.indexOf("/login")>=0) {
            return true;
        }
        // 获取Session
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        // 判断Session中是否有用户数据，如果有，则返回true,继续向下执行
        if(user != null) {
            return true;
        }
        Admin admin = (Admin) session.getAttribute("admin");
        // 判断Session中是否有用户数据，如果有，则返回true,继续向下执行
        if(admin != null){
            return true;
        }

        // 不符合条件的给出提示信息，并转发到登录页面
        request.setAttribute("msg", "您还没有登录，请先登录！");
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }

    /**
     * 请求处理之后调用
     * @param request
     * @param httpServletResponse
     * @param o
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object o, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 整个请求处理完成之后调用
     * @param request
     * @param httpServletResponse
     * @param o
     * @param e
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object o, Exception e) throws Exception {

    }
}
