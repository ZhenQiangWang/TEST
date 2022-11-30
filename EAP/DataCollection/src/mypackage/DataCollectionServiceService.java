/**
 * DataCollectionServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface DataCollectionServiceService extends javax.xml.rpc.Service {
    public java.lang.String getDataCollectionServiceAddress();

    public mypackage.DataCollectionService_PortType getDataCollectionService() throws javax.xml.rpc.ServiceException;

    public mypackage.DataCollectionService_PortType getDataCollectionService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
