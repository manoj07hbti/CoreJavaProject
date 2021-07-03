import java.util.HashSet;

public class SetWithEmployee {


    public void demo(){

        // HashSet <DataType>  obj_name= new HashSet <DataType> ();

        HashSet<Employee> employees= new HashSet<Employee>();

        Employee emp1= new Employee("Raj",23,"IT");
        Employee emp2= new Employee("Harsh",25,"IT");
        Employee emp3= new Employee("Ramesh",33,"CS");

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        for (Employee var: employees){

            System.out.println(var.name);
        }

    }

    public static void main(String[] args) {

        SetWithEmployee obj= new SetWithEmployee();
        obj.demo();

    }
}
