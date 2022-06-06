class ComplexNumber{
int real,imag;
public ComplexNumber(int r,int i)
{
this.real=r;
this.imag=i;
}
public void show()
{
System.out.println(this.real+" +" +this.imag+"i");
}
public static ComplexNumber add(ComplexNumber n1,ComplexNumber n2)
{
ComplexNumber res=new ComplexNumber(0,0);
res.real=n1.real+n2.real;
res.imag=n1.imag+n2.imag;
return res;
}
public static void main(String args[])
{
ComplexNumber c1=new ComplexNumber(4,5);
ComplexNumber c2=new ComplexNumber(10,5);
System.out.println("First:");
c1.show();
System.out.println("Second:");
c2.show();
ComplexNumber res=add(c1,c2);
System.out.println("\nAddition:");
res.show();
}
}