/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package MajoControl.Signals;

/**
 *
 * @author Hugo
 */
public class DoubleSignal extends Signal{
    public DoubleSignal(){
        value = 0.0;
    }
    public double getValue(){
        return (Double)value;
    }
    public void setValue(double value){
        this.value = value;
    }
}
