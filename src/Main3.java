import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        /*
        int[] nums = new int[5];
        nums[0] = 20;
        nums[1] = 30;
        nums[2] = 40;
        nums[3] = 50;
        nums[4] = 60;
        System.out.println(nums[0] + nums[4]);
        float[] nume = new float[] {3f, 2f, 4.4f};

        for (int i = 0; i < nume.length; i++) {
            System.out.println(nume[i]);
        }
        */
        int [] sell = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sell.length; i++) {
            int sella = sc.nextInt();
            sell[i] = sella;
        }

        int min =  sell[0];
        for (int i = 0; i < sell.length; i++) {
            if (sell[i] < min)
                 min = sell[i];
        }
        System.out.println(min);
    }
}
