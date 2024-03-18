//done 0 ms
public class Final_Value_of_Variable_After_Performing_Operations_2011 {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
        String[] operations1 = {"++X","++X","X++"};
        System.out.println(finalValueAfterOperations(operations1));
        String[] operations2 = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations2(operations2));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if (operation.contains("+")) {
                result += 1;
            } else {
                result -= 1;
            }
        }
        return result;
    }

    public static int finalValueAfterOperations2(String[] operations) {
        int result = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') {
                result += 1;
            } else {
                result -= 1;
            }
        }
        return result;
    }
}
