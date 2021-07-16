package Task07;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Backpack  {

    private Item[]  items;
    private int  value;

    public Backpack(Item[] items, int value) {
        this.items = items;
        this.value = value;
    }

    public Item[] getItems() {
        return items;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return items == null ? "" : Arrays.stream(items).map(Item::getName).collect(Collectors.joining("+")) + "-" + getValue();
    }
}




