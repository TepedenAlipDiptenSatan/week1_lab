package game.inventory;

/**
 * Manages the items in the game shop
 *
 * Name Kerem Dündar
 * Student ID 250446034
 * Date 19 10 2026
 */
public class Inventory {

    private Item[] items;
    private int count;

    public Inventory() {
        items = new Item[10];
        count = 0;
    }

    public void addItem(Item item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        } else {
            System.out.println("Inventory is full.");
        }
    }

    public void displayAll() {
        System.out.println("--- Inventory Listing ---");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s | %-8s | Stock: %d%n",
                    items[i].getName(),
                    items[i].getGenre(),
                    items[i].getStockCount());
        }
    }

    public void auditSerialCodes() {
        System.out.println("--- Serial Code Audit ---");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-15s -> %s%n",
                    items[i].getName(),
                    items[i].getSerialCode());
        }
    }
}
