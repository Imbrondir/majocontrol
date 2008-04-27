/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MajoControl.Signals;

/**
 *
 * @author Hugo
 */

public class Signal<V> {
    protected V value;
    protected String name;
    public enum SignalTypes {BOOL_TYPE, INT_TYPE, DOUBLE_TYPE};
    // the signals are designed only to be 1 of these 3 types
    
    public Signal(){
    }
    
    public Signal(V value){
        this.value = value;
    }
    
    public static Signal getSignal(String s){
        return new Signal();
    }
    
    public V getValue(){
        return value;
    }
    
    public void setValue(V value){
        this.value = value;
    }
    
    public boolean routeTo(String remoteComponent){
        return true;
    }
}
