package za.co.entelect.mojo.old.refactoring.b.solution;

import za.co.entelect.mojo.old.refactoring.b.domain.StockItemType;

public class StockMonitorService {

    private StockManagementService stockManagementService;

    public StockMonitorService(StockManagementService stockManagementService) {
        this.stockManagementService = stockManagementService;
    }

    public boolean hasItem(StockItemType type) {
        return stockManagementService.getItem(type) != null;
    }

    public int getItemQuantity(StockItemType itemType) {
        return stockManagementService.getItems(itemType).size();
    }
}
