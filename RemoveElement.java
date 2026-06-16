import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 6, 2};
        int valueToRemove = 6;

        int count = 0;

        for (int num : arr) {
            if (num != valueToRemove) {
                count++;
            }
        }

        int[] newArr = new int[count];
        int index = 0;

        for (int num : arr) {
            if (num != valueToRemove) {
                newArr[index++] = num;
            }
        }

        System.out.println( newArr.length);
    }
}