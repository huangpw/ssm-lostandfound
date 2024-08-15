package edu.school.service.impl;

import edu.school.entity.Admin;
import edu.school.mapper.AdminMapper;
import edu.school.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author huangpw
 * @date 2024/8/12 11:14
 * 博客： https://blog.csdn.net/qq_18167779?type=blog
 * @description:
 */
@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    @Override
    public Admin login(Admin admin) {
        return adminMapper.findAdmin(admin);
    }
}
