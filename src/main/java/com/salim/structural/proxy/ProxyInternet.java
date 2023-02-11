package com.salim.structural.proxy;

import java.util.ArrayList;
import java.util.List;

// The proxy should implements that same interface as the real class
public class ProxyInternet implements Internet {
    private final Internet realInternet;
    private final List<String> bannedSites;

    public ProxyInternet() {
        this.realInternet = new RealInternet();
        this.bannedSites = new ArrayList<>();

        bannedSites.add("facebook.com");
        bannedSites.add("twitter.com");
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        if(bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied");
        }

        realInternet.connectTo(serverHost);
    }
}
