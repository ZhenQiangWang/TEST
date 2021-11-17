/**
 * CheckMaterialServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class CheckMaterialServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.CheckMaterialServiceService {

    public CheckMaterialServiceServiceLocator() {
    }


    public CheckMaterialServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CheckMaterialServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CheckMaterialService
    private java.lang.String CheckMaterialService_address = "http://192.168.90.160:7001/mycim2/services/CheckMaterialService";

    public java.lang.String getCheckMaterialServiceAddress() {
        return CheckMaterialService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CheckMaterialServiceWSDDServiceName = "CheckMaterialService";

    public java.lang.String getCheckMaterialServiceWSDDServiceName() {
        return CheckMaterialServiceWSDDServiceName;
    }

    public void setCheckMaterialServiceWSDDServiceName(java.lang.String name) {
        CheckMaterialServiceWSDDServiceName = name;
    }

    public mypackage.CheckMaterialService_PortType getCheckMaterialService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CheckMaterialService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCheckMaterialService(endpoint);
    }

    public mypackage.CheckMaterialService_PortType getCheckMaterialService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.CheckMaterialServiceSoapBindingStub _stub = new mypackage.CheckMaterialServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCheckMaterialServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCheckMaterialServiceEndpointAddress(java.lang.String address) {
        CheckMaterialService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.CheckMaterialService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.CheckMaterialServiceSoapBindingStub _stub = new mypackage.CheckMaterialServiceSoapBindingStub(new java.net.URL(CheckMaterialService_address), this);
                _stub.setPortName(getCheckMaterialServiceWSDDServiceName());
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
        if ("CheckMaterialService".equals(inputPortName)) {
            return getCheckMaterialService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "CheckMaterialServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "CheckMaterialService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CheckMaterialService".equals(portName)) {
            setCheckMaterialServiceEndpointAddress(address);
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
