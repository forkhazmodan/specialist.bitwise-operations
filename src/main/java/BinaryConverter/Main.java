package BinaryConverter;

public class Main {
    public static void main(String[] args) {

        int[] numArray = {-1, 1, 2, 3, 4, 128};

        for (int num : numArray) {
            Converter converter = new Converter(num);

            System.out.println(
                String.format("%d == 2 to the power n? ==> %s",
                        num,
                        converter.isPowerOfTwo() ? "true" : "false"
                )
            );

            System.out.println(
                String.format("%d to binary string ==> %s",
                        num,
                        converter.getBinary()
                )
            );

            System.out.println("\n");
        }
    }
}
