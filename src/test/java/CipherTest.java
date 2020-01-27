import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.*;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

public class CipherTest {
    @Test
    public void encoder_encodeInput_shouldEncodeCharacter_String() {
        Encode testEncoder = new Encode();
        String expectedOutput = "N";
        assertEquals( expectedOutput, testEncoder.encrypting("K" ,3));
    }

    @Test
    public void encode_encodeInput_shouldEncodeWord_String() {
        Encode testEncoder = new Encode();
        String expectedOutput = "NO";
        assertEquals( expectedOutput, testEncoder.encrypting("KL",3));
    }
}
