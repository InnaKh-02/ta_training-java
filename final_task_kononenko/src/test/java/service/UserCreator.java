package service;

import model.User;
import util.TestDataReader;

public class UserCreator {
    private static final String TESTDATA_UC1_USERNAME = "testdata.uc1.username";
    private static final String TESTDATA_UC1_PASSWORD = "testdata.uc1.password";
    private static final String TESTDATA_UC1_LOG = "testdata.uc1.log";

    private static final String TESTDATA_UC2_USERNAME = "testdata.uc2.username";
    private static final String TESTDATA_UC2_PASSWORD = "testdata.uc2.password";
    private static final String TESTDATA_UC2_LOG = "testdata.uc2.log";

    private static final String TESTDATA_UC3_USERNAME = "testdata.uc3.username";
    private static final String TESTDATA_UC3_PASSWORD = "testdata.uc3.password";
    private static final String TESTDATA_UC3_LOG = "testdata.uc3.log";

    public static User getInfoUC1(){
        return new User(TestDataReader.getTestData(TESTDATA_UC1_USERNAME),
                TestDataReader.getTestData(TESTDATA_UC1_PASSWORD), TestDataReader.getTestData(TESTDATA_UC1_LOG));
    }
    public static User getInfoUC2(){
        return new User(TestDataReader.getTestData(TESTDATA_UC2_USERNAME),
                TestDataReader.getTestData(TESTDATA_UC2_PASSWORD), TestDataReader.getTestData(TESTDATA_UC2_LOG));
    }
    public static User getInfoUC3(){
        return new User(TestDataReader.getTestData(TESTDATA_UC3_USERNAME),
                TestDataReader.getTestData(TESTDATA_UC3_PASSWORD), TestDataReader.getTestData(TESTDATA_UC3_LOG));
    }
}
