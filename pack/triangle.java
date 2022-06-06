package pack;

import java.util.Scanner;
public class triangle{
    int height;
    int breadth;

   
    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input height of the triangle : ");
        height = sc.nextInt();
        System.out.println("Input breadth of triangle : ");
        breadth = sc.nextInt();
        String area = Double.toString((height*breadth)/2f);
        System.out.println("Area of the triangle is : "+area);
    }
}