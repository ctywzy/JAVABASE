package day18;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class g4 {
    public static void main(String[] args) throws ParseException {
//        long time = System.currentTimeMillis();
//        Date d = new Date();
//        DateFormat dateformate = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
//        System.out.println(sdf.format(d));
        String str_date = "2018--02--28";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy--mm--dd");
        Date date = sdf.parse(str_date);
        System.out.println(date);
    }
}
