package demo05;

import java.time.Period;

public class Demo5_49 {
    public static void main(String[] args){
        Person5_49 per1= new Person5_49("张三",21);
        Person5_49 per2= new Person5_49("张三",21);

        if(per1.comoare(per2)){
            System.out.println("该对象相等");
        }else{
            System.out.println("该对象不相等");
        }
        per1.setAge(22);
        if(per2.comoare(per1)){
            System.out.println("该对象相等");
        }else{
            System.out.println("该对象不相等");
        }
    }
}
class Person5_49{
    private String name;
    private int age;

    public Person5_49(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public boolean comoare(Person5_49 period5_49){
        Person5_49 p1 =this;
        Person5_49 p2 =period5_49;
        if(p1==p2){
            return true;
        }
        if(p2==null){
            return false;
        }
        if(p1.getName().equals(p2.getName())&&p1.getAge()==p2.getAge()){
            return true;
        }else{
            return false;
        }

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
