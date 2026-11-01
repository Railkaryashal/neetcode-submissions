class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> numbers= new HashMap<>();

        int subtraction;
        int[] answer=new int[2];
        int foundNumberIndex;
        for (int i=0; i< nums.length; i ++){
            subtraction = target - nums[i];
            
            if(numbers.containsKey(subtraction)){
                foundNumberIndex=numbers.get(subtraction);
                answer[0]= foundNumberIndex;
                answer[1]= i;
                // answer="["+foundNumberIndex+","+i+"]";
            }
            else{
                numbers.put(nums[i], i);
            }  
            
            
        }
        return answer;
        
    }
}
