// 45 Варіант, друга лаба по джаві
// 45 Варіант, третя лаба по джаві
package shop.fruits;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        FruitBox citrusBox = new FruitBox("Orange", "orange", "Summer", 35);
        FruitBox grapefruitBox = new FruitBox("Grapefruit", "red", "Summer", 33);
        FruitBox limeBox = new FruitBox("Lime", "green", "Autumn", 56);
        FruitBox strawberryBox = new FruitBox("Strawberry", "red", "Summer", 50);
        FruitBox raspberryBox = new FruitBox("Raspberry", "pink", "Autumn", 78);
        FruitBox blueberryBox = new FruitBox("Blueberry", "blue", "Autumn", 78);
        FruitBox blackberryBox = new FruitBox("Blackberry", "black", "Summer", 43);

        List<FruitBox> fruitBoxes = new ArrayList<>();
        fruitBoxes.add(citrusBox);
        fruitBoxes.add(grapefruitBox);
        fruitBoxes.add(limeBox);
        fruitBoxes.add(strawberryBox);
        fruitBoxes.add(raspberryBox);
        fruitBoxes.add(blueberryBox);
        fruitBoxes.add(blackberryBox);

        List<FruitBox> fruitBoxesListSortedByPrice = manager.sortSummerFruitsByPrice(fruitBoxes, true);
        fruitBoxesListSortedByPrice.forEach(System.out::println);

        System.out.println();

        List<FruitBox> fruitBoxesListSortedByColour =  manager.sortSummerFruitsByColour(fruitBoxes, false);
        fruitBoxesListSortedByColour.forEach(System.out::println);
    }
}