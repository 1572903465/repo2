package demo05;

public class Demo5_47 {
    public static void main(String[] args) {
        Person5_47 per1=new Person5_47();
        Person5_47 per2=new Person5_47();
        System.out.println("MAIN方法-->"+per1);
        per1.getinfo();
        System.out.println("MAIN方法-->"+per2);
        per2.getinfo();
    }
}
class Person5_47{
    public String getinfo(){
        System.out.println("Person类-->"+this);
        return null;
    }
    
}
