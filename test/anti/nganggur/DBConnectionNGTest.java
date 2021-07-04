
package anti.nganggur;

import java.sql.Connection;
import static org.testng.Assert.*;
import org.testng.annotations.Test;
public class DBConnectionNGTest {
    
    public DBConnectionNGTest() {
    }

    @Test
    public void testGetConnection() {
        System.out.println("getConnection");
        Connection result = DBConnection.getConnection();
        assertEquals(result!= null,true);
        
    }
    
    @Test
    public void test() {
        
    }
    
}
