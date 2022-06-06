class AreaSquare{
void area(int a)
{
int ar=a*a;
System.out.println("Area of  square:"+ar);
}
void area(int a,int b)
{
int are=a*b;
System.out.println("Area of rectangle:"+are);
}
}
class OverloadArea
{
public static void main(String args[])
{
AreaSquare a=new AreaSquare();
a.area(4);
a.area(2,3);
}
}
