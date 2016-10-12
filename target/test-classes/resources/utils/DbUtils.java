package resources.utils;

import oracle.jdbc.pool.OracleDataSource;

import java.sql.*;
import java.util.HashMap;

public class DbUtils {

    public static HashMap<String, String> setSingleRecord(String query, String connectionString) throws SQLException {

        OracleDataSource ods = new OracleDataSource();
        ods.setURL(connectionString);
        ods.setUser(System.getProperty("DBUN"));
        ods.setPassword(System.getProperty("DBPW"));
        Connection conn = null;
        try {
            conn = ods.getConnection();
            Statement stmt = conn.createStatement();
            // Prepare to insert new names in the EMP table
            PreparedStatement pstmt = null;
            try{
                // pstmt = conn.prepareStatement ("insert into EMP (EMPNO, ENAME) values (?, ?)");
                pstmt = conn.prepareCall(query);
                pstmt.execute (query);
            }
            finally{
                if(pstmt!=null)
                    // Close the statement
                    pstmt.close();
            }
        } finally {
            if(conn != null && !conn.isClosed()) {
                conn.close();
            }
        }
        return null;
    }
}

//TODO:Created conn string in pom.xml and contunuing to improve