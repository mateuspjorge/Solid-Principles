package br.com.solid.interface_segregation_principle.solution;

/**
 * ISP SOLUTION
 */
public class BackOffice implements GenerateSalesPdfReport, GenerateSalesExcelReport {

    @Override
    public void generateExcel() {
        System.out.println("Yeee, useful method for me!");
    }

    @Override
    public void generatePDF() {
        System.out.println("Yeee, useful method for me!");
    }

}