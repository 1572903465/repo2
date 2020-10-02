package demo05;

public class Demo5_15 {
    private String stuno;
    private String name;
    private float math;
    private float english;
    private float computer;

    public Demo5_15(String stuno, String name, float math, float english, float computer) {
        this.stuno = stuno;
        this.name = name;
        this.math = math;
        this.english = english;
        this.computer = computer;
    }

    public Demo5_15() {
    }

    public String getStuno() {
        return stuno;
    }

    public void setStuno(String stuno) {
        this.stuno = stuno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getEnglish() {
        return english;
    }

    public void setEnglish(float english) {
        this.english = english;
    }

    public float getComputer() {
        return computer;
    }

    public void setComputer(float computer) {
        this.computer = computer;
    }
    public float sum(){
        return math+english+computer;
    }
    public float avg(){
        return this.sum()/3;
    }
    public float max(){
        float max=math;
        max = max > english ? max:english;
        max = max > computer ? max:computer;
        return max;
    }
    public float min(){
        float min =math;
        min = math < english ? math : english;
        min = math < computer ? math : computer;
        return min;
    }
}
