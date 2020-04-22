package day20_ArraysContinue;

public class Array_Size {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
     //   System.out.println( arr1[100] ); // it returns ban out!
                            // (Because array's size is fixed (which mean 2, in this situation)

      int[] nums = new  int[2]; //  {0, 0}; 0 ~ 1

        nums[0] = 10;
        nums[1] = 20;
      // nums[2] = 30; => it returns ban out! array's size is fixed

        System.out.println(nums[0]); // 10
        System.out.println(nums[1]); // 20

        nums = new int[3]; // Reset

        System.out.println(nums[0]); // 0 => Not the 10. Because re-assigned, reset (Line 19). And not initialized
        System.out.println(nums[1]); // 0 => Not the 20. Because re-assigned, reset (Line 19)
        System.out.println(nums[2]); // 0





    }
}
