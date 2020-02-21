package com.iumafis.tallerpractico.point10;

import com.iumafis.tallerpractico.model.NewcomerProduct;
import com.iumafis.tallerpractico.model.ProductExpired;
import com.iumafis.tallerpractico.model.ProductSoonExpire;
import java.util.Date;

public class Point10 {
    
    public static void result() {
        
        NewcomerProduct newcomerProduct = new NewcomerProduct(new Date(2020, 01, 01), "Medellin", new Date(2020, 05, 01), 1020);
        ProductSoonExpire productSoonExpire = new ProductSoonExpire(2020, new Date(2020, 02, 01), 1010);
        ProductExpired productExpired = new ProductExpired(new Date(2020, 02, 01), new Date(2019, 11, 01), 3030);
        
        System.out.println(newcomerProduct.toString());
        System.out.println(productSoonExpire.toString());
        System.out.println(productExpired.toString());
    }
}
