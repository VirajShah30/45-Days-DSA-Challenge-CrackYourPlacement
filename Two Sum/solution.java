class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> visited = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int com = target - nums[i];
             if (visited.containsKey(com)) {
                return new int[]{visited.get(com), i};
            }
            visited.put(nums[i], i);
        }
        return new int[]{};
    }
}
