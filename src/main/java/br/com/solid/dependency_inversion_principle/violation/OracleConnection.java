package br.com.solid.dependency_inversion_principle.violation;

public class OracleConnection {

    public OracleConnection(String dbUrl) {
        System.out.println("Criating conection ORACLE database...");
    }

    public void persist(Order order) {
        System.out.println("Persisting order on ORACLE database...");
    }

}