
import java.sql.Connection;
import java.sql.DriverManager;

public class re {
    public static Connection getCon()
    {
        Connection con=null;
       
        try
         {
          con=DriverManager.getConnection("Jdbc:Odbc:Billing_System");

        }
        catch(Exception ex)
        {

        }
        return con;
    }

}
