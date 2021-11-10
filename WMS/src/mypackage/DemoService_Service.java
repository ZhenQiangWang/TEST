/**
 * DemoService_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface DemoService_Service extends javax.xml.rpc.Service {
    public java.lang.String getDemoServiceImplPortAddress();

    public mypackage.DemoService_PortType getDemoServiceImplPort() throws javax.xml.rpc.ServiceException;

    public mypackage.DemoService_PortType getDemoServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
