package demo05;


public class Demo5_41 {
    public static void main(String[] args) {
        Person41 per=new Person41("张三",30);
        Book41 book =new Book41("JAVA核心技术",90.0);
        per.setBook(book);
        book.setPerson(per);
        System.out.println("从人找到书 -->姓名："+per.getName()+" 年龄："+per.getAge()+
                " 书名："+per.getBook().getTitle()+" 价格："+per.getBook().getPrice());
        System.out.println("从书找到人 -->书名:"+book.getTitle()+" 价格："+book.getPrice()+
                " 人名："+book.getPerson().getName()+" 年龄："+book.getPerson().getAge());
    }
}
class Person41 {
    private String name;
    private int age;
    private Book41 book;

    public Person41(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public Book41 getBook() {
        return book;
    }

    public void setBook(Book41 book) {
        this.book = book;
    }
}
class Book41{
    private String title;
    private double price;
    private Person41 person;

    public Book41(String title, double price) {
        this.title = title;
        this.price = price;
    }

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

    public Person41 getPerson() {
        return person;
    }

    public void setPerson(Person41 person) {
        this.person = person;
    }
}
