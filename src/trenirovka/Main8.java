package trenirovka;

public class Main8 {
    public static void main(String[] args) {
        Transport bmw = new Transport();
        bmw.setValues(250.5f, 2500, "white", new byte[] {0, 0, 0});
//        bmw.speed = 250.5f;
//        bmw.weight = 2500;
//        bmw.color = "White";
//        bmw.coordinate = new byte[] {0, 0, 0};

        Transport truck = new Transport();

        truck.speed = 140.5f;
        truck.weight = 5600;
        truck.color = "Red";
        truck.coordinate = new byte[] {100, 0, 100};

        String res2 = truck.getValues();
        System.out.println(res2);
    }
}
