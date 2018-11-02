package idcard;
import framework.Factory;
import framework.Product;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class IDCardFactory extends Factory{
    private List<String> owners = new ArrayList<String>();
    private Map<String, String> cards = new HashMap<String, String>();
    private int lastCardNo = 1;
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(String.valueOf(lastCardNo++), owner);
    }
    @Override
    protected void registerProduct(Product product) {
        String cardno = ((IDCard)product).getCardNo();
        String owner = ((IDCard)product).getOwner();
        owners.add(((IDCard)product).getOwner());
        cards.put(cardno, owner);
        //owners.add("text");
    }
    public List<String> getOwners() {
        return owners;
    }
    public Map<String, String> getCards() {
        return cards;
    }
}
