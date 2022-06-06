class Person
{
String name,gender,address;
int age;
Person(String n,String g,String a,int age)
{
name=n;
gender=g;
address=a;
age=age;
}
}
class Employee extends Person
{
int empid;
String company,salary,quali;
Employee(int e,String c,String q,String s)
{
empid=e;
company=c;
quali=q;
salary=s;
}
}
class Teacher extends Employee{
String subject,dept;
int tchrid;
Teacher(int t,String s,String d);
{
tchrid=t;
subject=s;
dept=d;
}
void display()
{
System.out.println("TeacherId:"+tchrid+"\nName:"+name+"\nAge:"+age+"\nGender:"+gender+"\nAddress:"+address+"\nEmpid:"+empid+"\nCompanyName:"+company+"\nQualifiaction:"+quali+"\nSalary:"+salary+"Subject:"+subject+"\nDepartment:"+dept);
}
class TeacherInheritance{
Scanner s=new Scanner(System.in);

}
