package za.co.entelect.mojo.old.refactoring.b.problem;

import za.co.entelect.mojo.old.refactoring.b.domain.*;

import java.util.ArrayList;
import java.util.List;

public class StockMonitorService {

    private List<StockItem> stockItems;

    public StockMonitorService(List<StockItem> stockItems) {
        this.stockItems = stockItems;
    }

    public boolean hasTramezzini() {
        for (StockItem stockItem : stockItems) {
            if (stockItem.getType().equals(StockItemType.TRAMEZZINI)) {
                return true;
            }
        }
        return false;
    }

    public StockItem getItem(StockItemType itemType) {
        for (StockItem stockItem : stockItems) {
            if (stockItem.getType().equals(itemType)) {
                return stockItem;
            }
        }
        return null;
    }

    public List<StockItem> getAllCheese() {
        updateStock();
        List<StockItem> items = new ArrayList<>();
        for (StockItem stockItem : stockItems) {
            if (stockItem.getType().equals(StockItemType.CHEESE)) {
                items.add(stockItem);
            }
        }
        return items;
    }

    public int getItemQuantity(StockItemType itemType) {
        int quantity = 0;
        for (StockItem stockItem : stockItems) {
            if (stockItem.getType().equals(itemType)) {
                quantity++;
            }
        }
        return quantity;
    }

    public boolean hasSupplierItem(SupplierName supplierName, StockItemType itemType) {
        for (StockItem stockItem : stockItems) {
            if (stockItem.getType().equals(itemType) && stockItem.getSupplier().getName().equals(supplierName)) {
                return true;
            }
        }
        return false;
    }

    public boolean isSupplierActive(Supplier supplier) {
        return supplier.getStatus().equals(SupplierStatus.ACTIVE);
    }

    public void updateStock() {
        for (StockItem stockItem : stockItems) {
            if (!isSupplierActive(stockItem.getSupplier())) {
                stockItems.remove(stockItem);
            }
        }
    }
}
