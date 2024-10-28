package br.com.solid.dependency_inversion_principle.solution;

import br.com.solid.dependency_inversion_principle.violation.Order;

/**
 * DIP SOLUTION
 */
public class OrderProcessor {

    private IDatabaseRepository dbRepo;

    private IMailRepository mailRepo;

    public OrderProcessor(IDatabaseRepository dbRepo, IMailRepository mailRepo) {
        this.dbRepo = dbRepo;
        this.mailRepo = mailRepo;
    }

    public void process(Order order) {
        System.out.println("Executing business rules and logic...");
        order.setCustomerName("sandrolaxx");
        order.setCustomerEmail("sandrolax@gmail.com");
        order.setId(47);

        dbRepo.save(order);

        mailRepo.sendConfirmationEmail(order);
    }

}