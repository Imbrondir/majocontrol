/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MajoControl.Signals;

/**
 *
 * @author Hugo
 */
public class BooleanSignal extends Signal{
    public BooleanSignal(String name){
        super();
        value = false;
        this.name = name;
    }
    
    public boolean getValue(){
        return (Boolean)value;
    }
    
    public void setValue(boolean value){
        this.value = value;
    }
    
    public static BooleanSignal getSignal(String sig){
        return null;
    }
}
