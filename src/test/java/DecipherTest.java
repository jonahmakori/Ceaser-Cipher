import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class DecipherTest {
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


    @Test
    public void runCipher_gettingTheDecryptedText_ArrayList(){
        Decipher testCipher = new Decipher("dag",2);
        assertEquals("bye",testCipher.getDecryptedText());
    }
}






