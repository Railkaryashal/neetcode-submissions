class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> sumCheck = new HashMap<>();
        int[] indices= new int[2];
        for (int i=0; i< nums.length; i++){
            int complement = target- nums[i];

            if(sumCheck.containsKey(complement)){
                indices[1]=i;
                indices[0]= sumCheck.get(complement);
            }

            sumCheck.put(nums[i],i);

        }
        
        return indices;
    }
}
