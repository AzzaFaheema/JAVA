abstract class Emp{
 abstract void printinfo();
 }

class Employee extends Emp{
 void printinfo()
 {
  String name="Avinash";
  int age=21;
  float salary=222.2F;
  System.out.println("Name=" + name);
  System.out.println("Age=" + age);
  System.out.println("Salary=" + salary);
 }
}

class AbstractMain{
 public static void main(String args[]){
  Emp obj = new Employee();
  obj.printinfo();
 }
}     
