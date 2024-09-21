package SearchingAndSorting;
import java.util.*;

public class CommonElements {
    public static ArrayList<Integer> commonElements(ArrayList<Integer> A,
            ArrayList<Integer> B,
            ArrayList<Integer> C) {
        
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int ele : A) {
            map.put(ele, 1);
        }

        for (int ele : B) {
            if (map.containsKey(ele) && map.get(ele) == 1)
                map.put(ele, 2);
        }

        for (int ele : C) {
            if (map.containsKey(ele) && map.get(ele) == 2)
                map.put(ele, 3);
        }

        ArrayList<Integer> commonElements = new ArrayList<>();
        for (int ele : map.keySet()) {
            if (map.get(ele) == 3)
                commonElements.add(ele);
        }

        return commonElements;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(List.of(1, 5, 10, 20, 30));
        ArrayList<Integer> B = new ArrayList<>(List.of(5, 13, 15, 20));
        ArrayList<Integer> C = new ArrayList<>(List.of(5, 20));

        ArrayList<Integer> ans = commonElements(A, B, C);

        System.out.print("Common elements are: ");
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");
    }
}
