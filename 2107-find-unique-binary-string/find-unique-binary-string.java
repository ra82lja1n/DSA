class Solution {
    public String findDifferentBinaryString(String[] nums) {
        HashSet<String> set = new HashSet<>();

        for(String s : nums){
            set.add(s);
        }

        int n = nums[0].length();

        int limit = (int)Math.pow(2, n);

        for (int i = 0; i < limit; i++) {
            String binary = Integer.toBinaryString(i);

            while (binary.length() < n) {
                binary = "0" + binary;
            }

            if(!set.contains(binary)) return binary;
        }
        return "";
    }
}