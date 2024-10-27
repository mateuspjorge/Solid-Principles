package br.com.solid.interface_segregation_principle.solution;

/**
 * ISP SOLUTION
 */
public class DatascientsSector implements GenerateSalesExcelReport {

    @Override
    public void generateExcel() {
        System.out.println("Yeee, useful method for me!");
    }

}