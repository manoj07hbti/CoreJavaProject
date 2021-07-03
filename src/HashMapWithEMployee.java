import java.util.HashMap;

public class HashMapWithEMployee {

 public void demo(){

     //Syntax:   HashMap <Key_DataType,Value_DataType> objName= new HashMap <Key_DataType,Value_DataType> ();
     HashMap <Integer, Employee>  employees= new HashMap<Integer, Employee>();

     Employee emp1=new Employee("Java",23,"CS");
     Employee emp2=new Employee("Spring",23,"CS");
     Employee emp3=new Employee("SPring Boot",23,"CS");

     employees.put(1,emp1);
     employees.put(2,emp2);
     employees.put(3,emp3);


     Employee obj= employees.get(2);
     System.out.println(obj.name);
     System.out.println(obj.dept);
     System.out.println(obj.age);

     obj= employees.get(3);
     System.out.println(obj.name);
     System.out.println(obj.dept);
     System.out.println(obj.age);

     obj= employees.get(1);
     System.out.println(obj.name);
     System.out.println(obj.dept);
     System.out.println(obj.age);

 }


    public static void main(String[] args) {

        HashMapWithEMployee obj= new HashMapWithEMployee();
        obj.demo();

    }
}
