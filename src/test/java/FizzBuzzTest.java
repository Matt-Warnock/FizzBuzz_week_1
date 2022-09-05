import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void converts_to_string_one() {
        assertEquals("1", FizzBuzz.convert(1));
    }

}