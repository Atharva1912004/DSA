package Array;

import java.util.HashMap;
import java.util.Map;

class TwoSum{
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement), i};
            }

    map.put(nums[i], i);

        }

        // If no solution is found, return an empty array
        return new int[0];
    }
    public static void main(String[] args){
        int[] array={1,2,3,5,3,5,6};
        int[] result=twoSum(array,6);
        System.out.println(result[0]+","+result[1]);
    }
}
