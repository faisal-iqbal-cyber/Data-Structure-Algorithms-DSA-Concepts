import java.util.HashMap;
import java.util.Map;

public class Hash{
    public static void main(String[] args) {
        // Create a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Add key-value pairs
        hashMap.put("apple", 10);
        hashMap.put("banana", 20);
        hashMap.put("orange", 15);

        
	// Get the value associated with the key "banana"
        int value = hashMap.get("banana");

        // Print the value
        System.out.println("Value of 'banana': " + value);
	
	
        // Check if the key "banana" exists
        boolean exists = hashMap.containsKey("banana");

        // Print the result
        System.out.println("Key 'banana' exists: " + exists);

	// Iterate over the keys
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key);

    	}

	// Iterate over the values
        for (int value1 : hashMap.values()) {
            System.out.println("Value: " + value1);
        }
	//remove 
	hashMap.remove("orange");
	// Print the HashMap
               System.out.println("HashMap after removal: " + hashMap);

	        // Clear all key-value pairs

        hashMap.clear();

        // Print the HashMap
        System.out.println("HashMap after clearing: " + hashMap);

	 hashMap.put("apple", 10);
        hashMap.put("banana", 20);
        hashMap.put("orange", 15);
	System.out.println("Key Values Pair are : "+hashMap);

	// Get the size of the HashMap
        int size = hashMap.size();

        // Print the size
        System.out.println("Size of the HashMap: " + size);

	// Check if the value 20 exists
        boolean exists1 = hashMap.containsValue(20);

        // Print the result
        System.out.println("Value 20 exists: " + exists1);

	// Replace the value of the key "banana" with 25
        hashMap.put("banana", 25);

        // Print the HashMap
        System.out.println("HashMap after replacement: " + hashMap);

	

	String str = "aabbccdefg";
        String firstNonRepeatedChar = findFirstNonRepeatedCharacter(str);
        System.out.println("First non-repeated character: " + "[ " +firstNonRepeatedChar + "]");






    }
	    public static String findFirstNonRepeatedCharacter(String str) {
        	Map<Character, Integer> charCounts = new HashMap<>();
            String checker="";
        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeated character
        for (char c : str.toCharArray()) {
            if (charCounts.get(c) == 1) {
                checker=  checker + c + ",";
            }
        }

        return checker; // Return null character if no non-repeated character found
    }
}
