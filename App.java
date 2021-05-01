package $06_Multiple_Inheritance;

public class App {
    public static void main(String[] args) {
        Child c = new Child();
        c.m1(); //grand
        c.m2(); //parent
        c.m3(); //child
        System.out.println(c.hashCode());  //from object class which is automatically extended by the gramd
      
    }

}
