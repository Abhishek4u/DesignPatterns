package com.phone;

public class OperatingSystemFactory {
    
    public OS getInstance(String str) {

        if(str.equalsIgnoreCase("android")) {
            // it will compare by ignoring the cases of letters
            return new Android();

        } else if(str.equalsIgnoreCase("WINDOWS")) {
            return new Window();

        } else if(str.equalsIgnoreCase("iOS")) {
            return new iOS();
        }
        else return null;
    }
}
