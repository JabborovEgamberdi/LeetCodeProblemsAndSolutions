import java.util.*;

/*
* Level: 🟢🟢🟢
* Status: DONE
* Time Complexity: O(n + m)
* Space Complexity: O(n + m)
* Runtime: 3 ms ---> 100 %
* */
void main() {
    System.out.println(countWords(new String[]{"leetcode", "is", "amazing", "as", "is"}, new String[]{"amazing", "leetcode", "is"}));
    System.out.println(countWords1(new String[]{"b", "bb", "bbb"}, new String[]{"a", "aa", "aaa"}));
    System.out.println(countWords2(new String[]{"a", "ab"}, new String[]{"a", "a", "a", "ab"}));
}

// Runtime: 35 ms --> 7.45 %
public int countWords(String[] words1, String[] words2) {
    List<String> uniqueWords1 = calculateElementsCountAndGetUniqueWords(words1);
    List<String> uniqueWords2 = calculateElementsCountAndGetUniqueWords(words2);
    return commonWords(uniqueWords1, uniqueWords2);
}

private int commonWords(List<String> uniqueWords1, List<String> uniqueWords2) {
    int count = 0;
    for (String word : uniqueWords1) {
        if (!uniqueWords2.contains(word))
            continue;
        count++;
    }
    return count;
}

private List<String> calculateElementsCountAndGetUniqueWords(String[] words) {
    Map<String, Integer> calculateElementsCount = new HashMap<>();
    for (String word : words) {
        calculateElementsCount.put(word, calculateElementsCount.getOrDefault(word, 0) + 1);
    }
    return getUniqueWords(calculateElementsCount);
}

private List<String> getUniqueWords(Map<String, Integer> elementsCount) {
    List<String> uniqueWords = new LinkedList<>();
    for (Map.Entry<String, Integer> element : elementsCount.entrySet()) {
        if (element.getValue() != 1)
            continue;
        uniqueWords.add(element.getKey());
    }
    return uniqueWords;
}

//----------------------------------------------------------------------------------------------------//

// Runtime: 6 ms --> 89.93 %
public int countWords1(String[] words1, String[] words2) {
    Map<String, Integer> uniqueWords1 = calculateElementsCount(words1);
    Map<String, Integer> uniqueWords2 = calculateElementsCount(words2);
    return commonWords(uniqueWords1, uniqueWords2, words1);
}

private Map<String, Integer> calculateElementsCount(String[] words) {
    Map<String, Integer> calculateElementsCount = new HashMap<>();
    for (String word : words) {
        calculateElementsCount.put(word, calculateElementsCount.getOrDefault(word, 0) + 1);
    }
    return calculateElementsCount;
}

private int commonWords(Map<String, Integer> uniqueWords1, Map<String, Integer> uniqueWords2, String[] words) {
    int count = 0;
    for (String word : words) {
        if (uniqueWords1.get(word) == 1 && uniqueWords2.getOrDefault(word, 0) == 1) {
            count++;
        }
    }
    return count;
}

//----------------------------------------------------------------------------------------------------//
// 3 ms --> 100%
public int countWords2(String[] words1, String[] words2) {
    int count = 0;
    Set<String> set1 = new HashSet<>(words1.length);
    Set<String> duplicate1 = new HashSet<>(words1.length);
    Set<String> set2 = new HashSet<>(words2.length);
    Set<String> duplicate2 = new HashSet<>(words2.length);
    for (String word : words1) {
        if (set1.contains(word)) {
            duplicate1.add(word);
        } else {
            set1.add(word);
        }
    }
    for (String word : words2) {
        if (!set1.contains(word) || duplicate1.contains(word))
            continue;
        if (!set2.contains(word)) {
            set2.add(word);
            count++;
        } else if (!duplicate2.contains(word)) {
            duplicate2.add(word);
            count--;
        }
    }
    return count;
}