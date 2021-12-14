/**
 * TIPTOPServiceGateWayLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class TIPTOPServiceGateWayLocator extends org.apache.axis.client.Service implements mypackage.TIPTOPServiceGateWay {

    public TIPTOPServiceGateWayLocator() {
    }


    public TIPTOPServiceGateWayLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public TIPTOPServiceGateWayLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for TIPTOPServiceGateWayPortType
    private java.lang.String TIPTOPServiceGateWayPortType_address = "http://192.168.68.157/web/ws/r/aws_ttsrv2";

    public java.lang.String getTIPTOPServiceGateWayPortTypeAddress() {
        return TIPTOPServiceGateWayPortType_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String TIPTOPServiceGateWayPortTypeWSDDServiceName = "TIPTOPServiceGateWayPortType";

    public java.lang.String getTIPTOPServiceGateWayPortTypeWSDDServiceName() {
        return TIPTOPServiceGateWayPortTypeWSDDServiceName;
    }

    public void setTIPTOPServiceGateWayPortTypeWSDDServiceName(java.lang.String name) {
        TIPTOPServiceGateWayPortTypeWSDDServiceName = name;
    }

    public mypackage.TIPTOPServiceGateWayPortType_PortType getTIPTOPServiceGateWayPortType() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(TIPTOPServiceGateWayPortType_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getTIPTOPServiceGateWayPortType(endpoint);
    }

    public mypackage.TIPTOPServiceGateWayPortType_PortType getTIPTOPServiceGateWayPortType(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.TIPTOPServiceGateWayBindingStub _stub = new mypackage.TIPTOPServiceGateWayBindingStub(portAddress, this);
            _stub.setPortName(getTIPTOPServiceGateWayPortTypeWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setTIPTOPServiceGateWayPortTypeEndpointAddress(java.lang.String address) {
        TIPTOPServiceGateWayPortType_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.TIPTOPServiceGateWayPortType_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.TIPTOPServiceGateWayBindingStub _stub = new mypackage.TIPTOPServiceGateWayBindingStub(new java.net.URL(TIPTOPServiceGateWayPortType_address), this);
                _stub.setPortName(getTIPTOPServiceGateWayPortTypeWSDDServiceName());
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
        if ("TIPTOPServiceGateWayPortType".equals(inputPortName)) {
            return getTIPTOPServiceGateWayPortType();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "TIPTOPServiceGateWay");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "TIPTOPServiceGateWayPortType"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("TIPTOPServiceGateWayPortType".equals(portName)) {
            setTIPTOPServiceGateWayPortTypeEndpointAddress(address);
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
