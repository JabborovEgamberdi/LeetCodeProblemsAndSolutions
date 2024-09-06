void main() {
    System.out.println(reverseOnlyLetters("ab-cd"));
    System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
}

public String reverseOnlyLetters(String s) {
    char[] array = s.toCharArray();
    int left = 0;
    int right = array.length - 1;
    while (left < right) {
        while (left < right && !Character.isLetter(array[left])) {
            left++;
        }
        while (left < right && !Character.isLetter(array[right])) {
            right--;
        }
        if (left < right) {
            char temp = array[left];
            array[left++] = array[right];
            array[right--] = temp;
        }
    }
    return new String(array);
}