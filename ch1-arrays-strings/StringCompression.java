import java.util.HashMap;

public class StringCompression {
    public static void main(String[] args) {
        String s = "aabcccccaaa";
        String result = compressString(s);
        System.out.println("\n" + "This is the new string: " + result + "\n");
    }

    public static String compressString(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 1;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0, k = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(k)) {
                map.put(s.charAt(k), count);
                count++;
            }
            if (s.charAt(i) != s.charAt(k) || i == s.length() - 1) {
                count = 1;
                sb.append(s.charAt(k));
                sb.append(map.get(s.charAt(k)));
                map.remove(s.charAt(k));
                k = i;
                map.put(s.charAt(k), count);
                count++;
            }
        }

        return sb.toString().length() < s.length() ? sb.toString() : s;
    }
}