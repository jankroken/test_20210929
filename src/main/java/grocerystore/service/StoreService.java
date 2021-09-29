package grocerystore.service;

import grocerystore.domain.Product;
import grocerystore.domain.Storage;

import java.util.Optional;

public class StoreService {
    private Storage storage;

    public StoreService(Storage storage) {
        this.storage = storage;
    }

    public void addProduct(Product product, int count) {

    }

    public Optional<Product> removeProduct() {
        throw new RuntimeException("not implemented");
    }
}
