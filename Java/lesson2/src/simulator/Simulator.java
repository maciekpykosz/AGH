package simulator;

import java.util.HashMap;
import java.util.Map;

public class Simulator {
    public static void main (String[] args){
        Item car1 = new Item("kot", ItemCondition.NEW, 1231, 5);
        Item car2 = new Item("kot", ItemCondition.NEW, 1231, 4);
        Item car3 = new Item("kot2", ItemCondition.NEW, 1231, 3);
        FulfillmentCenter centerA = new FulfillmentCenter("CenterA",50000);
        centerA.addProduct(car1);
        centerA.addProduct(car2);
        centerA.addProduct(car3);
        //centerA.removeProduct(car3);
        centerA.getProduct(car1);
        centerA.countByCondition(ItemCondition.NEW);
        Item war = centerA.search("kot");
        centerA.summary();
        Item naj = centerA.max();
        naj.print();


        Map<String, FulfillmentCenter> mag=new HashMap<>();
        FulfillmentCenterContainer centers = new FulfillmentCenterContainer(mag);
        centers.addCenter("center2", 30000);
        centers.addCenter("center3", 30000);
        centers.removeCenter("center2");
        centers.summary();

    }
}
