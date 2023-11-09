public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Item book1 = new Item("Book 1");
        Item dvd1 = new Item("DVD 1");

        library.addItem(book1);
        library.addItem(dvd1);

        Client client1 = new Client("Ivan Petrov");
        Client client2 = new Client("Petro Ivanov");

        library.registerClient(client1);
        library.registerClient(client2);

        library.showAvailableItems();

        library.lendItem(book1, client1);
        library.lendItem(dvd1, client2);

        library.showLentItems();

        library.returnItem(book1);

        library.showAvailableItems();
    }
}