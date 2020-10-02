package demo05;

public class Demo5_53 {
    public static void main(String[] args) {
        Person5_53 per1 =new Person5_53("张三",18);
        Person5_53 per2 =new Person5_53("李四",19);
        Person5_53 per3 =new Person5_53("王伍",20);
        System.out.println("修改之前");
        per1.info();
        per2.info();
        per3.info();
        System.out.println("修改之后");
        Person5_53.setCounty("成都");
        per1.info();
        per2.info();
        per3.info();
    }

}
class Person5_53{
    private String name;
    private int age;
    private static String county = "衡阳";

    public static void setCounty(String county) { //
        Person5_53.county = county;
    }

    public static String getCounty() {
        return county;
    }

    public Person5_53(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.println("姓名："+this.name+",年龄："+this.age+",城市:"+county);
    }

}
