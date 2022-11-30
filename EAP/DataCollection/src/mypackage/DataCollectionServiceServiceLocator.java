/**
 * DataCollectionServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class DataCollectionServiceServiceLocator extends org.apache.axis.client.Service implements mypackage.DataCollectionServiceService {

    public DataCollectionServiceServiceLocator() {
    }


    public DataCollectionServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public DataCollectionServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for DataCollectionService
    private java.lang.String DataCollectionService_address = "http://localhost:7001/mycim2/services/DataCollectionService";

    public java.lang.String getDataCollectionServiceAddress() {
        return DataCollectionService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String DataCollectionServiceWSDDServiceName = "DataCollectionService";

    public java.lang.String getDataCollectionServiceWSDDServiceName() {
        return DataCollectionServiceWSDDServiceName;
    }

    public void setDataCollectionServiceWSDDServiceName(java.lang.String name) {
        DataCollectionServiceWSDDServiceName = name;
    }

    public mypackage.DataCollectionService_PortType getDataCollectionService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(DataCollectionService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getDataCollectionService(endpoint);
    }

    public mypackage.DataCollectionService_PortType getDataCollectionService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mypackage.DataCollectionServiceSoapBindingStub _stub = new mypackage.DataCollectionServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getDataCollectionServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setDataCollectionServiceEndpointAddress(java.lang.String address) {
        DataCollectionService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mypackage.DataCollectionService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                mypackage.DataCollectionServiceSoapBindingStub _stub = new mypackage.DataCollectionServiceSoapBindingStub(new java.net.URL(DataCollectionService_address), this);
                _stub.setPortName(getDataCollectionServiceWSDDServiceName());
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
        if ("DataCollectionService".equals(inputPortName)) {
            return getDataCollectionService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "DataCollectionServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://xml.fa-software.com/mycim/wsdd/", "DataCollectionService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("DataCollectionService".equals(portName)) {
            setDataCollectionServiceEndpointAddress(address);
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
