package NotFinished;

import java.util.Arrays;
import java.util.Random;

/*
* Status: DONE
* Level: 🟡🟡🟡
* Time Complexity: 😢
* */
public class N_912 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }

        System.out.println("Before");
        System.out.println(Arrays.toString(numbers));

        quickSort(numbers, 0, numbers.length - 1);

        System.out.println("\nAfter");
        System.out.println(Arrays.toString(sortArray(numbers)));
    }

    public static int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private static void quickSort(int[] nums, int lowIndex, int highIndex) {

        if (lowIndex >= highIndex) return;

        int pivot = nums[highIndex];

        int leftPointer = lowIndex;

        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (nums[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (nums[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(nums, leftPointer, rightPointer);
        }
        swap(nums, leftPointer, highIndex);
        quickSort(nums, lowIndex, leftPointer - 1);
        quickSort(nums, leftPointer + 1, highIndex);

    }

    private static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

}