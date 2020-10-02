package Averrage_score;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StudentList implements ReLine{
    private int num=0;
    private int i=0;
    private Student students[];//对象Student数组
    public StudentList(int num){ //对象数组构造方法
         this.num=num;
         students=new Student[num];
    }

    @Override
    public void add(Object obj) {
         if(i==students.length){ //检查空间是否已满，如果满了向对象数组申请新的空间
                students= Arrays.copyOf(students,students.length+1);
         }
         students[i]=(Student)obj;
         i++;
    }

    @Override
    public Object get(int index) {//从列表中获取索引为i的对象
        if(index>0&&index<=students.length){
            return students[index-1];
        }

        else {
            System.out.println("error index");
            return null;
        }
    }

    @Override
    public void clear() {//清空所有的对象
          for (int j=0;j<this.i;j++){
              students[j]=null;
          }
          this.i=0;
    }

    @Override
    public boolean isEmpty() {//判断列表中是否有对象
        for (int i=0;i<students.length;i++){
            if(students[i]!=null){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {//获取列表中对象的个数
         int a=0;
         if(students[students.length-1]!=null) return students.length;
         else {
             for(int k=0;students[k]!=null&&k<students.length;k++){
                 a++;
             }
             return a;
         }
    }

    @Override
    public int capacity() {//分配的空间大小
        return students.length;
    }
}
