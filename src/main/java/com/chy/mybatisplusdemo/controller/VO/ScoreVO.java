package com.chy.mybatisplusdemo.controller.VO;

public class ScoreVO {
    private Integer id;
    private String name;
    private String kecheng;
    private Integer score;

    public ScoreVO() {
    }

    public ScoreVO(Integer id, String name, String kecheng, Integer score) {
        this.id = id;
        this.name = name;
        this.kecheng = kecheng;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKecheng() {
        return kecheng;
    }

    public void setKecheng(String kecheng) {
        this.kecheng = kecheng;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
