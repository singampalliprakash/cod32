class MathUtil {
    public static int multiply(int a, int b) {
        return a * b;
    }
}

public class Main {
    public static void main(String[] args) {
        int result = MathUtil.multiply(4, 3);
        System.out.println("Product: " + result);  
    }
}
