package demo05;

public class Demo5_51 {
    public static void main(String[] args) {
        Person5_51 per1 =new Person5_51("张三",18);
        Person5_51 per2 =new Person5_51("李四",19);
        Person5_51 per3 =new Person5_51("王伍",20);
        System.out.println("修改之前");
        per1.info();
        per2.info();
        per3.info();
        System.out.println("修改之后");
        per1.county ="成都";
        per1.info();
        per2.info();
        per3.info();
    }

}
class Person5_51{
    String name;
    int age;
    static String county = "衡阳";

    public Person5_51(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.println("姓名："+this.name+",年龄："+this.age+",城市:"+county);
    }
}
