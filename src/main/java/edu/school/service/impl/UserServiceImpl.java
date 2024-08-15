package edu.school.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.school.entity.User;
import edu.school.entity.UserExample;
import edu.school.mapper.UserMapper;
import edu.school.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author huangpw
 * @date 2024/8/9 9:50
 * 博客： https://blog.csdn.net/qq_18167779?type=blog
 * @description:
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 注册
     * @param user
     * @return
     */
    @Override
    public boolean register(User user) {
        // 插入到数据库
        return userMapper.insertSelective(user) > 0 ? true : false;
    }

    /**
     * 加载用户列表(分页)
     * @param pageNum
     * @param pageSize
     * @param record
     * @return
     */
    @Override
    public PageInfo<User> getPageList(Integer pageNum, Integer pageSize, User record) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if(record != null) {
            // 根据学号查询
            if(StringUtils.isNoneBlank(record.getStuno())) {
                criteria.andStunoLike("%"+record.getStuno()+"%");
            }
            // 根据昵称查询
            if(StringUtils.isNoneBlank(record.getNick_name())) {
                criteria.andNick_nameLike("%"+record.getNick_name()+"%");
            }
        }
        PageHelper.startPage(pageNum, pageSize); // 开启分页
        List<User> userList = userMapper.selectByExample(example); // 查询
        PageInfo<User> info = new PageInfo<>(userList); // 封装分页信息
        return info;
    }

    /**
     * 根据Id查询
     * @param id
     * @return
     */
    @Override
    public User findById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    /**
     * 根据id修改用户
     * @param record
     * @return
     */
    @Override
    public boolean update(User record) {
        return userMapper.updateByPrimaryKey(record) > 0;
    }

    /**
     * 根据id删除
     * @param id
     * @return
     */
    @Override
    public boolean deleteUserById(Integer id) {
        return userMapper.deleteByPrimaryKey(id) > 0 ? true : false;
    }

    @Override
    public int deleteMany(String[] ids) {
        return userMapper.deleteMany(ids);
    }

    @Override
    public User login(String stuno, String pwd) {
        return userMapper.findByStunoAndPwd(stuno, pwd);
    }


}
