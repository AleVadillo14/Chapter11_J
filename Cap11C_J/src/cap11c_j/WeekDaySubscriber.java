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
public class WeekDaySubscriber extends NewspaperSubscriber{
    
    public WeekDaySubscriber(){
        setRate(0.0);
    }

    @Override
    public void setRate(Double rate) {
      this.rate = 3.50;
    }

    @Override
    public String toString() {
        return "WeekDaySubscriber:\n"+super.toString();
    }
    
}
