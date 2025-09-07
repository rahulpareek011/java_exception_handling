package excep_hand;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) {

        // FileNotFoundException
        try {
            FileReader f3 = new FileReader("rahul.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException: " + e);
        }

        // ClassNotFoundException
        try {
            Class.forName("com.unknown.Class");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException: " + e);
        }

        // SQLException
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root", "pass");
        } catch (SQLException e) {
            System.out.println("SQLException: " + e);
        }

        // NoSuchMethodException
        try {
            Demo.class.getMethod("unknowMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException: " + e);
        }
        
        // MalformedURLException
        try {
        	URL url = new URL("htp://wrongurl");
        } catch(MalformedURLException e) {
        	System.out.println(e);
        }
        
    }
}
