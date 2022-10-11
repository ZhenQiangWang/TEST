/**
 * ChangeEqpStatusServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class ChangeEqpStatusServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.ChangeEqpStatusServiceService {

    public ChangeEqpStatusServiceServiceLocator() {
    }


    public ChangeEqpStatusServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ChangeEqpStatusServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ChangeEqpStatusService
    private java.lang.String ChangeEqpStatusService_address = "http://localhost:7001/mycim2/services/ChangeEqpStatusService";
//    private java.lang.String ChangeEqpStatusService_address = "http://192.168.90.160:7001/mycim2/services/ChangeEqpStatusService";
//    private java.lang.String ChangeEqpStatusService_address = "http://192.168.68.95/mycim2/services/ChangeEqpStatusService";

    public java.lang.String getChangeEqpStatusServiceAddress() {
        return ChangeEqpStatusService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ChangeEqpStatusServiceWSDDServiceName = "ChangeEqpStatusService";

    public java.lang.String getChangeEqpStatusServiceWSDDServiceName() {
        return ChangeEqpStatusServiceWSDDServiceName;
    }

    public void setChangeEqpStatusServiceWSDDServiceName(java.lang.String name) {
        ChangeEqpStatusServiceWSDDServiceName = name;
    }

    public mypackage.ChangeEqpStatusService_PortType getChangeEqpStatusService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ChangeEqpStatusService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getChangeEqpStatusService(endpoint);
    }

    public mypackage.ChangeEqpStatusService_PortType getChangeEqpStatusService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.ChangeEqpStatusServiceSoapBindingStub _stub = new mypackage.ChangeEqpStatusServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getChangeEqpStatusServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setChangeEqpStatusServiceEndpointAddress(java.lang.String address) {
        ChangeEqpStatusService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.ChangeEqpStatusService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.ChangeEqpStatusServiceSoapBindingStub _stub = new mypackage.ChangeEqpStatusServiceSoapBindingStub(new java.net.URL(ChangeEqpStatusService_address), this);
                _stub.setPortName(getChangeEqpStatusServiceWSDDServiceName());
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
        if ("ChangeEqpStatusService".equals(inputPortName)) {
            return getChangeEqpStatusService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "ChangeEqpStatusServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "ChangeEqpStatusService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ChangeEqpStatusService".equals(portName)) {
            setChangeEqpStatusServiceEndpointAddress(address);
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
