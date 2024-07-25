

void main() {
    String s = "tree";
    System.out.println(frequencySort(s));
}

public static String frequencySort(String s) {
    int[] count = new int[128];
    for (char c : s.toCharArray()) {
        count[c]++;
    }
    StringBuilder sb = new StringBuilder();

    return null;
}