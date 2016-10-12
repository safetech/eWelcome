package resources.queries;

import resources.utils.DbUtils;
import resources.utils.PropertyUtils;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;

/**
 * Created by sislam13 on 10/12/16.
 */
public class DeletionQueries {

    public static String teardownTestData = "delete IS_PREFS.PERSON_PREFERENCE where user_id in ('%s')";
    

    public static void deleteIsPerf(String User_Id) throws SQLException, IOException, GeneralSecurityException {
        String query = String.format(teardownTestData, User_Id);
        System.out.println("------_____----->"+ query);
        DbUtils.setSingleRecord(query, PropertyUtils.getProperty("compas.db"));
    }
}
