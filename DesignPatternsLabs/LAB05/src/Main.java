public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();


        String sword = "Sword";
        String potion = "Health Potion";
        String key = "Golden Key";

        Mission quest1 = new Mission(potion, 2, inventory);
        Mission quest2 = new Mission(sword, 2, inventory);
        Mission quest3 = new Mission(key, 1, inventory);


        inventory.addItem("Sword");
        inventory.removeItem("Sword");
        inventory.addItem("Sword");
        inventory.addItem("Sword");
        inventory.addItem("Sword");
        inventory.addItem(potion);
        inventory.addItem(potion);





    }
}
