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
public class EquipmentWithoutLesson extends Equipment{
    public EquipmentWithoutLesson(Integer type) {
        super(type);
    }

    @Override
    public String lessonPolicy() {
         return "This type of rental does not require a lesson";
    }
}
