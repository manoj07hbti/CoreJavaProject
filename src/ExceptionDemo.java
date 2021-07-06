public class ExceptionDemo {

    public int divide(int a,int b){
        System.out.println("Inside method Before Exception ....");
        int result=0;

        try{
             result =a/b;
           }
       catch (Exception e){

           System.out.println("Exception occured and catched here....");
          }

        System.out.println("Inside method After Exception ....");
        return result;

    }

    public static void main(String[] args) {

        ExceptionDemo obj=new ExceptionDemo();

        System.out.println("Before Exception ....");

        int output= obj.divide(6,0);


        System.out.println("After Exception ....");
        System.out.println("result is "+output);
    }
}
