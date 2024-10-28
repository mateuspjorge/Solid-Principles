package br.com.solid.dependency_inversion_principle.solution;

import br.com.solid.dependency_inversion_principle.violation.Order;
import br.com.solid.dependency_inversion_principle.violation.PgConnection;

/**
 * DIP SOLUTION
 */
public class PgRepository implements IDatabaseRepository {

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