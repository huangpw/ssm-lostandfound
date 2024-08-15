package edu.school.utils;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author huangpw
 * @date 2024/8/12 9:32
 * 博客： https://blog.csdn.net/qq_18167779?type=blog
 * @description:
 */
public class WebUtils {
    public static String getRealPath() {
        return "E:\\JavaProjects\\ssm-lostandfound\\ssm-lostandfound\\src\\main\\webapp\\upload\\";
    }

    /**
     * 获取时间
     */
    public static String getDateFormat() {//把String类型的id转化Integer类型的
        Date nowTime = new Date();
        String createTime = "";
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            createTime = simpleDateFormat.format(nowTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return createTime;
    }

    /**
     * 生成订单号
     *
     * @return
     */
    public static String getOderNo() {//生成订单号
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String newDate = sdf.format(new Date());
        String result = "";
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            result += random.nextInt(10);
        }
        return newDate + result;
    }

    /**
     * 删除图片
     * @param filename
     * @return
     */
    public static boolean deleteImg(String filename) {
        if (filename == null) {
            System.out.println("文件名不能为空");
            return false;
        }
        String realPath = getRealPath();
        if(realPath == null) {
            System.out.println("获取路径失败");
            return false;
        }
        // 获取文件
        File file = new File(getRealPath() + filename);
        System.out.println(getRealPath() + filename);
        if (file.delete()) {
            System.out.println("删除文件成功");

            // 获取目录下子文件及子文件夹
            File file2 = new File(getRealPath());
            File[] files = file2.listFiles();

            if(files != null && files.length > 0) {
                readFile(files);
            }
            return true;
        } else {
            System.out.println("删除文件失败");
            return false;
        }
    }

    /**
     * 递归删除目录下的子文件及子文件夹
     * @param files
     */
    private static void readFile(File[] files) {
        if (files == null || files.length <= 0) {
            return;
        }
        for (File file : files) {
            if (file.isDirectory() && file.list().length <= 0) {
                System.out.println(file.getName());
                if (file.delete()) {
                    System.out.println("目录为空，已删除");
                } else {
                    System.out.println("删除目录失败");
                }
            }
        }
    }
}
