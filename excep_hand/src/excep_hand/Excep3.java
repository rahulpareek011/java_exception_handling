package excep_hand;

import java.io.IOException;
import java.sql.SQLException;   // ✅ Added this

public class Excep3 {

    // Method that always throws ArithmeticException
    void show() throws ArithmeticException {
        throw new ArithmeticException("From show()");
    }

    // Method that calls show() and handles ArithmeticException
    void display() throws IOException {
        try {
            show();
        } catch (ArithmeticException e) {
            System.out.println("Caught in display(): " + e);
        }
    }

    // Method that demonstrates checked exception
    void register() throws SQLException {
        // throw instead of just creating objects
        throw new SQLException("From register()");
    }

    // Main method
    public static void main(String[] args) {
        Excep3 d1 = new Excep3();

        try {
            d1.display();
        } catch (IOException e) {
            System.out.println("Caught in main(): " + e);
        }

        try {
            d1.register();
        } catch (SQLException e) {
            System.out.println("Caught in main(): " + e);
        }
    }
}
