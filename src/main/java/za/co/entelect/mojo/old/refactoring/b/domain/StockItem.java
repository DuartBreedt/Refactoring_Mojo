package za.co.entelect.mojo.old.refactoring.b.domain;

public class StockItem {
    private Supplier supplier;
    private StockItemType type;

    public StockItemType getType(){
        return type;
    }

    public Supplier getSupplier(){
        return supplier;
    }
}
