package br.com.solid.dependency_inversion_principle.violation;

/**
 * DIP VIOLATION
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