package com.chy.mybatisplusdemo.service;

import com.chy.mybatisplusdemo.pojo.Score;
import org.apache.ibatis.annotations.Param;

public interface IScore {
    Score getScoreById(@Param("id") Integer id);
}
