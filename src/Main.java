import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = new int[10];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            if (arr[i] == arr.length) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.println();
        System.out.println(Arrays.toString(arr));

        String str = Arrays.toString(arr);
        System.out.println(str);

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        boolean isEqual = true;

        if (arr.length == arr2.length) {
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != arr2[i]) {
                    isEqual = false;
                    break;
                }
            }
        } else {
            isEqual = false;
        }

        if (isEqual) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

        int sum = 0;

        for (int num : arr2) {
            sum += num;
        }

        System.out.println(sum);

        int[] arr3 = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(arr3));

        Arrays.sort(arr);
    }
}