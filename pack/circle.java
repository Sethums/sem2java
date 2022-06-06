package pack;



import java.util.Scanner;

public class circle{
    int radius;
 
    public void area() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input radius of circle : ");
        radius = sc.nextInt();
        String area = Double.toString(Math.PI*radius*radius);
        System.out.println("Area of the circle is : "+area);
        sc.close();
    }
}