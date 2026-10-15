   
public class Task8 {

    public static int sum(int... numbers) {
        int total = 0;

        for (int num : numbers) {
            int cumulativeSum = 0;

            for (int i = 1; i <= num; i++) {
                cumulativeSum += i;
            }

            System.out.println(num + " = " + cumulativeSum);
            total += cumulativeSum;
        }

        return total;
    }

    public static void main(String[] args) {
        int result = sum(4, 5, 10);

        System.out.println("Total sum: " + result);
    }
}


