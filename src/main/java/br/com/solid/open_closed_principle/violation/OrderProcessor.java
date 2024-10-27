package br.com.solid.open_closed_principle.violation;

/**
 * OCP VIOLATION - CLASS CHANGES REQUESTED AND WE CHANGE IT DIRECTLY
 */
public class OrderProcessor {

    public void process(Order order) {
        if (!order.hasItems()) {
            throw new RuntimeException("Is not possible continue! Order has no itens");
        }

        PgRepository pgRepo = new PgRepository();
        SendConfirmationEmail sendMail = new SendConfirmationEmail();

        System.out.println("Executing business rules and logic...");
        order.setCustomerName("mateus.p.jorge");
        order.setCustomerEmail("mateus.p.jorge@gmail.com");
        order.setId(47);

        pgRepo.save(order);

        sendMail.sendConfirmationEmail(order);

        if (!order.isValid()) {
            throw new RuntimeException("Is not possible continue! Order has no Id");
        }
    }

}