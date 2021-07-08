package TestJava;

import java.io.FileNotFoundException;

public class emp1 {
    public int  processdata()
    {
        try
        {
            Class.forName("TestJava.emp1");
            return 10;

        }
        catch(ClassNotFoundException c)
        {
         return 20;
        }
        finally
        {
            return 30;
        }
    }
    
}
