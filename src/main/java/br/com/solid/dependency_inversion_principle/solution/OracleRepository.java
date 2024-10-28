package br.com.solid.dependency_inversion_principle.solution;

import br.com.solid.dependency_inversion_principle.violation.OracleConnection;
import br.com.solid.dependency_inversion_principle.violation.Order;

/**
 * DIP SOLUTION
 */
public class OracleRepository implements IDatabaseRepository {

    public boolean save(Order order) {
        OracleConnection dbConnection = new OracleConnection("database.url");
        try {
            dbConnection.persist(order);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}