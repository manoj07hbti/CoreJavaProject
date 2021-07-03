import java.util.ArrayList;

public class ArrayListWithEmployee {



    public void displayEmployeeList(){
        // ArrayList <DataType> OBJ_NAME=new ArrayList  <DataType>();

        ArrayList <Employee>  empList= new ArrayList <Employee>();

        Employee emp1=new Employee("Raj",24,"CS");
        Employee emp2=new Employee("Mukesh",26,"IT");
        Employee emp3 =new Employee("Rahul",26,"IT");

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);


// SYNTAX  for (Datatype var_name: colletion ){}

        for (Employee var:empList ){

            System.out.println("Printing Data of Employee Name.." +var.name);
            System.out.println("Printing Data of Employee Age.." +var.age);
            System.out.println("Printing Data of Employee Dept.." +var.dept);
        }

    }


    public static void main(String[] args) {

        ArrayListWithEmployee object=new ArrayListWithEmployee();
        object.displayEmployeeList();

    }


}
