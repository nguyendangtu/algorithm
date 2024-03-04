package algorithm.companies.test;

import java.util.*;

/**
 * @author : JOHNNGUYEN
 * @since : 11/18/2023, Sat
 **/
public class Test2 {
    public static void main(String[] args) {
        String json1 = "{ \"name\": \"Alice\", \"age1\": 30, \"age\": 30, \"city\": \"New York\" }";
        String json2 = "{ \"name\": \"Alice\", \"age\": 35, \"country\": \"USA\" }";
        List<String> result = getJSONDiff(json1, json2);
        result.forEach(System.out::println);
    }

    private static List<String> getJSONDiff(String json1, String json2) {

        String[] keyValuePairs1 = json1.substring(1, json1.length() - 1).split(",");
        String[] keyValuePairs2 = json2.substring(1, json2.length() - 1).split(",");

        Map<String, String> map = new HashMap<>();
        // Iterate through key-value pairs
        for (String pair : keyValuePairs1) {
            // Split each pair into key and value
            String[] entry = pair.split(":");
            String key = entry[0].trim().replace("\"", "");
            String value = entry[1].trim().replace("\"", "");
            map.put(key, value);
        }

        List<String> result = new ArrayList<>();
        for (String pair : keyValuePairs2) {
            String[] entry = pair.split(":");
            String key = entry[0].trim().replace("\"", "");
            String value = entry[1].trim().replace("\"", "");
            if (!map.containsKey(key)) continue;
            if (!map.get(key).equals(value)) {
                result.add(key);
            }
        }
        Collections.sort(result);
        return result;
    }
}
