package edu.school.controller;

import com.github.pagehelper.PageInfo;
import edu.school.entity.Admin;
import edu.school.entity.Goods;
import edu.school.entity.User;
import edu.school.service.AdminService;
import edu.school.service.GoodsService;
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
public class GoodsController {

    @Autowired
    GoodsService service;

    // 去发布失物信息
    @RequestMapping("/goods/toAdd")
    public String toAdd(Model model, HttpSession session){
        User user = (User) session.getAttribute("user");
        if(user == null) {
            return "redirect:/toLogin";
        }
        model.addAttribute("url", "goods");
        return "client/add_goods";
    }

    //分页查询失物信息
    @RequestMapping(value = "/goods/list",method = {RequestMethod.GET,RequestMethod.POST})
    public String pageList(Goods record, HttpSession session,
                           @RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                           @RequestParam(value = "pageSize",defaultValue = "5")Integer pageSize,
                           ModelMap modelMap){
        User user = (User) session.getAttribute("user");
        if(user != null) {
            record.setUser_id(user.getId());
        }

        PageInfo<Goods> pageInfo = service.getPageList(pageNum,pageSize,record);
        modelMap.addAttribute("pageInfo",pageInfo);
        modelMap.addAttribute("record",record);
        if(user != null) {
            modelMap.addAttribute("url","goods");
            return "/client/goods_list";
        }
        return "/goods/list";
    }
    //发布失物信息
    @RequestMapping(value = "/goods/add",method = RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String save(Goods record, HttpSession session){
        User user = (User) session.getAttribute("user");
        if(user == null) {
            return "<script>alert('请先登录');location.href='/toLogin';</script>";
        }

        Date date = new Date();
        // 得到一个Timestamp格式的时间，存入mysql中的时间格式“yyyy/MM/dd HH:mm:ss”
        Timestamp timeStamp = new Timestamp(date.getTime());
        record.setCreate_time(timeStamp);
        record.setUser_id(user.getId());
        if(service.save(record)){
            return "<script>alert('发布成功');location.href='/goods/list';</script>";
        }else{
            return "<script>alert('发布失败');history.go(-1);</script>";
        }

    }
    //修改失物信息
    @RequestMapping(value = "/goods/edit",method =RequestMethod.POST,produces = "text/html;charset=UTF-8")
    @ResponseBody
    public String edit(Goods record,HttpSession session){
        if(service.update(record)){
            //Goods goods= (Goods) session.getAttribute("goods");
            //if(goods!=null){
            //    return "<script>alert('修改成功');location.href='/goods/myinfo';</script>";
            //}
            return "<script>alert('修改成功');location.href='/goods/list';</script>";
        }else{
            return "<script>alert('修改失败');history.go(-1);</script>";
        }
    }

    //回显失物信息
    @RequestMapping(value = "/goods/query")
    public String query(Integer id, Model model, HttpSession session){
        Goods record=service.findById(id);
        if(record != null){
            model.addAttribute("record",record);
        }
        User user = (User) session.getAttribute("user");
        if(user != null) {
            model.addAttribute("url","goods");
            return "client/edit_goods";
        }
        return "goods/edit";
    }

    // 失物详情
    @RequestMapping(value = "/goods/detail")
    public String getDetail(Integer id, Model model){
        Goods record=service.findById(id);
        if(record != null){
            model.addAttribute("record",record);
        }
        return "client/goods_detail";
    }

    @RequestMapping("/goods/delete")
    @ResponseBody
    public String ajaxdelete(Integer id,String filename) {
        boolean b =service.deleteGoods(id);
        System.out.println(filename+"文件名称");
        WebUtils.deleteImg(filename);
        if(b){
            return "ok";
        }
        return "fail";

    }

    //批量删除
    @RequestMapping("/goods/deletemany")
    @ResponseBody
    public String  deletemany(String ids) {
        System.err.println(ids);
        String[] arrayids=ids.split(",");//把数组里的值逗号隔开
        System.out.println("批量删除成功");
        for (int i=0;i<arrayids.length;i++){
            Goods goods=service.findById(Integer.parseInt(arrayids[i]));
            WebUtils.deleteImg(goods.getGods_img());
        }
        service.deleteMany(arrayids);
        return "ok";//返回给ajax
    }

}
