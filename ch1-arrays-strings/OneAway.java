import java.util.HashMap;

public class OneAway {
    public static void main(String[] args) {
        String s = "pale";
        String t = "ale";
        boolean result = isOneAway(s, t);
        System.out.println("\n" + "These two string are one edit away: " + result + "\n");
    }

    public static boolean isOneAway(String s, String t) {
        if (s.length() > t.length()) {
            int sum = differentStringSizeCompare(s, t);
            if (sum == 1) {
                return true;
            }
        } else if (s.length() < t.length()) {
            int sum = differentStringSizeCompare(t, s);
            if (sum == 1) {
                return true;
            }
        } else {
            int sum = sameStringSizeCompare(s, t);
            if (sum == 1) {
                return true;
            }
        }

        return false;
    }

    public static int differentStringSizeCompare(String big, String little) {
        // Assume strings contain only lower case letters.
        int[] arr = new int[26];

        for (int i = 0; i < big.length(); i++) {
            arr[big.charAt(i) - 'a']++;
        }

        for (int i = 0; i < little.length(); i++) {
            arr[little.charAt(i) - 'a']--;
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return sum;
    }

    public static int sameStringSizeCompare(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
            }
        }

        int sum = 0;
        for (int num : map.values()) {
            sum += num;
        }

        return sum;
    }
}
