/**
 * CancelTrackInServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class CancelTrackInServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.CancelTrackInServiceService {

    public CancelTrackInServiceServiceLocator() {
    }


    public CancelTrackInServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CancelTrackInServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CancelTrackInService
//    private java.lang.String CancelTrackInService_address = "http://192.168.90.160:7001/mycim2/services/CancelTrackInService";
    private java.lang.String CancelTrackInService_address = "http://192.168.68.95/mycim2/services/CancelTrackInService";

    public java.lang.String getCancelTrackInServiceAddress() {
        return CancelTrackInService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CancelTrackInServiceWSDDServiceName = "CancelTrackInService";

    public java.lang.String getCancelTrackInServiceWSDDServiceName() {
        return CancelTrackInServiceWSDDServiceName;
    }

    public void setCancelTrackInServiceWSDDServiceName(java.lang.String name) {
        CancelTrackInServiceWSDDServiceName = name;
    }

    public mypackage.CancelTrackInService_PortType getCancelTrackInService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CancelTrackInService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCancelTrackInService(endpoint);
    }

    public mypackage.CancelTrackInService_PortType getCancelTrackInService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.CancelTrackInServiceSoapBindingStub _stub = new mypackage.CancelTrackInServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCancelTrackInServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCancelTrackInServiceEndpointAddress(java.lang.String address) {
        CancelTrackInService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.CancelTrackInService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.CancelTrackInServiceSoapBindingStub _stub = new mypackage.CancelTrackInServiceSoapBindingStub(new java.net.URL(CancelTrackInService_address), this);
                _stub.setPortName(getCancelTrackInServiceWSDDServiceName());
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
        if ("CancelTrackInService".equals(inputPortName)) {
            return getCancelTrackInService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "CancelTrackInServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "CancelTrackInService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CancelTrackInService".equals(portName)) {
            setCancelTrackInServiceEndpointAddress(address);
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
