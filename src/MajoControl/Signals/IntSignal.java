/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MajoControl.Signals;

/**
 *
 * @author Hugo
 */
public class IntSignal extends Signal {
    public IntSignal(){
        value = 0;
    }
    
    public int getValue(){
        return (Integer)value;
    }
    
    public void setValue(int value){
        this.value = value;
    }
}
