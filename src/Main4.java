public class Main4 {
    public static void main(String[] args) {
        char[][] ch = new char[3][3];
        ch[0][0] = 'A';
        ch[0][1] = 'B';
        ch[0][2] = 'C';
        System.out.println(ch[0][0]);

        byte[][] by = new byte[][]{
                {2, 3},
                {4, 6},
                {7, 8}
        };

        by[0][1] = 32;

        for(int i = 0; i < by.length - 1; i++) {
            byte min = by[0][i];
            if (by [0][i] < min);
            min = by[0][i];

        }
    }
}
