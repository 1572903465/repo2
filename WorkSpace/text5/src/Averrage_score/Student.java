package Averrage_score;
import java.util.*;
public class Student  {
    public String name;
    private double score;

    public Student(String name, double score) {//构造方法
        this.name = name;
        this.score = score;
    }
    public Student() {//重构构造方法
        this.name = name;
        this.score = score;
    }
    public void setScore( double score) {//设置成绩
        this.score = score;
    }

    public void setName(String name) {//设置名字
        this.name = name;
    }

    public String getName() { //私有类型的get方法
        return this.name;
    }

    public double getScore() {//私有类型的get方法
        return this.score;
    }
}
