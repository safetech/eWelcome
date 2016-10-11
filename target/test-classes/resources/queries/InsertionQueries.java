package resources.queries;

import resources.utils.DateUtils;
import resources.utils.DbUtils;
import resources.utils.PropertyUtils;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.sql.SQLException;

public class InsertionQueries {
//    String SYS1_TST = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=dbsrt0623.uhc.com)(PORT=1521))(CONNECT_DATA=(SERVER=DEDICATED)(SERVICE_NAME=ace0ts00svc.uhc.com)))";
//   public static String STG_ENV = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=TCP)(HOST=orass0088.uhc.com)(PORT=1521))(CONNECT_DATA=(SERVER=DEDICATED)(SERVICE_NAME=acest02.uhc.com)))";

    String currentDate = DateUtils.DD_MMM_YYYY_FORMAT.format(new java.util.Date());

//    public String insertTestData = "insert into is_prefs.ecomm_transaction(token, transaction_id, transaction_start_date, Date_of_birth, user_id, state, Email_address, " +
//            "created_by, last_modified_by, Creation_date, Last_modified_date, " +
//            "Offer_focus, MS_MSLT_IND, INDEMNT_IND, PHIP_IND, INSURED_STATUS_CODE)"
//            +" values "+
//            "('%s', '%s', '%s', '%s', '%s', '%s', '%s', 'Fluentlenium', 'Automator','"+ currentDate +"','"+ currentDate + "'," +
//            "'%s', '%s', '%s', '%s', '%s')";

    public static String insertTestData = "insert into IS_PREFS.PERSON_PREFERENCE values (%s,2,1,'%s','UiAuto', sysdate,'Selenium', sysdate)";
    
    
    public String teardownTestData = "delete is_prefs.ecomm_transaction where transaction_id in ('%s')";
    public String teardownTestPrefData = "delete is_prefs.ecomm_person_preference where txn_id in ('%s')";

    public static void insertIntoIsPerf(String User_Id, String Yes_No) throws SQLException, IOException, GeneralSecurityException {
        String query = String.format(insertTestData, User_Id, Yes_No );
        System.out.println("------_____----->"+ query);
        DbUtils.setSingleRecord(query, PropertyUtils.getProperty("compas.db"));
    }


}
