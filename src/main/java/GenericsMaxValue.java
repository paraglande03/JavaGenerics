public class GenericsMaxValue {
    public static void main(String[] args) {
        printMax(testMaximumInteger(100, 200, 400));
    }
    public static int testMaximumInteger(Integer x, Integer y, Integer z) {
        Integer max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }
    private static void printMax(Integer max) {
        System.out.println(" Maximum number is : " + max);
    }
}
