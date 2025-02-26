import java.util.Arrays;

public class SequentialSearcher {
    
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5};
        int v = 1;

        System.out.println(find(arr, v));
        System.out.println(count(arr, v));
        System.out.println(max(arr));
        System.out.println(sum(arr));
        System.out.println(minOdd(arr));
        System.out.println(containsDuplicates(arr));
        System.out.println(Arrays.toString(even(arr)));
        System.out.println(isSorted(arr));
        System.out.println(sortOrder(arr));
    }
    
    private static int find(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    private static int count(int[] array, int value) {
        int count = 0;
        for (int num : array) {
            if (num == value) {
                count++;
            }
        }
        return count;
    }

    private static int max(int[] array) {
        int largest = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    private static int sum(int[] array) {
        int total = 0;
        for (int num : array) {
            total += num;
        }
        return total;
    }

    private static int minOdd(int[] array) {
        int oddSmallest = Integer.MAX_VALUE;
        for (int num : array) {
            if ((num % 2 != 0) && (num < (oddSmallest))) {
                oddSmallest = num;
            }
        }
        return oddSmallest;
    }

    private static boolean containsDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int[] even(int[] array) {
        int[] newArr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newArr[i] = array[i];
            }
        }

        int count = 0;
        for (int num : newArr) {
            if ((num % 2 == 0) && (num != 0)) {
                count++;
            }
        }

        int[] finalArr = new int[count];
        int j = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (newArr[i] != 0) {
                finalArr[j] = newArr[i];
                j++;
            }
        }
        return finalArr;
    }

    // Doesn't work
     private static boolean isSorted(int[] array) {
        int count = 0;
        int num = array[0];

        for (int i = 1; i < array.length; i++) {
            if (num < array[i]) {
                count++;
                num = array[i];
            }
        }

        return count == array.length;
     }

     private static int sortOrder(int[] array) {
         int countAsc = 0;
         int countDesc = 0;
         int num = array[0];

         for (int i = 1; i < array.length; i++) {
             if (num < array[i]) {
                 countAsc++;
                 num = array[i];
             } else if (num > array[i]) {
                 countDesc++;
             }
         }

         if (countAsc == array.length) {
             return 1;
         } else if (countDesc == array.length) {
             return -1;
         } else {
             return 0;
         }
     }
}
