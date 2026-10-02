public class Task2 {
    public static void main(String[] args) {

        byte zero = 0;
        short three = 3;
        int anotherZero = 0;
        float decimal = 2.0f;
        boolean isTrue = true;

        char[] letters = {'H', 'l', 'l', 'w', 'r', 'l', 'd'};
        char space = ' ';

        String output = ""
                + letters[0]
                + three
                + letters[1]
                + letters[2]
                + zero
                + space
                + letters[3]
                + anotherZero
                + letters[4]
                + letters[5]
                + letters[6]
                + space
                + decimal
                + space
                + isTrue;

        System.out.println(output);
    }
}