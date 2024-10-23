public class Question5 {
    public static void main(String[] args) {
        int[] numbers = {12, 3, 19, 7, 5};
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("배열의 최소값: " + min);
    }
}
