package SOLID_PRINCIPLES;


/*
* The below code does the 3 major works: calculating amount, printing Invoice and Saving into the DB.
*
* "This Class is not following the Single Responsibility Principle"
*
*/
class Invoice{

    private Marker marker; // Invoice has - a marker; as Invoice has a marker object

    private int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price =((marker.price) * this.quantity);
        return price;
    }

    public void printInvoice() {
        // print the invoice
    }

    public void saveToDB(){
        // Save data into the DB
    }

}


/*
 Creating 3 different classes for evry important method

*/

class Invoice2{
    private Marker marker; // Invoice has - a marker; as Invoice has a marker object

    private int quantity;

    public Invoice2(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculateTotal(){
        int price =((marker.price) * this.quantity);
        return price;
    }

}


class InvoiceDao{
    // Dao :  Data Access Layer
    Invoice2 invoice;

    public InvoiceDao(Invoice2 invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        //Save into the DB;
    }
}


class InvoicePrinter{
    private Invoice2 invoice;

    public InvoicePrinter(Invoice2 invoice){
        this.invoice = invoice;
    }

    public void print(){
        // print the invoice;
    }
}

/*
1. Now Each class has single Responsibility.

 */


public class SRP {

}
