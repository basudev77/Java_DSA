package Strings;

import java.util.*;

public class GroupAnagrams {
    private static String generate(String s) {
        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        StringBuilder newS = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            while (count[i] > 0) {
                newS.append((char) (i + 'a'));
                count[i]--;
            }
        }
        return newS.toString();
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            String newS = generate(s);

            if (!map.containsKey(newS)) {
                map.put(newS, new ArrayList<>());
            }

            map.get(newS).add(s);
        }

        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] str={"eat","tea","tan","ate","nat","bat"};
        List<List<String>>ans=groupAnagrams(str);
        System.out.println(ans);
    }
}
