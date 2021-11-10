/**
 * DemoService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface DemoService_PortType extends java.rmi.Remote {
    public mypackage.Result createTxt4Ftp(mypackage.ErpDocInfo arg0) throws java.rmi.RemoteException;
    public mypackage.Result genBpia(java.lang.String arg0) throws java.rmi.RemoteException;
    public mypackage.Result getFrUrl(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2, java.lang.Integer arg3) throws java.rmi.RemoteException;
    public mypackage.Result changeFaStatus(mypackage.Infos[] arg0) throws java.rmi.RemoteException;
    public mypackage.Result savePrintList(mypackage.PrintListEntity arg0) throws java.rmi.RemoteException;
    public java.lang.String sayHello(java.lang.String arg0) throws java.rmi.RemoteException;
    public mypackage.Result syncBaseItemStock(mypackage.SyncInfo arg0, mypackage.BaseItemStockEntity[] arg1) throws java.rmi.RemoteException;
    public mypackage.Result webGen(java.lang.String arg0) throws java.rmi.RemoteException;
    public mypackage.Result getTxtLog(mypackage.ErpDocInfo arg0) throws java.rmi.RemoteException;
}
