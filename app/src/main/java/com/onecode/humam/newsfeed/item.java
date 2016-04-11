package com.onecode.humam.newsfeed;

/**
 * Created by humam on 10/04/2016.
 */
public class item {
    String title;
    String  img;
    String auther;



    public void setTitle(String title){
        this.title=title;


    }


    public void setauther(String auther){
        this.auther=auther;
    }


    public String gettitle(){
        return title;

    }

    public String getauther(){


        return auther;
    }



    public void  setimg(String img){
        this.img=img;
    }

    public String getimg(){
        return img;
    }


}
