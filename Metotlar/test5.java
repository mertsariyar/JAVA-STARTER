public class test5 {

    static int fib(int n) {
        if(n==1 || n==0) return 1;
        return fib(n-1) + fib(n-2);
    }
    
    public static void main(String[] args) {
        // 1 1 2 3 5 8 13 21 ... şeklinde giden sayılardır
        System.out.println(fib(10));

    }
}
