/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/

object Solution {

    def twoSum(nums: Array[Int], target: Int): Array[Int] = {

        for(i <- 0 until nums.length)
            println("i is: " + i);
            println("i'th element is: " + nums(i));
            nums
    }

    val nums = Array(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
    val target = 3

    twoSum(nums, target)
}