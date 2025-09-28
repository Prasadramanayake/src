package LW02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q7 {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today.toString());
        SimpleDateFormat sdf2 = new SimpleDateFormat("EEEE,MMMM dd, yyyy");
        System.out.println(sdf2.format(today));
    }
}