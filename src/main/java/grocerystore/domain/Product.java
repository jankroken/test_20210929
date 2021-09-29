package grocerystore.domain;

import static grocerystore.domain.ProductType.JAM;

public class Product {
    private final static ProductType type = JAM;
    public int getSize() { return 42; }
}
