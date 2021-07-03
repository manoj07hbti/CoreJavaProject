import java.util.HashMap;

public class HashMapDemo {


    public void demo(){
   //Syntax:   HashMap <Key_DataType,Value_DataType> objName= new HashMap <Key_DataType,Value_DataType> ();
        HashMap <Integer,String> hashMap= new HashMap<Integer, String>();

        //put
       // adding value to hashMap....
        hashMap.put(1,"Java");
        hashMap.put(2,"Spring");
        hashMap.put(3,"Spring Boot");
        hashMap.put(4,"Microservice");
        hashMap.put(5,"Cloud");


        //get method
        System.out.println("Printing hashmap value " +hashMap.get(1));
        System.out.println("Printing hashmap value " +hashMap.get(2));
        System.out.println("Printing hashmap value " +hashMap.get(3));
        System.out.println("Printing hashmap value " +hashMap.get(4));
        System.out.println("Printing hashmap value " +hashMap.get(5));


    }

    public static void main(String[] args) {

        HashMapDemo obj =new HashMapDemo();
        obj.demo();
    }
}
