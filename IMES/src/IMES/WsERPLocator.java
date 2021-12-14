/**
 * WsERPLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class WsERPLocator extends org.apache.axis.client.Service implements mypackage.WsERP {

    public WsERPLocator() {
    }


    public WsERPLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WsERPLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for wsERPSoap
    private java.lang.String wsERPSoap_address = "http://192.168.68.167/MES_TEST_MESws_EAI/wsERP.asmx";

    public java.lang.String getwsERPSoapAddress() {
        return wsERPSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String wsERPSoapWSDDServiceName = "wsERPSoap";

    public java.lang.String getwsERPSoapWSDDServiceName() {
        return wsERPSoapWSDDServiceName;
    }

    public void setwsERPSoapWSDDServiceName(java.lang.String name) {
        wsERPSoapWSDDServiceName = name;
    }

    public mypackage.WsERPSoap_PortType getwsERPSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(wsERPSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwsERPSoap(endpoint);
    }

    public mypackage.WsERPSoap_PortType getwsERPSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.WsERPSoap_BindingStub _stub = new mypackage.WsERPSoap_BindingStub(portAddress, this);
            _stub.setPortName(getwsERPSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setwsERPSoapEndpointAddress(java.lang.String address) {
        wsERPSoap_address = address;
    }


    // Use to get a proxy class for wsERPSoap12
    private java.lang.String wsERPSoap12_address = "http://192.168.68.167/MES_TEST_MESws_EAI/wsERP.asmx";

    public java.lang.String getwsERPSoap12Address() {
        return wsERPSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String wsERPSoap12WSDDServiceName = "wsERPSoap12";

    public java.lang.String getwsERPSoap12WSDDServiceName() {
        return wsERPSoap12WSDDServiceName;
    }

    public void setwsERPSoap12WSDDServiceName(java.lang.String name) {
        wsERPSoap12WSDDServiceName = name;
    }

    public mypackage.WsERPSoap_PortType getwsERPSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(wsERPSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getwsERPSoap12(endpoint);
    }

    public mypackage.WsERPSoap_PortType getwsERPSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.WsERPSoap12Stub _stub = new mypackage.WsERPSoap12Stub(portAddress, this);
            _stub.setPortName(getwsERPSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setwsERPSoap12EndpointAddress(java.lang.String address) {
        wsERPSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.WsERPSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.WsERPSoap_BindingStub _stub = new mypackage.WsERPSoap_BindingStub(new java.net.URL(wsERPSoap_address), this);
                _stub.setPortName(getwsERPSoapWSDDServiceName());
                return _stub;
            }
            if (mypackage.WsERPSoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.WsERPSoap12Stub _stub = new mypackage.WsERPSoap12Stub(new java.net.URL(wsERPSoap12_address), this);
                _stub.setPortName(getwsERPSoap12WSDDServiceName());
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
        if ("wsERPSoap".equals(inputPortName)) {
            return getwsERPSoap();
        }
        else if ("wsERPSoap12".equals(inputPortName)) {
            return getwsERPSoap12();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.imestech.com/wsERP", "wsERP");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.imestech.com/wsERP", "wsERPSoap"));
            ports.add(new javax.xml.namespace.QName("http://www.imestech.com/wsERP", "wsERPSoap12"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("wsERPSoap".equals(portName)) {
            setwsERPSoapEndpointAddress(address);
        }
        else 
if ("wsERPSoap12".equals(portName)) {
            setwsERPSoap12EndpointAddress(address);
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
