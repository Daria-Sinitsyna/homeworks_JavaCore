package homework2;
/**
 * Написать метод, возвращающий количество чётных элементов массива.
 * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
 *
 * Написать функцию, возвращающую разницу между самым большим и
 * самым ма- леньким элементами переданного не пустого массива.
 *
 * Написать функцию, возвращающую истину, если в переданном массиве
 * есть два соседних элемента, с нулевым значением.
 */



public class ArrayOperation {

    public static int countEven(int[] array){
        int count = 0;
        for(int element : array){
            if(element%2 == 0){
                count++;
            }
        }
        return count;
    }

    public static int calculateDifference(int[] array){
        int max = getMax(array);
        int min = getMin(array);

        int diff = max - min;
        return diff;
    }

    public static int getMin(int[] array){
        int min = array[0];
        for(int element : array) {
            if (element < min) {
                min = element;
            }
        }

        return min;
    }

    public static int getMax(int[] array){
        int max = array[0];
        for(int element : array) {
            if (element > max) {
                max = element;
            }
        }

        return max;
    }

    public static Boolean findTheTruth(int[] array){

        for (int i = 0; i < array.length - 1; i++) {
            if(array[i] == 0 & array[i+1] == 0){
                return true;
            }
        }
        return false;
    }
}
