package com.rudy.study;

public class ProductExceptSelf {
    /*1.全部求积然后分别除以本身 时间O(n)空间O(n)
      2.分别相乘 时间O(n2)空间O(n)
      3.计算索引左右两边乘积
     */

    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[]{};
        answer[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            answer[i] *= answer[i - 1] * nums[i - 1];
        }
        int r = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            answer[i] *= r * answer[i];
            r *= nums[i];
        }
        return answer;
    }
}
