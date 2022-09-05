import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void converts_to_string_one() {
        assertEquals("1", FizzBuzz.convert(1));
    }

    @Test
    void converts_to_string_two() {
        assertEquals("2", FizzBuzz.convert(2));
    }
    @Test
    void converts_to_string_four() {
        assertEquals("4", FizzBuzz.convert(4));
    }
}