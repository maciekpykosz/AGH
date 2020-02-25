package simulator;

import simulator.FulfillmentCenter;

import java.util.*;

public class FulfillmentCenterContainer {
    private Map<String, FulfillmentCenter> allCenters = new HashMap<String, FulfillmentCenter>();

    public FulfillmentCenterContainer(Map<String, FulfillmentCenter> allCenters) {
        this.allCenters = allCenters;
    }

    public void addCenter(String s, double a) {
        FulfillmentCenter m = new FulfillmentCenter(s, a);
        allCenters.put(s, m);
    }

    public void removeCenter(String s) {
        allCenters.remove(s);
    }

    public void summary() {
        System.out.println("Informacje o magazynach w mapie:");
        for (Map.Entry<String, FulfillmentCenter> m : allCenters.entrySet()) {
            String klucz = m.getKey();
            FulfillmentCenter wartosc = m.getValue();
            System.out.println("Nazwa magazynu: " + klucz);
        }
    }





}
