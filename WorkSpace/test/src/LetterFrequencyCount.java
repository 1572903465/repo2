import java.io.*;

public class LetterFrequencyCount {

private int[] b = new int[300];

private double sum =0;

public LetterFrequencyCount() {

 for(int i=65;i<=122;i++){

b[i]=0;

 }

 }

public Boolean File(File file) throws IOException{

 jisuan(file);

return file.exists();

 }

 public void jisuan(File file) throws IOException{

     FileReader fr = null;
     try {
         fr = new FileReader(file);
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     }

     char[] a = new char[200000];

fr.read(a); // 读取数组中的内容

 for (char c : a){

 //System.out.print(c); // 一个一个打印字符

if(c>='A'&&c<='z'){

 b[(int)c]++;

 sum++;

 }else{

continue;
}

}
        fr.close();

}

public double getFrequency(char a){

int x=(int)a;

 if(x>=90){

 x-=32;

 }else{

}

 if(sum==0)

return 0;

 else

 return (b[x]+b[x+32])/sum;

 }

 public void printFrequencies(){

 for(int i=65;i<=90;i++){

 System.out.println((char)i+"/"+(char)(i+32)+"="+getFrequency((char)i)*100.0+"%");
 }

 }

}


