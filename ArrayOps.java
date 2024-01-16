import java.util.Arrays;

public class ArrayOps {
    public static void main(String[] args) {

    }

    public static int findMissingInt(int[] array) {
        // Write your code here:
        int arrl = array.length;
        for (int i = 0; i <= arrl; i++) {
            int m = i;
            boolean doesexist = false;
            for (int j = 0; j < arrl; j++) {
                if (m == array[j]) {
                    doesexist = true;
                    break;
                }
            }
            if (doesexist == false) {
                return m;
            }
        }
        return -1;
    }

    public static int secondMaxValue(int[] array) {
        // Write your code here:
        int max = array[0];
        int secondMax = array[0];
        int maxCount = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
                maxCount = 1;
            } else if (array[i] == max) {
                maxCount++;
            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }
        return maxCount > 1 ? max : secondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        // Write your code here:
        String arr1 = Arrays.toString(array1);
        String arr2 = Arrays.toString(array2);
        for (int i = 0; i < arr1.length(); i++) {
            if (arr2.indexOf(arr1.charAt(i)) == -1) {
                return false;
            }
        }
        for (int i = 0; i < arr2.length(); i++) {
            if (arr1.indexOf(arr2.charAt(i)) == -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int[] array) {
        // Write your code here:
        if (array.length < 2) {
            return true;
        }
        boolean increasing = array[0] <= array[1];
        for (int i = 1; i < array.length - 1; i++) {
            if (increasing && array[i] > array[i + 1]) {
                return false;
            } else if (!increasing && array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
