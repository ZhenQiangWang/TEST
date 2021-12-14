/**
 * ModeDateServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface ModeDateServicePortType extends java.rmi.Remote {
    public java.lang.String getModeDataByID(int in0, int in1, int in2, java.lang.String in3, java.lang.String in4) throws java.rmi.RemoteException;
    public java.lang.String deleteModeDataById(int in0, int in1, int in2, java.lang.String in3) throws java.rmi.RemoteException;
    public java.lang.String getAllModeDataList(int in0, int in1, int in2, int in3, int in4, java.lang.String in5, java.lang.String in6, java.lang.String in7) throws java.rmi.RemoteException;
    public java.lang.String saveModeData(java.lang.String in0) throws java.rmi.RemoteException;
    public int getAllModeDataCount(int in0, int in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException;
}
