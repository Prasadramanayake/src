package LW02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q6 {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println(today.toString());

        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(sdf.format(today));
    }
}