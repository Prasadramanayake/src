package LW02;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for(int x=1;true;x++) {
            System.out.print("Enter a number: ");
            int value = scanner.nextInt();
            if (value < 0){
                break;
            }

            int length = String.valueOf(value).length();

            System.out.println("Number of digits: "+ length);
        }


    }
}
