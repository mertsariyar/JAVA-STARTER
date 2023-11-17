public class test1 {
  static int power(int base, int exp) {
        int result = 1;
        for (int i = 0; i<exp; i++) {
            result *= base;
        }
        return result;
    }


    public static void main(String[] args) {
        int case1 = power(5, 2);
        System.out.println(case1);
    }
}
