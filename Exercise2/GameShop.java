import game.inventory.Inventory;
import game.inventory.Item;

/**
 * Tests the game shop inventory
 *
 * Name Kerem Dündar
 * Student ID 250446034
 * Date 19 10 2026
 */
public class GameShop {

    public static void main(String[] args) {

        Inventory shop = new Inventory();

        Item galaxyRacer = new Item("Galaxy Racer", "Racing", 12, "GR-4421");
        Item shadowRealm = new Item("Shadow Realm", "RPG", 5, "SR-8873");
        Item pixelLegends = new Item("Pixel Legends", "Strategy", 3, "PL-0091");

        shop.addItem(galaxyRacer);
        shop.addItem(shadowRealm);
        shop.addItem(pixelLegends);

        shop.displayAll();

        System.out.println();

        galaxyRacer.sell(4);
        shadowRealm.sell(6);

        System.out.println();

        shop.displayAll();

        System.out.println();

        shop.auditSerialCodes();

        // getSerialCode is package private and GameShop is outside
        // game inventory so it cannot be called here
    }
}
