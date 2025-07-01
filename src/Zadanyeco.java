
public class Zadanyeco {
    public static void main(String[] args) {
        int[] number = {3, 5, 6, 7, 1, 2, 9, 23, 45, 81};
        for (int i = 0; i < number.length - 1; i++)
        {
            for (int j = 0; j < number.length - 1 - i; j++) {
                if (number[j] > number[j + 1]) {
                    int temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                }
            }
        }

        int last = number[number.length - 1];
        int minuslast = number[number.length - 2];

        System.out.println("LAST: " + last);
        System.out.println("PREDLAST: "  + minuslast);
    }
}
