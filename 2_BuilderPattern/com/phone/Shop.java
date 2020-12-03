// package com.phone;


public class Shop {
    
    public static void main(String[] args) {

        Phone p = new PhoneBuilder().setOS("Android").setRam(4).getPhone();
        System.out.println(p);        
    }
}
