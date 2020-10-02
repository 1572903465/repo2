package lottery;

import java.io.*;
import java.util.ArrayList;

import java.util.Collection;

import java.util.HashSet;

import java.util.Random;

import java.util.Set;

import java.util.List;



public class Lottery {

    private int n=3,m=1,flag=0;

    public int getFlag() {
        return flag;

    }

    public void ListFlag(int flag) {

        this.flag = flag;

    }

    public int getN() {

        return n;

    }

    public void ListN(int n) {

        this.n = n;

    }

    public int getM() {

        return m;

    }

    public void ListM(int m) {

        this.m = m;

    }

    private List<Integer> list = new ArrayList<Integer>();

    private Set<Integer> set = new HashSet<Integer>();

    private List<Integer> s = new ArrayList<Integer>();

    private Set<Integer> s1 = new HashSet<Integer>();

    public Boolean addGuess(int e){

        if(s1.add(e)){

            s.add(e);

            return true;

        }else{

            return false;

        }

    }

    public double getAward(){

        if(list.equals(s)){

            System.out.println("猜对了"+this.n+"个且顺序一样，祝贺你!");

            return Math.pow(8,this.n)*100;

        }else if(list.containsAll(s)){

            System.out.println("猜对了"+this.n+"个但顺序不一样！");

            return Math.pow(6,this.n);

        }else{

            if(getAllCombinations(list)>=this.m){

                return Math.pow(2,getAllCombinations(list))*100;

            }else{

                System.out.println("很遗憾，你不满足最低要求个数~");

                return 0;

            }

        }

    }

    private int getAllCombinations(List<Integer> list2) {

        int sum=0;
        int nCnt = list.size();

        int nBit = 1<<nCnt;

        for (int i =1; i<= nBit; i++) {

            List temp = new ArrayList<Integer>();

            for (int j = 0; j< nCnt; j++) {

                if ((i<< (31 - j))>> 31 == -1) {

                    // System.out.print(list.get(j)+" ");?

                    temp.add(list.get(j));

                }

            }
            if(s.containsAll(temp)){

                sum=Math.max(sum, temp.size());

            }

            //System.out.println("");

        }

        System.out.println("猜对了"+sum+"个");

        return sum;

    }

    public boolean containsAll(Collection<?> c) {

        return list.containsAll(c);

    }

    public boolean containsAlls(Collection<?> c) {

        return s.containsAll(c);

    }

    public Lottery(int n,int m) {

        this.m=m;

        this.n=n;

        Random rand = new Random();
        for(int i=0;i<n;i++){
            int x = rand.nextInt(100) ;
            if(set.add(x)){

                list.add(x);

            }else{

                i--;

            }

        }

    }



    public void printList(){

        System.out.println(list);

        System.out.println(s);

    }

    public boolean equals(Object o) {

        return list.equals(o);

    }

}





