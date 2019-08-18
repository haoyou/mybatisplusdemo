package com.chy.mybatisplusdemo.controller;

import com.chy.mybatisplusdemo.errors.BusinessException;
import com.chy.mybatisplusdemo.errors.EnumList;
import com.chy.mybatisplusdemo.pojo.Score;
import com.chy.mybatisplusdemo.response.ComnReturnType;
import com.chy.mybatisplusdemo.service.impl.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/score")
public class ScoreController {
    @Autowired
    private ScoreService scoreService;
    @RequestMapping("/getscore")
    @ResponseBody
    public ComnReturnType getScore(Integer id) throws BusinessException {
         Score score = scoreService.getScoreById(id);
         if (score == null){
             throw new BusinessException(EnumList.PARAMETER_INVALID);
         }
         return ComnReturnType.create(score);
    }
}
