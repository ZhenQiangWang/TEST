/**
 * TipTopSetMaterialServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class TipTopSetMaterialServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.TipTopSetMaterialServiceService {

    public TipTopSetMaterialServiceServiceLocator() {
    }


    public TipTopSetMaterialServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TipTopSetMaterialServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TipTopSetMaterialService
    private java.lang.String TipTopSetMaterialService_address = "http://localhost:7001/mycim2/services/TipTopSetMaterialService";

    public java.lang.String getTipTopSetMaterialServiceAddress() {
        return TipTopSetMaterialService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TipTopSetMaterialServiceWSDDServiceName = "TipTopSetMaterialService";

    public java.lang.String getTipTopSetMaterialServiceWSDDServiceName() {
        return TipTopSetMaterialServiceWSDDServiceName;
    }

    public void setTipTopSetMaterialServiceWSDDServiceName(java.lang.String name) {
        TipTopSetMaterialServiceWSDDServiceName = name;
    }

    public mypackage.TipTopSetMaterialService_PortType getTipTopSetMaterialService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TipTopSetMaterialService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTipTopSetMaterialService(endpoint);
    }

    public mypackage.TipTopSetMaterialService_PortType getTipTopSetMaterialService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.TipTopSetMaterialServiceSoapBindingStub _stub = new mypackage.TipTopSetMaterialServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTipTopSetMaterialServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTipTopSetMaterialServiceEndpointAddress(java.lang.String address) {
        TipTopSetMaterialService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.TipTopSetMaterialService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.TipTopSetMaterialServiceSoapBindingStub _stub = new mypackage.TipTopSetMaterialServiceSoapBindingStub(new java.net.URL(TipTopSetMaterialService_address), this);
                _stub.setPortName(getTipTopSetMaterialServiceWSDDServiceName());
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
        if ("TipTopSetMaterialService".equals(inputPortName)) {
            return getTipTopSetMaterialService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "TipTopSetMaterialServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "TipTopSetMaterialService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TipTopSetMaterialService".equals(portName)) {
            setTipTopSetMaterialServiceEndpointAddress(address);
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
