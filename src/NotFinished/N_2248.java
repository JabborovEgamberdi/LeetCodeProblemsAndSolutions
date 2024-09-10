import java.util.HashMap;
import java.util.Map;

/*
 * Level: 🟡🟡🟡
 * Status: DONE
 * Runtime: 47 ms, faster than 81.99% of Java online submissions
 * TimeComplexity: O (N)
 * */
void main() {
    System.out.println(
            largestWordCount(
                    new String[]{"Hello userTwooo", "Hi userThree", "Wonderful day Alice", "Nice day userThree"},
                    new String[]{"Alice", "userTwo", "userThree", "Alice"}
            )
    );
}

public String largestWordCount(String[] messages, String[] senders) {
    Map<String, Integer> elements = new HashMap<>();
    for (int i = 0; i < messages.length; i++) {
        String[] words = messages[i].split(" ");
        String sender = senders[i];
        elements.put(sender, elements.getOrDefault(sender, 0) + words.length);
    }
    int maxCount = 0;
    String sender = "";
    for (Map.Entry<String, Integer> entry : elements.entrySet()) {
        String currentSender = entry.getKey();
        int wordCount = entry.getValue();
        if (wordCount > maxCount) {
            maxCount = wordCount;
            sender = currentSender;
        } else if (wordCount == maxCount) {
            if (currentSender.compareTo(sender) > 0) {
                sender = currentSender;
            }
        }
    }
    return sender;
}
