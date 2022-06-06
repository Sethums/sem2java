import java.util.Scanner;
public class StringSort{
public static void main(String args[])
{
int count;
String temp;
Scanner scan=new Scanner(System.in);
System.out.println("Enter  number of strings:");
count=scan.nextInt();
String str[]=new String[count];
Scanner scan2=new Scanner(System.in);
System.out.print("Enter the string to be sorted:");
for(int i=0;i<count;++i)
{
str[i]=scan2.nextLine();
}
scan.close();
for(int i=0;i<count;++i)
{
for(int j=i+1;j<count;++j)
{
if(str[i].compareTo(str[j])>0)
{
temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}
}
System.out.print("Sorted Strings:");
for(int i=0;i<=count-1;++i)
{
System.out.print(str[i]+",");
}
}
}