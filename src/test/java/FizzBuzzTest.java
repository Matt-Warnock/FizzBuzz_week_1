import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "4, 4", "3, Fizz", "6, Fizz", "9, Fizz"})

    void convert_number(int input, String output) {
        assertEquals(output, FizzBuzz.convert(input));
    }
}