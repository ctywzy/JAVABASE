package day27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class o4 {
    public static void main(String[] args) {
        String str = "abc de fghdd";
        String regex = "[a-z]{3}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        while(m.find()){ ;
            System.out.println(m.group());
        }


    }
}
