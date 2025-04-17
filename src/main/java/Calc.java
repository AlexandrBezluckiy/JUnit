public class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA + numB;
    }

    public int minus(int a, int b) {
        return a - b;
    }

    public int minus(String a, String b) {
        int numA = Integer.parseInt(a);
        int numB = Integer.parseInt(b);
        return numA - numB;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double multiply(String a, String b) {
        double numA = Double.parseDouble(a);
        double numB = Double.parseDouble(b);
        return numA * numB;
    }

    public double divide(double a, double b) {
        return a / b;
    }

    public int square(int a) {
        return a * a;
    }
}
