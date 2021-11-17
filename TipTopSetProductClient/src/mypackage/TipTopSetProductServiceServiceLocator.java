/**
 * TipTopSetProductServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class TipTopSetProductServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.TipTopSetProductServiceService {

    public TipTopSetProductServiceServiceLocator() {
    }


    public TipTopSetProductServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TipTopSetProductServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TipTopSetProductService
    private java.lang.String TipTopSetProductService_address = "http://localhost:7001/mycim2/services/TipTopSetProductService";

    public java.lang.String getTipTopSetProductServiceAddress() {
        return TipTopSetProductService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TipTopSetProductServiceWSDDServiceName = "TipTopSetProductService";

    public java.lang.String getTipTopSetProductServiceWSDDServiceName() {
        return TipTopSetProductServiceWSDDServiceName;
    }

    public void setTipTopSetProductServiceWSDDServiceName(java.lang.String name) {
        TipTopSetProductServiceWSDDServiceName = name;
    }

    public mypackage.TipTopSetProductService_PortType getTipTopSetProductService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TipTopSetProductService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTipTopSetProductService(endpoint);
    }

    public mypackage.TipTopSetProductService_PortType getTipTopSetProductService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.TipTopSetProductServiceSoapBindingStub _stub = new mypackage.TipTopSetProductServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTipTopSetProductServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTipTopSetProductServiceEndpointAddress(java.lang.String address) {
        TipTopSetProductService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.TipTopSetProductService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.TipTopSetProductServiceSoapBindingStub _stub = new mypackage.TipTopSetProductServiceSoapBindingStub(new java.net.URL(TipTopSetProductService_address), this);
                _stub.setPortName(getTipTopSetProductServiceWSDDServiceName());
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
        if ("TipTopSetProductService".equals(inputPortName)) {
            return getTipTopSetProductService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "TipTopSetProductServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "TipTopSetProductService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TipTopSetProductService".equals(portName)) {
            setTipTopSetProductServiceEndpointAddress(address);
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
