package br.com.solid.single_responsibility_principle.solution;

import br.com.solid.single_responsibility_principle.violation.Order;

public class Main {

    public static void main(String[] args) {
        OrderProcessor processor = new OrderProcessor();
        Order order = new Order();
        processor.process(order);
    }

}