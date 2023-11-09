import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Item> items;
    private List<Client> clients;

    public Library() {
        this.items = new ArrayList<>();
        this.clients = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public void registerClient(Client client) {
        clients.add(client);
    }

    public void lendItem(Item item, Client client) {
        if (item.isAvailable()) {
            item.setAvailable(false);
            System.out.println("Item " + item.getTitle() + " lent to " + client.getName());
        } else {
            System.out.println("Item " + item.getTitle() + " is not available");
        }
    }

    public void returnItem(Item item) {
        item.setAvailable(true);
        System.out.println("Item " + item.getTitle() + " returned to the library");
    }

    public void showAvailableItems() {
        System.out.println("Available items:");
        for (Item item : items) {
            if (item.isAvailable()) {
                System.out.println(item.getTitle());
            }
        }
    }

    public void showLentItems() {
        System.out.println("Lent items:");
        for (Item item : items) {
            if (!item.isAvailable()) {
                System.out.println(item.getTitle() + " (lent to someone)");
            }
        }
    }
}
