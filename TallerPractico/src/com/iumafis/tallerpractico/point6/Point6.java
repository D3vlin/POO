package com.iumafis.tallerpractico.point6;

import com.iumafis.tallerpractico.model.Purchase;
import com.iumafis.tallerpractico.model.Sale;
import java.io.PrintStream;
import java.util.Scanner;

public class Point6 {
    
    private static Scanner floatIn;
    private static Scanner intIn;
    private static PrintStream console;
    
    public static void result(){
        
        floatIn = new Scanner(System.in);
        intIn = new Scanner(System.in);
        console = System.out;
        float totalSales = 0;
        float totalPurchases = 0;
        Sale[] sales;
        Purchase[] purchases;
        String utility;
        
        console.println("Cuantas compras tuviste hoy?");
        purchases = new Purchase[intIn.nextInt()];
        
        for (int i = 0; i < purchases.length; i++) {
            purchases[i] = new Purchase();
            console.println(String.format("\nIngresa el valor de la compra #%s:", (i + 1)));
            purchases[i].setValue(floatIn.nextFloat());
            totalPurchases += purchases[i].getValue();
        }
        
        console.println(String.format("\n\nCuantas ventas tuviste hoy?"));
        sales = new Sale[intIn.nextInt()];
        
        for (int i = 0; i < sales.length; i++) {
            sales[i] = new Sale();
            console.println(String.format("\nIngresa el valor de la venta #%s:", (i + 1)));
            sales[i].setValue(floatIn.nextFloat());
            totalSales += sales[i].getValue();
        }
        
        if (totalSales > totalPurchases) { utility = "Tu negocio recibe ganancias! :D";
        
        } else if (totalSales == totalPurchases) { utility = "Tu negocio mantiene un equilibrio! :I";
        
        } else { utility = "Tu negocio tiene perdidas! :("; }
        
        console.println(String.format("\n\nAsí va tu negocio:\n    El total de compras fue: $%s\n    El total de ventas fue: $%s\n    Resultado:%s\n%s",
                                        totalPurchases,
                                        totalSales,
                                        (totalSales - totalPurchases),
                                        utility)
        );
    }
}
