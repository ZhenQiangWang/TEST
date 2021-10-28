/**
 * DemoService_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class DemoService_ServiceLocator extends org.apache.axis.client.Service implements mypackage.DemoService_Service {

    public DemoService_ServiceLocator() {
    }


    public DemoService_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DemoService_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DemoServiceImplPort
    private java.lang.String DemoServiceImplPort_address = "http://192.168.68.159:9191/services/api";

    public java.lang.String getDemoServiceImplPortAddress() {
        return DemoServiceImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DemoServiceImplPortWSDDServiceName = "DemoServiceImplPort";

    public java.lang.String getDemoServiceImplPortWSDDServiceName() {
        return DemoServiceImplPortWSDDServiceName;
    }

    public void setDemoServiceImplPortWSDDServiceName(java.lang.String name) {
        DemoServiceImplPortWSDDServiceName = name;
    }

    public mypackage.DemoService_PortType getDemoServiceImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DemoServiceImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDemoServiceImplPort(endpoint);
    }

    public mypackage.DemoService_PortType getDemoServiceImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.DemoServiceSoapBindingStub _stub = new mypackage.DemoServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDemoServiceImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDemoServiceImplPortEndpointAddress(java.lang.String address) {
        DemoServiceImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.DemoService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.DemoServiceSoapBindingStub _stub = new mypackage.DemoServiceSoapBindingStub(new java.net.URL(DemoServiceImplPort_address), this);
                _stub.setPortName(getDemoServiceImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("DemoServiceImplPort".equals(inputPortName)) {
            return getDemoServiceImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://webservices.e1.cy.com", "DemoService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://webservices.e1.cy.com", "DemoServiceImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DemoServiceImplPort".equals(portName)) {
            setDemoServiceImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
