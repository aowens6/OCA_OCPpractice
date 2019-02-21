/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca_ocppractice;

/**
 *
 * @author Austyn
 */

class OtherThread extends Thread{
  @Override
  public void run(){
    for(int i = 1; i < 10; i++){
      System.out.println("In otherThread.run() printer &&&&&&&&" + i);
    }
  }
}

public class ThreadPrac {
  
  public static void main(String args[]){
    System.out.println("Main method started-----------");
    
    
    OtherThread thread = new OtherThread();
    thread.start();
    
    for(int i = 1; i < 10; i++){
      System.out.println("In main sout printer ---------" + i);
    }
    
    System.out.println("Main method ending-------------");
  }
  
}
