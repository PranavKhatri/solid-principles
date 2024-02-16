package SOLID_PRINCIPLES;


interface RestaurantEmployees{
    void washDishes();
    void serveCustomers();

    void cookFood();
}


class waiter implements RestaurantEmployees{

    public void washDishes(){
        // not my job
    }

    public void serveCustomers(){
        // yes and here is my implementation
        System.out.println("serving the customer");
    }

    public void cookFood(){
        // not my food
    }
}


/*
break the interface into smaller parts so that the client has not to implement alot of methods.
* */

interface WaiterInterface{
    void serveCustomers();
    void takeOrder();
}

interface ChefInterface{
    void cookFood();
    void decideMenu();
}

// Now, we can implement the interface of the role that is needed/

class waiter2 implements WaiterInterface{

    public void serveCustomers(){
        System.out.println("serving the customners");
    }

    public void takeOrder(){
        // take orders
    }
}
public class ISP {
}
