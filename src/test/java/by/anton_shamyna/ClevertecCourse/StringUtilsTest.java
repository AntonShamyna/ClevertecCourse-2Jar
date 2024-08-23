package by.anton_shamyna.ClevertecCourse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @Test
    public void testIsPositiveNumber() {
        StringUtils numberUtils = new StringUtils();

        assertTrue(numberUtils.isPositiveNumber("10"));
        assertTrue(numberUtils.isPositiveNumber("10.234"));
        assertFalse(numberUtils.isPositiveNumber(""));
        assertFalse(numberUtils.isPositiveNumber(null));
        assertFalse(numberUtils.isPositiveNumber("NotNumber"));
        assertFalse(numberUtils.isPositiveNumber("-10"));
        assertFalse(numberUtils.isPositiveNumber("-10.234"));
    }
}
