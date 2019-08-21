package day27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class o7 {
    public static void main(String[] args) {
        String str = "title=\"关联其他QQ邮箱\">ctywzy@foxmail.com</span>&gt;</span><span id=\"setAliasTip\" class=\"icon_securityCenterTip\" style=\"display: none\"></span><style>.bindacc .menu_item,.bindacc  ";
        String regex = "\\w+@\\w+(\\.\\w+)+";
        Pattern p = Pattern.compile(regex);

        Matcher m = p.matcher(str);

        while(m.find()){
            System.out.println(m.group());
        }
    }
}
