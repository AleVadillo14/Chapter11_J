/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap11_.caseproblems;

/**
 *
 * @author ALEW
 */
public class Bartender extends Employee{
    
    public Bartender(){
        setJob_title();
    }
    
    

    @Override
    public void setPay_rate(Double pay_rate) {
        if(pay_rate<=14)
            this.pay_rate=pay_rate;
    }

    @Override
    public void setJob_title() {
        this.job_title = "Bartender";
    }
}
