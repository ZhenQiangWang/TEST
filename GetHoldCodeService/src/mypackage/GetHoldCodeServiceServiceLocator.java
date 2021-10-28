/**
 * GetHoldCodeServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class GetHoldCodeServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.GetHoldCodeServiceService {

    public GetHoldCodeServiceServiceLocator() {
    }


    public GetHoldCodeServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetHoldCodeServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetHoldCodeService
    private java.lang.String GetHoldCodeService_address = "http://192.168.90.160:7001/mycim2/services/GetHoldCodeService";

    public java.lang.String getGetHoldCodeServiceAddress() {
        return GetHoldCodeService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetHoldCodeServiceWSDDServiceName = "GetHoldCodeService";

    public java.lang.String getGetHoldCodeServiceWSDDServiceName() {
        return GetHoldCodeServiceWSDDServiceName;
    }

    public void setGetHoldCodeServiceWSDDServiceName(java.lang.String name) {
        GetHoldCodeServiceWSDDServiceName = name;
    }

    public mypackage.GetHoldCodeService_PortType getGetHoldCodeService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetHoldCodeService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetHoldCodeService(endpoint);
    }

    public mypackage.GetHoldCodeService_PortType getGetHoldCodeService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.GetHoldCodeServiceSoapBindingStub _stub = new mypackage.GetHoldCodeServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGetHoldCodeServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetHoldCodeServiceEndpointAddress(java.lang.String address) {
        GetHoldCodeService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.GetHoldCodeService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.GetHoldCodeServiceSoapBindingStub _stub = new mypackage.GetHoldCodeServiceSoapBindingStub(new java.net.URL(GetHoldCodeService_address), this);
                _stub.setPortName(getGetHoldCodeServiceWSDDServiceName());
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
        if ("GetHoldCodeService".equals(inputPortName)) {
            return getGetHoldCodeService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "GetHoldCodeServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "GetHoldCodeService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetHoldCodeService".equals(portName)) {
            setGetHoldCodeServiceEndpointAddress(address);
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
