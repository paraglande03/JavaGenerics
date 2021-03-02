public class GenericsMaxValue {
    public static void main(String[] args) {
        printMax(testMaximumInteger(100, 200, 400));
        Double [] b ={1.1,1.2,1.3};
        String [] c = {"parag","lande","patil"};

    }
    public static <E extends Comparable<E>> E max(E[] list) {
        E max = list[0]; //sets the first value in the array as the current maximum
        for (int i = 1; i < list.length; i++) {
            if (list[i].compareTo(max) > 0) //if value in list[i] is greater than max and is positive(greater than 0), the max value is replaced by list[i] {
                max = list[i];
        }
        return max;
    }
    private static <E>void toPrint(E[] max) {
        for (E i:max) {
            System.out.println(i);
        }
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
    public static double testMaximumDouble(Double x, Double y, Double z) {
        Double max1 = x;
        if (y.compareTo(max1) > 0) {
            max1 = y;
        }
        if (z.compareTo(max1) > 0) {
            max1 = z;
        }
        return max1;
    }
    public static String testMaximumString(String first, String second, String third) {
        int max = first.length();
        String letter = first;
        if (second.length() > max) {
            max = second.length();
            letter = second;
        }
        if (third.length() > max) {
            max = third.length();
            letter = third;
        }
        printMax(letter);
        return letter;
    }
    private static void printMax(Integer max) {
        System.out.println(" Maximum number is : " + max);
    }
    private static void printMax(double max) {
        System.out.println(" Maximum double  number is : " + max);
    }
    private static void printMax(String max) {
        System.out.println(" Maximum String length is : " + max);
    }
}
