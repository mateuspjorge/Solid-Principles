package br.com.solid.open_closed_principle.solution;

import br.com.solid.open_closed_principle.violation.Order;
import br.com.solid.open_closed_principle.violation.OrderProcessor;

/**
 * OCP SOLUTION
 */
public class OrderProcessorWithRequiredChange extends OrderProcessor {

    public void process(Order order) {
        if (!order.hasItems()) {
            throw new RuntimeException("Is not possible continue! Order has no itens");
        }

        super.process(order);

        if (!order.isValid()) {
            throw new RuntimeException("Is not possible continue! Order has no Id");
        }
    }

}