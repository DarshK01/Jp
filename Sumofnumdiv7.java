public class DivisibleBySeven {
    public static void main(String[] args) {
        int sum = 0, count = 0;

        for (int i = 101; i < 200; i++) {
            if (i % 7 == 0) {
                sum += i;
                count++;
            }
        }

        System.out.println("Total numbers divisible by 7: " + count);
        System.out.println("Sum of numbers divisible by 7: " + sum);
    }
}
