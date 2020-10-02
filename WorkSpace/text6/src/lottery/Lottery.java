package lottery;

import java.util.*;

public class Lottery {
    private int n;
    private int m;
    public Lottery(int n,int m){
        this.n=n;
        this.m=m;
    }
    public void setM(int m){
        this.m=m;
    }
    public void setN(int n){
        this.n=n;
    }
    public int getM(){
        return this.m;
    }
    public int getN(){
        return this.n;
    }
    List<Integer> lsit=new ArrayList<Integer>();



}
