package com.company.project.global;

<<<<<<< HEAD
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
=======
public class GlobalContants {
>>>>>>> aebd931add4a5dd8c1d1d37c334dfe6a7bebed14
}
