/**
 * GetReasonCodeServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class GetReasonCodeServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.GetReasonCodeServiceService {

    public GetReasonCodeServiceServiceLocator() {
    }


    public GetReasonCodeServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetReasonCodeServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetReasonCodeService
    private java.lang.String GetReasonCodeService_address = "http://192.168.90.160:7001/mycim2/services/GetReasonCodeService";

    public java.lang.String getGetReasonCodeServiceAddress() {
        return GetReasonCodeService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetReasonCodeServiceWSDDServiceName = "GetReasonCodeService";

    public java.lang.String getGetReasonCodeServiceWSDDServiceName() {
        return GetReasonCodeServiceWSDDServiceName;
    }

    public void setGetReasonCodeServiceWSDDServiceName(java.lang.String name) {
        GetReasonCodeServiceWSDDServiceName = name;
    }

    public mypackage.GetReasonCodeService_PortType getGetReasonCodeService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetReasonCodeService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetReasonCodeService(endpoint);
    }

    public mypackage.GetReasonCodeService_PortType getGetReasonCodeService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.GetReasonCodeServiceSoapBindingStub _stub = new mypackage.GetReasonCodeServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGetReasonCodeServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetReasonCodeServiceEndpointAddress(java.lang.String address) {
        GetReasonCodeService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.GetReasonCodeService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.GetReasonCodeServiceSoapBindingStub _stub = new mypackage.GetReasonCodeServiceSoapBindingStub(new java.net.URL(GetReasonCodeService_address), this);
                _stub.setPortName(getGetReasonCodeServiceWSDDServiceName());
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
        if ("GetReasonCodeService".equals(inputPortName)) {
            return getGetReasonCodeService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "GetReasonCodeServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "GetReasonCodeService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetReasonCodeService".equals(portName)) {
            setGetReasonCodeServiceEndpointAddress(address);
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
