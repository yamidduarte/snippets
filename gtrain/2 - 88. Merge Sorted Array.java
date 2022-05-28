class Solution { // O(n + m) , O(1) 
    
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        var p1 = m - 1;
        var p2 = n - 1;
        var i = m + n - 1;
        
        while (p2 >= 0) {
            
            if (p1 >= 0 && nums1[p1] > nums2[p2])
                nums1[i--] = nums1[p1--];
            else
                nums1[i--] = nums2[p2--];
            
        } 
    }
}
