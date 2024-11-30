import homework2.ArrayOperation;

public class Main {
    public static void main(String[] args) {

        int[] array1 = {0, 5, 54, 25, 87, 4, 2, 44, 88};
        int[] array2 = {1, 2, 1, 1, 5, 6, 0, 1, 1};
        System.out.println(ArrayOperation.countEven(array1));

        System.out.println(ArrayOperation.calculateDifference(array1));

        System.out.println(ArrayOperation.findTheTruth(array2));
    }
}
