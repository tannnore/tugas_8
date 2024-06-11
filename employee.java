package tugasinterface;

class Employee implements Payable {
    private Integer registrationNumber;
    private String name;
    private Integer salaryPerMonth;
    private Invoice[] invoices;

    public Employee(Integer registrationNumber, String name,
                    Integer salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    @Override
    public double getPayableAmount() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return salaryPerMonth - totalInvoiceAmount;
    }

    @Override
    public String toString() {
        return "Nomor Registrasi : " + registrationNumber + "\n"
                + "Nama Karyawan : " + name + "\n" + "Gaji : " + salaryPerMonth
                ;
    }
    // method untuk menampilkan invoice
    public void displayInvoices() {
        for (Invoice invoice : invoices) {
            System.out.println(invoice);
        }
    }
}
