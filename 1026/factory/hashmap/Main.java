import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String [] args) {
        Map<String, String> cards = new HashMap<String, String>();
        cards.put("1", "山内");
        cards.put("2", "山田");
        cards.put("3", "山田");
        System.out.println(cards);
    }
}
