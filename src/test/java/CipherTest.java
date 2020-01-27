import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class CipherTest {

   @Test
    public void  runCipher_gettingTheText_ArrayList() {
       Cipher testCipher = new Cipher("bye", 2);
       assertEquals("bye", testCipher.getText());

   }
    @Test
    public void runCipher_gettingTheNumbers_ArrayList(){
        Cipher testCipher = new Cipher("bye",2);
        assertEquals(2,testCipher.getNumbers());
       }

   }
