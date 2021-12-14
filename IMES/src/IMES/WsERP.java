/**
 * WsERP.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface WsERP extends javax.xml.rpc.Service {
    public java.lang.String getwsERPSoapAddress();

    public mypackage.WsERPSoap_PortType getwsERPSoap() throws javax.xml.rpc.ServiceException;

    public mypackage.WsERPSoap_PortType getwsERPSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
    public java.lang.String getwsERPSoap12Address();

    public mypackage.WsERPSoap_PortType getwsERPSoap12() throws javax.xml.rpc.ServiceException;

    public mypackage.WsERPSoap_PortType getwsERPSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
