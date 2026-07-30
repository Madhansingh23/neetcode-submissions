class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        HashMap<String, List<String>> soln = new HashMap<>();
        for( String word : strs)
        {
            int len = word.length();
            char[] a = word.toCharArray();
            Arrays.sort(a);
            String key = new String(a);
            if(!soln.containsKey(key))
            {
                soln.put(key,new ArrayList<>());
            }
            soln.get(key).add(word);
        }
        return new ArrayList<>(soln.values());
    }
}
