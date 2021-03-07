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
public class FullTime extends Student{

    public FullTime(String name) {
        super(name,true);
        tuition();
    }

    @Override
    public void tuition() {
        System.out.println(super.toString()+"Tuition =$"+20000);
    }
    
}
