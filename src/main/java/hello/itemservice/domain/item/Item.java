package hello.itemservice.domain.item;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data <<위험함 이것저것많이만듬 주의할필요가 있음
//@Getter @Setter
@Data
public class Item {

    private Long id;
    private String itemName;
    private Integer price=0;
    private int quantity;

    public Item(){
    }

    public Item(String itemName, Integer price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
