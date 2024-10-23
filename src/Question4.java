public class Question4 {
    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4};
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("배열의 최대값: " + max);
    }
}
