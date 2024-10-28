package br.com.solid.dependency_inversion_principle.violation;

/**
 * DIP VIOLATION
 */
public class OracleRepository {

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