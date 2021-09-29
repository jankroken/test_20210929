package grocerystore.domain;

public enum ProductType {
    JAM(2),
    PASTA(3),
    BREAD (7);

    private final int size;

    ProductType(int size) {
        this.size = size;
    }
}
