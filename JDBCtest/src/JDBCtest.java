import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by kritisharma on 4/18/20.
 */
public class JDBCtest
{
    public static void main(String[] args)
    {
        try
        {
            Connection connect = DriverManager.getConnection("jdbc:sqlite:/Users/kritisharma/projects/java/JDBCtest/connectJava.db");

            //using statement objects to use sql with jdbc
            Statement statement = connect.createStatement();
            //created a statement object by calling a connection method
            //can only be run against the database we connected to
            statement.execute("CREATE TABLE contacts (name TEXT, phone INTEGER, email TEXT)");

        }

        catch(SQLException e)
        {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
