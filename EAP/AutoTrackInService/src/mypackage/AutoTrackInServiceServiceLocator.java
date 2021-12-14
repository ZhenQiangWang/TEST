/**
 * AutoTrackInServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class AutoTrackInServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.AutoTrackInServiceService {

    public AutoTrackInServiceServiceLocator() {
    }


    public AutoTrackInServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AutoTrackInServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AutoTrackInService
//    private java.lang.String AutoTrackInService_address = "http://192.168.90.160:7001/mycim2/services/AutoTrackInService";
//    private java.lang.String AutoTrackInService_address = "http://192.168.68.95/mycim2/services/AutoTrackInService";
//    private java.lang.String AutoTrackInService_address = "http://localhost:7001/mycim2/services/AutoTrackInService";
    private java.lang.String AutoTrackInService_address = "http://192.168.68.60:7001/mycim2/services/AutoTrackInService";


    public java.lang.String getAutoTrackInServiceAddress() {
        return AutoTrackInService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AutoTrackInServiceWSDDServiceName = "AutoTrackInService";

    public java.lang.String getAutoTrackInServiceWSDDServiceName() {
        return AutoTrackInServiceWSDDServiceName;
    }

    public void setAutoTrackInServiceWSDDServiceName(java.lang.String name) {
        AutoTrackInServiceWSDDServiceName = name;
    }

    public mypackage.AutoTrackInService_PortType getAutoTrackInService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AutoTrackInService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAutoTrackInService(endpoint);
    }

    public mypackage.AutoTrackInService_PortType getAutoTrackInService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.AutoTrackInServiceSoapBindingStub _stub = new mypackage.AutoTrackInServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAutoTrackInServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAutoTrackInServiceEndpointAddress(java.lang.String address) {
        AutoTrackInService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.AutoTrackInService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.AutoTrackInServiceSoapBindingStub _stub = new mypackage.AutoTrackInServiceSoapBindingStub(new java.net.URL(AutoTrackInService_address), this);
                _stub.setPortName(getAutoTrackInServiceWSDDServiceName());
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
        if ("AutoTrackInService".equals(inputPortName)) {
            return getAutoTrackInService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "AutoTrackInServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "AutoTrackInService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AutoTrackInService".equals(portName)) {
            setAutoTrackInServiceEndpointAddress(address);
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
