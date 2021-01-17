package ImageHoster.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by vaibhavhajela on 02/01/21.
 */
@Entity
@Table(name = "invoice_data")
public class InvoiceData {

    @Id
    @Column(name = "invoice_serial_number")
    private String invoiceNumber;

    @Override
    public String toString() {
        return "InvoiceData{" +
                "invoiceNumber='" + invoiceNumber + '\'' +
                ", customerName='" + customerName + '\'' +
                ", amount=" + amount +
                '}';
    }

    @Column(name="customer_name")
    private String customerName;
    @Column
    private double amount;

    public InvoiceData(){

    }

    public InvoiceData(String invoiceNumber, String customerName, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.customerName = customerName;
        this.amount = amount;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


}
