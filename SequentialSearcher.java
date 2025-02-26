public class SequentialSearcher {
    
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 1, 5, 9};
        int v = 1;

        System.out.println(find(arr, v));
        System.out.println(count(arr, v));
        System.out.println(max(arr));
        System.out.println(sum(arr));
        System.out.println(minOdd(arr));
        System.out.println(containsDuplicates(arr));
        System.out.println(even(arr));
        // System.out.println(isSorted(arr));
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
        return newArr;
    }

    // private static boolean isSorted(int[] array) {

    // }
}
