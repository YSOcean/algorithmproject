package com.ys.algorithmproject.leetcode.array;
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
//
// 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
//
//
//
// 示例 1:
//
//
//输入: nums = [0,1,0,3,12]
//输出: [1,3,12,0,0]
//
//
// 示例 2:
//
//
//输入: nums = [0]
//输出: [0]
//
//
//
// 提示:
//
//
//
// 1 <= nums.length <= 104
// -231 <= nums[i] <= 231 - 1
//
//
//
//
// 进阶：你能尽量减少完成的操作次数吗？
// Related Topics 数组 双指针
// 👍 1594 👎 0
// https://leetcode.cn/problems/move-zeroes/
public class MoveZeroes {

    /**
     * 解法1：两层遍历
     * ①、外层遍历，遇到值为0时，停止
     * ②、外层停止时，内层开始遍历，遇到不为 0 时停止
     * ③、内层遍历停止后，交换内外下标值，然后内层循环终止
     * @param nums
     */
    public static void moveZeroes1(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] == 0){
                for (int i = j+1; i < nums.length; i++) {
                    if(nums[i] != 0){
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                }
            }
        }
    }


    /**
     * 解法2:
     * ①、声明一个下标索引index，表示非0值
     * ②、遍历数组，遇到非0的值，将该非0值赋予index表示的值，并且index+1
     * ③、遍历完成，数组从0-index 都是非0值，那么后面的值不用考虑，直接全部赋予0就行了
     * @param nums
     */
    public static void moveZeroes2(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int index = 0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != 0){
                nums[index++] = nums[j];
            }
        }
        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    /**
     * 解法3:
     * ①、声明两个下标指针，slow 表示非零下标，fast表示向前遍历下标
     * ②、fast 表示的值不为0时，和 slow 进行交换，交换后 slow+1
     * @param nums
     */
    public static void moveZeroes3(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int slow = 0, fast = 0;
        while(fast < nums.length){
            if(nums[fast] != 0){
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
            fast++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3,0,1,4,8,0,2};
        moveZeroes3(nums);
        System.out.println(nums);
    }


}
