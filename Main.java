package homework4;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String[] numbers = {"one", "two", "three", "one", "four", "five", "two", "six", "seven", "eight", "seven"};
        HashMap<String, Integer> uniqueWordsNumbers = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            if (uniqueWordsNumbers.containsKey(numbers[i])) {
                uniqueWordsNumbers.put(numbers[i], uniqueWordsNumbers.get(numbers[i]) + 1);
            } else
            {
                uniqueWordsNumbers.put(numbers[i], 1);
            }
        }
        System.out.println(uniqueWordsNumbers);
    }
}

//        for (String num : numbers) {
//            uniqueWordsNumbers.put(num, uniqueWordsNumbers.getOrDefault(num,0)+1);
//        }
