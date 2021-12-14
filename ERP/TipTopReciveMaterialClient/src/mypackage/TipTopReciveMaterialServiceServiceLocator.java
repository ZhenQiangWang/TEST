/**
 * TipTopReciveMaterialServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class TipTopReciveMaterialServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.TipTopReciveMaterialServiceService {

    public TipTopReciveMaterialServiceServiceLocator() {
    }


    public TipTopReciveMaterialServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TipTopReciveMaterialServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TipTopReciveMaterialService
    private java.lang.String TipTopReciveMaterialService_address = "http://localhost:7001/mycim2/services/TipTopReciveMaterialService";

    public java.lang.String getTipTopReciveMaterialServiceAddress() {
        return TipTopReciveMaterialService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TipTopReciveMaterialServiceWSDDServiceName = "TipTopReciveMaterialService";

    public java.lang.String getTipTopReciveMaterialServiceWSDDServiceName() {
        return TipTopReciveMaterialServiceWSDDServiceName;
    }

    public void setTipTopReciveMaterialServiceWSDDServiceName(java.lang.String name) {
        TipTopReciveMaterialServiceWSDDServiceName = name;
    }

    public mypackage.TipTopReciveMaterialService_PortType getTipTopReciveMaterialService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TipTopReciveMaterialService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTipTopReciveMaterialService(endpoint);
    }

    public mypackage.TipTopReciveMaterialService_PortType getTipTopReciveMaterialService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.TipTopReciveMaterialServiceSoapBindingStub _stub = new mypackage.TipTopReciveMaterialServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTipTopReciveMaterialServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTipTopReciveMaterialServiceEndpointAddress(java.lang.String address) {
        TipTopReciveMaterialService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.TipTopReciveMaterialService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.TipTopReciveMaterialServiceSoapBindingStub _stub = new mypackage.TipTopReciveMaterialServiceSoapBindingStub(new java.net.URL(TipTopReciveMaterialService_address), this);
                _stub.setPortName(getTipTopReciveMaterialServiceWSDDServiceName());
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
        if ("TipTopReciveMaterialService".equals(inputPortName)) {
            return getTipTopReciveMaterialService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "TipTopReciveMaterialServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "TipTopReciveMaterialService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TipTopReciveMaterialService".equals(portName)) {
            setTipTopReciveMaterialServiceEndpointAddress(address);
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
