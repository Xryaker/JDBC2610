import dataobjects.AdressTable;
import mysqlconfig.StatemenT;
import mysqlconfig.enums.ADRESSFIELDS;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.SQLException;

public class TestDB {
    static StatemenT statemenT;
    @BeforeClass
    public static void b(){
        statemenT=new StatemenT();
    }
    @Test
    public void test1() throws SQLException {
       statemenT.selectByFieldName(ADRESSFIELDS.NAME,"Vasiliy");
    }
    @Test
    public void test2() throws SQLException {
        Assert.assertNotNull(statemenT.selectByFieldName(ADRESSFIELDS.NAME,"Elena").email);
    }
    @Test
    public void test3() throws SQLException {
        for (AdressTable l:statemenT.selectListTablesMail(ADRESSFIELDS.EMAIL,"hhh.com")){
            System.out.println(l);
        }
    }
}
