package JavaCore1;

import java.util.Arrays;

//Write a program that reads an array of ints and checks if the array is sorted ascending (from smallest to largest number).
//
//Input data format:
//The first line contains the size of an array.
//The second line contains elements of the array separated by spaces.
//
//Output data format:
//Only a single value: true or false.
//
//Sample Input 1:
//        4
//        1 2 3 4
//Sample Output 1:
//True
//
//Sample Input 2:
//        4
//        1 2 3 0
//Sample Output 2:
//        false

public class Task1 {
    public static void main(String[] args) {
        System.out.println(isSortedAscending("4\n1 2 3 4"));
        System.out.println(isSortedAscending("4\n1 2 3 0"));
    }

    static boolean isSortedAscending(String s) {
        // first line is the length
        // second line contains numbers separated by spaces
        String[] lines = s.split("\n");
        int size = Integer.parseInt(lines[0]);
        String[] stringNums = lines[1].split(" ");
        if (size != stringNums.length) {
            throw new RuntimeException("Actual size doesn't match declared size.");
        }
        int[] nums = Arrays.stream(stringNums)
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                return false;
            }
        }
        return true;
    }
}