class Algo {
  
  public int[] evaluate(int[] nums, int target) {
  
    Map<Integer, Integer> stored = new HashMap<>();
    
    for (int i = 0; i < nums.length; i++) {
    
        if (map.containsKey(target - nums[i]))
          return new int[] {i, map.get(target - nums[i])};
        
        map.put(nums[i], i);
    
    }
    
    return null;
    
  }

}
