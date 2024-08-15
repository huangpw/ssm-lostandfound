package edu.school.service;

import com.github.pagehelper.PageInfo;
import edu.school.entity.Board;

/**
 * @author huangpw
 * @date 2024/8/13 14:16
 * 博客： https://blog.csdn.net/qq_18167779?type=blog
 * @description:
 */
public interface BoardService {
    boolean save(Board record);
    boolean update(Board record);
    PageInfo<Board> getPageList(Integer pageNum, Integer pageSize, Board record);
    Board findById(Integer id);
    boolean deleteBoard(Integer id);
    int deleteMany(String ids[]);
}
