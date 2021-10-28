/**
 * GetPMDueTimeServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class GetPMDueTimeServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.GetPMDueTimeServiceService {

    public GetPMDueTimeServiceServiceLocator() {
    }


    public GetPMDueTimeServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetPMDueTimeServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetPMDueTimeService
    private java.lang.String GetPMDueTimeService_address = "http://192.168.90.160:7001/mycim2/services/GetPMDueTimeService";

    public java.lang.String getGetPMDueTimeServiceAddress() {
        return GetPMDueTimeService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetPMDueTimeServiceWSDDServiceName = "GetPMDueTimeService";

    public java.lang.String getGetPMDueTimeServiceWSDDServiceName() {
        return GetPMDueTimeServiceWSDDServiceName;
    }

    public void setGetPMDueTimeServiceWSDDServiceName(java.lang.String name) {
        GetPMDueTimeServiceWSDDServiceName = name;
    }

    public mypackage.GetPMDueTimeService_PortType getGetPMDueTimeService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetPMDueTimeService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetPMDueTimeService(endpoint);
    }

    public mypackage.GetPMDueTimeService_PortType getGetPMDueTimeService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.GetPMDueTimeServiceSoapBindingStub _stub = new mypackage.GetPMDueTimeServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGetPMDueTimeServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetPMDueTimeServiceEndpointAddress(java.lang.String address) {
        GetPMDueTimeService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.GetPMDueTimeService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.GetPMDueTimeServiceSoapBindingStub _stub = new mypackage.GetPMDueTimeServiceSoapBindingStub(new java.net.URL(GetPMDueTimeService_address), this);
                _stub.setPortName(getGetPMDueTimeServiceWSDDServiceName());
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
        if ("GetPMDueTimeService".equals(inputPortName)) {
            return getGetPMDueTimeService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "GetPMDueTimeServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "GetPMDueTimeService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetPMDueTimeService".equals(portName)) {
            setGetPMDueTimeServiceEndpointAddress(address);
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
