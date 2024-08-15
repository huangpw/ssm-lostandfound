package edu.school.service;

import com.github.pagehelper.PageInfo;
import edu.school.entity.Goods;

/**
 * @author huangpw
 * @date 2024/8/13 14:16
 * 博客： https://blog.csdn.net/qq_18167779?type=blog
 * @description:
 */
public interface GoodsService {
    boolean save(Goods record);
    boolean update(Goods record);
    PageInfo<Goods> getPageList(Integer pageNum, Integer pageSize, Goods record);
    Goods findById(Integer id);
    boolean deleteGoods(Integer id);
    int deleteMany(String ids[]);
}
