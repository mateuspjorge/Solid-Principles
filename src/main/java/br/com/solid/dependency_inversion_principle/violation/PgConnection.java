package br.com.solid.dependency_inversion_principle.violation;

public class PgConnection {

    public PgConnection(String dbUrl) {
        System.out.println("Criating conection POSTGRES database...");
    }

    public void persist(Order order) {
        System.out.println("Persisting order on POSTGRES database...");
    }

}