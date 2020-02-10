package com.iumafis.project1.point4;

public class Point4 {
    
     public static void result(){
        int result = 0;
        
        for(int i = 100; i > 0; i = i - 2) {
            result += i; 
        }
        
        System.out.println(String.format("La suma es: %s", result));
    }
}
