/**
 * HrmServicePortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface HrmServicePortType extends java.rmi.Remote {
    public boolean changeUserPassword(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException;
    public java.lang.String getHrmJobTitleInfoXML(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException;
    public java.lang.String checkInvokeClient() throws java.rmi.RemoteException;
    public java.lang.String getDepartmentInfoWithPage(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String getHrmDepartmentInfoXML(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public java.lang.String synSubCompany(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public mypackage.JobTitleBean[] getHrmJobTitleInfo(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException;
    public mypackage.SubCompanyBean[] getHrmSubcompanyInfo(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String getOneUserInfo(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String synDepartment(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public java.lang.String getUseridByWorkcode(java.lang.String in0) throws java.rmi.RemoteException;
    public mypackage.UserBean[] getHrmUserInfo(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5) throws java.rmi.RemoteException;
    public boolean checkUser(java.lang.String in0, java.lang.String in1, java.lang.String in2) throws java.rmi.RemoteException;
    public java.lang.String getJobtitleInfoWithPage(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String synHrmResource(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public java.lang.String getHrmUserImage(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3) throws java.rmi.RemoteException;
    public java.lang.String sycHrmUserImage(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public mypackage.DepartmentBean[] getHrmDepartmentInfo(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public java.lang.String getHrmUserInfoWithPage(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String getHrmSubcompanyInfoWithPage(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String synJobtitle(java.lang.String in0, java.lang.String in1) throws java.rmi.RemoteException;
    public java.lang.String getHrmSubcompanyInfoXML(java.lang.String in0) throws java.rmi.RemoteException;
    public java.lang.String getHrmUserInfoXML(java.lang.String in0, java.lang.String in1, java.lang.String in2, java.lang.String in3, java.lang.String in4, java.lang.String in5) throws java.rmi.RemoteException;
}
