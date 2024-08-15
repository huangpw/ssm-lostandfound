package edu.school.controller;

import edu.school.utils.WebUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

/**
 * @author huangpw
 * @date 2024/8/9 9:54
 * 博客： https://blog.csdn.net/qq_18167779?type=blog
 * @description:
 */
@Controller
public class UtilsController {

    /**
     * 文件上传
     * @param request
     * @param response
     * @param file
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/utils/add", method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, Object> addBannerAct(HttpServletRequest request, HttpServletResponse response, @RequestParam(value = "file", required = false) MultipartFile file)
            throws Exception {
        String prefix = ""; // 文件后缀
        String dateStr = ""; // 日期字符串
        //保存上传
        OutputStream out = null; // 输出流
        InputStream fileInput = null; // 文件流
        String filepath = ""; // 文件路径
        String originalName = ""; // 旧文件名
        try {
            if (file != null) {
                originalName = file.getOriginalFilename(); // 获取原始文件名
                prefix = originalName.substring(originalName.lastIndexOf(".") + 1); // 获取文件后缀
                dateStr = System.currentTimeMillis() / 1000 + ""; // 获取当前时间戳作为文件名
                filepath = WebUtils.getRealPath() + dateStr + "." + prefix; // 整个文件路径
                File files = new File(filepath); // 创建文件
                //打印查看上传路径
                System.out.println(filepath);
                if (!files.getParentFile().exists()) { // 如果文件所在的目录不存在，则创建目录
                    files.getParentFile().mkdirs(); // 创建目录
                }
                file.transferTo(files); // 保存文件
            }
        } catch (Exception e) {
            e.printStackTrace(); // 输出异常信息
        } finally {
            try {
                if (out != null) {
                    out.close(); // 关闭输出流
                }
                if (fileInput != null) {
                    fileInput.close(); // 关闭文件流
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        Map<String, Object> pathMap = new HashMap<>(); // 返回数据
        Map<String, Object> map = new HashMap<>(); // 返回数据
        map.put("code", 0);
        map.put("msg", "1");
        map.put("data", pathMap);
        pathMap.put("src", dateStr + "." + prefix);
        return map;
    }


    //富文本上传
    @RequestMapping(value="/uploadconimage",method=RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> uploadconimage(HttpServletRequest request,@RequestParam MultipartFile file) {
        Map<String,Object> mv=new HashMap<String, Object>();
        Map<String,String> mvv=new HashMap<String, String>();
        try {

            /*  String rootPath ="D:\\Program Files\\idea_projects\\pet_web\\src\\main\\webapp\\upload\\";*/
            String rootPath =WebUtils.getRealPath();
            Calendar date = Calendar.getInstance(); //Calendar.getInstance()是获取一个Calendar对象并可以进行时间的计算，时区的指定
            String originalFile = file.getOriginalFilename(); //获得文件最初的路径
            String uuid = UUID.randomUUID().toString();    //UUID转化为String对象
            String newfilename=date.get(Calendar.YEAR)+""+(date.get(Calendar.MONTH)+1)+""+date.get(Calendar.DATE)+uuid.replace("-", "")+originalFile;
            //得到完整路径名
            File newFile = new File(rootPath+newfilename);
            /*文件不存在就创建*/
            if(!newFile.getParentFile().exists()){
                newFile.getParentFile().mkdirs();
            }
            String filename=originalFile.substring(0, originalFile.indexOf("."));
            System.out.println(originalFile);
            System.out.println(filename);
            file.transferTo(newFile);
            System.out.println("newFile : "+newFile);
            /*    filepath=WebUtils.getRealPath()+datePath+"/"+dateStr+"." + prefix;*/
            /*   String urlpat= "/images/"+ newfilename;*/
            /*     String urlpat=WebUtils.getRealPath()+newfilename;*/
            String urlpat= "/upload/"+ newfilename;
            mvv.put("src", urlpat);
            mvv.put("title",newfilename);
            mv.put("code", 0);
            mv.put("msg", "上传成功");
            mv.put("data", mvv);
            return mv;
        } catch (Exception e) {
            e.printStackTrace();
            mv.put("success", 1);
            return mv;
        }
    }
}
