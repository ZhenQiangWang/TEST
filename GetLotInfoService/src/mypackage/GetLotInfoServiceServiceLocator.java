/**
 * GetLotInfoServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class GetLotInfoServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.GetLotInfoServiceService {

    public GetLotInfoServiceServiceLocator() {
    }


    public GetLotInfoServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetLotInfoServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetLotInfoService
    private java.lang.String GetLotInfoService_address = "http://localhost:7001/mycim2/services/GetLotInfoService";
//    private java.lang.String GetLotInfoService_address = "http://192.168.68.95/mycim2/services/GetLotInfoService";

    public java.lang.String getGetLotInfoServiceAddress() {
        return GetLotInfoService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetLotInfoServiceWSDDServiceName = "GetLotInfoService";

    public java.lang.String getGetLotInfoServiceWSDDServiceName() {
        return GetLotInfoServiceWSDDServiceName;
    }

    public void setGetLotInfoServiceWSDDServiceName(java.lang.String name) {
        GetLotInfoServiceWSDDServiceName = name;
    }

    public mypackage.GetLotInfoService_PortType getGetLotInfoService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetLotInfoService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetLotInfoService(endpoint);
    }

    public mypackage.GetLotInfoService_PortType getGetLotInfoService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.GetLotInfoServiceSoapBindingStub _stub = new mypackage.GetLotInfoServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGetLotInfoServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetLotInfoServiceEndpointAddress(java.lang.String address) {
        GetLotInfoService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.GetLotInfoService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.GetLotInfoServiceSoapBindingStub _stub = new mypackage.GetLotInfoServiceSoapBindingStub(new java.net.URL(GetLotInfoService_address), this);
                _stub.setPortName(getGetLotInfoServiceWSDDServiceName());
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
        if ("GetLotInfoService".equals(inputPortName)) {
            return getGetLotInfoService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "GetLotInfoServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "GetLotInfoService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetLotInfoService".equals(portName)) {
            setGetLotInfoServiceEndpointAddress(address);
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
