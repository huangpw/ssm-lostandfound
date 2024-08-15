package edu.school.service;

import com.github.pagehelper.PageInfo;
import edu.school.entity.User;
import edu.school.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author huangpw
 * @date 2024/8/9 9:48
 * 博客： https://blog.csdn.net/qq_18167779?type=blog
 * @description:
 */
public interface UserService {
    /**
     * 注册
     * @param user
     * @return
     */
    boolean register(User user);

    /**
     * 用户列表
     * @param pageNum
     * @param pageSize
     * @param record
     * @return
     */
    PageInfo<User> getPageList(Integer pageNum, Integer pageSize, User record);

    User findById(Integer id);

    boolean update(User record);

    boolean deleteUserById(Integer id);

    int deleteMany(String[] ids);

    User login(String stuno, String pwd);
}
