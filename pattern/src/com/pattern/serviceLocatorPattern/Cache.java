package com.pattern.serviceLocatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private List<Service> serviceList;

    public Cache() {
        this.serviceList = new ArrayList<Service>();
    }

    public Service getService(String serviceName){
        for (Service service : serviceList) {
            if(service.getName().equalsIgnoreCase(serviceName)){
                System.out.println("Returning cached "+serviceName+" object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService){
        boolean exists = false;
        for (Service service : serviceList) {
            if(service.getName().equalsIgnoreCase(newService.getName())){
                exists = true;
            }
        }
        if(!exists){
            serviceList.add(newService);
        }


    }
}
