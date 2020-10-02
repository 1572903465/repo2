package demo05;

public class Demo5_44 {
    public static void main(String[] args) {
        Person544 person =new Person544("张三",33);
       System.out.println(person.getInfo());

    }
}
class Person544{
    private String name;
    private int age;

    public Person544() {
        System.out.println("一个新的Person对象被实例化");
    }

    public Person544(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }
    public String getInfo(){
        return  name+" "+age;
    }

}