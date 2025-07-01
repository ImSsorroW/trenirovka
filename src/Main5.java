public class Main5 {
    public static void main(String[] args) {
        int[] number = { 4, 6, 7, 8, 1, 2};
        for (int i = 0; i < number.length - 1; i++) {
         for (int j = 0; j < number.length - 1 - i; j++) {
             if (number[j] > number[j + 1]) {
                 int temp = number[j];
                 number[j] = number[j + 1];
                 number[j + 1] = temp;
             }
         }
        }
        for (int qwe : number) {
            System.out.println(qwe);
        }
        int sum = 14;
        if (sum > 0 | sum<13) {
            System.out.println("The sum is " + sum);
        }
        else {
            System.out.println('N');
        }
    }
}
