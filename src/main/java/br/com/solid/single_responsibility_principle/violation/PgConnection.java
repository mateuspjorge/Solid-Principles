package br.com.solid.single_responsibility_principle.violation;

public class PgConnection {

    public PgConnection(String dbUrl) {
        System.out.println("Criating conectiono POSTGRES database...");
    }

    public void persist(Order order) {
        System.out.println("Persisting order on POSTGRES database...");
    }

}