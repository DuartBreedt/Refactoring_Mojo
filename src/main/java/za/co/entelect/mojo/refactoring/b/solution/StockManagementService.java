package za.co.entelect.mojo.refactoring.b.solution;

import za.co.entelect.mojo.refactoring.b.domain.SupplierStatus;
import za.co.entelect.mojo.refactoring.b.domain.StockItem;
import za.co.entelect.mojo.refactoring.b.domain.StockItemType;

import java.util.ArrayList;
import java.util.List;

public class StockManagementService {

    private List<StockItem> stockItems;

    public void updateStock() {
        for (StockItem stockItem : stockItems) {
            if(stockItem.getSupplier().getStatus().equals(SupplierStatus.INACTIVE)){
                stockItems.remove(stockItem);
            }
        }
    }

    StockItem getItem(StockItemType itemType) {
        for (StockItem stockItem : stockItems) {
            if(stockItem.getType().equals(itemType)) {
                return stockItem;
            }
        }
        return null;
    }

    List<StockItem> getItems(StockItemType itemType) {
        List<StockItem> items = new ArrayList<>();
        for (StockItem stockItem : stockItems) {
            if(stockItem.getType().equals(itemType)) {
                items.add(stockItem);
            }
        }
        return items;
    }
}
