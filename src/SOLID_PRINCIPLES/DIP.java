package SOLID_PRINCIPLES;



// there are 2 types of Mouses: wired and Bluetooth
// there are 2 types of keyboards: wired and Bluetooth

interface keyboard{}

interface mouse{}

class wiredKeyBoard implements keyboard{}
class bluetoothKeyBoard implements keyboard{}

class wiredMouse implements mouse{}
class bluetoothMouse implements mouse{}

class MacBook{

    private final wiredMouse m;
    private final wiredKeyBoard k;


    public MacBook() {
      m = new wiredMouse() ;
      k = new wiredKeyBoard();
    }
}

/*
Here we are trying to create the objects for concrete classes directly inside the another class.

Instead take Interface refrences and then make the calls
* */


class MacBook2{

    private final keyboard k2;
    private final mouse m2;


    MacBook2(keyboard k2, mouse m2) {
        this.k2 = k2;
        this.m2 = m2;
    }
}

/*
* we will eb doing the constructor injection
*
* MackBook2( new wiredKeyboard() / new bluetoothKeyboard() , new wiredMouse() / new bluetoothMouse())
* */

public class DIP {
}
