package com.pattern.serviceLocatorPattern;

public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName){
        Service service = cache.getService(jndiName);
        if (service != null){
            return service;
        }
        InitialContext initialContext = new InitialContext();
        Service lookup = (Service) initialContext.lookup(jndiName);
        cache.addService(lookup);
        return lookup;
    }
}
