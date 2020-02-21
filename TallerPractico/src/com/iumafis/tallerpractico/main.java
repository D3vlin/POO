package com.iumafis.tallerpractico;

import com.iumafis.tallerpractico.point1.Point1;
import com.iumafis.tallerpractico.point10.Point10;
import com.iumafis.tallerpractico.point2.Point2;
import com.iumafis.tallerpractico.point3.Point3;
import com.iumafis.tallerpractico.point4.Point4;
import com.iumafis.tallerpractico.point5.Point5;
import com.iumafis.tallerpractico.point6.Point6;
import com.iumafis.tallerpractico.point7.Point7;
import com.iumafis.tallerpractico.point9.Point9;
import java.util.Scanner;

public class main {
        
    private static Scanner intIn;
    private static Scanner stringIn;
        
    public static void main(String[] args) {
                
        boolean repeat = true;
        intIn = new Scanner(System.in);
        stringIn = new Scanner(System.in);
        
        while (repeat) {
            
            int option;        
            System.out.println(String.format("\nQue punto desea ejecutar del 1 al 10?"));
            option = intIn.nextInt();
            System.out.println("");
        
            switch(option) {

                case 1:                
                    Point1.result();
                  break;

                case 2: 
                    Point2.result();
                  break;

                case 3:
                    Point3.result();
                  break;

                case 4:
                    Point4.result();
                  break;

                case 5:
                    Point5.result();
                  break;

                case 6:
                    Point6.result();
                  break;

                case 7:
                    Point7.result();
                  break;

                case 8:
                    System.out.println("Este punto esta comentado dentro del codigo, revisalo!");
                  break;

                case 9:
                    Point9.result();
                  break;

                case 10:
                    Point10.result();
                  break;

                default:
                    System.out.println("Este punto no esta disponible :'c");
            }
            
            String optionMenu;
            System.out.println(String.format("\nEjecutar otro punto?\n\nSi = S\nNo = N"));
            optionMenu = stringIn.nextLine();
            
            switch(optionMenu) {

                case "S":                
                    repeat = true;
                  break;

                case "N":
                    repeat = false;
                    System.out.println(String.format("\nHasta la vista!"));
                  break;

                default:
                    repeat = false;                    
                    System.out.println(String.format("\nError eso no estaba programado, bye :v"));
            }
        }
    }    
}