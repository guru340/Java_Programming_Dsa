package Knapsackproblem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class knapfractional {
    static void knapSack (ArrayList<Knap> items, int capacity) {
        Comparator<Knap> comparator = new Comparator<Knap>() {
            @Override
            public int compare(Knap o1, Knap o2) {
                if (o2.getRatio()>o1.getRatio()) return 1;
                else return -1;
            }
        };
        Collections.sort(items, comparator);
        int usedCapacity = 0;
        double totalValue = 0;

        for (Knap item : items) {
            if (usedCapacity + item.getWeight()<=capacity) {
                usedCapacity+=item.getWeight();
                System.out.println("Taken: "+item);
                totalValue+=item.getValue();
            } else {
                int usedWeight = capacity - usedCapacity;
                double value = item.getRatio()*usedWeight;
                System.out.println("Taken: item index = "+ item.getIndex()+ ", obtained value= "+ value+ ", used weight =" +usedWeight+ ", ratio = "+ item.getRatio());
                usedCapacity += usedWeight;
                totalValue += value;

            }
            if (usedCapacity == capacity) break;
        }

        System.out.println("\nTotal value obtained: "+ totalValue);

    }
}
