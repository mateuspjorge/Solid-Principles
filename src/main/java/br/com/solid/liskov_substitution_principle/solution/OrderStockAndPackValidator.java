package br.com.solid.liskov_substitution_principle.solution;

import br.com.solid.liskov_substitution_principle.violation.Item;
import br.com.solid.liskov_substitution_principle.violation.Order;
import br.com.solid.liskov_substitution_principle.violation.OrderStockValidator;

/**
 * LSP SOLUTION
 */
public class OrderStockAndPackValidator extends OrderStockValidator {

    @Override
    public boolean isValid(Order order) {
        for (Item item : order.getItems()) {
            if (!item.isInStock()) {
                return false;
            }
            if (!item.isPacked()) {
                return false;
            }
        }
        return true;
    }

}
