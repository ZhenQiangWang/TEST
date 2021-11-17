/**
 * TipTopReciveWorkOrderServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class TipTopReciveWorkOrderServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.TipTopReciveWorkOrderServiceService {

    public TipTopReciveWorkOrderServiceServiceLocator() {
    }


    public TipTopReciveWorkOrderServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TipTopReciveWorkOrderServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TipTopReciveWorkOrderService
    private java.lang.String TipTopReciveWorkOrderService_address = "http://localhost:7001/mycim2/services/TipTopReciveWorkOrderService";

    public java.lang.String getTipTopReciveWorkOrderServiceAddress() {
        return TipTopReciveWorkOrderService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TipTopReciveWorkOrderServiceWSDDServiceName = "TipTopReciveWorkOrderService";

    public java.lang.String getTipTopReciveWorkOrderServiceWSDDServiceName() {
        return TipTopReciveWorkOrderServiceWSDDServiceName;
    }

    public void setTipTopReciveWorkOrderServiceWSDDServiceName(java.lang.String name) {
        TipTopReciveWorkOrderServiceWSDDServiceName = name;
    }

    public mypackage.TipTopReciveWorkOrderService_PortType getTipTopReciveWorkOrderService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TipTopReciveWorkOrderService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTipTopReciveWorkOrderService(endpoint);
    }

    public mypackage.TipTopReciveWorkOrderService_PortType getTipTopReciveWorkOrderService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.TipTopReciveWorkOrderServiceSoapBindingStub _stub = new mypackage.TipTopReciveWorkOrderServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getTipTopReciveWorkOrderServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTipTopReciveWorkOrderServiceEndpointAddress(java.lang.String address) {
        TipTopReciveWorkOrderService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.TipTopReciveWorkOrderService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.TipTopReciveWorkOrderServiceSoapBindingStub _stub = new mypackage.TipTopReciveWorkOrderServiceSoapBindingStub(new java.net.URL(TipTopReciveWorkOrderService_address), this);
                _stub.setPortName(getTipTopReciveWorkOrderServiceWSDDServiceName());
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
        if ("TipTopReciveWorkOrderService".equals(inputPortName)) {
            return getTipTopReciveWorkOrderService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "TipTopReciveWorkOrderServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "TipTopReciveWorkOrderService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TipTopReciveWorkOrderService".equals(portName)) {
            setTipTopReciveWorkOrderServiceEndpointAddress(address);
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
