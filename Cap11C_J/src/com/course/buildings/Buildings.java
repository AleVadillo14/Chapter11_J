/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.course.buildings;

/**
 *
 * @author ALEW
 */
public class Buildings {
    protected Integer footage;
    protected Integer stories;

    public Integer getFootage() {
        return footage;
    }

    public void setFootage(Integer footage) {
        this.footage = footage;
    }

    public Integer getStories() {
        return stories;
    }

    public void setStories(Integer stories) {
        this.stories = stories;
    }

    @Override
    public String toString() {
        return "footage=" + footage + ", stories=" + stories + '}';
    }
    
}
