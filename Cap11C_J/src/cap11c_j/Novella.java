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
public class Novella extends Story{
    
     public Novella(String title, String author,Integer pages) {
        super(title, author);
        setPages(pages);
    }
    
    @Override
    public void setPages(Integer pages) {
        if(pages<50 || pages>100)
            System.out.println(this.message);
        else
            this.pages = pages;
    }

    @Override
    public String toString() {
        return "Novella:\n"+super.toString();
    }
}
