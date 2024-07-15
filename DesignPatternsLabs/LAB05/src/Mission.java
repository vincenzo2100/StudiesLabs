public class Mission implements Observer{
    private String requiredItem;
    private int requiredItemCount;
    private Inventory inventory;

    public Mission(String requiredItem, int requiredItemCount, Inventory inventory) {
        this.requiredItem = requiredItem;
        this.requiredItemCount = requiredItemCount;
        this.inventory = inventory;
        inventory.registerObserver(this);
    }

    @Override
    public void onItemAdded(String item) {
        if (item.equals(requiredItem)) {
            requiredItemCount--;
            if (requiredItemCount <= 0) {
                System.out.println("Quest completed: Gathered " + requiredItem + " left to get: " + requiredItemCount);
                inventory.removeItem(requiredItem);
                inventory.removeObserver(this);
            }
        }
    }

    @Override
    public void onItemRemoved(String item) {
    if(item.equals(requiredItem)){
        requiredItemCount++;
    }
    }
}
