class Solution {
    public boolean canBeEqual(String s1, String s2) {
        
        if(s1.equals(s2)) return true;
        String k = ""+s1.charAt(2)+s1.charAt(1)+s1.charAt(0)+s1.charAt(3);
        if(k.equals(s2)) return true;
        k = "" + k.charAt(0)+k.charAt(3)+k.charAt(2)+k.charAt(1);
        System.out.println(k);
        if(k.equals(s2)) return true;

        k = "" + s1.charAt(0)+s1.charAt(3)+s1.charAt(2)+s1.charAt(1);
        if(k.equals(s2)) return true;

        k = ""+k.charAt(2)+k.charAt(1)+k.charAt(0)+k.charAt(3);
        if(k.equals(s2)) return true;

        return false;
    }
}