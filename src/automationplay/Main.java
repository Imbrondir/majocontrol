/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package automationplay;

import MajoControl.Signals.*;
/**
 *
 * @author Hugo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ALWAYS create a new signal
        BooleanSignal b = new BooleanSignal("MySignalName");
        b.routeTo("Some.Component.Path.FooSignal");  
        
        Signal<Integer> bb = new Signal<Integer>(0);
        //bb.setValue(23);
        System.out.print(bb.getValue());
    }

}
