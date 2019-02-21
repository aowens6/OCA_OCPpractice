package oca_ocppractice;


import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Austyn
 */
public class LocalePrac {
  
  public static void main(String[] args){
    Locale locale = new Locale.Builder().setRegion("us").build();
    System.out.println(locale);
    
    // how to set the default to a new locale!! page 258
    System.out.println(Locale.getDefault());
    Locale locale2 = new Locale("fr");
    Locale.setDefault(locale2);
    System.out.println(Locale.getDefault());
  }
  
}
