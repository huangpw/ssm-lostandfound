package edu.school.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.school.entity.Goods;
import edu.school.entity.GoodsExample;
import edu.school.entity.User;
import edu.school.entity.UserExample;
import edu.school.mapper.GoodsMapper;
import edu.school.service.GoodsService;
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
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    GoodsMapper mapper;

    @Override
    public boolean save(Goods record) {
        return mapper.insertSelective(record) > 0;
    }

    @Override
    public boolean update(Goods record) {
        return mapper.updateByPrimaryKeySelective(record) > 0;
    }

    @Override
    public PageInfo<Goods> getPageList(Integer pageNum, Integer pageSize, Goods record) {
        GoodsExample example = new GoodsExample();
        GoodsExample.Criteria criteria = example.createCriteria();
        if(record != null) {
            // 根据名称查询
            if(StringUtils.isNoneBlank(record.getGoods_name())) {
                criteria.andGoods_nameLike("%"+record.getGoods_name()+"%");
            }
            if(StringUtils.isNoneBlank(record.getCreate_date())) {
                criteria.andCreate_dateLike("%"+record.getCreate_date()+"%");
            }
            if(record.getUser_id() != null) {
                criteria.andUser_idEqualTo(record.getUser_id());
            }
        }
        PageHelper.startPage(pageNum, pageSize); // 开启分页
        List<Goods> list = mapper.selectByExample(example);// 查询
        PageInfo<Goods> info = new PageInfo<>(list); // 封装分页信息
        return info;
    }

    @Override
    public Goods findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean deleteGoods(Integer id) {
        return mapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public int deleteMany(String[] ids) {
        return mapper.deleteMany(ids);
    }
}
