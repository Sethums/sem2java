import java.util.Scanner;
import java.io.*;
class validate extends Exception
{
   validate(String s)
    {  
super(s);
    }
}
class Exception_Login
{ 
  public static void main(String str[])
  { 
     
     try{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter username");

         String d=s.next();
         System.out.println("Enter password");

         int m=s.nextInt();
        Check(d,m);
       }catch(validate n)
         {System.out.println("Denied ...> " +n);
        }
  }
  static void Check(String s,int x) throws validate{
      
    
      if((s!="sethu")||(x!=123))
			
       throw new validate("check username and password");
      else
      System.out.println("Success");
     
          
    }
}     