package edu.school.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import edu.school.entity.Board;
import edu.school.entity.BoardExample;
import edu.school.mapper.BoardMapper;
import edu.school.service.BoardService;
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
public class BoardServiceImpl implements BoardService {

    @Autowired
    BoardMapper mapper;

    @Override
    public boolean save(Board record) {
        return mapper.insertSelective(record) > 0;
    }

    @Override
    public boolean update(Board record) {
        return mapper.updateByPrimaryKeySelective(record) > 0;
    }

    @Override
    public PageInfo<Board> getPageList(Integer pageNum, Integer pageSize, Board record) {
        BoardExample example = new BoardExample();
        example.setOrderByClause("create_time desc");
        BoardExample.Criteria criteria = example.createCriteria();
        if(record != null) {
            // 根据标题查询
            if(StringUtils.isNoneBlank(record.getTitle())) {
                criteria.andTitleLike("%"+record.getTitle()+"%");
            }
        }
        PageHelper.startPage(pageNum, pageSize); // 开启分页
        List<Board> list = mapper.selectByExample(example);// 查询
        PageInfo<Board> info = new PageInfo<>(list); // 封装分页信息
        return info;
    }

    @Override
    public Board findById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public boolean deleteBoard(Integer id) {
        return mapper.deleteByPrimaryKey(id) > 0;
    }

    @Override
    public int deleteMany(String[] ids) {
        return mapper.deleteMany(ids);
    }
}
