/**
 * AutoTrackOutServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class AutoTrackOutServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.AutoTrackOutServiceService {

    public AutoTrackOutServiceServiceLocator() {
    }


    public AutoTrackOutServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AutoTrackOutServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AutoTrackOutService
//    private java.lang.String AutoTrackOutService_address = "http://192.168.90.160:7001/mycim2/services/AutoTrackOutService";
    private java.lang.String AutoTrackOutService_address = "http://localhost:7001/mycim2/services/AutoTrackOutService";

    public java.lang.String getAutoTrackOutServiceAddress() {
        return AutoTrackOutService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AutoTrackOutServiceWSDDServiceName = "AutoTrackOutService";

    public java.lang.String getAutoTrackOutServiceWSDDServiceName() {
        return AutoTrackOutServiceWSDDServiceName;
    }

    public void setAutoTrackOutServiceWSDDServiceName(java.lang.String name) {
        AutoTrackOutServiceWSDDServiceName = name;
    }

    public mypackage.AutoTrackOutService_PortType getAutoTrackOutService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AutoTrackOutService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAutoTrackOutService(endpoint);
    }

    public mypackage.AutoTrackOutService_PortType getAutoTrackOutService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.AutoTrackOutServiceSoapBindingStub _stub = new mypackage.AutoTrackOutServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAutoTrackOutServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAutoTrackOutServiceEndpointAddress(java.lang.String address) {
        AutoTrackOutService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.AutoTrackOutService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.AutoTrackOutServiceSoapBindingStub _stub = new mypackage.AutoTrackOutServiceSoapBindingStub(new java.net.URL(AutoTrackOutService_address), this);
                _stub.setPortName(getAutoTrackOutServiceWSDDServiceName());
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
        if ("AutoTrackOutService".equals(inputPortName)) {
            return getAutoTrackOutService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "AutoTrackOutServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "AutoTrackOutService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AutoTrackOutService".equals(portName)) {
            setAutoTrackOutServiceEndpointAddress(address);
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
