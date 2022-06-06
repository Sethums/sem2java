import java.util.*;
interface A{
public void area();
public void perimeter();
}
class Circle implements A
{Scanner sc=new Scanner(System.in);
double a,p;
public void area()
{System.out.println("Enter radius of circle:");
int r=Integer.parseInt(sc.nextLine());
a=3.14*r*r;
System.out.println("Area of circle:"+a);
}
public void perimeter()
{
System.out.println("Enter radius of circle:");
int r=Integer.parseInt(sc.nextLine());
p=2*3.14*r;
System.out.println("Perimeter of circle:"+p);
}
}
class Rectangle implements A
{Scanner sc=new Scanner(System.in);
int a,p;
public void area()
{
System.out.println("Enter length and breadth:");
int l=Integer.parseInt(sc.nextLine());
int b=Integer.parseInt(sc.nextLine());
a=l*b;
System.out.println("Area of rectangle:"+a);
}
public void perimeter()
{
System.out.println("Enter length and breadth:");
int l=Integer.parseInt(sc.nextLine());
int b=Integer.parseInt(sc.nextLine());
p=2*(l+b);
System.out.println("Perimeter of rectangle:"+p);
}
}
class InterfaceDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
Rectangle rect=new Rectangle();
Circle cir=new Circle();
int c,ch,l,b,r;
do
{

System.out.println("Enter your choice:\n1.Area of circle\n2.Perimeter of circle\n3.Area of rect\n4.Perimeter of rect\n5.Exit");
c=Integer.parseInt(sc.nextLine());
switch(c)
{
case 1:

cir.area();
break;

case 2:

cir.perimeter();
break;
case 3:

rect.area();
break;
case 4:

rect.perimeter();
break;
case 5:
break;
default:
System.out.println("Invalid choice");
break;
}
System.out.println("Do you want to continue  1 for yes 0 for no");
ch=Integer.parseInt(sc.nextLine());
}while(ch!=0);
}
}





