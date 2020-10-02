package Averrage_score;

public class InvalidScoreException extends Exception{
    public InvalidScoreException(){
        super("输入错误，请输入0~100之间的数字");
    }
}
