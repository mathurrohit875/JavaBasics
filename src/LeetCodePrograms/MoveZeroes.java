package LeetCodePrograms;

public class MoveZeroes {

  public static void main(String[] args) {
    int[] nums = {0, 1, 0, 3, 12};
    int temp = nums[0];
    for (int i = 0; i < nums.length - 1; i++) {

      if (nums[i] == 0) {
        nums[i] = nums[i + 1];
        nums[i + 1] = 0;
      }

      //System.out.println(nums[i]);
    }
    // Print the array after modification
    for (int num : nums) {
      System.out.print(num + " ");
    }


  }
}
