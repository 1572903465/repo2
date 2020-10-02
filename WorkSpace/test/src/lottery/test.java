package lottery;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("输入彩票中随机产生的数字个数n（必须在3到9之间）。");

        int n = input.nextInt();

        System.out.println("输入彩票中需要匹配的最小数字数m（必须在1到n之间）。");

        int m = input.nextInt();

        Lottery lottery = new Lottery(n, m);

        //lottery.printList();

        System.out.println("请用户输入"+n+"个互不相等的猜测的数字");

        for(int i=0;i<n;i++){

            System.out.println("第"+(i+1)+"个");

            int e = input.nextInt();

            if(lottery.addGuess(e)){

            }else{

                System.out.println("您已经猜过这个数了，请重新输入。");

                i--;

            }

        }

        System.out.println("您的中奖结果为:");

        System.out.println("奖金为:"+lottery.getAward()+"RMB");

        System.out.println("彩票的结果和你的结果:");

        lottery.printList();

        input.close();

    }

}