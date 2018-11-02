package idcard;
import framework.Product;

public class IDCard extends Product {
    private String cardno;
    private String owner;
    IDCard(String cardno, String owner) {
        System.out.println(owner + "のカードを番号" + cardno + "で作ります。");

        this.cardno = cardno;
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println(owner + "の" + cardno + "番のカードを使いました");
    }
    public String getOwner() {
        return owner;
    }
    public String getCardNo() {
        return cardno;
    }
}
