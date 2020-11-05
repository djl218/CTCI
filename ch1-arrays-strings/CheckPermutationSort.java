public class CheckPermutationSort {
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

        return sort(t).equals(sort(s));
    }

    public static String sort(String unsortedString) {
        char[] content = unsortedString.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }
}
