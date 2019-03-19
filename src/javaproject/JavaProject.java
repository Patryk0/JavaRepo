/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

/**
 *
 * @author osboxes
 */
public class JavaProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	DEV1 dev1 = new DEV1();
    	DEV2 dev2 = new DEV2();
    	
        System.out.println(System.getProperty("java.version"));
        
        System.out.println(dev1.author);
        System.out.println(dev2.imie + " " + dev2.nazwisko);
    }
}
