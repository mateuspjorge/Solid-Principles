package br.com.solid.single_responsibility_principle.solution;

import br.com.solid.single_responsibility_principle.violation.Order;
import br.com.solid.single_responsibility_principle.violation.PgConnection;

/**
 * SRP SOLUTION
 */
public class PgRepository {

    public boolean save(Order order) {
        PgConnection dbConnection = new PgConnection("database.url");

        try {
            dbConnection.persist(order);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

}