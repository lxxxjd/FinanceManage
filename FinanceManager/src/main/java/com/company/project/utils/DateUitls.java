package com.company.project.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUitls {

    public static Date getIncomeDate(String datestr){
        try {
            SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return format0.parse(datestr);
        }catch (Exception e){
            return  null;
        }
    }


    public static String getIncomeDateStr(Date date){
        try {
            SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return format0.format(date);
        }catch (Exception e){
            return  null;
        }
    }

    public static String getDateStr(Date date){
        try {
            SimpleDateFormat format0 = new SimpleDateFormat("yyyy-MM-dd");
            return format0.format(date);
        }catch (Exception e){
            return  null;
        }
    }
}
