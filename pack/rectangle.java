package pack;

import java.util.Scanner;
public class rectangle{
    int l,b;
  
    public void area(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle :");
        l = sc.nextInt();
        System.out.println("Enter the breath of the rectangle");
        b = sc.nextInt();
        System.out.println("Area of the rectangle = "+l*b);
    }
}