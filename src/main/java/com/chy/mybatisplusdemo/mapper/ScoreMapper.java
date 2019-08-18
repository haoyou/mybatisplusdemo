package com.chy.mybatisplusdemo.mapper;

import com.chy.mybatisplusdemo.pojo.Score;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface ScoreMapper {
     Score getScoreById(@Param("id") Integer id);
}
