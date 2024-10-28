package br.com.solid.dependency_inversion_principle.solution;

import br.com.solid.dependency_inversion_principle.violation.Order;

/**
 * DIP SOLUTION
 */
public interface IMailRepository {

    void sendConfirmationEmail(Order order);

}