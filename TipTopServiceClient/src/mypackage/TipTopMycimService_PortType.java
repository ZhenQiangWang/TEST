/**
 * TipTopMycimService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface TipTopMycimService_PortType extends java.rmi.Remote {
    public java.lang.String tipTopSetMaterial(java.lang.String tblMTLMaterialBasis) throws java.rmi.RemoteException;
    public java.lang.String tipTopSetProduct(java.lang.String tblPRDProductBasis) throws java.rmi.RemoteException;
    public java.lang.String tipTopReciveWorkOrder(java.lang.String tblOEMOBasis) throws java.rmi.RemoteException;
    public java.lang.String tipTopReciveMaterial(java.lang.String request) throws java.rmi.RemoteException;
    public java.lang.String TipTopCloseWorkOrder(java.lang.String closeWorkOrder) throws java.rmi.RemoteException;
    public java.lang.String TipTopUpdateWorkOrder(java.lang.String tblOEMOBasis) throws java.rmi.RemoteException;
    public java.lang.String TipTopDeleteWorkOrder(java.lang.String DelMO) throws java.rmi.RemoteException;
}
