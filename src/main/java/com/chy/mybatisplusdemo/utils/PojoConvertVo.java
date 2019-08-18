package com.chy.mybatisplusdemo.utils;


import com.chy.mybatisplusdemo.controller.VO.ScoreVO;
import com.chy.mybatisplusdemo.pojo.Score;
import org.springframework.beans.BeanUtils;

public class PojoConvertVo {
    public static ScoreVO convert(Score score){
        if (score == null){
            return null;
        }
        ScoreVO scoreVO = new ScoreVO();
        BeanUtils.copyProperties(score,scoreVO);
        return scoreVO;
    }
}
