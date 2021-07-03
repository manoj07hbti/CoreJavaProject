public class MethodOverLoading {

/* todo Method overloading : same method signature but different parameter
        it can happen only in same class
        ******* also called compile time polymorphism
 */
    //TODO Syntax : access_specifier return_type  function_name (parameter) {}

    public void m1(){

        System.out.println("M1 without parameter");
    }
// overloaded method
    public void m1(int a){

        System.out.println("M1 with parameter: "+a);
    }
    // overloaded method
    public void m1(int a,int b){

        System.out.println("M1 with parameter: "+a +b);
    }

    public static void main(String[] args) {
        MethodOverLoading obj=new MethodOverLoading();
        obj.m1();
        obj.m1(33);
        obj.m1(44,11);
    }

}
