class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();
        int len = word.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                set.add(ch);
            }
        }

        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (set.contains(Character.toUpperCase(ch))) {
                    count++;
                    set.remove(Character.toUpperCase(ch));
                }
            }
        }

        return count;
    }
}