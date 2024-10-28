package br.com.solid.dependency_inversion_principle.solution;

import br.com.solid.dependency_inversion_principle.violation.Order;

/**
 * DIP SOLUTION
 */
public class Main {

    public static void main(String[] args) {
        PgRepository pgRepo = new PgRepository();
        OracleRepository oracleRepository = new OracleRepository();
        SendConfirmationEmail sendMail = new SendConfirmationEmail();

        Order order = new Order();

        OrderProcessor orderProcessor = new OrderProcessor(oracleRepository, sendMail);

        orderProcessor.process(order);
    }

}