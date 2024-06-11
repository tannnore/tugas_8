//Sultan Rafi
package tugasinterface;

public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice("Dompet", 1, 1000000);
        Invoice invoice2 = new Invoice("Termos", 1, 900000);
        Invoice[] invoices = {invoice1, invoice2};
        Employee employee = new Employee(101010, "Ardian",
                7500000, invoices);
        System.out.println("--------------------------------------------");
        System.out.println("Data Karyawan \n");
        System.out.println(employee);
        System.out.println("Total gaji setelah dipotong perbelanjaan : " + employee.getPayableAmount());
        System.out.println("--------------------------------------------------------------------- ");
        System.out.println("INVOICE KARYAWAN" );
        employee.displayInvoices();
        System.out.println("---------------------------------------------------------------------");
    }
}
