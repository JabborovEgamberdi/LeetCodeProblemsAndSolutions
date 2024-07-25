// Level: 🟡🟡🟡

void main() {
    System.out.println(maximumPrimeDifference(new int[]{1, 2, 3, 4, 5}));
}

// 11 ms  --> 51 %
public static int maximumPrimeDifference(int[] nums) {
    int min = -1;
    int max = -1;
    for (int i = 0; i < nums.length; i++) {
        if (isPrime(nums[i])) {
            if (min == -1) min = i;
            max = i;
        }
    }
    if (min == -1) return 0;
    return max - min;
}

static boolean isPrime(int number) {
    if (number <= 1) {
        return false;
    }
    for (int i = 2; i * i <= number; i++) {
        if (number % i == 0) {
            return false;
        }
    }
    return true;
}