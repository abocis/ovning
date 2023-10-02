import java.util.ArrayList;
import java.util.Arrays;

// carrier(compagnion objecj??) RECORD kommer att representera item
// Item kommer ha inparametrarna: name, type, count
record Item (String name, String type, int count){

    public Item( String name){

        this(name, "DIARRY", 1);

    }
}
public class List {
    public static void main(String[] args) {
        Object[] shoppingArray = new  Object[4];
        shoppingArray[0] = new Item(" milk ");
        shoppingArray[1] = new Item(" tomatoes ", " VEGETABLE ", 2);
        shoppingArray[2] = new Item(" apple ", " FRUIT ",   12);
        shoppingArray[3] = "carrot ";

        System.out.println(Arrays.toString(shoppingArray));

        Item[] shopArray = new Item[3];
        shopArray[0] = new Item("abou", "person",1);
        shopArray [1] = new Item("meat","animal", 12);
        shopArray[2] = new Item(" apple ", " FRUIT ",   12);
        System.out.println(Arrays.toString(shopArray));

        //Listi
        ArrayList <Item> itemList = new ArrayList<>();
        itemList.add(new Item("bregott ", "smör",1));
        itemList.add(new Item("volvo"));
        System.out.println(itemList);




















    }


}
