package demo05;

public class Demo5_42 {
    public static void main(String[] args) {
        Person42 per = new Person42("张三",30);
        Person42 cld=new Person42("张草",10);
        Book42 bk=new Book42("java核心技术",49.9);
        Book42 bk2=new Book42("一千零一夜",19.9);
        per.setBook(bk);
        bk.setPerson(per);
        cld.setBook(bk2);
        bk2.setPerson(cld);
        per.setChild(cld);
        System.out.println("从人找到书 --> 姓名:"+per.getName()+" 年龄："+per.getAge()+
                "书名："+per.getBook().getTitle()+"价格："+per.getBook().getPrice());
        System.out.println("从书找到人 --> 书名:"+bk.getTitle()+" 价格："+bk.getPrice()+
                "姓名："+bk.getPerson().getName()+"年龄："+bk.getPerson().getAge());
        System.out.println(per.getName()+" "+per.getChild().getName()+" "+per.getChild().getAge()+" "+per.getChild().getBook().getTitle()+" "+
                per.getChild().getBook().getPrice());
    }
}
class Person42{
    private String name;
    private int age;
    private Book42 book;
    private Person42 child; //调用自己的类作为属性

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Book42 getBook() {
        return book;
    }

    public void setBook(Book42 book) {
        this.book = book;
    }

    public Person42 getChild() {
        return child;
    }

    public void setChild(Person42 child) {
        this.child = child;
    }

    public Person42(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Book42{
    private String title;
    private double price;
    private Person42 person;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Person42 getPerson() {
        return person;
    }

    public void setPerson(Person42 person) {
        this.person = person;
    }

    public Book42(String title, double price) {
        this.title = title;
        this.price = price;
    }
}