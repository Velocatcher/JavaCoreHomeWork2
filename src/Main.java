//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

//    Написать метод, возвращающий количество чётных элементов массива.
//    countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    public static int countEvens(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }

//    Написать функцию, возвращающую разницу между самым большим и самым маленьким
//    элементами переданного не пустого массива.
    public static int findMaxMinDifference(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max - min;
    }


//    Написать функцию, возвращающую истину, если в переданном
//    массиве есть два соседних элемента, с нулевым значением.

    public static boolean checkForZeroNeighbor(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(countEvens(new int[]{2, 1, 2, 3, 4})); // Выведет 3
        System.out.println(countEvens(new int[]{2, 2, 0})); // Выведет 3
        System.out.println(countEvens(new int[]{1, 3, 5})); // Выведет 0

        int[] arr = {4, 6, 2, 8, 1, 9};
        int difference = findMaxMinDifference(arr);
        System.out.println("Difference between max and min elements: " + difference);

        int[] arrWithNull = {4, 0, 0, 6, 2, 8, 0, 0, 1, 9};
        System.out.println(checkForZeroNeighbor(arrWithNull));
        System.out.println(checkForZeroNeighbor(arr));
    }
}