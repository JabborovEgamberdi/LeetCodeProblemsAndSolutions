import java.util.*;

void main() {
    System.out.println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", new String[]{"hit"}));
}

public String mostCommonWord(String paragraph, String[] banned) {
    paragraph = paragraph.toLowerCase().replaceAll("\\W+"," ");
    String[] words = paragraph.split("\\s+");
    Map<String, Integer> countWords = countWords(words, banned);
    return findMostCommon(countWords);
}

private String findMostCommon(Map<String, Integer> words) {
    String mostCommon = "";
    int min = Integer.MAX_VALUE;
    for (Map.Entry<String, Integer> entry : words.entrySet()) {
        if (entry.getValue() < min) {
            min = entry.getValue();
            mostCommon = entry.getKey();
        }
    }
    return mostCommon;
}

private Map<String, Integer> removeBannedWords(String[] banned, Map<String, Integer> words) {
//    Map<String, Integer> result = new HashMap<>();
//    for (String word : banned) {
//        if (words.containsKey(word)) {
//            continue;
//        }
//        result.put(word, words.getOrDefault(word, 0) + 1);
//    }
//    return result;

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned)); // Convert banned array to a Set
        Iterator<Map.Entry<String, Integer>> iterator = words.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (bannedSet.contains(entry.getKey())) {
                iterator.remove(); // Safely remove the entry using Iterator
            }
        }

        return words; // Return the modified words map
    }


private Map<String, Integer> countWords(String[] words, String[] bannedWords) {
    Map<String, Integer> countWords = new HashMap<>();
    for (String word : words) {
        countWords.put(word, countWords.getOrDefault(word, 0) + 1);
    }
    return countWords;
}