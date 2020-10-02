package demo05;

public class Demo5_56 {
    public static void main(String[] args) {
        System.out.println(new Demo556().getName());
        System.out.println(new Demo556("zlw").getName());
        System.out.println(new Demo556().getName());
        System.out.println(new Demo556("zlwww").getName());
        System.out.println(new Demo556().getName());

    }
}
class Demo556{
    private String name;
    private static int count =0;
    public Demo556(){
        count++;
        this.name = "DEMO-"+count;
    }
    public Demo556(String name){
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}