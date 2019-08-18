package com.chy.mybatisplusdemo.service.impl;

import com.chy.mybatisplusdemo.mapper.ScoreMapper;
import com.chy.mybatisplusdemo.pojo.Score;
import com.chy.mybatisplusdemo.service.IScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScoreService implements IScore {
    @Autowired
    private ScoreMapper scoreMapper;
    @Override
    public Score getScoreById(Integer id) {
        return scoreMapper.getScoreById(id);
    }
}
