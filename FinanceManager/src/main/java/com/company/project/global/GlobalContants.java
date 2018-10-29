package com.company.project.global;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GlobalContants {
    public static Date mydate ;
    static {
       // mydate=new Date();
        try{
            SimpleDateFormat format =new SimpleDateFormat("yyyy-MM-dd");
            mydate= format.parse("2018-10-29");
        }catch (Exception e){

        }
    }
}
