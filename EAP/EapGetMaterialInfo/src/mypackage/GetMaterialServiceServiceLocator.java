/**
 * GetMaterialServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class GetMaterialServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.GetMaterialServiceService {

    public GetMaterialServiceServiceLocator() {
    }


    public GetMaterialServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetMaterialServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetMaterialService
    private java.lang.String GetMaterialService_address = "http://192.168.90.160:7001/mycim2/services/GetMaterialService";

    public java.lang.String getGetMaterialServiceAddress() {
        return GetMaterialService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetMaterialServiceWSDDServiceName = "GetMaterialService";

    public java.lang.String getGetMaterialServiceWSDDServiceName() {
        return GetMaterialServiceWSDDServiceName;
    }

    public void setGetMaterialServiceWSDDServiceName(java.lang.String name) {
        GetMaterialServiceWSDDServiceName = name;
    }

    public mypackage.GetMaterialService_PortType getGetMaterialService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetMaterialService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetMaterialService(endpoint);
    }

    public mypackage.GetMaterialService_PortType getGetMaterialService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.GetMaterialServiceSoapBindingStub _stub = new mypackage.GetMaterialServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGetMaterialServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetMaterialServiceEndpointAddress(java.lang.String address) {
        GetMaterialService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.GetMaterialService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.GetMaterialServiceSoapBindingStub _stub = new mypackage.GetMaterialServiceSoapBindingStub(new java.net.URL(GetMaterialService_address), this);
                _stub.setPortName(getGetMaterialServiceWSDDServiceName());
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
        if ("GetMaterialService".equals(inputPortName)) {
            return getGetMaterialService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "GetMaterialServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "GetMaterialService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetMaterialService".equals(portName)) {
            setGetMaterialServiceEndpointAddress(address);
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
