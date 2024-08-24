public class Perfect {
    public static void main(String[] args) {
        int n = 36;  
        int sqrt = (int) Math.sqrt(n);  
        if (sqrt * sqrt == n) {
            System.out.println(n + " is a perfect square");
        } else {
            System.out.println(n + " is not a perfect square");
        }
    }
}
