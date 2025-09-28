package LW02;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
       int [] num_Store  =new int [5];
        Scanner scanner=new Scanner(System.in);

        for(int x=0;x<5;x++){
            System.out.print("Enter value: ");
            num_Store[x]=scanner.nextInt();
        }
        Arrays.sort(num_Store);
        System.out.print("The second largest number is: "+ num_Store[3]);

    }
}
