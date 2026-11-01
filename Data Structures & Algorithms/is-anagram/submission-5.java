class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character, Integer> countS= new HashMap<>();
        Map<Character, Integer> countT= new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }    
        for(int i =0; i< s.length();i++){
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0)+1);
        }
        for(int j =0; j< t.length();j++){
            countT.put(t.charAt(j), countT.getOrDefault(t.charAt(j), 0)+1);
        }

        if(countS.equals(countT)){
            return true;
        }
        return false;
    }
}
