package BinaryConverter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @Test
    void isPowerOfTwo() {

        int[] numArray = {1, 2, 4, 32, 1024};

        for (int num : numArray) {
            Converter converter = new Converter(num);
            assertTrue(converter.isPowerOfTwo());
        }
    }

    @Test
    void isPowerOfTwoFailed() {

        int[] numArray = {0, 3, 12, 14};

        for (int num : numArray) {
            Converter converter = new Converter(num);
            assertFalse(converter.isPowerOfTwo());
        }
    }

    @Test
    void getBinary() {
        {
            Converter converter = new Converter(-1);
            assertEquals("11111111 11111111 11111111 11111111", converter.getBinary());
        }
        {
            Converter converter = new Converter(2);
            assertEquals("00000000 00000000 00000000 00000010", converter.getBinary());
        }
    }
}