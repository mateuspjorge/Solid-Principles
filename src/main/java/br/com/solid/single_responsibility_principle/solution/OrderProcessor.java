package br.com.solid.single_responsibility_principle.solution;

import br.com.solid.single_responsibility_principle.violation.Order;

/**
 * SRP SOLUTION
 */
public class OrderProcessor {

    public void process(Order order) {
        PgRepository pgRepo = new PgRepository();
        SendConfirmationEmail sendMail = new SendConfirmationEmail();

        System.out.println("Executing business rules and logic...");
        order.setCustomerName("mateus.p.jorge");
        order.setCustomerEmail("mateus.p.jorge@gmail.com");
        order.setId(47);

        pgRepo.save(order);

        sendMail.sendConfirmationEmail(order);
    }

}