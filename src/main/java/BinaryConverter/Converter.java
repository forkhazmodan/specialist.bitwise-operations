package BinaryConverter;

public class Converter {

    private int num;

    /**
     * @param num
     */
    public Converter(int num) {
        this.num = num;
    }

    /**
     * Check if expression (2^n = num) true
     * where n > 0
     *
     * @return boolean
     */
    public boolean isPowerOfTwo() {
        return num > 0 && (num & (num - 1)) == 0;
    }

    /**
     * Convert number into binary string
     *
     * @return String
     */
    public String getBinary() {
        StringBuilder strRaw = new StringBuilder();

        for (int i=0;i<32;i++) {
            strRaw.append(num&1);

            num >>= 1;

            switch (i) {
                case 7, 15, 23 -> strRaw.append(" ");
            }
        }

        return strRaw.reverse().toString();
    }
}
