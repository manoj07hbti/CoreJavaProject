public class AbstractMethodOverRiding  extends  AbstractionDemo{

    @Override
    public void m1() {
     System.out.println("m1 method implemented ......");

    }

    public static void main(String[] args) {
        AbstractMethodOverRiding obj=new AbstractMethodOverRiding();
        obj.m1();
    }
}
