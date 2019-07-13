/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author dylan
 */
public class NewClass {
    private String test;
    
    public NewClass(String test){
        this.test = test;
    }
    
    public NewClass(){}

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }   
    
    @Override
    public String toString(){
        return "test: "+this.test;
    }
}