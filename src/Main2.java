import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        LinkedList<Float> numbers = new LinkedList<Float>();
        numbers.add(5.6f);
        numbers.add(15.6f);
        numbers.add(5.6123f);

        for (Float el : numbers) {
            System.out.println(el);
        }
    }
}
