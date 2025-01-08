package com.springDingDong.Jay.assignment1;

public class JayStudyClass implements JayStudyInterface{


    @Override
    public void doDdanzit(String playname, int dotime) {
        System.out.println(playname + "을 " + dotime + "시간만큼 하는중");

    }

    @Override
    public void doGame(String gamename, int dotime) {
        JayStudyInterface.super.doGame(gamename, dotime);
    }

    public void getTeacherSaids(){
        JayStudyInterface.teacherSaids();
    }
}
