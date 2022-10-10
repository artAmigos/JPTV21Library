/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptv21library;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    public void run() {
        boolean repeat = true;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Spisok zadach:  ");
            System.out.println("0. Close");
            System.out.print("Viberite nimer zadachi:  ");
            int task = scanner.nextInt();
            scanner.nextLine();
            switch(task) {
                case 0:
                    repeat = false;
                    break;
                default:
                    System.out.println("Viberite zadachu iz spiska:  ");
           
            }
            System.out.println("++++++++++++++++++++++++++++");
        }while(repeat);
        System.out.println("GOOd BUY");
    }
    
}
            /*}*/
        
        
       