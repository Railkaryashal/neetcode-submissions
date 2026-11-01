class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> checkAnagramS = new HashMap<>();
        Map<Character, Integer> checkAnagramT = new HashMap<>();
        // char[] sChar= s.toCharArray();
        // char[] tChar= t.toCharArray();
        if(s.length()!=t.length()){
            return false;
        }
        else{
            for(int i=0; i <s.length(); i++){
                checkAnagramS.put(s.charAt(i),checkAnagramS.getOrDefault(s.charAt(i),0)+1); 
            }

            for(int j=0; j <t.length(); j++){
                checkAnagramT.put(t.charAt(j),checkAnagramT.getOrDefault(t.charAt(j),0)+1); 
            }
        }

        if (checkAnagramS.equals(checkAnagramT)){
            return true;
        }
        else{
            return false;
        }
        

    }
}
