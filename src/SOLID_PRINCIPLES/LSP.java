package SOLID_PRINCIPLES;


interface Bike{

    void turnOnEngine();
    void accelerate();
}

class MotorCycle implements Bike{

    boolean isEngineOn;
    int speed;

    @Override
    public void turnOnEngine(){

        // turn on the Engine!
        isEngineOn = true;
    }


    @Override
    public void accelerate() {
        speed += 10;
    }
}

class Bicycle implements Bike{

    // as there is no engine in cycle!!!!
    @Override
     public void turnOnEngine(){
        try{
            // do noting
        }finally{
            System.out.println("There is no engine!!");
        }
    }

    @Override
    public void accelerate() {
        // do something
    }
}

/*

Hence the base class meaning for Bike has chnaged as bycycle has no engine

Use inheritance to solve the issue.


Make the Parent class with generic methods and add interffaces and implements them according to teh need.
 */
public class LSP {
}
