package JAVA_DSA.SearchingAndSorting;
import java.util.ArrayList;
import java.util.TreeMap;

public class ArrayDuplicates {
    public static ArrayList<Integer> duplicates(int[] arr) {
        // code here
        TreeMap<Integer, Integer> freqMap = new TreeMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        for (int i:freqMap.keySet()) {
            if (freqMap.get(i) > 1) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,2,3};
        System.out.println(duplicates(arr));
    }
}
