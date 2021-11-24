package com.ccl;

import java.util.Calendar;
import java.util.Date;

public class Helloworld {

    public static void main(String[] args) {
        Date date = new Date() ;
        Calendar dd = Calendar.getInstance( );
        dd.setTime(date);
        int month = dd.get(Calendar.MONTH)+1;
        System.out.println(month);
        System.out.println("ghahahaha");
    }
}
