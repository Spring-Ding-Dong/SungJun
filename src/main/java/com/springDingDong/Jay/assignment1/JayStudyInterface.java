package com.springDingDong.Jay.assignment1;

public interface JayStudyInterface {
    String TODO = "공부";



    void doDdanzit(String playname, int dotime);

    default void doGame (String gamename, int dotime){
        System.out.println(gamename +"을" + dotime + "시간동안 하는중");
    }

    static void teacherSaids (){
        System.out.println(TODO + "하고있죠~?");
    }


}
