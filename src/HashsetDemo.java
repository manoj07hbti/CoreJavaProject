import java.util.HashSet;

public class HashsetDemo {

   public void demo(){

       // HashSet <DataType>  obj_name= new HashSet <DataType> ();

       HashSet <String> stringHashSet= new HashSet <String>();

       stringHashSet.add("Raj");
       stringHashSet.add("rahul");
       stringHashSet.add("Raj");
       stringHashSet.add("Mukesh");
       stringHashSet.add("Raj");
       stringHashSet.add("Java");
       stringHashSet.add("J2EE");
       stringHashSet.add("SPRING");

       for (String var: stringHashSet){

           System.out.println(var);
       }

       HashSet <Integer> IntHashSet= new HashSet <Integer>();
       IntHashSet.add(1);
       IntHashSet.add(3);
       IntHashSet.add(3);
       IntHashSet.add(5);
       IntHashSet.add(1);

       for (Integer var: IntHashSet){

           System.out.println(var);
       }

   }



    public static void main(String[] args) {

       HashsetDemo obj=new HashsetDemo();
       obj.demo();

    }
}
