/**
 * GetProductListServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class GetProductListServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.GetProductListServiceService {

    public GetProductListServiceServiceLocator() {
    }


    public GetProductListServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetProductListServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetProductListService
    private java.lang.String GetProductListService_address = "http://192.168.90.160:7001/mycim2/services/GetProductListService";

    public java.lang.String getGetProductListServiceAddress() {
        return GetProductListService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetProductListServiceWSDDServiceName = "GetProductListService";

    public java.lang.String getGetProductListServiceWSDDServiceName() {
        return GetProductListServiceWSDDServiceName;
    }

    public void setGetProductListServiceWSDDServiceName(java.lang.String name) {
        GetProductListServiceWSDDServiceName = name;
    }

    public mypackage.GetProductListService_PortType getGetProductListService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetProductListService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetProductListService(endpoint);
    }

    public mypackage.GetProductListService_PortType getGetProductListService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.GetProductListServiceSoapBindingStub _stub = new mypackage.GetProductListServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGetProductListServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetProductListServiceEndpointAddress(java.lang.String address) {
        GetProductListService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.GetProductListService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.GetProductListServiceSoapBindingStub _stub = new mypackage.GetProductListServiceSoapBindingStub(new java.net.URL(GetProductListService_address), this);
                _stub.setPortName(getGetProductListServiceWSDDServiceName());
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
        if ("GetProductListService".equals(inputPortName)) {
            return getGetProductListService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "GetProductListServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "GetProductListService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetProductListService".equals(portName)) {
            setGetProductListServiceEndpointAddress(address);
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
