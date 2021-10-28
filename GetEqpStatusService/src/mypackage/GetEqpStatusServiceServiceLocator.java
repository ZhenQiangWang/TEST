/**
 * GetEqpStatusServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class GetEqpStatusServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.GetEqpStatusServiceService {

    public GetEqpStatusServiceServiceLocator() {
    }


    public GetEqpStatusServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetEqpStatusServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetEqpStatusService
    private java.lang.String GetEqpStatusService_address = "http://192.168.90.160:7001/mycim2/services/GetEqpStatusService";

    public java.lang.String getGetEqpStatusServiceAddress() {
        return GetEqpStatusService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetEqpStatusServiceWSDDServiceName = "GetEqpStatusService";

    public java.lang.String getGetEqpStatusServiceWSDDServiceName() {
        return GetEqpStatusServiceWSDDServiceName;
    }

    public void setGetEqpStatusServiceWSDDServiceName(java.lang.String name) {
        GetEqpStatusServiceWSDDServiceName = name;
    }

    public mypackage.GetEqpStatusService_PortType getGetEqpStatusService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetEqpStatusService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetEqpStatusService(endpoint);
    }

    public mypackage.GetEqpStatusService_PortType getGetEqpStatusService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.GetEqpStatusServiceSoapBindingStub _stub = new mypackage.GetEqpStatusServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGetEqpStatusServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetEqpStatusServiceEndpointAddress(java.lang.String address) {
        GetEqpStatusService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.GetEqpStatusService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.GetEqpStatusServiceSoapBindingStub _stub = new mypackage.GetEqpStatusServiceSoapBindingStub(new java.net.URL(GetEqpStatusService_address), this);
                _stub.setPortName(getGetEqpStatusServiceWSDDServiceName());
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
        if ("GetEqpStatusService".equals(inputPortName)) {
            return getGetEqpStatusService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "GetEqpStatusServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "GetEqpStatusService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetEqpStatusService".equals(portName)) {
            setGetEqpStatusServiceEndpointAddress(address);
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
