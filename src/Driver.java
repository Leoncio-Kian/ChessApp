/**
 * Created by leonc on 2/11/2016.
 */

/*
* The driver class should only be responsible for starting up the system.
* Unless I change my mind later on, hopefully I won't.
*/
public class Driver {
    public static void main(String [] args){
        /*
        * The system is currently packageless, so it can be called without imports.
        */
        //initializing the system initializes any internal variables.
        System system = new System();
        //System runs the game.
        system.run();
        return 0;
    }
}
