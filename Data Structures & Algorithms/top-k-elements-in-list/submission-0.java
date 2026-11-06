class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num:nums) {
            count.put(num, count.getOrDefault(num, 0) +1); 
            }
                List<Integer> unique = new ArrayList<>(count.keySet());
               unique.sort((a, b) -> count.get(b) - count.get(a));
            int[] result = new int[k];
            for (int i=0; i<k; i++) {
                result[i] = unique.get(i);
            }
        return result;
        }
}