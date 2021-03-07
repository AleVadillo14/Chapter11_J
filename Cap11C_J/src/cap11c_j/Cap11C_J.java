/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap11c_j;

import cap11_.caseproblems.RentalDemo;
import cap11_.caseproblems.StaffDinnerEvent;
import cap11_.gamezone.CreateAliens;
import cap11_.gamezone.PlayCardGames;
import com.course.buildings.CreateBuilding;

/**
 *
 * @author ALEW
 */
public class Cap11C_J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UseAuto.useAuto();
        UseDivision.useDivision();
        ElementArray.elementArray();
        Subscribers.suscribers();
        StoryDemo.storyDemo();
        DemoTurners.demoTurners();
        DemoTurners2.demoTurners();
        UseInsurance.useInsecurance();
        UseGeometric.useGeometric();
        UseGeometric2.useGeometric2();
        UsePlayer.usePlayer();
        UseStudent.useStudents();
        CreateBuilding.createBuildings();
        CreateLoan.createLoan();
        //GAMES ZONE
        CreateAliens.createAliens();
        PlayCardGames.playCardGames();
        //CASE PROBLEMS
        StaffDinnerEvent.staffDinnerEvent();
        RentalDemo.rentalDemo();
    }
    
}
