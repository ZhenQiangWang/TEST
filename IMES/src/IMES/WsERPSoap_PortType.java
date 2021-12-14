/**
 * WsERPSoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package IMES;

public interface WsERPSoap_PortType extends java.rmi.Remote {

    /**
     * SD_DSC_SI002 / Material Basis Integration -- Create Material
     */
    public java.lang.String createMaterial(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI002 / Material Basis Integration -- Delete Material
     */
    public java.lang.String delMaterial(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI003 / Product Basis Integration -- Create Product
     */
    public java.lang.String createProduct(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI003 / Product Basis Integration -- Delete Product
     */
    public java.lang.String delProduct(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI004 / Customer Basis Integration -- Create Customer
     */
    public java.lang.String createCustomer(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI004 / Customer Basis Integration -- Delete Customer
     */
    public java.lang.String delCustomer(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI005 / Operation Basis Integration -- Create Operation
     */
    public java.lang.String createOperation(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI005 / Operation Basis Integration -- Delete Operation
     */
    public java.lang.String delOperation(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI006 / Inventory Basis Integration -- Create Inventory
     */
    public java.lang.String createInventory(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI006 / Inventory Basis Integration -- Delete Inventory
     */
    public java.lang.String delInventory(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI007 / Locator Basis Integration -- Create Location
     */
    public java.lang.String createLocation(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI007 / Locator Basis Integration -- Delete Location
     */
    public java.lang.String delLocation(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI008 / Department Basis Integration -- Create Department
     */
    public java.lang.String createDepartment(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI008 / Department Basis Integration -- Delete Department
     */
    public java.lang.String delDepartment(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI009 / 工單整合 -- Add MO
     */
    public java.lang.String addMO(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI009 / 工單整合 -- Edit MO
     */
    public java.lang.String editMO(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI009 / 工單整合 -- Delete MO
     */
    public java.lang.String delMO(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI009 / 工單整合 -- Close MO
     */
    public java.lang.String closeMO(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI009 / 工單整合 -- Undo Close MO
     */
    public java.lang.String undoCloseMO(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI010 / 工單發料作業
     */
    public java.lang.String addMaterial2MO(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI010 / 還原工單發料作業
     */
    public java.lang.String undoAddMaterial2MO(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI011 / Equipment Basis Integration -- Create Equipment
     */
    public java.lang.String createEquipment(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI011 / Equipment Basis Integration -- Delete Equipment
     */
    public java.lang.String delEquipment(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI012 / Vendor Basis Integration -- Create Vendor
     */
    public java.lang.String createVendor(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI012 / Vendor Basis Integration -- Delete Vendor
     */
    public java.lang.String delVendor(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI013 / Material Vendor Basis Integration -- Create
     * Material Vendor
     */
    public java.lang.String createMaterialVendor(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI013 / Material Vendor Basis Integration -- Delete
     * Material Vendor
     */
    public java.lang.String delMaterialVendor(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI014 / Shift Basis Integration -- Create Shift
     */
    public java.lang.String createShift(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI014 / Shift Basis Integration -- Delete Shift
     */
    public java.lang.String delShift(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI015 / OPGroup Basis Integration -- Create OPGroup
     */
    public java.lang.String createOPGroup(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI015 / OPGroup Basis Integration -- Delete OPGroup
     */
    public java.lang.String delOPGroup(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI016 / 工單退料作業
     */
    public java.lang.String returnMaterial2MO(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI016 / 還原工單退料作業
     */
    public java.lang.String undoReturnMaterial2MO(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI017 / Subcontractor Basis Integration -- Create Subcontractor
     */
    public java.lang.String createSubcontractor(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * SD_DSC_SI017 / Subcontractor Basis Integration -- Delete Subcontractor
     */
    public java.lang.String delSubcontractor(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * Web service and database connection test
     */
    public java.lang.String testDBConnection(java.lang.String userNo) throws java.rmi.RemoteException;

    /**
     * Invoke Web Service
     */
    public java.lang.String invokeSrv(java.lang.String requestId, java.lang.String methodName, java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * qc.create /檢驗單新增
     */
    public java.lang.String qc_create(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * qc.process /檢驗單還原
     */
    public java.lang.String qc_process(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * MES & WMS线边仓投料接口
     */
    public java.lang.String createWipInvRaw(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * MES & OA / User Basis Integration -- Create User
     */
    public java.lang.String createUser(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * MES & OA / 异常审核结果回抛接口 -- ReturnERFDispositionResut
     */
    public java.lang.String returnERFDispositionResut(java.lang.String inXml) throws java.rmi.RemoteException;

    /**
     * MES & OA / MES线边仓扣料接口 -- ReturnERFDispositionResut
     */
    public java.lang.String delWipInvRaw(java.lang.String inXml) throws java.rmi.RemoteException;
}
