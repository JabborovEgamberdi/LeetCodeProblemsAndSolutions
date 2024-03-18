public class N_520 {

    public static void main(String[] args) {
        boolean isUnique = false;
        System.out.println(detectCapitalUse("FlaG"));

        System.out.println(detectCapitalUse("USA"));

    }

    public static boolean detectCapitalUse(String word) {
        if (word.charAt(0) < 65 && word.charAt(0) > 90) return false;
        boolean isCapital = false;
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) >= 65 && word.charAt(i) >= 90) {
                isCapital = true;
            }
            if (!isCapital) break;
        }
        if (!isCapital) return true;
        return checkNonCapital(word);
    }

    private static boolean checkNonCapital(String word) {
        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) >= 97 && word.charAt(i) <= 122) {
                return false;
            }
        }
        return true;
    }

}
