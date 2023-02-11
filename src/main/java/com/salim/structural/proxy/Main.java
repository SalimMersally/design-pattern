package com.salim.structural.proxy;

import com.salim.structural.proxy.example.Internet;
import com.salim.structural.proxy.example.ProxyInternet;

public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();

        try {
            internet.connectTo("google.com");
            internet.connectTo("facebook.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
