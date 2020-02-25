package simulator;

public class Item implements Comparable<Item> {

    private String name;

    private ItemCondition condition;
    private double weight;
    private int amount;

    public String getName() {
        return name;
    }

    public ItemCondition getCondition() {
        return condition;
    }

    public double getWeight() {
        return weight;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Item(String name, ItemCondition condition, double weight, int amount) {
        this.name = name;
        this.condition = condition;
        this.weight = weight;
        this.amount = amount;
    }

    public void print(){
        System.out.println("Nazwa: " + name);
        System.out.println("Stan: " + condition);
        System.out.println("Masa: " + weight);
        System.out.println("Ilość: " + amount);
    }

    @Override
    public int compareTo(Item o) {
        return name.compareTo(o.name);
    }
}
