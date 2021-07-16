package Task07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        int n = 4;
        int k = 5;

        Item[] items = {new Item("money", 5, 100),
                new Item("phone", 6, 150),
                new Item("netbook", 5, 250),
                new Item("documents", 2, 200)};

        Backpack[][] bp = new Backpack[n + 1][k + 1];

        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < k + 1; j++) {
                if (i == 0 || j == 0) {
                    bp[i][j] = new Backpack(new Item[]{}, 0);
                } else if (i == 1) {

                    bp[1][j] = items[0].getVolume() <= j ? new Backpack(new Item[]{items[0]}, items[0].getValue())
                            : new Backpack(new Item[]{}, 0);
                } else {
                    if (items[i - 1].getVolume() > j)
                        bp[i][j] = bp[i - 1][j];
                    else {

                        int newValue = items[i - 1].getValue() + bp[i - 1][j - items[i - 1].getVolume()].getValue();
                        if (bp[i - 1][j].getValue() > newValue)
                            bp[i][j] = bp[i - 1][j];
                        else {

                            bp[i][j] = new Backpack(Stream.concat(Arrays.stream(new Item[]{items[i - 1]}),
                                    Arrays.stream(bp[i - 1][j - items[i - 1].getVolume()].getItems())).toArray(Item[]::new), newValue);
                        }
                    }
                }
            }
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < k + 1; j++) {
                System.out.print(bp[i][j].getDescription() + " ");
            }
            System.out.print("\n");
        }

        List<Backpack> lastColumn = Arrays.stream(bp).map(row -> row[row.length - 1]).collect(Collectors.toList());

        Backpack backpackWithMax = lastColumn.stream().max(Comparator.comparing(Backpack::getValue)).orElse(new Backpack(null, 0));

        System.out.println(backpackWithMax.getDescription());
    }
}


