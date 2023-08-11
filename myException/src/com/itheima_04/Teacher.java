package com.itheima_04;

public class Teacher {
    public void checkScore(int score) throws ScoreException{
        if(score<0 || score>100){
            throw new ScoreException("你给的分数异常");
        }else{
            System.out.println("分数正常");
        }
    }
}
