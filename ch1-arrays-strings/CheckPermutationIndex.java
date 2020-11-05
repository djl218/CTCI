public class CheckPermutationIndex {
    public static void main(String[] args) {
        String s = "snake";
        String t = "ekans";
        boolean result = permutation(s, t);
        System.out.println("\n" + "Is one string a permutation of the other? " + result + "\n");
    }

    public static boolean permutation(String s, String t) {
        // Permutations are of equal length
        if (t.length() != s.length()) {
            return false;
        }

        // Assume ASCII characters
        int[] chars = new int[128];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i)]++;
        }

        for (int i = 0; i < s.length(); i++) {
            chars[t.charAt(i)]--;
            if (chars[t.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }
    
}
