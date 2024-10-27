package br.com.solid.open_closed_principle.violation;

import br.com.solid.open_closed_principle.violation.PgConnection;

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