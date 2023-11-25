package app;

public class Main07 {
    static double res;
    private static final String EUR = "EUR";

    public static void main(String[] args) {

        int[] priceproducts = {2, 3, 278, 2306, 1909, 50, 123,};
        res = 0;
        for (int priceproduct : priceproducts) {
            res += priceproduct;
        }

        for (int num = 0; num < priceproducts.length; num++) {
            for (int num2 = 1; num2 < (priceproducts.length - num - 1); num2++) {
                if (priceproducts[num2] > priceproducts[num2 + 1]) {
                    int temp = priceproducts[num2];
                    priceproducts[num2] = priceproducts[num2 + 1];
                    priceproducts[num2 + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted price:");

        int num = 0;
        while (num < priceproducts.length) {
            num++;
            System.out.print(num + " day price product " + priceproducts[num - 1] +
                    " " + EUR + " " + "\n");

        }
        System.out.printf("Average price for the entire period: %.2f", res / priceproducts.length);
    }
}



