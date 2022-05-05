class Algo {
  public int[] twoSum(int[] nums, int target) {
    
        Map<Integer, Integer> mappings = new HashMap<>();
    
        for (int i = 0; i < nums.length; i++)
            mappings.put(nums[i], i);
    
        for (int i = 0; i < nums.length; i++) {
 
            int complement = target - nums[i];
            if (mappings.containsKey(complement) && mappings.get(complement) != i)
                return new int[] {i, mappings.get(complement)};
        }
        return null;  
  }
}
