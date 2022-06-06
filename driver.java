import pack.circle;
import pack.rectangle;
import pack.square;
import pack.triangle;

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice,c;
        circle obj1 = new circle();
        rectangle obj2 = new rectangle();
        square obj3 = new square();
        triangle obj4 = new triangle();
do{               
System.out.println("Choose any    1)Circle   2)Rectangle   3)Square  4)Triangle: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        obj1.area();
                        break;
                    case 2:
                        obj2.area();
                        break;
                    case 3:
                        obj3.area();
                        break;
                    case 4:
                        obj4.area();
                    default:
                        break;
                }
System.out.println("Do you want to continue");
c=sc.nextInt();
}while(c!=0);
        }
    }