package grocerystore;

import grocerystore.domain.Storage;
import grocerystore.service.StoreService;

public class Main {

    public static void main(String[] args) {
        Storage storage = new Storage(100);
        StoreService storeService = new StoreService(storage);
    }
}
