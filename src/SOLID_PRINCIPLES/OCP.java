package SOLID_PRINCIPLES;


/*
We got the new requirement to save the code in to the file too.
So, we created  another function to saveToFile
 */



class InvoiceDao2{
    // Dao :  Data Access Layer
    Invoice2 invoice;

    public InvoiceDao2(Invoice2 invoice){
        this.invoice = invoice;
    }

    public void saveToDB(){
        //Save into the DB;
    }

    // New Method added according to function
    public void saveToFile(String filename){
        // Save Invoice in the file with the given name
    }
}

/*
But It does not follow OCP.
Ideally the class should be open for the extension but should be closed for further modifications.
It is prone more bugs.
 */


interface InvoiceDaoOCP{
    public void save (Invoice2 invoice);
}

class DatabaseInvoiceDao implements InvoiceDaoOCP{

    @Override
    public void save(Invoice2 invoice) {
        // save to DB
    }
}


class  FileInvoiceDao implements InvoiceDaoOCP{

    @Override
    public void save(Invoice2 invoice) {
        // save to the file
    }
}

/*
In the above modification, we have a common method in the interface which
 is implemented by different classes in different ways. We can further implement int new different ways.
 */

public class OCP {
}
