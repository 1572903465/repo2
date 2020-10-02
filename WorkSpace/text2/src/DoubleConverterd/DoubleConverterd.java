package DoubleConverterd;
import java.math.*;
public class DoubleConverterd {
    public void DoubleConverterd(String snumber)
    {
        double number = 0.0;
        double temp = 0.0 ;
        int j = 0;
        boolean flag= true ;
        for(int i = 0;i < snumber.length();i++)
        {
            if('0' <= snumber.charAt(i) && snumber.charAt(i) <= '9')
            {
                temp = snumber.charAt(i) - '0' ;
                number = number * 10.0;
				number = number + temp;
            }else if(snumber.charAt(i) ==  '.' && flag)
            {
                j=i;
                flag=false;
            }
            else
            {
                System.out.println("Eorror,您输入的不是double!");
                System.exit(0);
            }
        }
        for(int i = 1; i < snumber.length()-j;i++ )
        {
            number = number / 10 ;
        }
        System.out.println("您输入的double 是 :"+ number);
    }
}
