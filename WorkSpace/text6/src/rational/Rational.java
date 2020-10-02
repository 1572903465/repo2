package rational;

public class Rational implements Comparable<Rational>{
    private int numerator;//分子
    private int denominator;//分母
    public Rational(int numerator,int denominator){//构造方法
        this.numerator=numerator;
        this.denominator=denominator;
    }
    public int getNumerator(){//get private numerator值
        return this.numerator;
    }
    public int getDenominator(){//get private denominstor 值
        return this.denominator;
    }
    public double getAge(){
        return this.numerator/this.denominator;
    }
    @Override
    public int compareTo(Rational o) {
        if (this.getDenominator() == 0 && o.getDenominator() != 0) {

            return 1;

        } else if (this.getDenominator() != 0 && o.getDenominator() == 0) {

            return -1;

        } else if (this.getDenominator() == 0 && o.getDenominator() == 0) {

            return 0;
        } else {
            if(this.getDenominator()*o.getNumerator()<o.getDenominator()*this.getNumerator()){
        return 1;
            }
            else if(this.getDenominator()*o.getNumerator()>this.getNumerator()*o.getDenominator()){
                return -1;
            }
              else{
                return 0 ;
            }

        }

    }
}
//import java.util.*;
////class Student implements Comparable<Student>{
////    private String Name,Id;
////    private int subject=1;
////    private int Score;
////    private double sum=0;
////    Student(){}
////    Student(String name,String id,int Score){
////        this.Name=name;
////        this.Id=id;
////        this.Score=Score;
////    }
////    public String getid(){
////        return this.Id;
////    }
////    public void subjectadd() {
////        this.subject++;
////    }
////    public void scoreadd(int score){
////        this.Score=this.Score+score;
////    }
////    public String Getname() {
////        return this.Name;
////    }
////    public void Sum() {
////        this.sum=this.Score/this.subject;
////    }
////
////    public int compareTo(Student o1){
////        Student one = (Student) o1;
////        if(this.sum-one.sum!=0)
////            return (int)(one.sum-this.sum);
////        else
////            return this.Id.compareTo(one.Id);
////    }
////}
////public class Main{
////    public static void main(String[] args) {
////        Scanner sc=new Scanner(System.in);
////        List<Student> list =new ArrayList<Student>();
////        int i,flag=0;
////        String k;
////        String[] and =new String[5];
////
////        while(sc.hasNext())
////        {
////            k=sc.next();
////            and=k.split(",");
////            if(k.compareTo("exit")==0)
////                break;
////            for(i=0;i<list.size();i++)
////            {
////                if(list.get(i).getid().compareTo(and[1])==0)
////                {
////                    flag=1;
////                    break;
////                }
////            }
////            if(flag==1)
////            {
////                list.get(i).subjectadd();
////                list.get(i).scoreadd(Integer.parseInt(and[3]));
////            }
////            else
////            {
////                list.add(new Student(and[0],and[1],Integer.parseInt(and[3])));
////            }
////            flag=0;
////        }
////        for(i=0;i<list.size();i++)
////            list.get(i).Sum();
////        Collections.sort(list);
////        for(i=0;i<list.size();i++)
////        {
////
////            System.out.println("No"+(i+1)+":"+list.get(i).getid()+","+list.get(i).Getname());
////            //System.out.println(list.get(i).rescore());
////        }
////
////    }
//}