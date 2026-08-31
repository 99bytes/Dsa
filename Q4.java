import java.util.*;

public class Q4 {
    public String frequencySort(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        // Now we need to convert the entry set to a list

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(hm.entrySet());

        // Sort the list based on the value (frequency)

        list.sort((a, b) -> b.getValue() - a.getValue());

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : list) {
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }
        return sb.toString();
    }
}
