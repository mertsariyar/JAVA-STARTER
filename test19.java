public class test19 {
    public static void main(String[] args) {
        int n = 50; // Fibonacci serisinin ilk n terimi için istediğiniz sayıyı kullanabilirsiniz.

        System.out.println("Fibonacci Serisi:");

        int fib1 = 0, fib2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(fib1 + " ");

            int toplam = fib1 + fib2;
            fib1 = fib2;
            fib2 = toplam;
        }
    }
    
}
