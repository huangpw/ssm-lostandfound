package edu.school.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.school.entity.Tiezi;
import edu.school.entity.TieziExample;
import edu.school.entity.User;
import edu.school.mapper.TieziMapper;
import edu.school.mapper.UserMapper;
import edu.school.service.TieziService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huangpw
 * @date 2024/8/13 14:16
 * 博客： https://blog.csdn.net/qq_18167779?type=blog
 * @description:
 */
@Service
public class TieziServiceImpl implements TieziService {

    @Autowired
    TieziMapper mapper;

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean save(Tiezi record) {
        return mapper.insertSelective(record) > 0;
    }

    @Override
    public boolean update(Tiezi record) {
        return mapper.updateByPrimaryKeySelective(record) > 0;
    }

    @Override
    public PageInfo<Tiezi> getPageList(Integer pageNum, Integer pageSize, Tiezi record) {
        TieziExample example = new TieziExample();
        example.setOrderByClause("create_time desc");
        TieziExample.Criteria criteria = example.createCriteria();
        if(record != null) {
            // 根据标题查询
            if(StringUtils.isNoneBlank(record.getTitle())) {
                criteria.andTitleLike("%"+record.getTitle()+"%");
            }
            if(record.getUser_id() != null) {
                criteria.andUser_idEqualTo(record.getUser_id());
            }
        }
        PageHelper.startPage(pageNum, pageSize); // 开启分页
        List<Tiezi> list = mapper.selectByExample(example);// 查询
        for (Tiezi tiezi : list) {
            User user = userMapper.selectByPrimaryKey(tiezi.getUser_id());
            tiezi.setUser(user);
        }
        PageInfo<Tiezi> info = new PageInfo<>(list); // 封装分页信息
        return info;
    }

    @Override
    public Tiezi findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean deleteTiezi(Integer id) {
        return mapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public int deleteMany(String[] ids) {
        return mapper.deleteMany(ids);
    }
}
