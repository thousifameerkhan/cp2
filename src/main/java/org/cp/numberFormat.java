package org.cp;


import java.sql.SQLException;


public class numberFormat {

    public void test() {


        try {
            // Code that might throw SQLException
            // (e.g., database connection, query execution)
            oracle.sql.NUMBER nn = new oracle.sql.NUMBER("123.12");
            String NLS = "NLS_NUMERIC_CHARACTERS=., NLS_CURRENCY=₹";
            String s = nn.toFormattedText("99999",NLS).trim();
            //String s = nn.toFormattedText("999999999.90",NLS).trim();
            //String s = nn.toFormattedText("999999",NLS).trim();


            String s2 = nn.toFormattedText("00000",NLS).trim();

            System.out.println(s);

        } catch (SQLException e) {
            // Handle the exception
            // (e.g., log the error, display a user-friendly message)
            e.printStackTrace();
            // or
            System.err.println("Database error: " + e.getMessage());
        }
    }

}
