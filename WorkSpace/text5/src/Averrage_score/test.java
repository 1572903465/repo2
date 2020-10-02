package Averrage_score;
import java.util.*;
public class test {
    public static double grade(double x) throws InvalidScoreException{//自定义异常函数
        if(x<-1||x>100) throw new InvalidScoreException(); //成绩在0~100，-1结束输入
        return x;
    }
    public static void main(String[] args) throws InvalidScoreException {
        int num=0;
        Scanner input=new Scanner(System.in);
        System.out.println("请输入学生的人数");
        num=input.nextInt();
       StudentList students=new StudentList(num);
       boolean flag=true;
       int i=0;
       double b = 0;
       String a;
       boolean flag1=true;
        System.out.println("请输入学生的姓名和成绩");
        while(flag) {//循环遍历输入学生，成绩
            a=input.next();
            if(a.equals("-1")){//-1结束输入
                flag = false;
                break;
            }
            while(flag1) {//检查成绩的输入异常 -1结束输入  抛除异常 while循环为获得正确的成绩输入
                try {
                    b = grade(input.nextDouble());
                    if(b==-1){//-1结束输入
                        flag1 = false;
                        break;
                    }
                    flag1 = false;
                } catch (InvalidScoreException e) {
                  System.out.println(e);
                }
            }
            if(a.equals("-1")||b==-1)//-1结束输入
            {
                flag = false;
                break;
            }
            flag1=true;
            students.add(new Student(a,b));
            if(students.size()==num){//对象数组人数等于预设人数，跳出循环
                flag=false;
            }


    i++;
    }
        int studentsum=0;//累加成绩
        int studentrate=0;//及格人数
        for(int j=1;j<=students.size();j++){//遍历输出姓名 成绩 并计算累加成绩 及格人数
            System.out.println(((Student)students.get(j)).getName()+"  "+((Student)students.get(j)).getScore());
            studentsum+=((Student)students.get(j)).getScore();
            if(((Student)students.get(j)).getScore()>=60.0)
                studentrate++;
        }
        System.out.println("====");
        System.out.println("平均成绩："+studentsum/students.size());
        System.out.println("及格率："+studentrate*100/students.size()+"%");
        }
    }

