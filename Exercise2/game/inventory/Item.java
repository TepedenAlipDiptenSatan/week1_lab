package game.inventory;

/**
 * Represents a single game title in the shop
 *
 * Name Kerem Dündar
 * Student ID 250446034
 * Date 19 10 2026
 */
public class Item {

    private String name;
    private String genre;
    private int stockCount;
    private String serialCode;

    public Item(String name, String genre, int stockCount, String serialCode) {
        this.name = name;
        this.genre = genre;
        this.stockCount = stockCount;
        this.serialCode = serialCode;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getStockCount() {
        return stockCount;
    }

    // only this package can use it
    String getSerialCode() {
        return serialCode;
    }

    private boolean isAvailable(int quantity) {
        return stockCount >= quantity;
    }

    public void sell(int quantity) {
        if (isAvailable(quantity)) {
            stockCount = stockCount - quantity;
            System.out.println("Sold " + quantity + " copy/copies of "
                    + name + ". Remaining stock: " + stockCount);
        } else {
            System.out.println("WARNING: Not enough stock for " + name
                    + ". Requested: " + quantity + ", Available: " + stockCount);
        }
    }
}
