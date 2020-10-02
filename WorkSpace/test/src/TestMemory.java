public class TestMemory {

    static final int SIZE=1700*1024*1024;

  public static void main(String[] args) {

                             System.out.println("程序运行开始时:");

                             System.out.println("空闲内存:"+Runtime.getRuntime().freeMemory() / 1024 / 1024);

                             System.out.println("总内存:"+Runtime.getRuntime().totalMemory() / 1024 / 1024);

                            System.out.println("最大内存:"+Runtime.getRuntime().maxMemory() / 1024 / 1024);

                            System.out.println("=============");

                            System.out.println("分配一个超过最大内存的数组为1700*1024*1024后");

  try {

 int[] i = new int[SIZE];

  }catch (OutOfMemoryError ee) {

  System.out.println("产生了OutOfMemoryError!异常");

 }

 finally {

  System.gc();

  }

                   System.out.println("使用System.gc()方法后恢复异常:");

                   System.out.println("空闲内存:"+Runtime.getRuntime().freeMemory() / 1024 / 1024);

                   System.out.println("总内存:"+Runtime.getRuntime().totalMemory() / 1024 / 1024);

                   System.out.println("最大内存:"+Runtime.getRuntime().maxMemory() / 1024 / 1024);

                   System.out.println("=============");

    }

}


