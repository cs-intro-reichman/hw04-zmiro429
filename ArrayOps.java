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
        int arrl = array.length;
        int max = array[0], secondmax = array[0], finder = 0;
        // this for loop to find the Max in the array
        for (int j = 0; j < arrl; j++) {
            if (max < array[j]) {
                max = array[j];
                finder = j;
            }
        }
        for (int i = 0; i < arrl; i++) {
            if (array[i] == max && i != finder)
                return array[i];
        }
        for (int i = 0; i < arrl; i++) {
            for (int j = 0; j < arrl; j++) {
                int num = array[j];
                if (num > secondmax && num <= max)
                    secondmax = num;
            }
        }
        return secondmax;
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
        String arr1 = Arrays.toString(array);
        boolean dec = true;
        boolean inc = true;
        for (int i = 1; i < arr1.length(); i++) {
            if (dec && arr1.charAt(i - 1) < arr1.charAt(i))
                dec = false;
        }
        for (int i = 0; i < arr1.length(); i++) {
            if (inc && arr1.charAt(i - 1) > arr1.charAt(i))
                inc = false;
        }
        if (inc == true)
            return true;
        else if (dec == true)
            return true;
        else if (!inc && !dec)
            return false;
        return false;
    }

}
