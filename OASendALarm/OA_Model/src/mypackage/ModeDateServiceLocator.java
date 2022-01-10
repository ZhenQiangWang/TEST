/**
 * ModeDateServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class ModeDateServiceLocator extends org.apache.axis.client.Service implements mypackage.ModeDateService {

    public ModeDateServiceLocator() {
    }


    public ModeDateServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ModeDateServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ModeDateServiceHttpPort
    private java.lang.String ModeDateServiceHttpPort_address = "http://192.168.68.172:8008/services/ModeDateService";

    public java.lang.String getModeDateServiceHttpPortAddress() {
        return ModeDateServiceHttpPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ModeDateServiceHttpPortWSDDServiceName = "ModeDateServiceHttpPort";

    public java.lang.String getModeDateServiceHttpPortWSDDServiceName() {
        return ModeDateServiceHttpPortWSDDServiceName;
    }

    public void setModeDateServiceHttpPortWSDDServiceName(java.lang.String name) {
        ModeDateServiceHttpPortWSDDServiceName = name;
    }

    public mypackage.ModeDateServicePortType getModeDateServiceHttpPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ModeDateServiceHttpPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getModeDateServiceHttpPort(endpoint);
    }

    public mypackage.ModeDateServicePortType getModeDateServiceHttpPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.ModeDateServiceHttpBindingStub _stub = new mypackage.ModeDateServiceHttpBindingStub(portAddress, this);
            _stub.setPortName(getModeDateServiceHttpPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setModeDateServiceHttpPortEndpointAddress(java.lang.String address) {
        ModeDateServiceHttpPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.ModeDateServicePortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.ModeDateServiceHttpBindingStub _stub = new mypackage.ModeDateServiceHttpBindingStub(new java.net.URL(ModeDateServiceHttpPort_address), this);
                _stub.setPortName(getModeDateServiceHttpPortWSDDServiceName());
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
        if ("ModeDateServiceHttpPort".equals(inputPortName)) {
            return getModeDateServiceHttpPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost/services/ModeDateService", "ModeDateService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost/services/ModeDateService", "ModeDateServiceHttpPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ModeDateServiceHttpPort".equals(portName)) {
            setModeDateServiceHttpPortEndpointAddress(address);
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
