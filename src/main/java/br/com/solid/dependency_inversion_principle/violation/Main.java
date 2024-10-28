package br.com.solid.dependency_inversion_principle.violation;

/**
 * DIP VIOLATION
 */
public class Main {

    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();
        orderProcessor.process(new Order());
    }

}