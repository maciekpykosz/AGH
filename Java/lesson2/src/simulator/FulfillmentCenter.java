package simulator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FulfillmentCenter {

    private String nameOfCenter;
    private double maxWeightOfAllProducts;
    private List<Item> listOfItems = new ArrayList<>();

    public List<Item> getListOfItems() {
        return listOfItems;
    }

    public FulfillmentCenter(String nameOfCenter, double maxWeightOfAllProducts) {
        this.nameOfCenter = nameOfCenter;
        this.maxWeightOfAllProducts = maxWeightOfAllProducts;
    }

    public void addProduct(Item item) {

        if (listOfItems.isEmpty()) {
            listOfItems.add(item);
        }
        else {
            for (int i = 0; i < listOfItems.size(); i++) {
                if (item.compareTo(listOfItems.get(i)) != 0) {
                    if (maxWeightOfAllProducts > (listOfItems.get(i).getAmount() * listOfItems.get(i).getWeight())) {
                        listOfItems.add(item);
                    }
                    else {
                        System.out.println("Brak miejsca w magazynie");
                    }
                }
                else {
                    if (maxWeightOfAllProducts > (listOfItems.get(i).getAmount() * listOfItems.get(i).getWeight())) {
                        listOfItems.get(i).setAmount(listOfItems.get(i).getAmount() + item.getAmount());
                    }
                    else {
                        System.out.println("Brak miejsca w magazynie");
                    }
                }
            }
        }
    }

    public void getProduct(Item item){
        if (item.getAmount()>1){
            item.setAmount(item.getAmount()-1);
        }
        else {
            removeProduct(item);
        }
    }

    public void removeProduct(Item item){
        listOfItems.remove(item);
    }

    public void countByCondition(ItemCondition s) {
        int licznik = 0;
        for (int i = 0; i < listOfItems.size(); i++) {
            if (s == listOfItems.get(i).getCondition()) {
                licznik++;
            }
        }
    }

    public void summary() {
        System.out.println("Informacje o magazynie " + nameOfCenter);
        for (int i = 0; i < listOfItems.size(); i++) {
            listOfItems.get(i).print();
        }
        System.out.println("Koniec info");
    }

    public Item max(){
        return Collections.max(listOfItems, null);
    }

    public Item search(String s){
        for (Item item : listOfItems){
            if (item.getName().equals(s)){
                return item;
            }
        }
        return null;
    }

}



