package demo05;

public class Demo5_40 {
    public static void main(String[] args) {
        Demo40 d1 =new Demo40();
        d1.setTemp(50);
        d1.fun(d1);
        System.out.println("trmp="+d1.getTemp());
    }

}
class Demo40{
    private int temp = 30;
    public void fun(Demo40 d2){
        d2.temp =40;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }
}
