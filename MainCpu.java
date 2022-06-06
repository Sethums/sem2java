class  Cpu{
int price;
void display(int p)
{price=p;
System.out.println("price:"+price);
}
class Processor{
int core;
String manufacturer;
void print(int c,String m){
core=c;
manufacturer=m;
System.out.println("No of Core"+core);
System.out.println("Manufacturer:"+manufacturer);
}
}
}
class MainCpu{
public static void main(String args[])
{
Cpu cp=new Cpu();
cp.display(Integer.parseInt(args[0]));
Cpu.Processor pr=cp.new Processor();
pr.print(Integer.parseInt(args[1]),args[2]);
}
}