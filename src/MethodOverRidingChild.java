public class MethodOverRidingChild extends MethodOverRidingParent {

    public void m1(){

        System.out.println("I am in M1 of Child");

    }


    public static void main(String[] args) {
        MethodOverRidingChild obj=new MethodOverRidingChild();

        obj.m1();

        MethodOverRidingParent parentObj=new MethodOverRidingParent();
        parentObj.m1();

        MethodOverRidingParent Obj=new MethodOverRidingChild();// creating child object
        Obj.m1();

       // MethodOverRidingChild obj1=new MethodOverRidingParent(); compile time error



    }
}
