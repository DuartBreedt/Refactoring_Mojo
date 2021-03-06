package za.co.entelect.mojo.old.refactoring.b.domain;

public class Supplier {
    private SupplierName name;
    private SupplierStatus status;

    public Supplier(SupplierName name, SupplierStatus status) {
        this.name = name;
        this.status = status;
    }

    public SupplierName getName() {
        return name;
    }

    public SupplierStatus getStatus() {
        return status;
    }
}
