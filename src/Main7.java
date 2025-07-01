public class Main7 {
    public static void main(String[] args) {
        byte[] nums1 = {5, 6, 8};

    int sum1 = summaArray(nums1);
        System.out.println("SUM 1= " + sum1);

        byte[] nums2 = {5, 2, 4, 6, 8, 9, 1};
        int sum2 = summaArray(nums2);
        System.out.println("SUM 2= " + sum2);
    }

    public static int summaArray(byte[] arr) {
        int summa = 0;
        for (byte i = 0; i < arr.length; i++) {
            summa += arr[i];
        }
        return summa;
    }
}
