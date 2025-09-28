package LW02;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        System.out.print("Enter number of Rows in pyramid: ");
        Scanner scanner=new Scanner(System.in);
        int p=scanner.nextInt();
        for (int i=1;i<=p;i++){
            for(int y=1;y<=p-i;y++){
                System.out.print(" ");
            }
            for(int z=1;z<=(i*2)-1;z++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
