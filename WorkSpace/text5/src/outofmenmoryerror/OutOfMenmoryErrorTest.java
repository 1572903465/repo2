package outofmenmoryerror;

public class OutOfMenmoryErrorTest {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try
        {
            int len = Integer.MAX_VALUE;
            int largArray[] = new int[len];
            System.out.println(len);
        }
        catch (OutOfMemoryError ex)
        {
            System.out.println(Runtime.getRuntime().freeMemory()/(1024 * 1024));
            System.out.println(Runtime.getRuntime().totalMemory()/(1024 * 1024));
            System.out.println(Runtime.getRuntime().maxMemory()/(1024 * 1024));
            System.out.println(ex.getMessage());

        }
        finally
        {
            System.gc();
            System.out.println(Runtime.getRuntime().freeMemory()/(1024 * 1024));
            System.out.println(Runtime.getRuntime().totalMemory()/(1024 * 1024));
            System.out.println(Runtime.getRuntime().maxMemory()/(1024 * 1024));
           // System.out.println(ex.getMessage());
        }
    }
}
