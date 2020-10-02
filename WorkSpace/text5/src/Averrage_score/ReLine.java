package Averrage_score;

public interface ReLine {
    void add(Object obj);//往列表尾部添加对象
    Object get(int index);//从列表中获取索引为i的对象
    void clear();//清空所有的对象
    boolean isEmpty();//判断列表中是否有对象
    int size();//获取列表中对象的个数
    int capacity();//分配的空间大小
}

