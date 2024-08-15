package edu.school.mapper;

import edu.school.entity.Board;
import edu.school.entity.BoardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoardMapper {
    long countByExample(BoardExample example);

    int deleteByExample(BoardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Board record);

    int insertSelective(Board record);

    List<Board> selectByExampleWithBLOBs(BoardExample example);

    List<Board> selectByExample(BoardExample example);

    Board selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Board record, @Param("example") BoardExample example);

    int updateByExampleWithBLOBs(@Param("record") Board record, @Param("example") BoardExample example);

    int updateByExample(@Param("record") Board record, @Param("example") BoardExample example);

    int updateByPrimaryKeySelective(Board record);

    int updateByPrimaryKeyWithBLOBs(Board record);

    int updateByPrimaryKey(Board record);

    int deleteMany(String [] ids);
}