/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap11c_j;

/**
 *
 * @author ALEW
 */
public abstract class GeometricFigure {
    protected Integer height;
    protected Integer width;
    protected String figure;
    protected Double area;
  
    
    public abstract Double area();

    @Override
    public String toString() {
        return "GeometricFigure{" + "height=" + height + ", width=" + width + ", figure=" + figure + ", area=" + area + '}';
    }
    
    
}
