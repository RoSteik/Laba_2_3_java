package shop.fruits;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FruitBox extends FruitShop {

    private  String nameOfFruitInBox;
    private  String colourOfFruitInBox;
    private  String ripeningSeason;
    private  int price; //per kilogram

    public FruitBox(String nameOfFruitInBox, String colourOfFruitInBox, String ripeningSeason, int price) {
        this.nameOfFruitInBox = nameOfFruitInBox;
        this.colourOfFruitInBox = colourOfFruitInBox;
        this.ripeningSeason = ripeningSeason;
        this.price = price;
    }

    @Override
    public String toString()
    {
        return this.nameOfFruitInBox + " " +  this.colourOfFruitInBox + " "
                + this.ripeningSeason + " " +  this.price;
    }
}
