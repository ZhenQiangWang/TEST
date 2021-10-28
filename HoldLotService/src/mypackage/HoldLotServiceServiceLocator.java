/**
 * HoldLotServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class HoldLotServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.HoldLotServiceService {

    public HoldLotServiceServiceLocator() {
    }


    public HoldLotServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HoldLotServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HoldLotService
    private java.lang.String HoldLotService_address = "http://192.168.90.160:7001/mycim2/services/HoldLotService";

    public java.lang.String getHoldLotServiceAddress() {
        return HoldLotService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HoldLotServiceWSDDServiceName = "HoldLotService";

    public java.lang.String getHoldLotServiceWSDDServiceName() {
        return HoldLotServiceWSDDServiceName;
    }

    public void setHoldLotServiceWSDDServiceName(java.lang.String name) {
        HoldLotServiceWSDDServiceName = name;
    }

    public mypackage.HoldLotService_PortType getHoldLotService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HoldLotService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHoldLotService(endpoint);
    }

    public mypackage.HoldLotService_PortType getHoldLotService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.HoldLotServiceSoapBindingStub _stub = new mypackage.HoldLotServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getHoldLotServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHoldLotServiceEndpointAddress(java.lang.String address) {
        HoldLotService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.HoldLotService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.HoldLotServiceSoapBindingStub _stub = new mypackage.HoldLotServiceSoapBindingStub(new java.net.URL(HoldLotService_address), this);
                _stub.setPortName(getHoldLotServiceWSDDServiceName());
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
        if ("HoldLotService".equals(inputPortName)) {
            return getHoldLotService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "HoldLotServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "HoldLotService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HoldLotService".equals(portName)) {
            setHoldLotServiceEndpointAddress(address);
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
