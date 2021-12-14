/**
 * TIPTOPServiceGateWayBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class TIPTOPServiceGateWayBindingStub extends org.apache.axis.client.Stub implements mypackage.TIPTOPServiceGateWayPortType_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[206];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
        _initOperationDesc15();
        _initOperationDesc16();
        _initOperationDesc17();
        _initOperationDesc18();
        _initOperationDesc19();
        _initOperationDesc20();
        _initOperationDesc21();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItemUnitConversionData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemUnitConversionDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemUnitConversionDataRequest_GetItemUnitConversionDataRequest"), mypackage.GetItemUnitConversionDataRequest_GetItemUnitConversionDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemUnitConversionDataResponse_GetItemUnitConversionDataResponse"));
        oper.setReturnClass(mypackage.GetItemUnitConversionDataResponse_GetItemUnitConversionDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemUnitConversionDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGoodsStock");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetGoodsStockRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetGoodsStockRequest_GetGoodsStockRequest"), mypackage.GetGoodsStockRequest_GetGoodsStockRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetGoodsStockResponse_GetGoodsStockResponse"));
        oper.setReturnClass(mypackage.GetGoodsStockResponse_GetGoodsStockResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetGoodsStockResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSaleClassData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSaleClassDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSaleClassDataRequest_GetSaleClassDataRequest"), mypackage.GetSaleClassDataRequest_GetSaleClassDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSaleClassDataResponse_GetSaleClassDataResponse"));
        oper.setReturnClass(mypackage.GetSaleClassDataResponse_GetSaleClassDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSaleClassDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFQCMasterData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetFQCMasterDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetFQCMasterDataRequest_GetFQCMasterDataRequest"), mypackage.GetFQCMasterDataRequest_GetFQCMasterDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetFQCMasterDataResponse_GetFQCMasterDataResponse"));
        oper.setReturnClass(mypackage.GetFQCMasterDataResponse_GetFQCMasterDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetFQCMasterDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreatePurchaseDeliveryData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseDeliveryDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseDeliveryDataRequest_CreatePurchaseDeliveryDataRequest"), mypackage.CreatePurchaseDeliveryDataRequest_CreatePurchaseDeliveryDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseDeliveryDataResponse_CreatePurchaseDeliveryDataResponse"));
        oper.setReturnClass(mypackage.CreatePurchaseDeliveryDataResponse_CreatePurchaseDeliveryDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseDeliveryDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateReceivingInvoice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateReceivingInvoiceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateReceivingInvoiceRequest_CreateReceivingInvoiceRequest"), mypackage.CreateReceivingInvoiceRequest_CreateReceivingInvoiceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateReceivingInvoiceResponse_CreateReceivingInvoiceResponse"));
        oper.setReturnClass(mypackage.CreateReceivingInvoiceResponse_CreateReceivingInvoiceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateReceivingInvoiceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateShippingOrder");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateShippingOrderRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateShippingOrderRequest_CreateShippingOrderRequest"), mypackage.CreateShippingOrderRequest_CreateShippingOrderRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateShippingOrderResponse_CreateShippingOrderResponse"));
        oper.setReturnClass(mypackage.CreateShippingOrderResponse_CreateShippingOrderResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateShippingOrderResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReasonCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReasonCodeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReasonCodeRequest_GetReasonCodeRequest"), mypackage.GetReasonCodeRequest_GetReasonCodeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReasonCodeResponse_GetReasonCodeResponse"));
        oper.setReturnClass(mypackage.GetReasonCodeResponse_GetReasonCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReasonCodeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDocumentList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDocumentListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDocumentListRequest_GetDocumentListRequest"), mypackage.GetDocumentListRequest_GetDocumentListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDocumentListResponse_GetDocumentListResponse"));
        oper.setReturnClass(mypackage.GetDocumentListResponse_GetDocumentListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDocumentListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpenDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "OpenDocumentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "OpenDocumentRequest_OpenDocumentRequest"), mypackage.OpenDocumentRequest_OpenDocumentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "OpenDocumentResponse_OpenDocumentResponse"));
        oper.setReturnClass(mypackage.OpenDocumentResponse_OpenDocumentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "OpenDocumentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdatePOReceivingData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdatePOReceivingDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdatePOReceivingDataRequest_UpdatePOReceivingDataRequest"), mypackage.UpdatePOReceivingDataRequest_UpdatePOReceivingDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdatePOReceivingDataResponse_UpdatePOReceivingDataResponse"));
        oper.setReturnClass(mypackage.UpdatePOReceivingDataResponse_UpdatePOReceivingDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdatePOReceivingDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CleanDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CleanDocumentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CleanDocumentRequest_CleanDocumentRequest"), mypackage.CleanDocumentRequest_CleanDocumentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CleanDocumentResponse_CleanDocumentResponse"));
        oper.setReturnClass(mypackage.CleanDocumentResponse_CleanDocumentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CleanDocumentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateSalesOrderModifyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSalesOrderModifyDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSalesOrderModifyDataRequest_CreateSalesOrderModifyDataRequest"), mypackage.CreateSalesOrderModifyDataRequest_CreateSalesOrderModifyDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSalesOrderModifyDataResponse_CreateSalesOrderModifyDataResponse"));
        oper.setReturnClass(mypackage.CreateSalesOrderModifyDataResponse_CreateSalesOrderModifyDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSalesOrderModifyDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SelCardInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SelCardInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SelCardInfoRequest_SelCardInfoRequest"), mypackage.SelCardInfoRequest_SelCardInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SelCardInfoResponse_SelCardInfoResponse"));
        oper.setReturnClass(mypackage.SelCardInfoResponse_SelCardInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SelCardInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckDataNumExists");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckDataNumExistsRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckDataNumExistsRequest_CheckDataNumExistsRequest"), mypackage.CheckDataNumExistsRequest_CheckDataNumExistsRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckDataNumExistsResponse_CheckDataNumExistsResponse"));
        oper.setReturnClass(mypackage.CheckDataNumExistsResponse_CheckDataNumExistsResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckDataNumExistsResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAxmPrice");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAxmPriceRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAxmPriceRequest_GetAxmPriceRequest"), mypackage.GetAxmPriceRequest_GetAxmPriceRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAxmPriceResponse_GetAxmPriceResponse"));
        oper.setReturnClass(mypackage.GetAxmPriceResponse_GetAxmPriceResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAxmPriceResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPOSKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOSKeyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOSKeyRequest_GetPOSKeyRequest"), mypackage.GetPOSKeyRequest_GetPOSKeyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOSKeyResponse_GetPOSKeyResponse"));
        oper.setReturnClass(mypackage.GetPOSKeyResponse_GetPOSKeyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOSKeyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UndoCreateStockInData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UndoCreateStockInDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UndoCreateStockInDataRequest_UndoCreateStockInDataRequest"), mypackage.UndoCreateStockInDataRequest_UndoCreateStockInDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UndoCreateStockInDataResponse_UndoCreateStockInDataResponse"));
        oper.setReturnClass(mypackage.UndoCreateStockInDataResponse_UndoCreateStockInDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UndoCreateStockInDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UndoCreateWOWorkReportData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UndoCreateWOWorkReportDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UndoCreateWOWorkReportDataRequest_UndoCreateWOWorkReportDataRequest"), mypackage.UndoCreateWOWorkReportDataRequest_UndoCreateWOWorkReportDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UndoCreateWOWorkReportDataResponse_UndoCreateWOWorkReportDataResponse"));
        oper.setReturnClass(mypackage.UndoCreateWOWorkReportDataResponse_UndoCreateWOWorkReportDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UndoCreateWOWorkReportDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCostGroupData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCostGroupDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCostGroupDataRequest_GetCostGroupDataRequest"), mypackage.GetCostGroupDataRequest_GetCostGroupDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCostGroupDataResponse_GetCostGroupDataResponse"));
        oper.setReturnClass(mypackage.GetCostGroupDataResponse_GetCostGroupDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCostGroupDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateSalesOrderData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSalesOrderDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSalesOrderDataRequest_CreateSalesOrderDataRequest"), mypackage.CreateSalesOrderDataRequest_CreateSalesOrderDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSalesOrderDataResponse_CreateSalesOrderDataResponse"));
        oper.setReturnClass(mypackage.CreateSalesOrderDataResponse_CreateSalesOrderDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSalesOrderDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWOIssueData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWOIssueDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWOIssueDataRequest_GetWOIssueDataRequest"), mypackage.GetWOIssueDataRequest_GetWOIssueDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWOIssueDataResponse_GetWOIssueDataResponse"));
        oper.setReturnClass(mypackage.GetWOIssueDataResponse_GetWOIssueDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWOIssueDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateWOIssueData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateWOIssueDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateWOIssueDataRequest_UpdateWOIssueDataRequest"), mypackage.UpdateWOIssueDataRequest_UpdateWOIssueDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateWOIssueDataResponse_UpdateWOIssueDataResponse"));
        oper.setReturnClass(mypackage.UpdateWOIssueDataResponse_UpdateWOIssueDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateWOIssueDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCountryData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountryDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountryDataRequest_GetCountryDataRequest"), mypackage.GetCountryDataRequest_GetCountryDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountryDataResponse_GetCountryDataResponse"));
        oper.setReturnClass(mypackage.GetCountryDataResponse_GetCountryDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountryDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCountryList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountryListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountryListRequest_GetCountryListRequest"), mypackage.GetCountryListRequest_GetCountryListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountryListResponse_GetCountryListResponse"));
        oper.setReturnClass(mypackage.GetCountryListResponse_GetCountryListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountryListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCurrencyData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCurrencyDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCurrencyDataRequest_GetCurrencyDataRequest"), mypackage.GetCurrencyDataRequest_GetCurrencyDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCurrencyDataResponse_GetCurrencyDataResponse"));
        oper.setReturnClass(mypackage.GetCurrencyDataResponse_GetCurrencyDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCurrencyDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCurrencyList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCurrencyListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCurrencyListRequest_GetCurrencyListRequest"), mypackage.GetCurrencyListRequest_GetCurrencyListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCurrencyListResponse_GetCurrencyListResponse"));
        oper.setReturnClass(mypackage.GetCurrencyListResponse_GetCurrencyListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCurrencyListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCustList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustListRequest_GetCustListRequest"), mypackage.GetCustListRequest_GetCustListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustListResponse_GetCustListResponse"));
        oper.setReturnClass(mypackage.GetCustListResponse_GetCustListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCustomerData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerDataRequest_GetCustomerDataRequest"), mypackage.GetCustomerDataRequest_GetCustomerDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerDataResponse_GetCustomerDataResponse"));
        oper.setReturnClass(mypackage.GetCustomerDataResponse_GetCustomerDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCustomerProductData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerProductDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerProductDataRequest_GetCustomerProductDataRequest"), mypackage.GetCustomerProductDataRequest_GetCustomerProductDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerProductDataResponse_GetCustomerProductDataResponse"));
        oper.setReturnClass(mypackage.GetCustomerProductDataResponse_GetCustomerProductDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerProductDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDepartmentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDepartmentDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDepartmentDataRequest_GetDepartmentDataRequest"), mypackage.GetDepartmentDataRequest_GetDepartmentDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDepartmentDataResponse_GetDepartmentDataResponse"));
        oper.setReturnClass(mypackage.GetDepartmentDataResponse_GetDepartmentDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDepartmentDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDepartmentList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDepartmentListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDepartmentListRequest_GetDepartmentListRequest"), mypackage.GetDepartmentListRequest_GetDepartmentListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDepartmentListResponse_GetDepartmentListResponse"));
        oper.setReturnClass(mypackage.GetDepartmentListResponse_GetDepartmentListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDepartmentListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPOReceivingOutData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOReceivingOutDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOReceivingOutDataRequest_GetPOReceivingOutDataRequest"), mypackage.GetPOReceivingOutDataRequest_GetPOReceivingOutDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOReceivingOutDataResponse_GetPOReceivingOutDataResponse"));
        oper.setReturnClass(mypackage.GetPOReceivingOutDataResponse_GetPOReceivingOutDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOReceivingOutDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEmployeeData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEmployeeDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEmployeeDataRequest_GetEmployeeDataRequest"), mypackage.GetEmployeeDataRequest_GetEmployeeDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEmployeeDataResponse_GetEmployeeDataResponse"));
        oper.setReturnClass(mypackage.GetEmployeeDataResponse_GetEmployeeDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEmployeeDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEmployeeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEmployeeListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEmployeeListRequest_GetEmployeeListRequest"), mypackage.GetEmployeeListRequest_GetEmployeeListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEmployeeListResponse_GetEmployeeListResponse"));
        oper.setReturnClass(mypackage.GetEmployeeListResponse_GetEmployeeListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEmployeeListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetInspectionData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetInspectionDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetInspectionDataRequest_GetInspectionDataRequest"), mypackage.GetInspectionDataRequest_GetInspectionDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetInspectionDataResponse_GetInspectionDataResponse"));
        oper.setReturnClass(mypackage.GetInspectionDataResponse_GetInspectionDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetInspectionDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreatePurchaseStockOut");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseStockOutRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseStockOutRequest_CreatePurchaseStockOutRequest"), mypackage.CreatePurchaseStockOutRequest_CreatePurchaseStockOutRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseStockOutResponse_CreatePurchaseStockOutResponse"));
        oper.setReturnClass(mypackage.CreatePurchaseStockOutResponse_CreatePurchaseStockOutResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseStockOutResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItemList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemListRequest_GetItemListRequest"), mypackage.GetItemListRequest_GetItemListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemListResponse_GetItemListResponse"));
        oper.setReturnClass(mypackage.GetItemListResponse_GetItemListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLocationData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetLocationDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetLocationDataRequest_GetLocationDataRequest"), mypackage.GetLocationDataRequest_GetLocationDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetLocationDataResponse_GetLocationDataResponse"));
        oper.setReturnClass(mypackage.GetLocationDataResponse_GetLocationDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetLocationDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMonthList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMonthListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMonthListRequest_GetMonthListRequest"), mypackage.GetMonthListRequest_GetMonthListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMonthListResponse_GetMonthListResponse"));
        oper.setReturnClass(mypackage.GetMonthListResponse_GetMonthListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMonthListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOperationData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOperationDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOperationDataRequest_GetOperationDataRequest"), mypackage.GetOperationDataRequest_GetOperationDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOperationDataResponse_GetOperationDataResponse"));
        oper.setReturnClass(mypackage.GetOperationDataResponse_GetOperationDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOperationDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOverdueAmtDetailData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOverdueAmtDetailDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOverdueAmtDetailDataRequest_GetOverdueAmtDetailDataRequest"), mypackage.GetOverdueAmtDetailDataRequest_GetOverdueAmtDetailDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOverdueAmtDetailDataResponse_GetOverdueAmtDetailDataResponse"));
        oper.setReturnClass(mypackage.GetOverdueAmtDetailDataResponse_GetOverdueAmtDetailDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOverdueAmtDetailDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOverdueAmtRankingData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOverdueAmtRankingDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOverdueAmtRankingDataRequest_GetOverdueAmtRankingDataRequest"), mypackage.GetOverdueAmtRankingDataRequest_GetOverdueAmtRankingDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOverdueAmtRankingDataResponse_GetOverdueAmtRankingDataResponse"));
        oper.setReturnClass(mypackage.GetOverdueAmtRankingDataResponse_GetOverdueAmtRankingDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOverdueAmtRankingDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProdClassList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdClassListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdClassListRequest_GetProdClassListRequest"), mypackage.GetProdClassListRequest_GetProdClassListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdClassListResponse_GetProdClassListResponse"));
        oper.setReturnClass(mypackage.GetProdClassListResponse_GetProdClassListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdClassListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProductClassData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProductClassDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProductClassDataRequest_GetProductClassDataRequest"), mypackage.GetProductClassDataRequest_GetProductClassDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProductClassDataResponse_GetProductClassDataResponse"));
        oper.setReturnClass(mypackage.GetProductClassDataResponse_GetProductClassDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProductClassDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSOInfoData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSOInfoDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSOInfoDataRequest_GetSOInfoDataRequest"), mypackage.GetSOInfoDataRequest_GetSOInfoDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSOInfoDataResponse_GetSOInfoDataResponse"));
        oper.setReturnClass(mypackage.GetSOInfoDataResponse_GetSOInfoDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSOInfoDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSOInfoDetailData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSOInfoDetailDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSOInfoDetailDataRequest_GetSOInfoDetailDataRequest"), mypackage.GetSOInfoDetailDataRequest_GetSOInfoDetailDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSOInfoDetailDataResponse_GetSOInfoDetailDataResponse"));
        oper.setReturnClass(mypackage.GetSOInfoDetailDataResponse_GetSOInfoDetailDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSOInfoDetailDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSalesDetailData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesDetailDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesDetailDataRequest_GetSalesDetailDataRequest"), mypackage.GetSalesDetailDataRequest_GetSalesDetailDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesDetailDataResponse_GetSalesDetailDataResponse"));
        oper.setReturnClass(mypackage.GetSalesDetailDataResponse_GetSalesDetailDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesDetailDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSalesStatisticsData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesStatisticsDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesStatisticsDataRequest_GetSalesStatisticsDataRequest"), mypackage.GetSalesStatisticsDataRequest_GetSalesStatisticsDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesStatisticsDataResponse_GetSalesStatisticsDataResponse"));
        oper.setReturnClass(mypackage.GetSalesStatisticsDataResponse_GetSalesStatisticsDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesStatisticsDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSupplierData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSupplierDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSupplierDataRequest_GetSupplierDataRequest"), mypackage.GetSupplierDataRequest_GetSupplierDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSupplierDataResponse_GetSupplierDataResponse"));
        oper.setReturnClass(mypackage.GetSupplierDataResponse_GetSupplierDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSupplierDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSupplierItemData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSupplierItemDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSupplierItemDataRequest_GetSupplierItemDataRequest"), mypackage.GetSupplierItemDataRequest_GetSupplierItemDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSupplierItemDataResponse_GetSupplierItemDataResponse"));
        oper.setReturnClass(mypackage.GetSupplierItemDataResponse_GetSupplierItemDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSupplierItemDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWarehouseData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWarehouseDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWarehouseDataRequest_GetWarehouseDataRequest"), mypackage.GetWarehouseDataRequest_GetWarehouseDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWarehouseDataResponse_GetWarehouseDataResponse"));
        oper.setReturnClass(mypackage.GetWarehouseDataResponse_GetWarehouseDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWarehouseDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItemData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemDataRequest_GetItemDataRequest"), mypackage.GetItemDataRequest_GetItemDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemDataResponse_GetItemDataResponse"));
        oper.setReturnClass(mypackage.GetItemDataResponse_GetItemDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBOMData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBOMDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBOMDataRequest_GetBOMDataRequest"), mypackage.GetBOMDataRequest_GetBOMDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBOMDataResponse_GetBOMDataResponse"));
        oper.setReturnClass(mypackage.GetBOMDataResponse_GetBOMDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBOMDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDocumentNumber");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDocumentNumberRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDocumentNumberRequest_GetDocumentNumberRequest"), mypackage.GetDocumentNumberRequest_GetDocumentNumberRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDocumentNumberResponse_GetDocumentNumberResponse"));
        oper.setReturnClass(mypackage.GetDocumentNumberResponse_GetDocumentNumberResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDocumentNumberResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateQuotationData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateQuotationDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateQuotationDataRequest_CreateQuotationDataRequest"), mypackage.CreateQuotationDataRequest_CreateQuotationDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateQuotationDataResponse_CreateQuotationDataResponse"));
        oper.setReturnClass(mypackage.CreateQuotationDataResponse_CreateQuotationDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateQuotationDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStockData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetStockDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetStockDataRequest_GetStockDataRequest"), mypackage.GetStockDataRequest_GetStockDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetStockDataResponse_GetStockDataResponse"));
        oper.setReturnClass(mypackage.GetStockDataResponse_GetStockDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetStockDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReceivingQty");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReceivingQtyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReceivingQtyRequest_GetReceivingQtyRequest"), mypackage.GetReceivingQtyRequest_GetReceivingQtyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReceivingQtyResponse_GetReceivingQtyResponse"));
        oper.setReturnClass(mypackage.GetReceivingQtyResponse_GetReceivingQtyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReceivingQtyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPOData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPODataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPODataRequest_GetPODataRequest"), mypackage.GetPODataRequest_GetPODataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPODataResponse_GetPODataResponse"));
        oper.setReturnClass(mypackage.GetPODataResponse_GetPODataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPODataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMFGDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMFGDocumentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMFGDocumentRequest_GetMFGDocumentRequest"), mypackage.GetMFGDocumentRequest_GetMFGDocumentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMFGDocumentResponse_GetMFGDocumentResponse"));
        oper.setReturnClass(mypackage.GetMFGDocumentResponse_GetMFGDocumentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMFGDocumentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreatePOReceivingData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePOReceivingDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePOReceivingDataRequest_CreatePOReceivingDataRequest"), mypackage.CreatePOReceivingDataRequest_CreatePOReceivingDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePOReceivingDataResponse_CreatePOReceivingDataResponse"));
        oper.setReturnClass(mypackage.CreatePOReceivingDataResponse_CreatePOReceivingDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePOReceivingDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateIssueReturnData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateIssueReturnDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateIssueReturnDataRequest_CreateIssueReturnDataRequest"), mypackage.CreateIssueReturnDataRequest_CreateIssueReturnDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateIssueReturnDataResponse_CreateIssueReturnDataResponse"));
        oper.setReturnClass(mypackage.CreateIssueReturnDataResponse_CreateIssueReturnDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateIssueReturnDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPOReceivingInData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOReceivingInDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOReceivingInDataRequest_GetPOReceivingInDataRequest"), mypackage.GetPOReceivingInDataRequest_GetPOReceivingInDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOReceivingInDataResponse_GetPOReceivingInDataResponse"));
        oper.setReturnClass(mypackage.GetPOReceivingInDataResponse_GetPOReceivingInDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOReceivingInDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateStockInData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateStockInDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateStockInDataRequest_CreateStockInDataRequest"), mypackage.CreateStockInDataRequest_CreateStockInDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateStockInDataResponse_CreateStockInDataResponse"));
        oper.setReturnClass(mypackage.CreateStockInDataResponse_CreateStockInDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateStockInDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccountSubjectData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountSubjectDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountSubjectDataRequest_GetAccountSubjectDataRequest"), mypackage.GetAccountSubjectDataRequest_GetAccountSubjectDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountSubjectDataResponse_GetAccountSubjectDataResponse"));
        oper.setReturnClass(mypackage.GetAccountSubjectDataResponse_GetAccountSubjectDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountSubjectDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreatePurchaseStockIn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseStockInRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseStockInRequest_CreatePurchaseStockInRequest"), mypackage.CreatePurchaseStockInRequest_CreatePurchaseStockInRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseStockInResponse_CreatePurchaseStockInResponse"));
        oper.setReturnClass(mypackage.CreatePurchaseStockInResponse_CreatePurchaseStockInResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseStockInResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPurchaseStockOutQty");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPurchaseStockOutQtyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPurchaseStockOutQtyRequest_GetPurchaseStockOutQtyRequest"), mypackage.GetPurchaseStockOutQtyRequest_GetPurchaseStockOutQtyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPurchaseStockOutQtyResponse_GetPurchaseStockOutQtyResponse"));
        oper.setReturnClass(mypackage.GetPurchaseStockOutQtyResponse_GetPurchaseStockOutQtyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPurchaseStockOutQtyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateTransferNote");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTransferNoteRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTransferNoteRequest_CreateTransferNoteRequest"), mypackage.CreateTransferNoteRequest_CreateTransferNoteRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTransferNoteResponse_CreateTransferNoteResponse"));
        oper.setReturnClass(mypackage.CreateTransferNoteResponse_CreateTransferNoteResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTransferNoteResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetQtyConversion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetQtyConversionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetQtyConversionRequest_GetQtyConversionRequest"), mypackage.GetQtyConversionRequest_GetQtyConversionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetQtyConversionResponse_GetQtyConversionResponse"));
        oper.setReturnClass(mypackage.GetQtyConversionResponse_GetQtyConversionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetQtyConversionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetShippingNoticeData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShippingNoticeDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShippingNoticeDataRequest_GetShippingNoticeDataRequest"), mypackage.GetShippingNoticeDataRequest_GetShippingNoticeDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShippingNoticeDataResponse_GetShippingNoticeDataResponse"));
        oper.setReturnClass(mypackage.GetShippingNoticeDataResponse_GetShippingNoticeDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShippingNoticeDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSalesDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesDocumentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesDocumentRequest_GetSalesDocumentRequest"), mypackage.GetSalesDocumentRequest_GetSalesDocumentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesDocumentResponse_GetSalesDocumentResponse"));
        oper.setReturnClass(mypackage.GetSalesDocumentResponse_GetSalesDocumentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesDocumentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetShippingOrderData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShippingOrderDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShippingOrderDataRequest_GetShippingOrderDataRequest"), mypackage.GetShippingOrderDataRequest_GetShippingOrderDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShippingOrderDataResponse_GetShippingOrderDataResponse"));
        oper.setReturnClass(mypackage.GetShippingOrderDataResponse_GetShippingOrderDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShippingOrderDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFQCData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetFQCDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetFQCDataRequest_GetFQCDataRequest"), mypackage.GetFQCDataRequest_GetFQCDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetFQCDataResponse_GetFQCDataResponse"));
        oper.setReturnClass(mypackage.GetFQCDataResponse_GetFQCDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetFQCDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWOData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWODataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWODataRequest_GetWODataRequest"), mypackage.GetWODataRequest_GetWODataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWODataResponse_GetWODataResponse"));
        oper.setReturnClass(mypackage.GetWODataResponse_GetWODataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWODataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWOStockQty");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWOStockQtyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWOStockQtyRequest_GetWOStockQtyRequest"), mypackage.GetWOStockQtyRequest_GetWOStockQtyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWOStockQtyResponse_GetWOStockQtyResponse"));
        oper.setReturnClass(mypackage.GetWOStockQtyResponse_GetWOStockQtyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWOStockQtyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateWOStockinData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateWOStockinDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateWOStockinDataRequest_CreateWOStockinDataRequest"), mypackage.CreateWOStockinDataRequest_CreateWOStockinDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateWOStockinDataResponse_CreateWOStockinDataResponse"));
        oper.setReturnClass(mypackage.CreateWOStockinDataResponse_CreateWOStockinDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateWOStockinDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetJointProductData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetJointProductDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetJointProductDataRequest_GetJointProductDataRequest"), mypackage.GetJointProductDataRequest_GetJointProductDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetJointProductDataResponse_GetJointProductDataResponse"));
        oper.setReturnClass(mypackage.GetJointProductDataResponse_GetJointProductDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetJointProductDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMoMasterData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMoMasterDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMoMasterDataRequest_GetMoMasterDataRequest"), mypackage.GetMoMasterDataRequest_GetMoMasterDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMoMasterDataResponse_GetMoMasterDataResponse"));
        oper.setReturnClass(mypackage.GetMoMasterDataResponse_GetMoMasterDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMoMasterDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLabelTypeData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetLabelTypeDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetLabelTypeDataRequest_GetLabelTypeDataRequest"), mypackage.GetLabelTypeDataRequest_GetLabelTypeDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetLabelTypeDataResponse_GetLabelTypeDataResponse"));
        oper.setReturnClass(mypackage.GetLabelTypeDataResponse_GetLabelTypeDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetLabelTypeDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCountingLabelData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountingLabelDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountingLabelDataRequest_GetCountingLabelDataRequest"), mypackage.GetCountingLabelDataRequest_GetCountingLabelDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountingLabelDataResponse_GetCountingLabelDataResponse"));
        oper.setReturnClass(mypackage.GetCountingLabelDataResponse_GetCountingLabelDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountingLabelDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateCountingLabelData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateCountingLabelDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateCountingLabelDataRequest_UpdateCountingLabelDataRequest"), mypackage.UpdateCountingLabelDataRequest_UpdateCountingLabelDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateCountingLabelDataResponse_UpdateCountingLabelDataResponse"));
        oper.setReturnClass(mypackage.UpdateCountingLabelDataResponse_UpdateCountingLabelDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateCountingLabelDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateMISCIssueData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateMISCIssueDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateMISCIssueDataRequest_CreateMISCIssueDataRequest"), mypackage.CreateMISCIssueDataRequest_CreateMISCIssueDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateMISCIssueDataResponse_CreateMISCIssueDataResponse"));
        oper.setReturnClass(mypackage.CreateMISCIssueDataResponse_CreateMISCIssueDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateMISCIssueDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckExecAuthorization");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckExecAuthorizationRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckExecAuthorizationRequest_CheckExecAuthorizationRequest"), mypackage.CheckExecAuthorizationRequest_CheckExecAuthorizationRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckExecAuthorizationResponse_CheckExecAuthorizationResponse"));
        oper.setReturnClass(mypackage.CheckExecAuthorizationResponse_CheckExecAuthorizationResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckExecAuthorizationResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateStockData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateStockDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateStockDataRequest_CreateStockDataRequest"), mypackage.CreateStockDataRequest_CreateStockDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateStockDataResponse_CreateStockDataResponse"));
        oper.setReturnClass(mypackage.CreateStockDataResponse_CreateStockDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateStockDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EboGetCustData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetCustDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetCustDataRequest_EboGetCustDataRequest"), mypackage.EboGetCustDataRequest_EboGetCustDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetCustDataResponse_EboGetCustDataResponse"));
        oper.setReturnClass(mypackage.EboGetCustDataResponse_EboGetCustDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetCustDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EboGetProdData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetProdDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetProdDataRequest_EboGetProdDataRequest"), mypackage.EboGetProdDataRequest_EboGetProdDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetProdDataResponse_EboGetProdDataResponse"));
        oper.setReturnClass(mypackage.EboGetProdDataResponse_EboGetProdDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetProdDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EboGetOrderData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetOrderDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetOrderDataRequest_EboGetOrderDataRequest"), mypackage.EboGetOrderDataRequest_EboGetOrderDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetOrderDataResponse_EboGetOrderDataResponse"));
        oper.setReturnClass(mypackage.EboGetOrderDataResponse_EboGetOrderDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetOrderDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RunCommand");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RunCommandRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RunCommandRequest_RunCommandRequest"), mypackage.RunCommandRequest_RunCommandRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RunCommandResponse_RunCommandResponse"));
        oper.setReturnClass(mypackage.RunCommandResponse_RunCommandResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RunCommandResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckApsExecution");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckApsExecutionRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckApsExecutionRequest_CheckApsExecutionRequest"), mypackage.CheckApsExecutionRequest_CheckApsExecutionRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckApsExecutionResponse_CheckApsExecutionResponse"));
        oper.setReturnClass(mypackage.CheckApsExecutionResponse_CheckApsExecutionResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckApsExecutionResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOrganizationList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOrganizationListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOrganizationListRequest_GetOrganizationListRequest"), mypackage.GetOrganizationListRequest_GetOrganizationListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOrganizationListResponse_GetOrganizationListResponse"));
        oper.setReturnClass(mypackage.GetOrganizationListResponse_GetOrganizationListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOrganizationListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUserTokenRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUserTokenRequest_GetUserTokenRequest"), mypackage.GetUserTokenRequest_GetUserTokenRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUserTokenResponse_GetUserTokenResponse"));
        oper.setReturnClass(mypackage.GetUserTokenResponse_GetUserTokenResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUserTokenResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckUserAuth");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckUserAuthRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckUserAuthRequest_CheckUserAuthRequest"), mypackage.CheckUserAuthRequest_CheckUserAuthRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckUserAuthResponse_CheckUserAuthResponse"));
        oper.setReturnClass(mypackage.CheckUserAuthResponse_CheckUserAuthResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckUserAuthResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMenuData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMenuDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMenuDataRequest_GetMenuDataRequest"), mypackage.GetMenuDataRequest_GetMenuDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMenuDataResponse_GetMenuDataResponse"));
        oper.setReturnClass(mypackage.GetMenuDataResponse_GetMenuDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMenuDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateVendorData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateVendorDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateVendorDataRequest_CreateVendorDataRequest"), mypackage.CreateVendorDataRequest_CreateVendorDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateVendorDataResponse_CreateVendorDataResponse"));
        oper.setReturnClass(mypackage.CreateVendorDataResponse_CreateVendorDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateVendorDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateBOMMasterData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMMasterDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMMasterDataRequest_CreateBOMMasterDataRequest"), mypackage.CreateBOMMasterDataRequest_CreateBOMMasterDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMMasterDataResponse_CreateBOMMasterDataResponse"));
        oper.setReturnClass(mypackage.CreateBOMMasterDataResponse_CreateBOMMasterDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMMasterDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateBOMDetailData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMDetailDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMDetailDataRequest_CreateBOMDetailDataRequest"), mypackage.CreateBOMDetailDataRequest_CreateBOMDetailDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMDetailDataResponse_CreateBOMDetailDataResponse"));
        oper.setReturnClass(mypackage.CreateBOMDetailDataResponse_CreateBOMDetailDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMDetailDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateVoucherData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateVoucherDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateVoucherDataRequest_CreateVoucherDataRequest"), mypackage.CreateVoucherDataRequest_CreateVoucherDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateVoucherDataResponse_CreateVoucherDataResponse"));
        oper.setReturnClass(mypackage.CreateVoucherDataResponse_CreateVoucherDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateVoucherDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccountData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountDataRequest_GetAccountDataRequest"), mypackage.GetAccountDataRequest_GetAccountDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountDataResponse_GetAccountDataResponse"));
        oper.setReturnClass(mypackage.GetAccountDataResponse_GetAccountDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateCustomerData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerDataRequest_CreateCustomerDataRequest"), mypackage.CreateCustomerDataRequest_CreateCustomerDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerDataResponse_CreateCustomerDataResponse"));
        oper.setReturnClass(mypackage.CreateCustomerDataResponse_CreateCustomerDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateItemMasterData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateItemMasterDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateItemMasterDataRequest_CreateItemMasterDataRequest"), mypackage.CreateItemMasterDataRequest_CreateItemMasterDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateItemMasterDataResponse_CreateItemMasterDataResponse"));
        oper.setReturnClass(mypackage.CreateItemMasterDataResponse_CreateItemMasterDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateItemMasterDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateEmployeeData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateEmployeeDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateEmployeeDataRequest_CreateEmployeeDataRequest"), mypackage.CreateEmployeeDataRequest_CreateEmployeeDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateEmployeeDataResponse_CreateEmployeeDataResponse"));
        oper.setReturnClass(mypackage.CreateEmployeeDataResponse_CreateEmployeeDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateEmployeeDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateAddressData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateAddressDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateAddressDataRequest_CreateAddressDataRequest"), mypackage.CreateAddressDataRequest_CreateAddressDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateAddressDataResponse_CreateAddressDataResponse"));
        oper.setReturnClass(mypackage.CreateAddressDataResponse_CreateAddressDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateAddressDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TIPTOPGateWay");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "TIPTOPGateWayRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "TIPTOPGateWayRequest_TIPTOPGateWayRequest"), mypackage.TIPTOPGateWayRequest_TIPTOPGateWayRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "TIPTOPGateWayResponse_TIPTOPGateWayResponse"));
        oper.setReturnClass(mypackage.TIPTOPGateWayResponse_TIPTOPGateWayResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "TIPTOPGateWayResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateBillingAP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBillingAPRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBillingAPRequest_CreateBillingAPRequest"), mypackage.CreateBillingAPRequest_CreateBillingAPRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBillingAPResponse_CreateBillingAPResponse"));
        oper.setReturnClass(mypackage.CreateBillingAPResponse_CreateBillingAPResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBillingAPResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateCustomerOtheraddressData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerOtheraddressDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerOtheraddressDataRequest_CreateCustomerOtheraddressDataRequest"), mypackage.CreateCustomerOtheraddressDataRequest_CreateCustomerOtheraddressDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerOtheraddressDataResponse_CreateCustomerOtheraddressDataResponse"));
        oper.setReturnClass(mypackage.CreateCustomerOtheraddressDataResponse_CreateCustomerOtheraddressDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerOtheraddressDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreatePotentialCustomerData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePotentialCustomerDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePotentialCustomerDataRequest_CreatePotentialCustomerDataRequest"), mypackage.CreatePotentialCustomerDataRequest_CreatePotentialCustomerDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePotentialCustomerDataResponse_CreatePotentialCustomerDataResponse"));
        oper.setReturnClass(mypackage.CreatePotentialCustomerDataResponse_CreatePotentialCustomerDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePotentialCustomerDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCustomerContactData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerContactDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerContactDataRequest_GetCustomerContactDataRequest"), mypackage.GetCustomerContactDataRequest_GetCustomerContactDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerContactDataResponse_GetCustomerContactDataResponse"));
        oper.setReturnClass(mypackage.GetCustomerContactDataResponse_GetCustomerContactDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerContactDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCustomerOtheraddressData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerOtheraddressDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerOtheraddressDataRequest_GetCustomerOtheraddressDataRequest"), mypackage.GetCustomerOtheraddressDataRequest_GetCustomerOtheraddressDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerOtheraddressDataResponse_GetCustomerOtheraddressDataResponse"));
        oper.setReturnClass(mypackage.GetCustomerOtheraddressDataResponse_GetCustomerOtheraddressDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerOtheraddressDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItemStockList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemStockListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemStockListRequest_GetItemStockListRequest"), mypackage.GetItemStockListRequest_GetItemStockListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemStockListResponse_GetItemStockListResponse"));
        oper.setReturnClass(mypackage.GetItemStockListResponse_GetItemStockListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemStockListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMFGSettingSmaData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMFGSettingSmaDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMFGSettingSmaDataRequest_GetMFGSettingSmaDataRequest"), mypackage.GetMFGSettingSmaDataRequest_GetMFGSettingSmaDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMFGSettingSmaDataResponse_GetMFGSettingSmaDataResponse"));
        oper.setReturnClass(mypackage.GetMFGSettingSmaDataResponse_GetMFGSettingSmaDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMFGSettingSmaDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPackingMethodData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPackingMethodDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPackingMethodDataRequest_GetPackingMethodDataRequest"), mypackage.GetPackingMethodDataRequest_GetPackingMethodDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPackingMethodDataResponse_GetPackingMethodDataResponse"));
        oper.setReturnClass(mypackage.GetPackingMethodDataResponse_GetPackingMethodDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPackingMethodDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPotentialCustomerData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPotentialCustomerDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPotentialCustomerDataRequest_GetPotentialCustomerDataRequest"), mypackage.GetPotentialCustomerDataRequest_GetPotentialCustomerDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPotentialCustomerDataResponse_GetPotentialCustomerDataResponse"));
        oper.setReturnClass(mypackage.GetPotentialCustomerDataResponse_GetPotentialCustomerDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPotentialCustomerDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTableAmendmentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTableAmendmentDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTableAmendmentDataRequest_GetTableAmendmentDataRequest"), mypackage.GetTableAmendmentDataRequest_GetTableAmendmentDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTableAmendmentDataResponse_GetTableAmendmentDataResponse"));
        oper.setReturnClass(mypackage.GetTableAmendmentDataResponse_GetTableAmendmentDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTableAmendmentDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTaxTypeData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTaxTypeDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTaxTypeDataRequest_GetTaxTypeDataRequest"), mypackage.GetTaxTypeDataRequest_GetTaxTypeDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTaxTypeDataResponse_GetTaxTypeDataResponse"));
        oper.setReturnClass(mypackage.GetTaxTypeDataResponse_GetTaxTypeDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTaxTypeDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUnitConversionData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUnitConversionDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUnitConversionDataRequest_GetUnitConversionDataRequest"), mypackage.GetUnitConversionDataRequest_GetUnitConversionDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUnitConversionDataResponse_GetUnitConversionDataResponse"));
        oper.setReturnClass(mypackage.GetUnitConversionDataResponse_GetUnitConversionDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUnitConversionDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUnitData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUnitDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUnitDataRequest_GetUnitDataRequest"), mypackage.GetUnitDataRequest_GetUnitDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUnitDataResponse_GetUnitDataResponse"));
        oper.setReturnClass(mypackage.GetUnitDataResponse_GetUnitDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUnitDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReportData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReportDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReportDataRequest_GetReportDataRequest"), mypackage.GetReportDataRequest_GetReportDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReportDataResponse_GetReportDataResponse"));
        oper.setReturnClass(mypackage.GetReportDataResponse_GetReportDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReportDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CRMGetCustomerData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CRMGetCustomerDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CRMGetCustomerDataRequest_CRMGetCustomerDataRequest"), mypackage.CRMGetCustomerDataRequest_CRMGetCustomerDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CRMGetCustomerDataResponse_CRMGetCustomerDataResponse"));
        oper.setReturnClass(mypackage.CRMGetCustomerDataResponse_CRMGetCustomerDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CRMGetCustomerDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateCustomerContactData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerContactDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerContactDataRequest_CreateCustomerContactDataRequest"), mypackage.CreateCustomerContactDataRequest_CreateCustomerContactDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerContactDataResponse_CreateCustomerContactDataResponse"));
        oper.setReturnClass(mypackage.CreateCustomerContactDataResponse_CreateCustomerContactDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerContactDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateDepartmentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateDepartmentDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateDepartmentDataRequest_CreateDepartmentDataRequest"), mypackage.CreateDepartmentDataRequest_CreateDepartmentDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateDepartmentDataResponse_CreateDepartmentDataResponse"));
        oper.setReturnClass(mypackage.CreateDepartmentDataResponse_CreateDepartmentDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateDepartmentDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAccountTypeData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountTypeDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountTypeDataRequest_GetAccountTypeDataRequest"), mypackage.GetAccountTypeDataRequest_GetAccountTypeDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountTypeDataResponse_GetAccountTypeDataResponse"));
        oper.setReturnClass(mypackage.GetAccountTypeDataResponse_GetAccountTypeDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountTypeDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTransactionCategory");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTransactionCategoryRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTransactionCategoryRequest_GetTransactionCategoryRequest"), mypackage.GetTransactionCategoryRequest_GetTransactionCategoryRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTransactionCategoryResponse_GetTransactionCategoryResponse"));
        oper.setReturnClass(mypackage.GetTransactionCategoryResponse_GetTransactionCategoryResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTransactionCategoryResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetVoucherDocumentData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetVoucherDocumentDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetVoucherDocumentDataRequest_GetVoucherDocumentDataRequest"), mypackage.GetVoucherDocumentDataRequest_GetVoucherDocumentDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetVoucherDocumentDataResponse_GetVoucherDocumentDataResponse"));
        oper.setReturnClass(mypackage.GetVoucherDocumentDataResponse_GetVoucherDocumentDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetVoucherDocumentDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RollbackVoucherData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RollbackVoucherDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RollbackVoucherDataRequest_RollbackVoucherDataRequest"), mypackage.RollbackVoucherDataRequest_RollbackVoucherDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RollbackVoucherDataResponse_RollbackVoucherDataResponse"));
        oper.setReturnClass(mypackage.RollbackVoucherDataResponse_RollbackVoucherDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RollbackVoucherDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCardDetailData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCardDetailDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCardDetailDataRequest_GetCardDetailDataRequest"), mypackage.GetCardDetailDataRequest_GetCardDetailDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCardDetailDataResponse_GetCardDetailDataResponse"));
        oper.setReturnClass(mypackage.GetCardDetailDataResponse_GetCardDetailDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCardDetailDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOnlineUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOnlineUserRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOnlineUserRequest_GetOnlineUserRequest"), mypackage.GetOnlineUserRequest_GetOnlineUserRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOnlineUserResponse_GetOnlineUserResponse"));
        oper.setReturnClass(mypackage.GetOnlineUserResponse_GetOnlineUserResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOnlineUserResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProdInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdInfoRequest_GetProdInfoRequest"), mypackage.GetProdInfoRequest_GetProdInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdInfoResponse_GetProdInfoResponse"));
        oper.setReturnClass(mypackage.GetProdInfoResponse_GetProdInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMemberData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemberDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemberDataRequest_GetMemberDataRequest"), mypackage.GetMemberDataRequest_GetMemberDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemberDataResponse_GetMemberDataResponse"));
        oper.setReturnClass(mypackage.GetMemberDataResponse_GetMemberDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemberDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMachineData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMachineDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMachineDataRequest_GetMachineDataRequest"), mypackage.GetMachineDataRequest_GetMachineDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMachineDataResponse_GetMachineDataResponse"));
        oper.setReturnClass(mypackage.GetMachineDataResponse_GetMachineDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMachineDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProdRoutingData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdRoutingDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdRoutingDataRequest_GetProdRoutingDataRequest"), mypackage.GetProdRoutingDataRequest_GetProdRoutingDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdRoutingDataResponse_GetProdRoutingDataResponse"));
        oper.setReturnClass(mypackage.GetProdRoutingDataResponse_GetProdRoutingDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdRoutingDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWorkstationData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWorkstationDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWorkstationDataRequest_GetWorkstationDataRequest"), mypackage.GetWorkstationDataRequest_GetWorkstationDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWorkstationDataResponse_GetWorkstationDataResponse"));
        oper.setReturnClass(mypackage.GetWorkstationDataResponse_GetWorkstationDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWorkstationDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateRepSubPBOMData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateRepSubPBOMDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateRepSubPBOMDataRequest_CreateRepSubPBOMDataRequest"), mypackage.CreateRepSubPBOMDataRequest_CreateRepSubPBOMDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateRepSubPBOMDataResponse_CreateRepSubPBOMDataResponse"));
        oper.setReturnClass(mypackage.CreateRepSubPBOMDataResponse_CreateRepSubPBOMDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateRepSubPBOMDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBrandData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBrandDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBrandDataRequest_GetBrandDataRequest"), mypackage.GetBrandDataRequest_GetBrandDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBrandDataResponse_GetBrandDataResponse"));
        oper.setReturnClass(mypackage.GetBrandDataResponse_GetBrandDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBrandDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateItemApprovalData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateItemApprovalDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateItemApprovalDataRequest_CreateItemApprovalDataRequest"), mypackage.CreateItemApprovalDataRequest_CreateItemApprovalDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateItemApprovalDataResponse_CreateItemApprovalDataResponse"));
        oper.setReturnClass(mypackage.CreateItemApprovalDataResponse_CreateItemApprovalDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateItemApprovalDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItemOtherGroupData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemOtherGroupDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemOtherGroupDataRequest_GetItemOtherGroupDataRequest"), mypackage.GetItemOtherGroupDataRequest_GetItemOtherGroupDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemOtherGroupDataResponse_GetItemOtherGroupDataResponse"));
        oper.setReturnClass(mypackage.GetItemOtherGroupDataResponse_GetItemOtherGroupDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemOtherGroupDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateSupplierItemData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSupplierItemDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSupplierItemDataRequest_CreateSupplierItemDataRequest"), mypackage.CreateSupplierItemDataRequest_CreateSupplierItemDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSupplierItemDataResponse_CreateSupplierItemDataResponse"));
        oper.setReturnClass(mypackage.CreateSupplierItemDataResponse_CreateSupplierItemDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSupplierItemDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateWOWorkReportData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateWOWorkReportDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateWOWorkReportDataRequest_CreateWOWorkReportDataRequest"), mypackage.CreateWOWorkReportDataRequest_CreateWOWorkReportDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateWOWorkReportDataResponse_CreateWOWorkReportDataResponse"));
        oper.setReturnClass(mypackage.CreateWOWorkReportDataResponse_CreateWOWorkReportDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateWOWorkReportDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[136] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateBOMData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMDataRequest_CreateBOMDataRequest"), mypackage.CreateBOMDataRequest_CreateBOMDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMDataResponse_CreateBOMDataResponse"));
        oper.setReturnClass(mypackage.CreateBOMDataResponse_CreateBOMDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[137] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateShippingOrdersWithoutOrders");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateShippingOrdersWithoutOrdersRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateShippingOrdersWithoutOrdersRequest_CreateShippingOrdersWithoutOrdersRequest"), mypackage.CreateShippingOrdersWithoutOrdersRequest_CreateShippingOrdersWithoutOrdersRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateShippingOrdersWithoutOrdersResponse_CreateShippingOrdersWithoutOrdersResponse"));
        oper.setReturnClass(mypackage.CreateShippingOrdersWithoutOrdersResponse_CreateShippingOrdersWithoutOrdersResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateShippingOrdersWithoutOrdersResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[138] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetItemGroupData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemGroupDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemGroupDataRequest_GetItemGroupDataRequest"), mypackage.GetItemGroupDataRequest_GetItemGroupDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemGroupDataResponse_GetItemGroupDataResponse"));
        oper.setReturnClass(mypackage.GetItemGroupDataResponse_GetItemGroupDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemGroupDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[139] = oper;

    }

    private static void _initOperationDesc15(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProdState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdStateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdStateRequest_GetProdStateRequest"), mypackage.GetProdStateRequest_GetProdStateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdStateResponse_GetProdStateResponse"));
        oper.setReturnClass(mypackage.GetProdStateResponse_GetProdStateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdStateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[140] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPaymentTermsData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPaymentTermsDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPaymentTermsDataRequest_GetPaymentTermsDataRequest"), mypackage.GetPaymentTermsDataRequest_GetPaymentTermsDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPaymentTermsDataResponse_GetPaymentTermsDataResponse"));
        oper.setReturnClass(mypackage.GetPaymentTermsDataResponse_GetPaymentTermsDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPaymentTermsDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[141] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSSOKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSSOKeyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSSOKeyRequest_GetSSOKeyRequest"), mypackage.GetSSOKeyRequest_GetSSOKeyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSSOKeyResponse_GetSSOKeyResponse"));
        oper.setReturnClass(mypackage.GetSSOKeyResponse_GetSSOKeyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSSOKeyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[142] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateECNData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateECNDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateECNDataRequest_CreateECNDataRequest"), mypackage.CreateECNDataRequest_CreateECNDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateECNDataResponse_CreateECNDataResponse"));
        oper.setReturnClass(mypackage.CreateECNDataResponse_CreateECNDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateECNDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[143] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreatePLMBOMData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePLMBOMDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePLMBOMDataRequest_CreatePLMBOMDataRequest"), mypackage.CreatePLMBOMDataRequest_CreatePLMBOMDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePLMBOMDataResponse_CreatePLMBOMDataResponse"));
        oper.setReturnClass(mypackage.CreatePLMBOMDataResponse_CreatePLMBOMDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePLMBOMDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[144] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetQuotationData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetQuotationDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetQuotationDataRequest_GetQuotationDataRequest"), mypackage.GetQuotationDataRequest_GetQuotationDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetQuotationDataResponse_GetQuotationDataResponse"));
        oper.setReturnClass(mypackage.GetQuotationDataResponse_GetQuotationDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetQuotationDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[145] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCustClassificationData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustClassificationDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustClassificationDataRequest_GetCustClassificationDataRequest"), mypackage.GetCustClassificationDataRequest_GetCustClassificationDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustClassificationDataResponse_GetCustClassificationDataResponse"));
        oper.setReturnClass(mypackage.GetCustClassificationDataResponse_GetCustClassificationDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustClassificationDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[146] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetInvoiceTypeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetInvoiceTypeListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetInvoiceTypeListRequest_GetInvoiceTypeListRequest"), mypackage.GetInvoiceTypeListRequest_GetInvoiceTypeListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetInvoiceTypeListResponse_GetInvoiceTypeListResponse"));
        oper.setReturnClass(mypackage.GetInvoiceTypeListResponse_GetInvoiceTypeListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetInvoiceTypeListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[147] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetTradeTermData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTradeTermDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTradeTermDataRequest_GetTradeTermDataRequest"), mypackage.GetTradeTermDataRequest_GetTradeTermDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTradeTermDataResponse_GetTradeTermDataResponse"));
        oper.setReturnClass(mypackage.GetTradeTermDataResponse_GetTradeTermDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTradeTermDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[148] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SyncAccountData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SyncAccountDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SyncAccountDataRequest_SyncAccountDataRequest"), mypackage.SyncAccountDataRequest_SyncAccountDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SyncAccountDataResponse_SyncAccountDataResponse"));
        oper.setReturnClass(mypackage.SyncAccountDataResponse_SyncAccountDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SyncAccountDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[149] = oper;

    }

    private static void _initOperationDesc16(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCustomerAccAmtData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerAccAmtDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerAccAmtDataRequest_GetCustomerAccAmtDataRequest"), mypackage.GetCustomerAccAmtDataRequest_GetCustomerAccAmtDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerAccAmtDataResponse_GetCustomerAccAmtDataResponse"));
        oper.setReturnClass(mypackage.GetCustomerAccAmtDataResponse_GetCustomerAccAmtDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerAccAmtDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[150] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDataCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDataCountRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDataCountRequest_GetDataCountRequest"), mypackage.GetDataCountRequest_GetDataCountRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDataCountResponse_GetDataCountResponse"));
        oper.setReturnClass(mypackage.GetDataCountResponse_GetDataCountResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDataCountResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[151] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSOData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSODataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSODataRequest_GetSODataRequest"), mypackage.GetSODataRequest_GetSODataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSODataResponse_GetSODataResponse"));
        oper.setReturnClass(mypackage.GetSODataResponse_GetSODataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSODataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[152] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetShappingData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShappingDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShappingDataRequest_GetShappingDataRequest"), mypackage.GetShappingDataRequest_GetShappingDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShappingDataResponse_GetShappingDataResponse"));
        oper.setReturnClass(mypackage.GetShappingDataResponse_GetShappingDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShappingDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[153] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetUserDefOrg");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUserDefOrgRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUserDefOrgRequest_GetUserDefOrgRequest"), mypackage.GetUserDefOrgRequest_GetUserDefOrgRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUserDefOrgResponse_GetUserDefOrgResponse"));
        oper.setReturnClass(mypackage.GetUserDefOrgResponse_GetUserDefOrgResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUserDefOrgResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[154] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCardRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCardRequest_CheckCardRequest"), mypackage.CheckCardRequest_CheckCardRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCardResponse_CheckCardResponse"));
        oper.setReturnClass(mypackage.CheckCardResponse_CheckCardResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCardResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[155] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckCardType");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCardTypeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCardTypeRequest_CheckCardTypeRequest"), mypackage.CheckCardTypeRequest_CheckCardTypeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCardTypeResponse_CheckCardTypeResponse"));
        oper.setReturnClass(mypackage.CheckCardTypeResponse_CheckCardTypeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCardTypeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[156] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckCoupon");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCouponRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCouponRequest_CheckCouponRequest"), mypackage.CheckCouponRequest_CheckCouponRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCouponResponse_CheckCouponResponse"));
        oper.setReturnClass(mypackage.CheckCouponResponse_CheckCouponResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCouponResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[157] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckMemberUpgrade");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckMemberUpgradeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckMemberUpgradeRequest_CheckMemberUpgradeRequest"), mypackage.CheckMemberUpgradeRequest_CheckMemberUpgradeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckMemberUpgradeResponse_CheckMemberUpgradeResponse"));
        oper.setReturnClass(mypackage.CheckMemberUpgradeResponse_CheckMemberUpgradeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckMemberUpgradeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[158] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCardScore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCardScoreRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCardScoreRequest_GetCardScoreRequest"), mypackage.GetCardScoreRequest_GetCardScoreRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCardScoreResponse_GetCardScoreResponse"));
        oper.setReturnClass(mypackage.GetCardScoreResponse_GetCardScoreResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCardScoreResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[159] = oper;

    }

    private static void _initOperationDesc17(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCashCardInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCashCardInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCashCardInfoRequest_GetCashCardInfoRequest"), mypackage.GetCashCardInfoRequest_GetCashCardInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCashCardInfoResponse_GetCashCardInfoResponse"));
        oper.setReturnClass(mypackage.GetCashCardInfoResponse_GetCashCardInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCashCardInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[160] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RechargeCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RechargeCardRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RechargeCardRequest_RechargeCardRequest"), mypackage.RechargeCardRequest_RechargeCardRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RechargeCardResponse_RechargeCardResponse"));
        oper.setReturnClass(mypackage.RechargeCardResponse_RechargeCardResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RechargeCardResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[161] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReturnCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnCardRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnCardRequest_ReturnCardRequest"), mypackage.ReturnCardRequest_ReturnCardRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnCardResponse_ReturnCardResponse"));
        oper.setReturnClass(mypackage.ReturnCardResponse_ReturnCardResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnCardResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[162] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeductSPayment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductSPaymentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductSPaymentRequest_DeductSPaymentRequest"), mypackage.DeductSPaymentRequest_DeductSPaymentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductSPaymentResponse_DeductSPaymentResponse"));
        oper.setReturnClass(mypackage.DeductSPaymentResponse_DeductSPaymentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductSPaymentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[163] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReturnOrderBill");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnOrderBillRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnOrderBillRequest_ReturnOrderBillRequest"), mypackage.ReturnOrderBillRequest_ReturnOrderBillRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnOrderBillResponse_ReturnOrderBillResponse"));
        oper.setReturnClass(mypackage.ReturnOrderBillResponse_ReturnOrderBillResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnOrderBillResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[164] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ChangeCardRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ChangeCardRequest_ChangeCardRequest"), mypackage.ChangeCardRequest_ChangeCardRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ChangeCardResponse_ChangeCardResponse"));
        oper.setReturnClass(mypackage.ChangeCardResponse_ChangeCardResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ChangeCardResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[165] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MemberUpgrade");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "MemberUpgradeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "MemberUpgradeRequest_MemberUpgradeRequest"), mypackage.MemberUpgradeRequest_MemberUpgradeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "MemberUpgradeResponse_MemberUpgradeResponse"));
        oper.setReturnClass(mypackage.MemberUpgradeResponse_MemberUpgradeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "MemberUpgradeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[166] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetOrderInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOrderInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOrderInfoRequest_GetOrderInfoRequest"), mypackage.GetOrderInfoRequest_GetOrderInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOrderInfoResponse_GetOrderInfoResponse"));
        oper.setReturnClass(mypackage.GetOrderInfoResponse_GetOrderInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOrderInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[167] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RollbackBillingAP");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RollbackBillingAPRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RollbackBillingAPRequest_RollbackBillingAPRequest"), mypackage.RollbackBillingAPRequest_RollbackBillingAPRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RollbackBillingAPResponse_RollbackBillingAPResponse"));
        oper.setReturnClass(mypackage.RollbackBillingAPResponse_RollbackBillingAPResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RollbackBillingAPResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[168] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAPCategoryAccountCode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAPCategoryAccountCodeRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAPCategoryAccountCodeRequest_GetAPCategoryAccountCodeRequest"), mypackage.GetAPCategoryAccountCodeRequest_GetAPCategoryAccountCodeRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAPCategoryAccountCodeResponse_GetAPCategoryAccountCodeResponse"));
        oper.setReturnClass(mypackage.GetAPCategoryAccountCodeResponse_GetAPCategoryAccountCodeResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAPCategoryAccountCodeResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[169] = oper;

    }

    private static void _initOperationDesc18(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeletePLMTempTableData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeletePLMTempTableDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeletePLMTempTableDataRequest_DeletePLMTempTableDataRequest"), mypackage.DeletePLMTempTableDataRequest_DeletePLMTempTableDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeletePLMTempTableDataResponse_DeletePLMTempTableDataResponse"));
        oper.setReturnClass(mypackage.DeletePLMTempTableDataResponse_DeletePLMTempTableDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeletePLMTempTableDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[170] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPLMTempTableDataStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPLMTempTableDataStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPLMTempTableDataStatusRequest_GetPLMTempTableDataStatusRequest"), mypackage.GetPLMTempTableDataStatusRequest_GetPLMTempTableDataStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPLMTempTableDataStatusResponse_GetPLMTempTableDataStatusResponse"));
        oper.setReturnClass(mypackage.GetPLMTempTableDataStatusResponse_GetPLMTempTableDataStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPLMTempTableDataStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[171] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreatePLMTempTableData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePLMTempTableDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePLMTempTableDataRequest_CreatePLMTempTableDataRequest"), mypackage.CreatePLMTempTableDataRequest_CreatePLMTempTableDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePLMTempTableDataResponse_CreatePLMTempTableDataResponse"));
        oper.setReturnClass(mypackage.CreatePLMTempTableDataResponse_CreatePLMTempTableDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePLMTempTableDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[172] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SelRepairCard");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SelRepairCardRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SelRepairCardRequest_SelRepairCardRequest"), mypackage.SelRepairCardRequest_SelRepairCardRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SelRepairCardResponse_SelRepairCardResponse"));
        oper.setReturnClass(mypackage.SelRepairCardResponse_SelRepairCardResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SelRepairCardResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[173] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMemoData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemoDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemoDataRequest_GetMemoDataRequest"), mypackage.GetMemoDataRequest_GetMemoDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemoDataResponse_GetMemoDataResponse"));
        oper.setReturnClass(mypackage.GetMemoDataResponse_GetMemoDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemoDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[174] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeCardActivate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ChangeCardActivateRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ChangeCardActivateRequest_ChangeCardActivateRequest"), mypackage.ChangeCardActivateRequest_ChangeCardActivateRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ChangeCardActivateResponse_ChangeCardActivateResponse"));
        oper.setReturnClass(mypackage.ChangeCardActivateResponse_ChangeCardActivateResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ChangeCardActivateResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[175] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RepairCardSale");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RepairCardSaleRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RepairCardSaleRequest_RepairCardSaleRequest"), mypackage.RepairCardSaleRequest_RepairCardSaleRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RepairCardSaleResponse_RepairCardSaleResponse"));
        oper.setReturnClass(mypackage.RepairCardSaleResponse_RepairCardSaleResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RepairCardSaleResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[176] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReturnEInvoiceBooks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnEInvoiceBooksRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnEInvoiceBooksRequest_ReturnEInvoiceBooksRequest"), mypackage.ReturnEInvoiceBooksRequest_ReturnEInvoiceBooksRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnEInvoiceBooksResponse_ReturnEInvoiceBooksResponse"));
        oper.setReturnClass(mypackage.ReturnEInvoiceBooksResponse_ReturnEInvoiceBooksResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnEInvoiceBooksResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[177] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetEInvoiceBooks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEInvoiceBooksRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEInvoiceBooksRequest_GetEInvoiceBooksRequest"), mypackage.GetEInvoiceBooksRequest_GetEInvoiceBooksRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEInvoiceBooksResponse_GetEInvoiceBooksResponse"));
        oper.setReturnClass(mypackage.GetEInvoiceBooksResponse_GetEInvoiceBooksResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEInvoiceBooksResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[178] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetARListData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetARListDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetARListDataRequest_GetARListDataRequest"), mypackage.GetARListDataRequest_GetARListDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetARListDataResponse_GetARListDataResponse"));
        oper.setReturnClass(mypackage.GetARListDataResponse_GetARListDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetARListDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[179] = oper;

    }

    private static void _initOperationDesc19(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProjectWBSData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProjectWBSDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProjectWBSDataRequest_GetProjectWBSDataRequest"), mypackage.GetProjectWBSDataRequest_GetProjectWBSDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProjectWBSDataResponse_GetProjectWBSDataResponse"));
        oper.setReturnClass(mypackage.GetProjectWBSDataResponse_GetProjectWBSDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProjectWBSDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[180] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CheckGiftNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckGiftNoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckGiftNoRequest_CheckGiftNoRequest"), mypackage.CheckGiftNoRequest_CheckGiftNoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckGiftNoResponse_CheckGiftNoResponse"));
        oper.setReturnClass(mypackage.CheckGiftNoResponse_CheckGiftNoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckGiftNoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[181] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeductGiftNO");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductGiftNORequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductGiftNORequest_DeductGiftNORequest"), mypackage.DeductGiftNORequest_DeductGiftNORequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductGiftNOResponse_DeductGiftNOResponse"));
        oper.setReturnClass(mypackage.DeductGiftNOResponse_DeductGiftNOResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductGiftNOResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[182] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeductMoney");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductMoneyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductMoneyRequest_DeductMoneyRequest"), mypackage.DeductMoneyRequest_DeductMoneyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductMoneyResponse_DeductMoneyResponse"));
        oper.setReturnClass(mypackage.DeductMoneyResponse_DeductMoneyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductMoneyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[183] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetClassData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetClassDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetClassDataRequest_GetClassDataRequest"), mypackage.GetClassDataRequest_GetClassDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetClassDataResponse_GetClassDataResponse"));
        oper.setReturnClass(mypackage.GetClassDataResponse_GetClassDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetClassDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[184] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeductScore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductScoreRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductScoreRequest_DeductScoreRequest"), mypackage.DeductScoreRequest_DeductScoreRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductScoreResponse_DeductScoreResponse"));
        oper.setReturnClass(mypackage.DeductScoreResponse_DeductScoreResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductScoreResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[185] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetMemberCardInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemberCardInfoRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemberCardInfoRequest_GetMemberCardInfoRequest"), mypackage.GetMemberCardInfoRequest_GetMemberCardInfoRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemberCardInfoResponse_GetMemberCardInfoResponse"));
        oper.setReturnClass(mypackage.GetMemberCardInfoResponse_GetMemberCardInfoResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemberCardInfoResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[186] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetScore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetScoreRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetScoreRequest_GetScoreRequest"), mypackage.GetScoreRequest_GetScoreRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetScoreResponse_GetScoreResponse"));
        oper.setReturnClass(mypackage.GetScoreResponse_GetScoreResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetScoreResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[187] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ModPassWord");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ModPassWordRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ModPassWordRequest_ModPassWordRequest"), mypackage.ModPassWordRequest_ModPassWordRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ModPassWordResponse_ModPassWordResponse"));
        oper.setReturnClass(mypackage.ModPassWordResponse_ModPassWordResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ModPassWordResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[188] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WritePoint");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "WritePointRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "WritePointRequest_WritePointRequest"), mypackage.WritePointRequest_WritePointRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "WritePointResponse_WritePointResponse"));
        oper.setReturnClass(mypackage.WritePointResponse_WritePointResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "WritePointResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[189] = oper;

    }

    private static void _initOperationDesc20(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetExchangeRateData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetExchangeRateDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetExchangeRateDataRequest_GetExchangeRateDataRequest"), mypackage.GetExchangeRateDataRequest_GetExchangeRateDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetExchangeRateDataResponse_GetExchangeRateDataResponse"));
        oper.setReturnClass(mypackage.GetExchangeRateDataResponse_GetExchangeRateDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetExchangeRateDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[190] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAreaData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAreaDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAreaDataRequest_GetAreaDataRequest"), mypackage.GetAreaDataRequest_GetAreaDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAreaDataResponse_GetAreaDataResponse"));
        oper.setReturnClass(mypackage.GetAreaDataResponse_GetAreaDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAreaDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[191] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAreaList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAreaListRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAreaListRequest_GetAreaListRequest"), mypackage.GetAreaListRequest_GetAreaListRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAreaListResponse_GetAreaListResponse"));
        oper.setReturnClass(mypackage.GetAreaListResponse_GetAreaListResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAreaListResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[192] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAxmDocument");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAxmDocumentRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAxmDocumentRequest_GetAxmDocumentRequest"), mypackage.GetAxmDocumentRequest_GetAxmDocumentRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAxmDocumentResponse_GetAxmDocumentResponse"));
        oper.setReturnClass(mypackage.GetAxmDocumentResponse_GetAxmDocumentResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAxmDocumentResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[193] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPurchaseStockInQty");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPurchaseStockInQtyRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPurchaseStockInQtyRequest_GetPurchaseStockInQtyRequest"), mypackage.GetPurchaseStockInQtyRequest_GetPurchaseStockInQtyRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPurchaseStockInQtyResponse_GetPurchaseStockInQtyResponse"));
        oper.setReturnClass(mypackage.GetPurchaseStockInQtyResponse_GetPurchaseStockInQtyResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPurchaseStockInQtyResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[194] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetBasicCodeData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBasicCodeDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBasicCodeDataRequest_GetBasicCodeDataRequest"), mypackage.GetBasicCodeDataRequest_GetBasicCodeDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBasicCodeDataResponse_GetBasicCodeDataResponse"));
        oper.setReturnClass(mypackage.GetBasicCodeDataResponse_GetBasicCodeDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBasicCodeDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[195] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetComponentrepsubData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetComponentrepsubDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetComponentrepsubDataRequest_GetComponentrepsubDataRequest"), mypackage.GetComponentrepsubDataRequest_GetComponentrepsubDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetComponentrepsubDataResponse_GetComponentrepsubDataResponse"));
        oper.setReturnClass(mypackage.GetComponentrepsubDataResponse_GetComponentrepsubDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetComponentrepsubDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[196] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createasfi5icd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "createasfi5icdRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "createasfi5icdRequest_createasfi5icdRequest"), mypackage.Createasfi5IcdRequest_createasfi5IcdRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "createasfi5icdResponse_createasfi5icdResponse"));
        oper.setReturnClass(mypackage.Createasfi5IcdResponse_createasfi5IcdResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "createasfi5icdResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[197] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("createasft300");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "createasft300Request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "createasft300Request_createasft300Request"), mypackage.Createasft300Request_createasft300Request.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "createasft300Response_createasft300Response"));
        oper.setReturnClass(mypackage.Createasft300Response_createasft300Response.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "createasft300Response"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[198] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QueryData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "QueryDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "QueryDataRequest_QueryDataRequest"), mypackage.QueryDataRequest_QueryDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "QueryDataResponse_QueryDataResponse"));
        oper.setReturnClass(mypackage.QueryDataResponse_QueryDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "QueryDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[199] = oper;

    }

    private static void _initOperationDesc21(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("UpdateStatus");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateStatusRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateStatusRequest_UpdateStatusRequest"), mypackage.UpdateStatusRequest_UpdateStatusRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateStatusResponse_UpdateStatusResponse"));
        oper.setReturnClass(mypackage.UpdateStatusResponse_UpdateStatusResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateStatusResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[200] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MergeData");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "MergeDataRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "MergeDataRequest_MergeDataRequest"), mypackage.MergeDataRequest_MergeDataRequest.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "MergeDataResponse_MergeDataResponse"));
        oper.setReturnClass(mypackage.MergeDataResponse_MergeDataResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "MergeDataResponse"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[201] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invokeSrv");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[202] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("callbackSrv");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[203] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("syncProd");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[204] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("invokeMdm");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "request"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "response"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[205] = oper;

    }

    public TIPTOPServiceGateWayBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public TIPTOPServiceGateWayBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public TIPTOPServiceGateWayBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
        addBindings2();
        addBindings3();
        addBindings4();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ChangeCardActivateRequest_ChangeCardActivateRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.ChangeCardActivateRequest_ChangeCardActivateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ChangeCardActivateResponse_ChangeCardActivateResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.ChangeCardActivateResponse_ChangeCardActivateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ChangeCardRequest_ChangeCardRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.ChangeCardRequest_ChangeCardRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ChangeCardResponse_ChangeCardResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.ChangeCardResponse_ChangeCardResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckApsExecutionRequest_CheckApsExecutionRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckApsExecutionRequest_CheckApsExecutionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckApsExecutionResponse_CheckApsExecutionResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckApsExecutionResponse_CheckApsExecutionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCardRequest_CheckCardRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckCardRequest_CheckCardRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCardResponse_CheckCardResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckCardResponse_CheckCardResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCardTypeRequest_CheckCardTypeRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckCardTypeRequest_CheckCardTypeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCardTypeResponse_CheckCardTypeResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckCardTypeResponse_CheckCardTypeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCouponRequest_CheckCouponRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckCouponRequest_CheckCouponRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckCouponResponse_CheckCouponResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckCouponResponse_CheckCouponResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckDataNumExistsRequest_CheckDataNumExistsRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckDataNumExistsRequest_CheckDataNumExistsRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckDataNumExistsResponse_CheckDataNumExistsResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckDataNumExistsResponse_CheckDataNumExistsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckExecAuthorizationRequest_CheckExecAuthorizationRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckExecAuthorizationRequest_CheckExecAuthorizationRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckExecAuthorizationResponse_CheckExecAuthorizationResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckExecAuthorizationResponse_CheckExecAuthorizationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckGiftNoRequest_CheckGiftNoRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckGiftNoRequest_CheckGiftNoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckGiftNoResponse_CheckGiftNoResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckGiftNoResponse_CheckGiftNoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckMemberUpgradeRequest_CheckMemberUpgradeRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckMemberUpgradeRequest_CheckMemberUpgradeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckMemberUpgradeResponse_CheckMemberUpgradeResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckMemberUpgradeResponse_CheckMemberUpgradeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckUserAuthRequest_CheckUserAuthRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckUserAuthRequest_CheckUserAuthRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CheckUserAuthResponse_CheckUserAuthResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CheckUserAuthResponse_CheckUserAuthResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CleanDocumentRequest_CleanDocumentRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CleanDocumentRequest_CleanDocumentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CleanDocumentResponse_CleanDocumentResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CleanDocumentResponse_CleanDocumentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateAddressDataRequest_CreateAddressDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateAddressDataRequest_CreateAddressDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateAddressDataResponse_CreateAddressDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateAddressDataResponse_CreateAddressDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "createasfi5icdRequest_createasfi5icdRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.Createasfi5IcdRequest_createasfi5IcdRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "createasfi5icdResponse_createasfi5icdResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.Createasfi5IcdResponse_createasfi5IcdResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "createasft300Request_createasft300Request");
            cachedSerQNames.add(qName);
            cls = mypackage.Createasft300Request_createasft300Request.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "createasft300Response_createasft300Response");
            cachedSerQNames.add(qName);
            cls = mypackage.Createasft300Response_createasft300Response.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBillingAPRequest_CreateBillingAPRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateBillingAPRequest_CreateBillingAPRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBillingAPResponse_CreateBillingAPResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateBillingAPResponse_CreateBillingAPResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMDataRequest_CreateBOMDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateBOMDataRequest_CreateBOMDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMDataResponse_CreateBOMDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateBOMDataResponse_CreateBOMDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMDetailDataRequest_CreateBOMDetailDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateBOMDetailDataRequest_CreateBOMDetailDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMDetailDataResponse_CreateBOMDetailDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateBOMDetailDataResponse_CreateBOMDetailDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMMasterDataRequest_CreateBOMMasterDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateBOMMasterDataRequest_CreateBOMMasterDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateBOMMasterDataResponse_CreateBOMMasterDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateBOMMasterDataResponse_CreateBOMMasterDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerContactDataRequest_CreateCustomerContactDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateCustomerContactDataRequest_CreateCustomerContactDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerContactDataResponse_CreateCustomerContactDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateCustomerContactDataResponse_CreateCustomerContactDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerDataRequest_CreateCustomerDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateCustomerDataRequest_CreateCustomerDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerDataResponse_CreateCustomerDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateCustomerDataResponse_CreateCustomerDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerOtheraddressDataRequest_CreateCustomerOtheraddressDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateCustomerOtheraddressDataRequest_CreateCustomerOtheraddressDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateCustomerOtheraddressDataResponse_CreateCustomerOtheraddressDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateCustomerOtheraddressDataResponse_CreateCustomerOtheraddressDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateDepartmentDataRequest_CreateDepartmentDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateDepartmentDataRequest_CreateDepartmentDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateDepartmentDataResponse_CreateDepartmentDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateDepartmentDataResponse_CreateDepartmentDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateECNDataRequest_CreateECNDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateECNDataRequest_CreateECNDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateECNDataResponse_CreateECNDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateECNDataResponse_CreateECNDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateEmployeeDataRequest_CreateEmployeeDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateEmployeeDataRequest_CreateEmployeeDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateEmployeeDataResponse_CreateEmployeeDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateEmployeeDataResponse_CreateEmployeeDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateIssueReturnDataRequest_CreateIssueReturnDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateIssueReturnDataRequest_CreateIssueReturnDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateIssueReturnDataResponse_CreateIssueReturnDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateIssueReturnDataResponse_CreateIssueReturnDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateItemApprovalDataRequest_CreateItemApprovalDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateItemApprovalDataRequest_CreateItemApprovalDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateItemApprovalDataResponse_CreateItemApprovalDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateItemApprovalDataResponse_CreateItemApprovalDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateItemMasterDataRequest_CreateItemMasterDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateItemMasterDataRequest_CreateItemMasterDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateItemMasterDataResponse_CreateItemMasterDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateItemMasterDataResponse_CreateItemMasterDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateMISCIssueDataRequest_CreateMISCIssueDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateMISCIssueDataRequest_CreateMISCIssueDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateMISCIssueDataResponse_CreateMISCIssueDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateMISCIssueDataResponse_CreateMISCIssueDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePLMBOMDataRequest_CreatePLMBOMDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreatePLMBOMDataRequest_CreatePLMBOMDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePLMBOMDataResponse_CreatePLMBOMDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreatePLMBOMDataResponse_CreatePLMBOMDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePLMTempTableDataRequest_CreatePLMTempTableDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreatePLMTempTableDataRequest_CreatePLMTempTableDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePLMTempTableDataResponse_CreatePLMTempTableDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreatePLMTempTableDataResponse_CreatePLMTempTableDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePOReceivingDataRequest_CreatePOReceivingDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreatePOReceivingDataRequest_CreatePOReceivingDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePOReceivingDataResponse_CreatePOReceivingDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreatePOReceivingDataResponse_CreatePOReceivingDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePotentialCustomerDataRequest_CreatePotentialCustomerDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreatePotentialCustomerDataRequest_CreatePotentialCustomerDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePotentialCustomerDataResponse_CreatePotentialCustomerDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreatePotentialCustomerDataResponse_CreatePotentialCustomerDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseDeliveryDataRequest_CreatePurchaseDeliveryDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreatePurchaseDeliveryDataRequest_CreatePurchaseDeliveryDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseDeliveryDataResponse_CreatePurchaseDeliveryDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreatePurchaseDeliveryDataResponse_CreatePurchaseDeliveryDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseStockInRequest_CreatePurchaseStockInRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreatePurchaseStockInRequest_CreatePurchaseStockInRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseStockInResponse_CreatePurchaseStockInResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreatePurchaseStockInResponse_CreatePurchaseStockInResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseStockOutRequest_CreatePurchaseStockOutRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreatePurchaseStockOutRequest_CreatePurchaseStockOutRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreatePurchaseStockOutResponse_CreatePurchaseStockOutResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreatePurchaseStockOutResponse_CreatePurchaseStockOutResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateQuotationDataRequest_CreateQuotationDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateQuotationDataRequest_CreateQuotationDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateQuotationDataResponse_CreateQuotationDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateQuotationDataResponse_CreateQuotationDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateReceivingInvoiceRequest_CreateReceivingInvoiceRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateReceivingInvoiceRequest_CreateReceivingInvoiceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateReceivingInvoiceResponse_CreateReceivingInvoiceResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateReceivingInvoiceResponse_CreateReceivingInvoiceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateRepSubPBOMDataRequest_CreateRepSubPBOMDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateRepSubPBOMDataRequest_CreateRepSubPBOMDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateRepSubPBOMDataResponse_CreateRepSubPBOMDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateRepSubPBOMDataResponse_CreateRepSubPBOMDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSalesOrderDataRequest_CreateSalesOrderDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateSalesOrderDataRequest_CreateSalesOrderDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSalesOrderDataResponse_CreateSalesOrderDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateSalesOrderDataResponse_CreateSalesOrderDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSalesOrderModifyDataRequest_CreateSalesOrderModifyDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateSalesOrderModifyDataRequest_CreateSalesOrderModifyDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSalesOrderModifyDataResponse_CreateSalesOrderModifyDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateSalesOrderModifyDataResponse_CreateSalesOrderModifyDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateShippingOrderRequest_CreateShippingOrderRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateShippingOrderRequest_CreateShippingOrderRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateShippingOrderResponse_CreateShippingOrderResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateShippingOrderResponse_CreateShippingOrderResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateShippingOrdersWithoutOrdersRequest_CreateShippingOrdersWithoutOrdersRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateShippingOrdersWithoutOrdersRequest_CreateShippingOrdersWithoutOrdersRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateShippingOrdersWithoutOrdersResponse_CreateShippingOrdersWithoutOrdersResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateShippingOrdersWithoutOrdersResponse_CreateShippingOrdersWithoutOrdersResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateStockDataRequest_CreateStockDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateStockDataRequest_CreateStockDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateStockDataResponse_CreateStockDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateStockDataResponse_CreateStockDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateStockInDataRequest_CreateStockInDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateStockInDataRequest_CreateStockInDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateStockInDataResponse_CreateStockInDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateStockInDataResponse_CreateStockInDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSupplierItemDataRequest_CreateSupplierItemDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateSupplierItemDataRequest_CreateSupplierItemDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateSupplierItemDataResponse_CreateSupplierItemDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateSupplierItemDataResponse_CreateSupplierItemDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTransferNoteRequest_CreateTransferNoteRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateTransferNoteRequest_CreateTransferNoteRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateTransferNoteResponse_CreateTransferNoteResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateTransferNoteResponse_CreateTransferNoteResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateVendorDataRequest_CreateVendorDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateVendorDataRequest_CreateVendorDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateVendorDataResponse_CreateVendorDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateVendorDataResponse_CreateVendorDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateVoucherDataRequest_CreateVoucherDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateVoucherDataRequest_CreateVoucherDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateVoucherDataResponse_CreateVoucherDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateVoucherDataResponse_CreateVoucherDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateWOStockinDataRequest_CreateWOStockinDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateWOStockinDataRequest_CreateWOStockinDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateWOStockinDataResponse_CreateWOStockinDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateWOStockinDataResponse_CreateWOStockinDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateWOWorkReportDataRequest_CreateWOWorkReportDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateWOWorkReportDataRequest_CreateWOWorkReportDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateWOWorkReportDataResponse_CreateWOWorkReportDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CreateWOWorkReportDataResponse_CreateWOWorkReportDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CRMGetCustomerDataRequest_CRMGetCustomerDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.CRMGetCustomerDataRequest_CRMGetCustomerDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CRMGetCustomerDataResponse_CRMGetCustomerDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.CRMGetCustomerDataResponse_CRMGetCustomerDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductGiftNORequest_DeductGiftNORequest");
            cachedSerQNames.add(qName);
            cls = mypackage.DeductGiftNORequest_DeductGiftNORequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductGiftNOResponse_DeductGiftNOResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.DeductGiftNOResponse_DeductGiftNOResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductMoneyRequest_DeductMoneyRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.DeductMoneyRequest_DeductMoneyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductMoneyResponse_DeductMoneyResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.DeductMoneyResponse_DeductMoneyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductScoreRequest_DeductScoreRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.DeductScoreRequest_DeductScoreRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductScoreResponse_DeductScoreResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.DeductScoreResponse_DeductScoreResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductSPaymentRequest_DeductSPaymentRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.DeductSPaymentRequest_DeductSPaymentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeductSPaymentResponse_DeductSPaymentResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.DeductSPaymentResponse_DeductSPaymentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeletePLMTempTableDataRequest_DeletePLMTempTableDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.DeletePLMTempTableDataRequest_DeletePLMTempTableDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "DeletePLMTempTableDataResponse_DeletePLMTempTableDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.DeletePLMTempTableDataResponse_DeletePLMTempTableDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetCustDataRequest_EboGetCustDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.EboGetCustDataRequest_EboGetCustDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetCustDataResponse_EboGetCustDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.EboGetCustDataResponse_EboGetCustDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetOrderDataRequest_EboGetOrderDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.EboGetOrderDataRequest_EboGetOrderDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetOrderDataResponse_EboGetOrderDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.EboGetOrderDataResponse_EboGetOrderDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetProdDataRequest_EboGetProdDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.EboGetProdDataRequest_EboGetProdDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "EboGetProdDataResponse_EboGetProdDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.EboGetProdDataResponse_EboGetProdDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountDataRequest_GetAccountDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetAccountDataRequest_GetAccountDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountDataResponse_GetAccountDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetAccountDataResponse_GetAccountDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountSubjectDataRequest_GetAccountSubjectDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetAccountSubjectDataRequest_GetAccountSubjectDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountSubjectDataResponse_GetAccountSubjectDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetAccountSubjectDataResponse_GetAccountSubjectDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountTypeDataRequest_GetAccountTypeDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetAccountTypeDataRequest_GetAccountTypeDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAccountTypeDataResponse_GetAccountTypeDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetAccountTypeDataResponse_GetAccountTypeDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAPCategoryAccountCodeRequest_GetAPCategoryAccountCodeRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetAPCategoryAccountCodeRequest_GetAPCategoryAccountCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAPCategoryAccountCodeResponse_GetAPCategoryAccountCodeResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetAPCategoryAccountCodeResponse_GetAPCategoryAccountCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAreaDataRequest_GetAreaDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetAreaDataRequest_GetAreaDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAreaDataResponse_GetAreaDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetAreaDataResponse_GetAreaDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAreaListRequest_GetAreaListRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetAreaListRequest_GetAreaListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAreaListResponse_GetAreaListResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetAreaListResponse_GetAreaListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetARListDataRequest_GetARListDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetARListDataRequest_GetARListDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetARListDataResponse_GetARListDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetARListDataResponse_GetARListDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAxmDocumentRequest_GetAxmDocumentRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetAxmDocumentRequest_GetAxmDocumentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAxmDocumentResponse_GetAxmDocumentResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetAxmDocumentResponse_GetAxmDocumentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAxmPriceRequest_GetAxmPriceRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetAxmPriceRequest_GetAxmPriceRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetAxmPriceResponse_GetAxmPriceResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetAxmPriceResponse_GetAxmPriceResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBasicCodeDataRequest_GetBasicCodeDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetBasicCodeDataRequest_GetBasicCodeDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBasicCodeDataResponse_GetBasicCodeDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetBasicCodeDataResponse_GetBasicCodeDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBOMDataRequest_GetBOMDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetBOMDataRequest_GetBOMDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBOMDataResponse_GetBOMDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetBOMDataResponse_GetBOMDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBrandDataRequest_GetBrandDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetBrandDataRequest_GetBrandDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetBrandDataResponse_GetBrandDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetBrandDataResponse_GetBrandDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCardDetailDataRequest_GetCardDetailDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCardDetailDataRequest_GetCardDetailDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCardDetailDataResponse_GetCardDetailDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCardDetailDataResponse_GetCardDetailDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCardScoreRequest_GetCardScoreRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCardScoreRequest_GetCardScoreRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCardScoreResponse_GetCardScoreResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCardScoreResponse_GetCardScoreResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCashCardInfoRequest_GetCashCardInfoRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCashCardInfoRequest_GetCashCardInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCashCardInfoResponse_GetCashCardInfoResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCashCardInfoResponse_GetCashCardInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetClassDataRequest_GetClassDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetClassDataRequest_GetClassDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetClassDataResponse_GetClassDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetClassDataResponse_GetClassDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetComponentrepsubDataRequest_GetComponentrepsubDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetComponentrepsubDataRequest_GetComponentrepsubDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetComponentrepsubDataResponse_GetComponentrepsubDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetComponentrepsubDataResponse_GetComponentrepsubDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCostGroupDataRequest_GetCostGroupDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCostGroupDataRequest_GetCostGroupDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCostGroupDataResponse_GetCostGroupDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCostGroupDataResponse_GetCostGroupDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountingLabelDataRequest_GetCountingLabelDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCountingLabelDataRequest_GetCountingLabelDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountingLabelDataResponse_GetCountingLabelDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCountingLabelDataResponse_GetCountingLabelDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountryDataRequest_GetCountryDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCountryDataRequest_GetCountryDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountryDataResponse_GetCountryDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCountryDataResponse_GetCountryDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountryListRequest_GetCountryListRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCountryListRequest_GetCountryListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCountryListResponse_GetCountryListResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCountryListResponse_GetCountryListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCurrencyDataRequest_GetCurrencyDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCurrencyDataRequest_GetCurrencyDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCurrencyDataResponse_GetCurrencyDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCurrencyDataResponse_GetCurrencyDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCurrencyListRequest_GetCurrencyListRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCurrencyListRequest_GetCurrencyListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCurrencyListResponse_GetCurrencyListResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCurrencyListResponse_GetCurrencyListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustClassificationDataRequest_GetCustClassificationDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCustClassificationDataRequest_GetCustClassificationDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustClassificationDataResponse_GetCustClassificationDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCustClassificationDataResponse_GetCustClassificationDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustListRequest_GetCustListRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCustListRequest_GetCustListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustListResponse_GetCustListResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCustListResponse_GetCustListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerAccAmtDataRequest_GetCustomerAccAmtDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCustomerAccAmtDataRequest_GetCustomerAccAmtDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerAccAmtDataResponse_GetCustomerAccAmtDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCustomerAccAmtDataResponse_GetCustomerAccAmtDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerContactDataRequest_GetCustomerContactDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCustomerContactDataRequest_GetCustomerContactDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerContactDataResponse_GetCustomerContactDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCustomerContactDataResponse_GetCustomerContactDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerDataRequest_GetCustomerDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCustomerDataRequest_GetCustomerDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerDataResponse_GetCustomerDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCustomerDataResponse_GetCustomerDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerOtheraddressDataRequest_GetCustomerOtheraddressDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCustomerOtheraddressDataRequest_GetCustomerOtheraddressDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerOtheraddressDataResponse_GetCustomerOtheraddressDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCustomerOtheraddressDataResponse_GetCustomerOtheraddressDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerProductDataRequest_GetCustomerProductDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCustomerProductDataRequest_GetCustomerProductDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetCustomerProductDataResponse_GetCustomerProductDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetCustomerProductDataResponse_GetCustomerProductDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDataCountRequest_GetDataCountRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetDataCountRequest_GetDataCountRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDataCountResponse_GetDataCountResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetDataCountResponse_GetDataCountResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDepartmentDataRequest_GetDepartmentDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetDepartmentDataRequest_GetDepartmentDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDepartmentDataResponse_GetDepartmentDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetDepartmentDataResponse_GetDepartmentDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDepartmentListRequest_GetDepartmentListRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetDepartmentListRequest_GetDepartmentListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDepartmentListResponse_GetDepartmentListResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetDepartmentListResponse_GetDepartmentListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDocumentListRequest_GetDocumentListRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetDocumentListRequest_GetDocumentListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDocumentListResponse_GetDocumentListResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetDocumentListResponse_GetDocumentListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDocumentNumberRequest_GetDocumentNumberRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetDocumentNumberRequest_GetDocumentNumberRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetDocumentNumberResponse_GetDocumentNumberResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetDocumentNumberResponse_GetDocumentNumberResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEInvoiceBooksRequest_GetEInvoiceBooksRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetEInvoiceBooksRequest_GetEInvoiceBooksRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEInvoiceBooksResponse_GetEInvoiceBooksResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetEInvoiceBooksResponse_GetEInvoiceBooksResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEmployeeDataRequest_GetEmployeeDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetEmployeeDataRequest_GetEmployeeDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEmployeeDataResponse_GetEmployeeDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetEmployeeDataResponse_GetEmployeeDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEmployeeListRequest_GetEmployeeListRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetEmployeeListRequest_GetEmployeeListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetEmployeeListResponse_GetEmployeeListResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetEmployeeListResponse_GetEmployeeListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetExchangeRateDataRequest_GetExchangeRateDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetExchangeRateDataRequest_GetExchangeRateDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetExchangeRateDataResponse_GetExchangeRateDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetExchangeRateDataResponse_GetExchangeRateDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetFQCDataRequest_GetFQCDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetFQCDataRequest_GetFQCDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetFQCDataResponse_GetFQCDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetFQCDataResponse_GetFQCDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings2() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetFQCMasterDataRequest_GetFQCMasterDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetFQCMasterDataRequest_GetFQCMasterDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetFQCMasterDataResponse_GetFQCMasterDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetFQCMasterDataResponse_GetFQCMasterDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetGoodsStockRequest_GetGoodsStockRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetGoodsStockRequest_GetGoodsStockRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetGoodsStockResponse_GetGoodsStockResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetGoodsStockResponse_GetGoodsStockResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetInspectionDataRequest_GetInspectionDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetInspectionDataRequest_GetInspectionDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetInspectionDataResponse_GetInspectionDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetInspectionDataResponse_GetInspectionDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetInvoiceTypeListRequest_GetInvoiceTypeListRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetInvoiceTypeListRequest_GetInvoiceTypeListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetInvoiceTypeListResponse_GetInvoiceTypeListResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetInvoiceTypeListResponse_GetInvoiceTypeListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemDataRequest_GetItemDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetItemDataRequest_GetItemDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemDataResponse_GetItemDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetItemDataResponse_GetItemDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemGroupDataRequest_GetItemGroupDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetItemGroupDataRequest_GetItemGroupDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemGroupDataResponse_GetItemGroupDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetItemGroupDataResponse_GetItemGroupDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemListRequest_GetItemListRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetItemListRequest_GetItemListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemListResponse_GetItemListResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetItemListResponse_GetItemListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemOtherGroupDataRequest_GetItemOtherGroupDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetItemOtherGroupDataRequest_GetItemOtherGroupDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemOtherGroupDataResponse_GetItemOtherGroupDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetItemOtherGroupDataResponse_GetItemOtherGroupDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemStockListRequest_GetItemStockListRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetItemStockListRequest_GetItemStockListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemStockListResponse_GetItemStockListResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetItemStockListResponse_GetItemStockListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemUnitConversionDataRequest_GetItemUnitConversionDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetItemUnitConversionDataRequest_GetItemUnitConversionDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetItemUnitConversionDataResponse_GetItemUnitConversionDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetItemUnitConversionDataResponse_GetItemUnitConversionDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetJointProductDataRequest_GetJointProductDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetJointProductDataRequest_GetJointProductDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetJointProductDataResponse_GetJointProductDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetJointProductDataResponse_GetJointProductDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetLabelTypeDataRequest_GetLabelTypeDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetLabelTypeDataRequest_GetLabelTypeDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetLabelTypeDataResponse_GetLabelTypeDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetLabelTypeDataResponse_GetLabelTypeDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetLocationDataRequest_GetLocationDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetLocationDataRequest_GetLocationDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetLocationDataResponse_GetLocationDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetLocationDataResponse_GetLocationDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMachineDataRequest_GetMachineDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMachineDataRequest_GetMachineDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMachineDataResponse_GetMachineDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMachineDataResponse_GetMachineDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemberCardInfoRequest_GetMemberCardInfoRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMemberCardInfoRequest_GetMemberCardInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemberCardInfoResponse_GetMemberCardInfoResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMemberCardInfoResponse_GetMemberCardInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemberDataRequest_GetMemberDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMemberDataRequest_GetMemberDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemberDataResponse_GetMemberDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMemberDataResponse_GetMemberDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemoDataRequest_GetMemoDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMemoDataRequest_GetMemoDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMemoDataResponse_GetMemoDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMemoDataResponse_GetMemoDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMenuDataRequest_GetMenuDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMenuDataRequest_GetMenuDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMenuDataResponse_GetMenuDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMenuDataResponse_GetMenuDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMFGDocumentRequest_GetMFGDocumentRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMFGDocumentRequest_GetMFGDocumentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMFGDocumentResponse_GetMFGDocumentResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMFGDocumentResponse_GetMFGDocumentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMFGSettingSmaDataRequest_GetMFGSettingSmaDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMFGSettingSmaDataRequest_GetMFGSettingSmaDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMFGSettingSmaDataResponse_GetMFGSettingSmaDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMFGSettingSmaDataResponse_GetMFGSettingSmaDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMoMasterDataRequest_GetMoMasterDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMoMasterDataRequest_GetMoMasterDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMoMasterDataResponse_GetMoMasterDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMoMasterDataResponse_GetMoMasterDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMonthListRequest_GetMonthListRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMonthListRequest_GetMonthListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetMonthListResponse_GetMonthListResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetMonthListResponse_GetMonthListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOnlineUserRequest_GetOnlineUserRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetOnlineUserRequest_GetOnlineUserRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOnlineUserResponse_GetOnlineUserResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetOnlineUserResponse_GetOnlineUserResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOperationDataRequest_GetOperationDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetOperationDataRequest_GetOperationDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOperationDataResponse_GetOperationDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetOperationDataResponse_GetOperationDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOrderInfoRequest_GetOrderInfoRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetOrderInfoRequest_GetOrderInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOrderInfoResponse_GetOrderInfoResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetOrderInfoResponse_GetOrderInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOrganizationListRequest_GetOrganizationListRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetOrganizationListRequest_GetOrganizationListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOrganizationListResponse_GetOrganizationListResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetOrganizationListResponse_GetOrganizationListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOverdueAmtDetailDataRequest_GetOverdueAmtDetailDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetOverdueAmtDetailDataRequest_GetOverdueAmtDetailDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOverdueAmtDetailDataResponse_GetOverdueAmtDetailDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetOverdueAmtDetailDataResponse_GetOverdueAmtDetailDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOverdueAmtRankingDataRequest_GetOverdueAmtRankingDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetOverdueAmtRankingDataRequest_GetOverdueAmtRankingDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetOverdueAmtRankingDataResponse_GetOverdueAmtRankingDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetOverdueAmtRankingDataResponse_GetOverdueAmtRankingDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPackingMethodDataRequest_GetPackingMethodDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPackingMethodDataRequest_GetPackingMethodDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPackingMethodDataResponse_GetPackingMethodDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPackingMethodDataResponse_GetPackingMethodDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPaymentTermsDataRequest_GetPaymentTermsDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPaymentTermsDataRequest_GetPaymentTermsDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPaymentTermsDataResponse_GetPaymentTermsDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPaymentTermsDataResponse_GetPaymentTermsDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPLMTempTableDataStatusRequest_GetPLMTempTableDataStatusRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPLMTempTableDataStatusRequest_GetPLMTempTableDataStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPLMTempTableDataStatusResponse_GetPLMTempTableDataStatusResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPLMTempTableDataStatusResponse_GetPLMTempTableDataStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPODataRequest_GetPODataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPODataRequest_GetPODataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPODataResponse_GetPODataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPODataResponse_GetPODataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOReceivingInDataRequest_GetPOReceivingInDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPOReceivingInDataRequest_GetPOReceivingInDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOReceivingInDataResponse_GetPOReceivingInDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPOReceivingInDataResponse_GetPOReceivingInDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOReceivingOutDataRequest_GetPOReceivingOutDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPOReceivingOutDataRequest_GetPOReceivingOutDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOReceivingOutDataResponse_GetPOReceivingOutDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPOReceivingOutDataResponse_GetPOReceivingOutDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOSKeyRequest_GetPOSKeyRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPOSKeyRequest_GetPOSKeyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPOSKeyResponse_GetPOSKeyResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPOSKeyResponse_GetPOSKeyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPotentialCustomerDataRequest_GetPotentialCustomerDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPotentialCustomerDataRequest_GetPotentialCustomerDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPotentialCustomerDataResponse_GetPotentialCustomerDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPotentialCustomerDataResponse_GetPotentialCustomerDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdClassListRequest_GetProdClassListRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetProdClassListRequest_GetProdClassListRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdClassListResponse_GetProdClassListResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetProdClassListResponse_GetProdClassListResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdInfoRequest_GetProdInfoRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetProdInfoRequest_GetProdInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdInfoResponse_GetProdInfoResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetProdInfoResponse_GetProdInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdRoutingDataRequest_GetProdRoutingDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetProdRoutingDataRequest_GetProdRoutingDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdRoutingDataResponse_GetProdRoutingDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetProdRoutingDataResponse_GetProdRoutingDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdStateRequest_GetProdStateRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetProdStateRequest_GetProdStateRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProdStateResponse_GetProdStateResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetProdStateResponse_GetProdStateResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProductClassDataRequest_GetProductClassDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetProductClassDataRequest_GetProductClassDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProductClassDataResponse_GetProductClassDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetProductClassDataResponse_GetProductClassDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProjectWBSDataRequest_GetProjectWBSDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetProjectWBSDataRequest_GetProjectWBSDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetProjectWBSDataResponse_GetProjectWBSDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetProjectWBSDataResponse_GetProjectWBSDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPurchaseStockInQtyRequest_GetPurchaseStockInQtyRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPurchaseStockInQtyRequest_GetPurchaseStockInQtyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPurchaseStockInQtyResponse_GetPurchaseStockInQtyResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPurchaseStockInQtyResponse_GetPurchaseStockInQtyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPurchaseStockOutQtyRequest_GetPurchaseStockOutQtyRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPurchaseStockOutQtyRequest_GetPurchaseStockOutQtyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetPurchaseStockOutQtyResponse_GetPurchaseStockOutQtyResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetPurchaseStockOutQtyResponse_GetPurchaseStockOutQtyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetQtyConversionRequest_GetQtyConversionRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetQtyConversionRequest_GetQtyConversionRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetQtyConversionResponse_GetQtyConversionResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetQtyConversionResponse_GetQtyConversionResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetQuotationDataRequest_GetQuotationDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetQuotationDataRequest_GetQuotationDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetQuotationDataResponse_GetQuotationDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetQuotationDataResponse_GetQuotationDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReasonCodeRequest_GetReasonCodeRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetReasonCodeRequest_GetReasonCodeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReasonCodeResponse_GetReasonCodeResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetReasonCodeResponse_GetReasonCodeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReceivingQtyRequest_GetReceivingQtyRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetReceivingQtyRequest_GetReceivingQtyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReceivingQtyResponse_GetReceivingQtyResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetReceivingQtyResponse_GetReceivingQtyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReportDataRequest_GetReportDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetReportDataRequest_GetReportDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetReportDataResponse_GetReportDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetReportDataResponse_GetReportDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSaleClassDataRequest_GetSaleClassDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSaleClassDataRequest_GetSaleClassDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSaleClassDataResponse_GetSaleClassDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSaleClassDataResponse_GetSaleClassDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings3() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesDetailDataRequest_GetSalesDetailDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSalesDetailDataRequest_GetSalesDetailDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesDetailDataResponse_GetSalesDetailDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSalesDetailDataResponse_GetSalesDetailDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesDocumentRequest_GetSalesDocumentRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSalesDocumentRequest_GetSalesDocumentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesDocumentResponse_GetSalesDocumentResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSalesDocumentResponse_GetSalesDocumentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesStatisticsDataRequest_GetSalesStatisticsDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSalesStatisticsDataRequest_GetSalesStatisticsDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSalesStatisticsDataResponse_GetSalesStatisticsDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSalesStatisticsDataResponse_GetSalesStatisticsDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetScoreRequest_GetScoreRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetScoreRequest_GetScoreRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetScoreResponse_GetScoreResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetScoreResponse_GetScoreResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShappingDataRequest_GetShappingDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetShappingDataRequest_GetShappingDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShappingDataResponse_GetShappingDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetShappingDataResponse_GetShappingDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShippingNoticeDataRequest_GetShippingNoticeDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetShippingNoticeDataRequest_GetShippingNoticeDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShippingNoticeDataResponse_GetShippingNoticeDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetShippingNoticeDataResponse_GetShippingNoticeDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShippingOrderDataRequest_GetShippingOrderDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetShippingOrderDataRequest_GetShippingOrderDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetShippingOrderDataResponse_GetShippingOrderDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetShippingOrderDataResponse_GetShippingOrderDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSODataRequest_GetSODataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSODataRequest_GetSODataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSODataResponse_GetSODataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSODataResponse_GetSODataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSOInfoDataRequest_GetSOInfoDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSOInfoDataRequest_GetSOInfoDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSOInfoDataResponse_GetSOInfoDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSOInfoDataResponse_GetSOInfoDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSOInfoDetailDataRequest_GetSOInfoDetailDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSOInfoDetailDataRequest_GetSOInfoDetailDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSOInfoDetailDataResponse_GetSOInfoDetailDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSOInfoDetailDataResponse_GetSOInfoDetailDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSSOKeyRequest_GetSSOKeyRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSSOKeyRequest_GetSSOKeyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSSOKeyResponse_GetSSOKeyResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSSOKeyResponse_GetSSOKeyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetStockDataRequest_GetStockDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetStockDataRequest_GetStockDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetStockDataResponse_GetStockDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetStockDataResponse_GetStockDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSupplierDataRequest_GetSupplierDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSupplierDataRequest_GetSupplierDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSupplierDataResponse_GetSupplierDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSupplierDataResponse_GetSupplierDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSupplierItemDataRequest_GetSupplierItemDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSupplierItemDataRequest_GetSupplierItemDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetSupplierItemDataResponse_GetSupplierItemDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetSupplierItemDataResponse_GetSupplierItemDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTableAmendmentDataRequest_GetTableAmendmentDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetTableAmendmentDataRequest_GetTableAmendmentDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTableAmendmentDataResponse_GetTableAmendmentDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetTableAmendmentDataResponse_GetTableAmendmentDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTaxTypeDataRequest_GetTaxTypeDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetTaxTypeDataRequest_GetTaxTypeDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTaxTypeDataResponse_GetTaxTypeDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetTaxTypeDataResponse_GetTaxTypeDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTradeTermDataRequest_GetTradeTermDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetTradeTermDataRequest_GetTradeTermDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTradeTermDataResponse_GetTradeTermDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetTradeTermDataResponse_GetTradeTermDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTransactionCategoryRequest_GetTransactionCategoryRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetTransactionCategoryRequest_GetTransactionCategoryRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetTransactionCategoryResponse_GetTransactionCategoryResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetTransactionCategoryResponse_GetTransactionCategoryResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUnitConversionDataRequest_GetUnitConversionDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetUnitConversionDataRequest_GetUnitConversionDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUnitConversionDataResponse_GetUnitConversionDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetUnitConversionDataResponse_GetUnitConversionDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUnitDataRequest_GetUnitDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetUnitDataRequest_GetUnitDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUnitDataResponse_GetUnitDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetUnitDataResponse_GetUnitDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUserDefOrgRequest_GetUserDefOrgRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetUserDefOrgRequest_GetUserDefOrgRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUserDefOrgResponse_GetUserDefOrgResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetUserDefOrgResponse_GetUserDefOrgResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUserTokenRequest_GetUserTokenRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetUserTokenRequest_GetUserTokenRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetUserTokenResponse_GetUserTokenResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetUserTokenResponse_GetUserTokenResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetVoucherDocumentDataRequest_GetVoucherDocumentDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetVoucherDocumentDataRequest_GetVoucherDocumentDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetVoucherDocumentDataResponse_GetVoucherDocumentDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetVoucherDocumentDataResponse_GetVoucherDocumentDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWarehouseDataRequest_GetWarehouseDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetWarehouseDataRequest_GetWarehouseDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWarehouseDataResponse_GetWarehouseDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetWarehouseDataResponse_GetWarehouseDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWODataRequest_GetWODataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetWODataRequest_GetWODataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWODataResponse_GetWODataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetWODataResponse_GetWODataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWOIssueDataRequest_GetWOIssueDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetWOIssueDataRequest_GetWOIssueDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWOIssueDataResponse_GetWOIssueDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetWOIssueDataResponse_GetWOIssueDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWorkstationDataRequest_GetWorkstationDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetWorkstationDataRequest_GetWorkstationDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWorkstationDataResponse_GetWorkstationDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetWorkstationDataResponse_GetWorkstationDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWOStockQtyRequest_GetWOStockQtyRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.GetWOStockQtyRequest_GetWOStockQtyRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "GetWOStockQtyResponse_GetWOStockQtyResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.GetWOStockQtyResponse_GetWOStockQtyResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "MemberUpgradeRequest_MemberUpgradeRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.MemberUpgradeRequest_MemberUpgradeRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "MemberUpgradeResponse_MemberUpgradeResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.MemberUpgradeResponse_MemberUpgradeResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "MergeDataRequest_MergeDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.MergeDataRequest_MergeDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "MergeDataResponse_MergeDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.MergeDataResponse_MergeDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ModPassWordRequest_ModPassWordRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.ModPassWordRequest_ModPassWordRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ModPassWordResponse_ModPassWordResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.ModPassWordResponse_ModPassWordResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "OpenDocumentRequest_OpenDocumentRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.OpenDocumentRequest_OpenDocumentRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "OpenDocumentResponse_OpenDocumentResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.OpenDocumentResponse_OpenDocumentResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "QueryDataRequest_QueryDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.QueryDataRequest_QueryDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "QueryDataResponse_QueryDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.QueryDataResponse_QueryDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RechargeCardRequest_RechargeCardRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.RechargeCardRequest_RechargeCardRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RechargeCardResponse_RechargeCardResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.RechargeCardResponse_RechargeCardResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RepairCardSaleRequest_RepairCardSaleRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.RepairCardSaleRequest_RepairCardSaleRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RepairCardSaleResponse_RepairCardSaleResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.RepairCardSaleResponse_RepairCardSaleResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnCardRequest_ReturnCardRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.ReturnCardRequest_ReturnCardRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnCardResponse_ReturnCardResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.ReturnCardResponse_ReturnCardResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnEInvoiceBooksRequest_ReturnEInvoiceBooksRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.ReturnEInvoiceBooksRequest_ReturnEInvoiceBooksRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnEInvoiceBooksResponse_ReturnEInvoiceBooksResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.ReturnEInvoiceBooksResponse_ReturnEInvoiceBooksResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnOrderBillRequest_ReturnOrderBillRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.ReturnOrderBillRequest_ReturnOrderBillRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "ReturnOrderBillResponse_ReturnOrderBillResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.ReturnOrderBillResponse_ReturnOrderBillResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RollbackBillingAPRequest_RollbackBillingAPRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.RollbackBillingAPRequest_RollbackBillingAPRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RollbackBillingAPResponse_RollbackBillingAPResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.RollbackBillingAPResponse_RollbackBillingAPResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RollbackVoucherDataRequest_RollbackVoucherDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.RollbackVoucherDataRequest_RollbackVoucherDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RollbackVoucherDataResponse_RollbackVoucherDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.RollbackVoucherDataResponse_RollbackVoucherDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RunCommandRequest_RunCommandRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.RunCommandRequest_RunCommandRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "RunCommandResponse_RunCommandResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.RunCommandResponse_RunCommandResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SelCardInfoRequest_SelCardInfoRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.SelCardInfoRequest_SelCardInfoRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SelCardInfoResponse_SelCardInfoResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.SelCardInfoResponse_SelCardInfoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SelRepairCardRequest_SelRepairCardRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.SelRepairCardRequest_SelRepairCardRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SelRepairCardResponse_SelRepairCardResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.SelRepairCardResponse_SelRepairCardResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SyncAccountDataRequest_SyncAccountDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.SyncAccountDataRequest_SyncAccountDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "SyncAccountDataResponse_SyncAccountDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.SyncAccountDataResponse_SyncAccountDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "TIPTOPGateWayRequest_TIPTOPGateWayRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.TIPTOPGateWayRequest_TIPTOPGateWayRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "TIPTOPGateWayResponse_TIPTOPGateWayResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.TIPTOPGateWayResponse_TIPTOPGateWayResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UndoCreateStockInDataRequest_UndoCreateStockInDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.UndoCreateStockInDataRequest_UndoCreateStockInDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UndoCreateStockInDataResponse_UndoCreateStockInDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.UndoCreateStockInDataResponse_UndoCreateStockInDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UndoCreateWOWorkReportDataRequest_UndoCreateWOWorkReportDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.UndoCreateWOWorkReportDataRequest_UndoCreateWOWorkReportDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UndoCreateWOWorkReportDataResponse_UndoCreateWOWorkReportDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.UndoCreateWOWorkReportDataResponse_UndoCreateWOWorkReportDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateCountingLabelDataRequest_UpdateCountingLabelDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.UpdateCountingLabelDataRequest_UpdateCountingLabelDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateCountingLabelDataResponse_UpdateCountingLabelDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.UpdateCountingLabelDataResponse_UpdateCountingLabelDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdatePOReceivingDataRequest_UpdatePOReceivingDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.UpdatePOReceivingDataRequest_UpdatePOReceivingDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdatePOReceivingDataResponse_UpdatePOReceivingDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.UpdatePOReceivingDataResponse_UpdatePOReceivingDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateStatusRequest_UpdateStatusRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.UpdateStatusRequest_UpdateStatusRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateStatusResponse_UpdateStatusResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.UpdateStatusResponse_UpdateStatusResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }
    private void addBindings4() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateWOIssueDataRequest_UpdateWOIssueDataRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.UpdateWOIssueDataRequest_UpdateWOIssueDataRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "UpdateWOIssueDataResponse_UpdateWOIssueDataResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.UpdateWOIssueDataResponse_UpdateWOIssueDataResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "WritePointRequest_WritePointRequest");
            cachedSerQNames.add(qName);
            cls = mypackage.WritePointRequest_WritePointRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "WritePointResponse_WritePointResponse");
            cachedSerQNames.add(qName);
            cls = mypackage.WritePointResponse_WritePointResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public mypackage.GetItemUnitConversionDataResponse_GetItemUnitConversionDataResponse getItemUnitConversionData(mypackage.GetItemUnitConversionDataRequest_GetItemUnitConversionDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetItemUnitConversionData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetItemUnitConversionDataResponse_GetItemUnitConversionDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetItemUnitConversionDataResponse_GetItemUnitConversionDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetItemUnitConversionDataResponse_GetItemUnitConversionDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetGoodsStockResponse_GetGoodsStockResponse getGoodsStock(mypackage.GetGoodsStockRequest_GetGoodsStockRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetGoodsStock"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetGoodsStockResponse_GetGoodsStockResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetGoodsStockResponse_GetGoodsStockResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetGoodsStockResponse_GetGoodsStockResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetSaleClassDataResponse_GetSaleClassDataResponse getSaleClassData(mypackage.GetSaleClassDataRequest_GetSaleClassDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSaleClassData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetSaleClassDataResponse_GetSaleClassDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetSaleClassDataResponse_GetSaleClassDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetSaleClassDataResponse_GetSaleClassDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetFQCMasterDataResponse_GetFQCMasterDataResponse getFQCMasterData(mypackage.GetFQCMasterDataRequest_GetFQCMasterDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetFQCMasterData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetFQCMasterDataResponse_GetFQCMasterDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetFQCMasterDataResponse_GetFQCMasterDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetFQCMasterDataResponse_GetFQCMasterDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreatePurchaseDeliveryDataResponse_CreatePurchaseDeliveryDataResponse createPurchaseDeliveryData(mypackage.CreatePurchaseDeliveryDataRequest_CreatePurchaseDeliveryDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreatePurchaseDeliveryData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreatePurchaseDeliveryDataResponse_CreatePurchaseDeliveryDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreatePurchaseDeliveryDataResponse_CreatePurchaseDeliveryDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreatePurchaseDeliveryDataResponse_CreatePurchaseDeliveryDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateReceivingInvoiceResponse_CreateReceivingInvoiceResponse createReceivingInvoice(mypackage.CreateReceivingInvoiceRequest_CreateReceivingInvoiceRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateReceivingInvoice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateReceivingInvoiceResponse_CreateReceivingInvoiceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateReceivingInvoiceResponse_CreateReceivingInvoiceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateReceivingInvoiceResponse_CreateReceivingInvoiceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateShippingOrderResponse_CreateShippingOrderResponse createShippingOrder(mypackage.CreateShippingOrderRequest_CreateShippingOrderRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateShippingOrder"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateShippingOrderResponse_CreateShippingOrderResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateShippingOrderResponse_CreateShippingOrderResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateShippingOrderResponse_CreateShippingOrderResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetReasonCodeResponse_GetReasonCodeResponse getReasonCode(mypackage.GetReasonCodeRequest_GetReasonCodeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetReasonCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetReasonCodeResponse_GetReasonCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetReasonCodeResponse_GetReasonCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetReasonCodeResponse_GetReasonCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetDocumentListResponse_GetDocumentListResponse getDocumentList(mypackage.GetDocumentListRequest_GetDocumentListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetDocumentList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetDocumentListResponse_GetDocumentListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetDocumentListResponse_GetDocumentListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetDocumentListResponse_GetDocumentListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.OpenDocumentResponse_OpenDocumentResponse openDocument(mypackage.OpenDocumentRequest_OpenDocumentRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "OpenDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.OpenDocumentResponse_OpenDocumentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.OpenDocumentResponse_OpenDocumentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.OpenDocumentResponse_OpenDocumentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.UpdatePOReceivingDataResponse_UpdatePOReceivingDataResponse updatePOReceivingData(mypackage.UpdatePOReceivingDataRequest_UpdatePOReceivingDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdatePOReceivingData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.UpdatePOReceivingDataResponse_UpdatePOReceivingDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.UpdatePOReceivingDataResponse_UpdatePOReceivingDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.UpdatePOReceivingDataResponse_UpdatePOReceivingDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CleanDocumentResponse_CleanDocumentResponse cleanDocument(mypackage.CleanDocumentRequest_CleanDocumentRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CleanDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CleanDocumentResponse_CleanDocumentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CleanDocumentResponse_CleanDocumentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CleanDocumentResponse_CleanDocumentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateSalesOrderModifyDataResponse_CreateSalesOrderModifyDataResponse createSalesOrderModifyData(mypackage.CreateSalesOrderModifyDataRequest_CreateSalesOrderModifyDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateSalesOrderModifyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateSalesOrderModifyDataResponse_CreateSalesOrderModifyDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateSalesOrderModifyDataResponse_CreateSalesOrderModifyDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateSalesOrderModifyDataResponse_CreateSalesOrderModifyDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.SelCardInfoResponse_SelCardInfoResponse selCardInfo(mypackage.SelCardInfoRequest_SelCardInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SelCardInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.SelCardInfoResponse_SelCardInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.SelCardInfoResponse_SelCardInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.SelCardInfoResponse_SelCardInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CheckDataNumExistsResponse_CheckDataNumExistsResponse checkDataNumExists(mypackage.CheckDataNumExistsRequest_CheckDataNumExistsRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckDataNumExists"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CheckDataNumExistsResponse_CheckDataNumExistsResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CheckDataNumExistsResponse_CheckDataNumExistsResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CheckDataNumExistsResponse_CheckDataNumExistsResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetAxmPriceResponse_GetAxmPriceResponse getAxmPrice(mypackage.GetAxmPriceRequest_GetAxmPriceRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAxmPrice"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetAxmPriceResponse_GetAxmPriceResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetAxmPriceResponse_GetAxmPriceResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetAxmPriceResponse_GetAxmPriceResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetPOSKeyResponse_GetPOSKeyResponse getPOSKey(mypackage.GetPOSKeyRequest_GetPOSKeyRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPOSKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetPOSKeyResponse_GetPOSKeyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetPOSKeyResponse_GetPOSKeyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetPOSKeyResponse_GetPOSKeyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.UndoCreateStockInDataResponse_UndoCreateStockInDataResponse undoCreateStockInData(mypackage.UndoCreateStockInDataRequest_UndoCreateStockInDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UndoCreateStockInData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.UndoCreateStockInDataResponse_UndoCreateStockInDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.UndoCreateStockInDataResponse_UndoCreateStockInDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.UndoCreateStockInDataResponse_UndoCreateStockInDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.UndoCreateWOWorkReportDataResponse_UndoCreateWOWorkReportDataResponse undoCreateWOWorkReportData(mypackage.UndoCreateWOWorkReportDataRequest_UndoCreateWOWorkReportDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UndoCreateWOWorkReportData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.UndoCreateWOWorkReportDataResponse_UndoCreateWOWorkReportDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.UndoCreateWOWorkReportDataResponse_UndoCreateWOWorkReportDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.UndoCreateWOWorkReportDataResponse_UndoCreateWOWorkReportDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetCostGroupDataResponse_GetCostGroupDataResponse getCostGroupData(mypackage.GetCostGroupDataRequest_GetCostGroupDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCostGroupData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetCostGroupDataResponse_GetCostGroupDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetCostGroupDataResponse_GetCostGroupDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetCostGroupDataResponse_GetCostGroupDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateSalesOrderDataResponse_CreateSalesOrderDataResponse createSalesOrderData(mypackage.CreateSalesOrderDataRequest_CreateSalesOrderDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateSalesOrderData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateSalesOrderDataResponse_CreateSalesOrderDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateSalesOrderDataResponse_CreateSalesOrderDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateSalesOrderDataResponse_CreateSalesOrderDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetWOIssueDataResponse_GetWOIssueDataResponse getWOIssueData(mypackage.GetWOIssueDataRequest_GetWOIssueDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetWOIssueData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetWOIssueDataResponse_GetWOIssueDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetWOIssueDataResponse_GetWOIssueDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetWOIssueDataResponse_GetWOIssueDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.UpdateWOIssueDataResponse_UpdateWOIssueDataResponse updateWOIssueData(mypackage.UpdateWOIssueDataRequest_UpdateWOIssueDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateWOIssueData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.UpdateWOIssueDataResponse_UpdateWOIssueDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.UpdateWOIssueDataResponse_UpdateWOIssueDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.UpdateWOIssueDataResponse_UpdateWOIssueDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetCountryDataResponse_GetCountryDataResponse getCountryData(mypackage.GetCountryDataRequest_GetCountryDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCountryData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetCountryDataResponse_GetCountryDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetCountryDataResponse_GetCountryDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetCountryDataResponse_GetCountryDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetCountryListResponse_GetCountryListResponse getCountryList(mypackage.GetCountryListRequest_GetCountryListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCountryList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetCountryListResponse_GetCountryListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetCountryListResponse_GetCountryListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetCountryListResponse_GetCountryListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetCurrencyDataResponse_GetCurrencyDataResponse getCurrencyData(mypackage.GetCurrencyDataRequest_GetCurrencyDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCurrencyData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetCurrencyDataResponse_GetCurrencyDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetCurrencyDataResponse_GetCurrencyDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetCurrencyDataResponse_GetCurrencyDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetCurrencyListResponse_GetCurrencyListResponse getCurrencyList(mypackage.GetCurrencyListRequest_GetCurrencyListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCurrencyList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetCurrencyListResponse_GetCurrencyListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetCurrencyListResponse_GetCurrencyListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetCurrencyListResponse_GetCurrencyListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetCustListResponse_GetCustListResponse getCustList(mypackage.GetCustListRequest_GetCustListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCustList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetCustListResponse_GetCustListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetCustListResponse_GetCustListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetCustListResponse_GetCustListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetCustomerDataResponse_GetCustomerDataResponse getCustomerData(mypackage.GetCustomerDataRequest_GetCustomerDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCustomerData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetCustomerDataResponse_GetCustomerDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetCustomerDataResponse_GetCustomerDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetCustomerDataResponse_GetCustomerDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetCustomerProductDataResponse_GetCustomerProductDataResponse getCustomerProductData(mypackage.GetCustomerProductDataRequest_GetCustomerProductDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCustomerProductData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetCustomerProductDataResponse_GetCustomerProductDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetCustomerProductDataResponse_GetCustomerProductDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetCustomerProductDataResponse_GetCustomerProductDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetDepartmentDataResponse_GetDepartmentDataResponse getDepartmentData(mypackage.GetDepartmentDataRequest_GetDepartmentDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetDepartmentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetDepartmentDataResponse_GetDepartmentDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetDepartmentDataResponse_GetDepartmentDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetDepartmentDataResponse_GetDepartmentDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetDepartmentListResponse_GetDepartmentListResponse getDepartmentList(mypackage.GetDepartmentListRequest_GetDepartmentListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetDepartmentList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetDepartmentListResponse_GetDepartmentListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetDepartmentListResponse_GetDepartmentListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetDepartmentListResponse_GetDepartmentListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetPOReceivingOutDataResponse_GetPOReceivingOutDataResponse getPOReceivingOutData(mypackage.GetPOReceivingOutDataRequest_GetPOReceivingOutDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPOReceivingOutData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetPOReceivingOutDataResponse_GetPOReceivingOutDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetPOReceivingOutDataResponse_GetPOReceivingOutDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetPOReceivingOutDataResponse_GetPOReceivingOutDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetEmployeeDataResponse_GetEmployeeDataResponse getEmployeeData(mypackage.GetEmployeeDataRequest_GetEmployeeDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetEmployeeData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetEmployeeDataResponse_GetEmployeeDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetEmployeeDataResponse_GetEmployeeDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetEmployeeDataResponse_GetEmployeeDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetEmployeeListResponse_GetEmployeeListResponse getEmployeeList(mypackage.GetEmployeeListRequest_GetEmployeeListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetEmployeeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetEmployeeListResponse_GetEmployeeListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetEmployeeListResponse_GetEmployeeListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetEmployeeListResponse_GetEmployeeListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetInspectionDataResponse_GetInspectionDataResponse getInspectionData(mypackage.GetInspectionDataRequest_GetInspectionDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetInspectionData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetInspectionDataResponse_GetInspectionDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetInspectionDataResponse_GetInspectionDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetInspectionDataResponse_GetInspectionDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreatePurchaseStockOutResponse_CreatePurchaseStockOutResponse createPurchaseStockOut(mypackage.CreatePurchaseStockOutRequest_CreatePurchaseStockOutRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreatePurchaseStockOut"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreatePurchaseStockOutResponse_CreatePurchaseStockOutResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreatePurchaseStockOutResponse_CreatePurchaseStockOutResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreatePurchaseStockOutResponse_CreatePurchaseStockOutResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetItemListResponse_GetItemListResponse getItemList(mypackage.GetItemListRequest_GetItemListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetItemList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetItemListResponse_GetItemListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetItemListResponse_GetItemListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetItemListResponse_GetItemListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetLocationDataResponse_GetLocationDataResponse getLocationData(mypackage.GetLocationDataRequest_GetLocationDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetLocationData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetLocationDataResponse_GetLocationDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetLocationDataResponse_GetLocationDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetLocationDataResponse_GetLocationDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetMonthListResponse_GetMonthListResponse getMonthList(mypackage.GetMonthListRequest_GetMonthListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetMonthList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetMonthListResponse_GetMonthListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetMonthListResponse_GetMonthListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetMonthListResponse_GetMonthListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetOperationDataResponse_GetOperationDataResponse getOperationData(mypackage.GetOperationDataRequest_GetOperationDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetOperationData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetOperationDataResponse_GetOperationDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetOperationDataResponse_GetOperationDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetOperationDataResponse_GetOperationDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetOverdueAmtDetailDataResponse_GetOverdueAmtDetailDataResponse getOverdueAmtDetailData(mypackage.GetOverdueAmtDetailDataRequest_GetOverdueAmtDetailDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetOverdueAmtDetailData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetOverdueAmtDetailDataResponse_GetOverdueAmtDetailDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetOverdueAmtDetailDataResponse_GetOverdueAmtDetailDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetOverdueAmtDetailDataResponse_GetOverdueAmtDetailDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetOverdueAmtRankingDataResponse_GetOverdueAmtRankingDataResponse getOverdueAmtRankingData(mypackage.GetOverdueAmtRankingDataRequest_GetOverdueAmtRankingDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetOverdueAmtRankingData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetOverdueAmtRankingDataResponse_GetOverdueAmtRankingDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetOverdueAmtRankingDataResponse_GetOverdueAmtRankingDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetOverdueAmtRankingDataResponse_GetOverdueAmtRankingDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetProdClassListResponse_GetProdClassListResponse getProdClassList(mypackage.GetProdClassListRequest_GetProdClassListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetProdClassList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetProdClassListResponse_GetProdClassListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetProdClassListResponse_GetProdClassListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetProdClassListResponse_GetProdClassListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetProductClassDataResponse_GetProductClassDataResponse getProductClassData(mypackage.GetProductClassDataRequest_GetProductClassDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetProductClassData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetProductClassDataResponse_GetProductClassDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetProductClassDataResponse_GetProductClassDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetProductClassDataResponse_GetProductClassDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetSOInfoDataResponse_GetSOInfoDataResponse getSOInfoData(mypackage.GetSOInfoDataRequest_GetSOInfoDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSOInfoData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetSOInfoDataResponse_GetSOInfoDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetSOInfoDataResponse_GetSOInfoDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetSOInfoDataResponse_GetSOInfoDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetSOInfoDetailDataResponse_GetSOInfoDetailDataResponse getSOInfoDetailData(mypackage.GetSOInfoDetailDataRequest_GetSOInfoDetailDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSOInfoDetailData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetSOInfoDetailDataResponse_GetSOInfoDetailDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetSOInfoDetailDataResponse_GetSOInfoDetailDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetSOInfoDetailDataResponse_GetSOInfoDetailDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetSalesDetailDataResponse_GetSalesDetailDataResponse getSalesDetailData(mypackage.GetSalesDetailDataRequest_GetSalesDetailDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSalesDetailData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetSalesDetailDataResponse_GetSalesDetailDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetSalesDetailDataResponse_GetSalesDetailDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetSalesDetailDataResponse_GetSalesDetailDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetSalesStatisticsDataResponse_GetSalesStatisticsDataResponse getSalesStatisticsData(mypackage.GetSalesStatisticsDataRequest_GetSalesStatisticsDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSalesStatisticsData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetSalesStatisticsDataResponse_GetSalesStatisticsDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetSalesStatisticsDataResponse_GetSalesStatisticsDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetSalesStatisticsDataResponse_GetSalesStatisticsDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetSupplierDataResponse_GetSupplierDataResponse getSupplierData(mypackage.GetSupplierDataRequest_GetSupplierDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSupplierData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetSupplierDataResponse_GetSupplierDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetSupplierDataResponse_GetSupplierDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetSupplierDataResponse_GetSupplierDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetSupplierItemDataResponse_GetSupplierItemDataResponse getSupplierItemData(mypackage.GetSupplierItemDataRequest_GetSupplierItemDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSupplierItemData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetSupplierItemDataResponse_GetSupplierItemDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetSupplierItemDataResponse_GetSupplierItemDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetSupplierItemDataResponse_GetSupplierItemDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetWarehouseDataResponse_GetWarehouseDataResponse getWarehouseData(mypackage.GetWarehouseDataRequest_GetWarehouseDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetWarehouseData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetWarehouseDataResponse_GetWarehouseDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetWarehouseDataResponse_GetWarehouseDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetWarehouseDataResponse_GetWarehouseDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetItemDataResponse_GetItemDataResponse getItemData(mypackage.GetItemDataRequest_GetItemDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetItemData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetItemDataResponse_GetItemDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetItemDataResponse_GetItemDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetItemDataResponse_GetItemDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetBOMDataResponse_GetBOMDataResponse getBOMData(mypackage.GetBOMDataRequest_GetBOMDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBOMData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetBOMDataResponse_GetBOMDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetBOMDataResponse_GetBOMDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetBOMDataResponse_GetBOMDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetDocumentNumberResponse_GetDocumentNumberResponse getDocumentNumber(mypackage.GetDocumentNumberRequest_GetDocumentNumberRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetDocumentNumber"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetDocumentNumberResponse_GetDocumentNumberResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetDocumentNumberResponse_GetDocumentNumberResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetDocumentNumberResponse_GetDocumentNumberResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateQuotationDataResponse_CreateQuotationDataResponse createQuotationData(mypackage.CreateQuotationDataRequest_CreateQuotationDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateQuotationData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateQuotationDataResponse_CreateQuotationDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateQuotationDataResponse_CreateQuotationDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateQuotationDataResponse_CreateQuotationDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetStockDataResponse_GetStockDataResponse getStockData(mypackage.GetStockDataRequest_GetStockDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetStockData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetStockDataResponse_GetStockDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetStockDataResponse_GetStockDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetStockDataResponse_GetStockDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetReceivingQtyResponse_GetReceivingQtyResponse getReceivingQty(mypackage.GetReceivingQtyRequest_GetReceivingQtyRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetReceivingQty"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetReceivingQtyResponse_GetReceivingQtyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetReceivingQtyResponse_GetReceivingQtyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetReceivingQtyResponse_GetReceivingQtyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetPODataResponse_GetPODataResponse getPOData(mypackage.GetPODataRequest_GetPODataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPOData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetPODataResponse_GetPODataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetPODataResponse_GetPODataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetPODataResponse_GetPODataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetMFGDocumentResponse_GetMFGDocumentResponse getMFGDocument(mypackage.GetMFGDocumentRequest_GetMFGDocumentRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetMFGDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetMFGDocumentResponse_GetMFGDocumentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetMFGDocumentResponse_GetMFGDocumentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetMFGDocumentResponse_GetMFGDocumentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreatePOReceivingDataResponse_CreatePOReceivingDataResponse createPOReceivingData(mypackage.CreatePOReceivingDataRequest_CreatePOReceivingDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreatePOReceivingData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreatePOReceivingDataResponse_CreatePOReceivingDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreatePOReceivingDataResponse_CreatePOReceivingDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreatePOReceivingDataResponse_CreatePOReceivingDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateIssueReturnDataResponse_CreateIssueReturnDataResponse createIssueReturnData(mypackage.CreateIssueReturnDataRequest_CreateIssueReturnDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateIssueReturnData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateIssueReturnDataResponse_CreateIssueReturnDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateIssueReturnDataResponse_CreateIssueReturnDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateIssueReturnDataResponse_CreateIssueReturnDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetPOReceivingInDataResponse_GetPOReceivingInDataResponse getPOReceivingInData(mypackage.GetPOReceivingInDataRequest_GetPOReceivingInDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPOReceivingInData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetPOReceivingInDataResponse_GetPOReceivingInDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetPOReceivingInDataResponse_GetPOReceivingInDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetPOReceivingInDataResponse_GetPOReceivingInDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateStockInDataResponse_CreateStockInDataResponse createStockInData(mypackage.CreateStockInDataRequest_CreateStockInDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateStockInData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateStockInDataResponse_CreateStockInDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateStockInDataResponse_CreateStockInDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateStockInDataResponse_CreateStockInDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetAccountSubjectDataResponse_GetAccountSubjectDataResponse getAccountSubjectData(mypackage.GetAccountSubjectDataRequest_GetAccountSubjectDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAccountSubjectData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetAccountSubjectDataResponse_GetAccountSubjectDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetAccountSubjectDataResponse_GetAccountSubjectDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetAccountSubjectDataResponse_GetAccountSubjectDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreatePurchaseStockInResponse_CreatePurchaseStockInResponse createPurchaseStockIn(mypackage.CreatePurchaseStockInRequest_CreatePurchaseStockInRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreatePurchaseStockIn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreatePurchaseStockInResponse_CreatePurchaseStockInResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreatePurchaseStockInResponse_CreatePurchaseStockInResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreatePurchaseStockInResponse_CreatePurchaseStockInResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetPurchaseStockOutQtyResponse_GetPurchaseStockOutQtyResponse getPurchaseStockOutQty(mypackage.GetPurchaseStockOutQtyRequest_GetPurchaseStockOutQtyRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPurchaseStockOutQty"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetPurchaseStockOutQtyResponse_GetPurchaseStockOutQtyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetPurchaseStockOutQtyResponse_GetPurchaseStockOutQtyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetPurchaseStockOutQtyResponse_GetPurchaseStockOutQtyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateTransferNoteResponse_CreateTransferNoteResponse createTransferNote(mypackage.CreateTransferNoteRequest_CreateTransferNoteRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateTransferNote"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateTransferNoteResponse_CreateTransferNoteResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateTransferNoteResponse_CreateTransferNoteResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateTransferNoteResponse_CreateTransferNoteResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetQtyConversionResponse_GetQtyConversionResponse getQtyConversion(mypackage.GetQtyConversionRequest_GetQtyConversionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetQtyConversion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetQtyConversionResponse_GetQtyConversionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetQtyConversionResponse_GetQtyConversionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetQtyConversionResponse_GetQtyConversionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetShippingNoticeDataResponse_GetShippingNoticeDataResponse getShippingNoticeData(mypackage.GetShippingNoticeDataRequest_GetShippingNoticeDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetShippingNoticeData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetShippingNoticeDataResponse_GetShippingNoticeDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetShippingNoticeDataResponse_GetShippingNoticeDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetShippingNoticeDataResponse_GetShippingNoticeDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetSalesDocumentResponse_GetSalesDocumentResponse getSalesDocument(mypackage.GetSalesDocumentRequest_GetSalesDocumentRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSalesDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetSalesDocumentResponse_GetSalesDocumentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetSalesDocumentResponse_GetSalesDocumentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetSalesDocumentResponse_GetSalesDocumentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetShippingOrderDataResponse_GetShippingOrderDataResponse getShippingOrderData(mypackage.GetShippingOrderDataRequest_GetShippingOrderDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetShippingOrderData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetShippingOrderDataResponse_GetShippingOrderDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetShippingOrderDataResponse_GetShippingOrderDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetShippingOrderDataResponse_GetShippingOrderDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetFQCDataResponse_GetFQCDataResponse getFQCData(mypackage.GetFQCDataRequest_GetFQCDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetFQCData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetFQCDataResponse_GetFQCDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetFQCDataResponse_GetFQCDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetFQCDataResponse_GetFQCDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetWODataResponse_GetWODataResponse getWOData(mypackage.GetWODataRequest_GetWODataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetWOData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetWODataResponse_GetWODataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetWODataResponse_GetWODataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetWODataResponse_GetWODataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetWOStockQtyResponse_GetWOStockQtyResponse getWOStockQty(mypackage.GetWOStockQtyRequest_GetWOStockQtyRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetWOStockQty"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetWOStockQtyResponse_GetWOStockQtyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetWOStockQtyResponse_GetWOStockQtyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetWOStockQtyResponse_GetWOStockQtyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateWOStockinDataResponse_CreateWOStockinDataResponse createWOStockinData(mypackage.CreateWOStockinDataRequest_CreateWOStockinDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateWOStockinData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateWOStockinDataResponse_CreateWOStockinDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateWOStockinDataResponse_CreateWOStockinDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateWOStockinDataResponse_CreateWOStockinDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetJointProductDataResponse_GetJointProductDataResponse getJointProductData(mypackage.GetJointProductDataRequest_GetJointProductDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetJointProductData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetJointProductDataResponse_GetJointProductDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetJointProductDataResponse_GetJointProductDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetJointProductDataResponse_GetJointProductDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetMoMasterDataResponse_GetMoMasterDataResponse getMoMasterData(mypackage.GetMoMasterDataRequest_GetMoMasterDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetMoMasterData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetMoMasterDataResponse_GetMoMasterDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetMoMasterDataResponse_GetMoMasterDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetMoMasterDataResponse_GetMoMasterDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetLabelTypeDataResponse_GetLabelTypeDataResponse getLabelTypeData(mypackage.GetLabelTypeDataRequest_GetLabelTypeDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetLabelTypeData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetLabelTypeDataResponse_GetLabelTypeDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetLabelTypeDataResponse_GetLabelTypeDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetLabelTypeDataResponse_GetLabelTypeDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetCountingLabelDataResponse_GetCountingLabelDataResponse getCountingLabelData(mypackage.GetCountingLabelDataRequest_GetCountingLabelDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCountingLabelData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetCountingLabelDataResponse_GetCountingLabelDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetCountingLabelDataResponse_GetCountingLabelDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetCountingLabelDataResponse_GetCountingLabelDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.UpdateCountingLabelDataResponse_UpdateCountingLabelDataResponse updateCountingLabelData(mypackage.UpdateCountingLabelDataRequest_UpdateCountingLabelDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateCountingLabelData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.UpdateCountingLabelDataResponse_UpdateCountingLabelDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.UpdateCountingLabelDataResponse_UpdateCountingLabelDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.UpdateCountingLabelDataResponse_UpdateCountingLabelDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateMISCIssueDataResponse_CreateMISCIssueDataResponse createMISCIssueData(mypackage.CreateMISCIssueDataRequest_CreateMISCIssueDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateMISCIssueData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateMISCIssueDataResponse_CreateMISCIssueDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateMISCIssueDataResponse_CreateMISCIssueDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateMISCIssueDataResponse_CreateMISCIssueDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CheckExecAuthorizationResponse_CheckExecAuthorizationResponse checkExecAuthorization(mypackage.CheckExecAuthorizationRequest_CheckExecAuthorizationRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckExecAuthorization"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CheckExecAuthorizationResponse_CheckExecAuthorizationResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CheckExecAuthorizationResponse_CheckExecAuthorizationResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CheckExecAuthorizationResponse_CheckExecAuthorizationResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateStockDataResponse_CreateStockDataResponse createStockData(mypackage.CreateStockDataRequest_CreateStockDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateStockData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateStockDataResponse_CreateStockDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateStockDataResponse_CreateStockDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateStockDataResponse_CreateStockDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.EboGetCustDataResponse_EboGetCustDataResponse eboGetCustData(mypackage.EboGetCustDataRequest_EboGetCustDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "EboGetCustData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.EboGetCustDataResponse_EboGetCustDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.EboGetCustDataResponse_EboGetCustDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.EboGetCustDataResponse_EboGetCustDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.EboGetProdDataResponse_EboGetProdDataResponse eboGetProdData(mypackage.EboGetProdDataRequest_EboGetProdDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "EboGetProdData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.EboGetProdDataResponse_EboGetProdDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.EboGetProdDataResponse_EboGetProdDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.EboGetProdDataResponse_EboGetProdDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.EboGetOrderDataResponse_EboGetOrderDataResponse eboGetOrderData(mypackage.EboGetOrderDataRequest_EboGetOrderDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "EboGetOrderData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.EboGetOrderDataResponse_EboGetOrderDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.EboGetOrderDataResponse_EboGetOrderDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.EboGetOrderDataResponse_EboGetOrderDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.RunCommandResponse_RunCommandResponse runCommand(mypackage.RunCommandRequest_RunCommandRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RunCommand"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.RunCommandResponse_RunCommandResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.RunCommandResponse_RunCommandResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.RunCommandResponse_RunCommandResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CheckApsExecutionResponse_CheckApsExecutionResponse checkApsExecution(mypackage.CheckApsExecutionRequest_CheckApsExecutionRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckApsExecution"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CheckApsExecutionResponse_CheckApsExecutionResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CheckApsExecutionResponse_CheckApsExecutionResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CheckApsExecutionResponse_CheckApsExecutionResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetOrganizationListResponse_GetOrganizationListResponse getOrganizationList(mypackage.GetOrganizationListRequest_GetOrganizationListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetOrganizationList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetOrganizationListResponse_GetOrganizationListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetOrganizationListResponse_GetOrganizationListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetOrganizationListResponse_GetOrganizationListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetUserTokenResponse_GetUserTokenResponse getUserToken(mypackage.GetUserTokenRequest_GetUserTokenRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetUserToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetUserTokenResponse_GetUserTokenResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetUserTokenResponse_GetUserTokenResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetUserTokenResponse_GetUserTokenResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CheckUserAuthResponse_CheckUserAuthResponse checkUserAuth(mypackage.CheckUserAuthRequest_CheckUserAuthRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckUserAuth"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CheckUserAuthResponse_CheckUserAuthResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CheckUserAuthResponse_CheckUserAuthResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CheckUserAuthResponse_CheckUserAuthResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetMenuDataResponse_GetMenuDataResponse getMenuData(mypackage.GetMenuDataRequest_GetMenuDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetMenuData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetMenuDataResponse_GetMenuDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetMenuDataResponse_GetMenuDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetMenuDataResponse_GetMenuDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateVendorDataResponse_CreateVendorDataResponse createVendorData(mypackage.CreateVendorDataRequest_CreateVendorDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateVendorData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateVendorDataResponse_CreateVendorDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateVendorDataResponse_CreateVendorDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateVendorDataResponse_CreateVendorDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateBOMMasterDataResponse_CreateBOMMasterDataResponse createBOMMasterData(mypackage.CreateBOMMasterDataRequest_CreateBOMMasterDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateBOMMasterData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateBOMMasterDataResponse_CreateBOMMasterDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateBOMMasterDataResponse_CreateBOMMasterDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateBOMMasterDataResponse_CreateBOMMasterDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateBOMDetailDataResponse_CreateBOMDetailDataResponse createBOMDetailData(mypackage.CreateBOMDetailDataRequest_CreateBOMDetailDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateBOMDetailData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateBOMDetailDataResponse_CreateBOMDetailDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateBOMDetailDataResponse_CreateBOMDetailDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateBOMDetailDataResponse_CreateBOMDetailDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateVoucherDataResponse_CreateVoucherDataResponse createVoucherData(mypackage.CreateVoucherDataRequest_CreateVoucherDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateVoucherData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateVoucherDataResponse_CreateVoucherDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateVoucherDataResponse_CreateVoucherDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateVoucherDataResponse_CreateVoucherDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetAccountDataResponse_GetAccountDataResponse getAccountData(mypackage.GetAccountDataRequest_GetAccountDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAccountData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetAccountDataResponse_GetAccountDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetAccountDataResponse_GetAccountDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetAccountDataResponse_GetAccountDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateCustomerDataResponse_CreateCustomerDataResponse createCustomerData(mypackage.CreateCustomerDataRequest_CreateCustomerDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateCustomerData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateCustomerDataResponse_CreateCustomerDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateCustomerDataResponse_CreateCustomerDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateCustomerDataResponse_CreateCustomerDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateItemMasterDataResponse_CreateItemMasterDataResponse createItemMasterData(mypackage.CreateItemMasterDataRequest_CreateItemMasterDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateItemMasterData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateItemMasterDataResponse_CreateItemMasterDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateItemMasterDataResponse_CreateItemMasterDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateItemMasterDataResponse_CreateItemMasterDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateEmployeeDataResponse_CreateEmployeeDataResponse createEmployeeData(mypackage.CreateEmployeeDataRequest_CreateEmployeeDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateEmployeeData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateEmployeeDataResponse_CreateEmployeeDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateEmployeeDataResponse_CreateEmployeeDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateEmployeeDataResponse_CreateEmployeeDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateAddressDataResponse_CreateAddressDataResponse createAddressData(mypackage.CreateAddressDataRequest_CreateAddressDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateAddressData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateAddressDataResponse_CreateAddressDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateAddressDataResponse_CreateAddressDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateAddressDataResponse_CreateAddressDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.TIPTOPGateWayResponse_TIPTOPGateWayResponse TIPTOPGateWay(mypackage.TIPTOPGateWayRequest_TIPTOPGateWayRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "TIPTOPGateWay"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.TIPTOPGateWayResponse_TIPTOPGateWayResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.TIPTOPGateWayResponse_TIPTOPGateWayResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.TIPTOPGateWayResponse_TIPTOPGateWayResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateBillingAPResponse_CreateBillingAPResponse createBillingAP(mypackage.CreateBillingAPRequest_CreateBillingAPRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateBillingAP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateBillingAPResponse_CreateBillingAPResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateBillingAPResponse_CreateBillingAPResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateBillingAPResponse_CreateBillingAPResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateCustomerOtheraddressDataResponse_CreateCustomerOtheraddressDataResponse createCustomerOtheraddressData(mypackage.CreateCustomerOtheraddressDataRequest_CreateCustomerOtheraddressDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateCustomerOtheraddressData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateCustomerOtheraddressDataResponse_CreateCustomerOtheraddressDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateCustomerOtheraddressDataResponse_CreateCustomerOtheraddressDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateCustomerOtheraddressDataResponse_CreateCustomerOtheraddressDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreatePotentialCustomerDataResponse_CreatePotentialCustomerDataResponse createPotentialCustomerData(mypackage.CreatePotentialCustomerDataRequest_CreatePotentialCustomerDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreatePotentialCustomerData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreatePotentialCustomerDataResponse_CreatePotentialCustomerDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreatePotentialCustomerDataResponse_CreatePotentialCustomerDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreatePotentialCustomerDataResponse_CreatePotentialCustomerDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetCustomerContactDataResponse_GetCustomerContactDataResponse getCustomerContactData(mypackage.GetCustomerContactDataRequest_GetCustomerContactDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCustomerContactData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetCustomerContactDataResponse_GetCustomerContactDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetCustomerContactDataResponse_GetCustomerContactDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetCustomerContactDataResponse_GetCustomerContactDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetCustomerOtheraddressDataResponse_GetCustomerOtheraddressDataResponse getCustomerOtheraddressData(mypackage.GetCustomerOtheraddressDataRequest_GetCustomerOtheraddressDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCustomerOtheraddressData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetCustomerOtheraddressDataResponse_GetCustomerOtheraddressDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetCustomerOtheraddressDataResponse_GetCustomerOtheraddressDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetCustomerOtheraddressDataResponse_GetCustomerOtheraddressDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetItemStockListResponse_GetItemStockListResponse getItemStockList(mypackage.GetItemStockListRequest_GetItemStockListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetItemStockList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetItemStockListResponse_GetItemStockListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetItemStockListResponse_GetItemStockListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetItemStockListResponse_GetItemStockListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetMFGSettingSmaDataResponse_GetMFGSettingSmaDataResponse getMFGSettingSmaData(mypackage.GetMFGSettingSmaDataRequest_GetMFGSettingSmaDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetMFGSettingSmaData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetMFGSettingSmaDataResponse_GetMFGSettingSmaDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetMFGSettingSmaDataResponse_GetMFGSettingSmaDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetMFGSettingSmaDataResponse_GetMFGSettingSmaDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetPackingMethodDataResponse_GetPackingMethodDataResponse getPackingMethodData(mypackage.GetPackingMethodDataRequest_GetPackingMethodDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPackingMethodData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetPackingMethodDataResponse_GetPackingMethodDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetPackingMethodDataResponse_GetPackingMethodDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetPackingMethodDataResponse_GetPackingMethodDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetPotentialCustomerDataResponse_GetPotentialCustomerDataResponse getPotentialCustomerData(mypackage.GetPotentialCustomerDataRequest_GetPotentialCustomerDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPotentialCustomerData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetPotentialCustomerDataResponse_GetPotentialCustomerDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetPotentialCustomerDataResponse_GetPotentialCustomerDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetPotentialCustomerDataResponse_GetPotentialCustomerDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetTableAmendmentDataResponse_GetTableAmendmentDataResponse getTableAmendmentData(mypackage.GetTableAmendmentDataRequest_GetTableAmendmentDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetTableAmendmentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetTableAmendmentDataResponse_GetTableAmendmentDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetTableAmendmentDataResponse_GetTableAmendmentDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetTableAmendmentDataResponse_GetTableAmendmentDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetTaxTypeDataResponse_GetTaxTypeDataResponse getTaxTypeData(mypackage.GetTaxTypeDataRequest_GetTaxTypeDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetTaxTypeData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetTaxTypeDataResponse_GetTaxTypeDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetTaxTypeDataResponse_GetTaxTypeDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetTaxTypeDataResponse_GetTaxTypeDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetUnitConversionDataResponse_GetUnitConversionDataResponse getUnitConversionData(mypackage.GetUnitConversionDataRequest_GetUnitConversionDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetUnitConversionData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetUnitConversionDataResponse_GetUnitConversionDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetUnitConversionDataResponse_GetUnitConversionDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetUnitConversionDataResponse_GetUnitConversionDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetUnitDataResponse_GetUnitDataResponse getUnitData(mypackage.GetUnitDataRequest_GetUnitDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetUnitData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetUnitDataResponse_GetUnitDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetUnitDataResponse_GetUnitDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetUnitDataResponse_GetUnitDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetReportDataResponse_GetReportDataResponse getReportData(mypackage.GetReportDataRequest_GetReportDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetReportData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetReportDataResponse_GetReportDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetReportDataResponse_GetReportDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetReportDataResponse_GetReportDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CRMGetCustomerDataResponse_CRMGetCustomerDataResponse CRMGetCustomerData(mypackage.CRMGetCustomerDataRequest_CRMGetCustomerDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CRMGetCustomerData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CRMGetCustomerDataResponse_CRMGetCustomerDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CRMGetCustomerDataResponse_CRMGetCustomerDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CRMGetCustomerDataResponse_CRMGetCustomerDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateCustomerContactDataResponse_CreateCustomerContactDataResponse createCustomerContactData(mypackage.CreateCustomerContactDataRequest_CreateCustomerContactDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateCustomerContactData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateCustomerContactDataResponse_CreateCustomerContactDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateCustomerContactDataResponse_CreateCustomerContactDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateCustomerContactDataResponse_CreateCustomerContactDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateDepartmentDataResponse_CreateDepartmentDataResponse createDepartmentData(mypackage.CreateDepartmentDataRequest_CreateDepartmentDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateDepartmentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateDepartmentDataResponse_CreateDepartmentDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateDepartmentDataResponse_CreateDepartmentDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateDepartmentDataResponse_CreateDepartmentDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetAccountTypeDataResponse_GetAccountTypeDataResponse getAccountTypeData(mypackage.GetAccountTypeDataRequest_GetAccountTypeDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAccountTypeData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetAccountTypeDataResponse_GetAccountTypeDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetAccountTypeDataResponse_GetAccountTypeDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetAccountTypeDataResponse_GetAccountTypeDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetTransactionCategoryResponse_GetTransactionCategoryResponse getTransactionCategory(mypackage.GetTransactionCategoryRequest_GetTransactionCategoryRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetTransactionCategory"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetTransactionCategoryResponse_GetTransactionCategoryResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetTransactionCategoryResponse_GetTransactionCategoryResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetTransactionCategoryResponse_GetTransactionCategoryResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetVoucherDocumentDataResponse_GetVoucherDocumentDataResponse getVoucherDocumentData(mypackage.GetVoucherDocumentDataRequest_GetVoucherDocumentDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetVoucherDocumentData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetVoucherDocumentDataResponse_GetVoucherDocumentDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetVoucherDocumentDataResponse_GetVoucherDocumentDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetVoucherDocumentDataResponse_GetVoucherDocumentDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.RollbackVoucherDataResponse_RollbackVoucherDataResponse rollbackVoucherData(mypackage.RollbackVoucherDataRequest_RollbackVoucherDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RollbackVoucherData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.RollbackVoucherDataResponse_RollbackVoucherDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.RollbackVoucherDataResponse_RollbackVoucherDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.RollbackVoucherDataResponse_RollbackVoucherDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetCardDetailDataResponse_GetCardDetailDataResponse getCardDetailData(mypackage.GetCardDetailDataRequest_GetCardDetailDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCardDetailData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetCardDetailDataResponse_GetCardDetailDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetCardDetailDataResponse_GetCardDetailDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetCardDetailDataResponse_GetCardDetailDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetOnlineUserResponse_GetOnlineUserResponse getOnlineUser(mypackage.GetOnlineUserRequest_GetOnlineUserRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetOnlineUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetOnlineUserResponse_GetOnlineUserResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetOnlineUserResponse_GetOnlineUserResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetOnlineUserResponse_GetOnlineUserResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetProdInfoResponse_GetProdInfoResponse getProdInfo(mypackage.GetProdInfoRequest_GetProdInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetProdInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetProdInfoResponse_GetProdInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetProdInfoResponse_GetProdInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetProdInfoResponse_GetProdInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetMemberDataResponse_GetMemberDataResponse getMemberData(mypackage.GetMemberDataRequest_GetMemberDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetMemberData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetMemberDataResponse_GetMemberDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetMemberDataResponse_GetMemberDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetMemberDataResponse_GetMemberDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetMachineDataResponse_GetMachineDataResponse getMachineData(mypackage.GetMachineDataRequest_GetMachineDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetMachineData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetMachineDataResponse_GetMachineDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetMachineDataResponse_GetMachineDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetMachineDataResponse_GetMachineDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetProdRoutingDataResponse_GetProdRoutingDataResponse getProdRoutingData(mypackage.GetProdRoutingDataRequest_GetProdRoutingDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetProdRoutingData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetProdRoutingDataResponse_GetProdRoutingDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetProdRoutingDataResponse_GetProdRoutingDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetProdRoutingDataResponse_GetProdRoutingDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetWorkstationDataResponse_GetWorkstationDataResponse getWorkstationData(mypackage.GetWorkstationDataRequest_GetWorkstationDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetWorkstationData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetWorkstationDataResponse_GetWorkstationDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetWorkstationDataResponse_GetWorkstationDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetWorkstationDataResponse_GetWorkstationDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateRepSubPBOMDataResponse_CreateRepSubPBOMDataResponse createRepSubPBOMData(mypackage.CreateRepSubPBOMDataRequest_CreateRepSubPBOMDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateRepSubPBOMData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateRepSubPBOMDataResponse_CreateRepSubPBOMDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateRepSubPBOMDataResponse_CreateRepSubPBOMDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateRepSubPBOMDataResponse_CreateRepSubPBOMDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetBrandDataResponse_GetBrandDataResponse getBrandData(mypackage.GetBrandDataRequest_GetBrandDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBrandData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetBrandDataResponse_GetBrandDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetBrandDataResponse_GetBrandDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetBrandDataResponse_GetBrandDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateItemApprovalDataResponse_CreateItemApprovalDataResponse createItemApprovalData(mypackage.CreateItemApprovalDataRequest_CreateItemApprovalDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateItemApprovalData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateItemApprovalDataResponse_CreateItemApprovalDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateItemApprovalDataResponse_CreateItemApprovalDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateItemApprovalDataResponse_CreateItemApprovalDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetItemOtherGroupDataResponse_GetItemOtherGroupDataResponse getItemOtherGroupData(mypackage.GetItemOtherGroupDataRequest_GetItemOtherGroupDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetItemOtherGroupData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetItemOtherGroupDataResponse_GetItemOtherGroupDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetItemOtherGroupDataResponse_GetItemOtherGroupDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetItemOtherGroupDataResponse_GetItemOtherGroupDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateSupplierItemDataResponse_CreateSupplierItemDataResponse createSupplierItemData(mypackage.CreateSupplierItemDataRequest_CreateSupplierItemDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[135]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateSupplierItemData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateSupplierItemDataResponse_CreateSupplierItemDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateSupplierItemDataResponse_CreateSupplierItemDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateSupplierItemDataResponse_CreateSupplierItemDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateWOWorkReportDataResponse_CreateWOWorkReportDataResponse createWOWorkReportData(mypackage.CreateWOWorkReportDataRequest_CreateWOWorkReportDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[136]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateWOWorkReportData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateWOWorkReportDataResponse_CreateWOWorkReportDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateWOWorkReportDataResponse_CreateWOWorkReportDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateWOWorkReportDataResponse_CreateWOWorkReportDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateBOMDataResponse_CreateBOMDataResponse createBOMData(mypackage.CreateBOMDataRequest_CreateBOMDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[137]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateBOMData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateBOMDataResponse_CreateBOMDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateBOMDataResponse_CreateBOMDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateBOMDataResponse_CreateBOMDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateShippingOrdersWithoutOrdersResponse_CreateShippingOrdersWithoutOrdersResponse createShippingOrdersWithoutOrders(mypackage.CreateShippingOrdersWithoutOrdersRequest_CreateShippingOrdersWithoutOrdersRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[138]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateShippingOrdersWithoutOrders"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateShippingOrdersWithoutOrdersResponse_CreateShippingOrdersWithoutOrdersResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateShippingOrdersWithoutOrdersResponse_CreateShippingOrdersWithoutOrdersResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateShippingOrdersWithoutOrdersResponse_CreateShippingOrdersWithoutOrdersResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetItemGroupDataResponse_GetItemGroupDataResponse getItemGroupData(mypackage.GetItemGroupDataRequest_GetItemGroupDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[139]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetItemGroupData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetItemGroupDataResponse_GetItemGroupDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetItemGroupDataResponse_GetItemGroupDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetItemGroupDataResponse_GetItemGroupDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetProdStateResponse_GetProdStateResponse getProdState(mypackage.GetProdStateRequest_GetProdStateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[140]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetProdState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetProdStateResponse_GetProdStateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetProdStateResponse_GetProdStateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetProdStateResponse_GetProdStateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetPaymentTermsDataResponse_GetPaymentTermsDataResponse getPaymentTermsData(mypackage.GetPaymentTermsDataRequest_GetPaymentTermsDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[141]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPaymentTermsData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetPaymentTermsDataResponse_GetPaymentTermsDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetPaymentTermsDataResponse_GetPaymentTermsDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetPaymentTermsDataResponse_GetPaymentTermsDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetSSOKeyResponse_GetSSOKeyResponse getSSOKey(mypackage.GetSSOKeyRequest_GetSSOKeyRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[142]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSSOKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetSSOKeyResponse_GetSSOKeyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetSSOKeyResponse_GetSSOKeyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetSSOKeyResponse_GetSSOKeyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreateECNDataResponse_CreateECNDataResponse createECNData(mypackage.CreateECNDataRequest_CreateECNDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[143]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreateECNData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreateECNDataResponse_CreateECNDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreateECNDataResponse_CreateECNDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreateECNDataResponse_CreateECNDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreatePLMBOMDataResponse_CreatePLMBOMDataResponse createPLMBOMData(mypackage.CreatePLMBOMDataRequest_CreatePLMBOMDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[144]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreatePLMBOMData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreatePLMBOMDataResponse_CreatePLMBOMDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreatePLMBOMDataResponse_CreatePLMBOMDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreatePLMBOMDataResponse_CreatePLMBOMDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetQuotationDataResponse_GetQuotationDataResponse getQuotationData(mypackage.GetQuotationDataRequest_GetQuotationDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[145]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetQuotationData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetQuotationDataResponse_GetQuotationDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetQuotationDataResponse_GetQuotationDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetQuotationDataResponse_GetQuotationDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetCustClassificationDataResponse_GetCustClassificationDataResponse getCustClassificationData(mypackage.GetCustClassificationDataRequest_GetCustClassificationDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[146]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCustClassificationData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetCustClassificationDataResponse_GetCustClassificationDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetCustClassificationDataResponse_GetCustClassificationDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetCustClassificationDataResponse_GetCustClassificationDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetInvoiceTypeListResponse_GetInvoiceTypeListResponse getInvoiceTypeList(mypackage.GetInvoiceTypeListRequest_GetInvoiceTypeListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[147]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetInvoiceTypeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetInvoiceTypeListResponse_GetInvoiceTypeListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetInvoiceTypeListResponse_GetInvoiceTypeListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetInvoiceTypeListResponse_GetInvoiceTypeListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetTradeTermDataResponse_GetTradeTermDataResponse getTradeTermData(mypackage.GetTradeTermDataRequest_GetTradeTermDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[148]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetTradeTermData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetTradeTermDataResponse_GetTradeTermDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetTradeTermDataResponse_GetTradeTermDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetTradeTermDataResponse_GetTradeTermDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.SyncAccountDataResponse_SyncAccountDataResponse syncAccountData(mypackage.SyncAccountDataRequest_SyncAccountDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[149]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SyncAccountData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.SyncAccountDataResponse_SyncAccountDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.SyncAccountDataResponse_SyncAccountDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.SyncAccountDataResponse_SyncAccountDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetCustomerAccAmtDataResponse_GetCustomerAccAmtDataResponse getCustomerAccAmtData(mypackage.GetCustomerAccAmtDataRequest_GetCustomerAccAmtDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[150]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCustomerAccAmtData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetCustomerAccAmtDataResponse_GetCustomerAccAmtDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetCustomerAccAmtDataResponse_GetCustomerAccAmtDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetCustomerAccAmtDataResponse_GetCustomerAccAmtDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetDataCountResponse_GetDataCountResponse getDataCount(mypackage.GetDataCountRequest_GetDataCountRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[151]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetDataCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetDataCountResponse_GetDataCountResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetDataCountResponse_GetDataCountResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetDataCountResponse_GetDataCountResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetSODataResponse_GetSODataResponse getSOData(mypackage.GetSODataRequest_GetSODataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[152]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetSOData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetSODataResponse_GetSODataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetSODataResponse_GetSODataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetSODataResponse_GetSODataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetShappingDataResponse_GetShappingDataResponse getShappingData(mypackage.GetShappingDataRequest_GetShappingDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[153]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetShappingData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetShappingDataResponse_GetShappingDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetShappingDataResponse_GetShappingDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetShappingDataResponse_GetShappingDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetUserDefOrgResponse_GetUserDefOrgResponse getUserDefOrg(mypackage.GetUserDefOrgRequest_GetUserDefOrgRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[154]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetUserDefOrg"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetUserDefOrgResponse_GetUserDefOrgResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetUserDefOrgResponse_GetUserDefOrgResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetUserDefOrgResponse_GetUserDefOrgResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CheckCardResponse_CheckCardResponse checkCard(mypackage.CheckCardRequest_CheckCardRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[155]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CheckCardResponse_CheckCardResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CheckCardResponse_CheckCardResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CheckCardResponse_CheckCardResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CheckCardTypeResponse_CheckCardTypeResponse checkCardType(mypackage.CheckCardTypeRequest_CheckCardTypeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[156]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckCardType"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CheckCardTypeResponse_CheckCardTypeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CheckCardTypeResponse_CheckCardTypeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CheckCardTypeResponse_CheckCardTypeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CheckCouponResponse_CheckCouponResponse checkCoupon(mypackage.CheckCouponRequest_CheckCouponRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[157]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckCoupon"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CheckCouponResponse_CheckCouponResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CheckCouponResponse_CheckCouponResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CheckCouponResponse_CheckCouponResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CheckMemberUpgradeResponse_CheckMemberUpgradeResponse checkMemberUpgrade(mypackage.CheckMemberUpgradeRequest_CheckMemberUpgradeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[158]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckMemberUpgrade"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CheckMemberUpgradeResponse_CheckMemberUpgradeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CheckMemberUpgradeResponse_CheckMemberUpgradeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CheckMemberUpgradeResponse_CheckMemberUpgradeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetCardScoreResponse_GetCardScoreResponse getCardScore(mypackage.GetCardScoreRequest_GetCardScoreRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[159]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCardScore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetCardScoreResponse_GetCardScoreResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetCardScoreResponse_GetCardScoreResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetCardScoreResponse_GetCardScoreResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetCashCardInfoResponse_GetCashCardInfoResponse getCashCardInfo(mypackage.GetCashCardInfoRequest_GetCashCardInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[160]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetCashCardInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetCashCardInfoResponse_GetCashCardInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetCashCardInfoResponse_GetCashCardInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetCashCardInfoResponse_GetCashCardInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.RechargeCardResponse_RechargeCardResponse rechargeCard(mypackage.RechargeCardRequest_RechargeCardRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[161]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RechargeCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.RechargeCardResponse_RechargeCardResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.RechargeCardResponse_RechargeCardResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.RechargeCardResponse_RechargeCardResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.ReturnCardResponse_ReturnCardResponse returnCard(mypackage.ReturnCardRequest_ReturnCardRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[162]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ReturnCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.ReturnCardResponse_ReturnCardResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.ReturnCardResponse_ReturnCardResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.ReturnCardResponse_ReturnCardResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.DeductSPaymentResponse_DeductSPaymentResponse deductSPayment(mypackage.DeductSPaymentRequest_DeductSPaymentRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[163]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeductSPayment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.DeductSPaymentResponse_DeductSPaymentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.DeductSPaymentResponse_DeductSPaymentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.DeductSPaymentResponse_DeductSPaymentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.ReturnOrderBillResponse_ReturnOrderBillResponse returnOrderBill(mypackage.ReturnOrderBillRequest_ReturnOrderBillRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[164]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ReturnOrderBill"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.ReturnOrderBillResponse_ReturnOrderBillResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.ReturnOrderBillResponse_ReturnOrderBillResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.ReturnOrderBillResponse_ReturnOrderBillResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.ChangeCardResponse_ChangeCardResponse changeCard(mypackage.ChangeCardRequest_ChangeCardRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[165]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.ChangeCardResponse_ChangeCardResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.ChangeCardResponse_ChangeCardResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.ChangeCardResponse_ChangeCardResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.MemberUpgradeResponse_MemberUpgradeResponse memberUpgrade(mypackage.MemberUpgradeRequest_MemberUpgradeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[166]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MemberUpgrade"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.MemberUpgradeResponse_MemberUpgradeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.MemberUpgradeResponse_MemberUpgradeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.MemberUpgradeResponse_MemberUpgradeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetOrderInfoResponse_GetOrderInfoResponse getOrderInfo(mypackage.GetOrderInfoRequest_GetOrderInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[167]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetOrderInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetOrderInfoResponse_GetOrderInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetOrderInfoResponse_GetOrderInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetOrderInfoResponse_GetOrderInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.RollbackBillingAPResponse_RollbackBillingAPResponse rollbackBillingAP(mypackage.RollbackBillingAPRequest_RollbackBillingAPRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[168]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RollbackBillingAP"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.RollbackBillingAPResponse_RollbackBillingAPResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.RollbackBillingAPResponse_RollbackBillingAPResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.RollbackBillingAPResponse_RollbackBillingAPResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetAPCategoryAccountCodeResponse_GetAPCategoryAccountCodeResponse getAPCategoryAccountCode(mypackage.GetAPCategoryAccountCodeRequest_GetAPCategoryAccountCodeRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[169]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAPCategoryAccountCode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetAPCategoryAccountCodeResponse_GetAPCategoryAccountCodeResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetAPCategoryAccountCodeResponse_GetAPCategoryAccountCodeResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetAPCategoryAccountCodeResponse_GetAPCategoryAccountCodeResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.DeletePLMTempTableDataResponse_DeletePLMTempTableDataResponse deletePLMTempTableData(mypackage.DeletePLMTempTableDataRequest_DeletePLMTempTableDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[170]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeletePLMTempTableData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.DeletePLMTempTableDataResponse_DeletePLMTempTableDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.DeletePLMTempTableDataResponse_DeletePLMTempTableDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.DeletePLMTempTableDataResponse_DeletePLMTempTableDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetPLMTempTableDataStatusResponse_GetPLMTempTableDataStatusResponse getPLMTempTableDataStatus(mypackage.GetPLMTempTableDataStatusRequest_GetPLMTempTableDataStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[171]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPLMTempTableDataStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetPLMTempTableDataStatusResponse_GetPLMTempTableDataStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetPLMTempTableDataStatusResponse_GetPLMTempTableDataStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetPLMTempTableDataStatusResponse_GetPLMTempTableDataStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CreatePLMTempTableDataResponse_CreatePLMTempTableDataResponse createPLMTempTableData(mypackage.CreatePLMTempTableDataRequest_CreatePLMTempTableDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[172]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CreatePLMTempTableData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CreatePLMTempTableDataResponse_CreatePLMTempTableDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CreatePLMTempTableDataResponse_CreatePLMTempTableDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CreatePLMTempTableDataResponse_CreatePLMTempTableDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.SelRepairCardResponse_SelRepairCardResponse selRepairCard(mypackage.SelRepairCardRequest_SelRepairCardRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[173]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "SelRepairCard"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.SelRepairCardResponse_SelRepairCardResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.SelRepairCardResponse_SelRepairCardResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.SelRepairCardResponse_SelRepairCardResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetMemoDataResponse_GetMemoDataResponse getMemoData(mypackage.GetMemoDataRequest_GetMemoDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[174]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetMemoData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetMemoDataResponse_GetMemoDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetMemoDataResponse_GetMemoDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetMemoDataResponse_GetMemoDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.ChangeCardActivateResponse_ChangeCardActivateResponse changeCardActivate(mypackage.ChangeCardActivateRequest_ChangeCardActivateRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[175]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ChangeCardActivate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.ChangeCardActivateResponse_ChangeCardActivateResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.ChangeCardActivateResponse_ChangeCardActivateResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.ChangeCardActivateResponse_ChangeCardActivateResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.RepairCardSaleResponse_RepairCardSaleResponse repairCardSale(mypackage.RepairCardSaleRequest_RepairCardSaleRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[176]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "RepairCardSale"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.RepairCardSaleResponse_RepairCardSaleResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.RepairCardSaleResponse_RepairCardSaleResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.RepairCardSaleResponse_RepairCardSaleResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.ReturnEInvoiceBooksResponse_ReturnEInvoiceBooksResponse returnEInvoiceBooks(mypackage.ReturnEInvoiceBooksRequest_ReturnEInvoiceBooksRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[177]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ReturnEInvoiceBooks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.ReturnEInvoiceBooksResponse_ReturnEInvoiceBooksResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.ReturnEInvoiceBooksResponse_ReturnEInvoiceBooksResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.ReturnEInvoiceBooksResponse_ReturnEInvoiceBooksResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetEInvoiceBooksResponse_GetEInvoiceBooksResponse getEInvoiceBooks(mypackage.GetEInvoiceBooksRequest_GetEInvoiceBooksRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[178]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetEInvoiceBooks"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetEInvoiceBooksResponse_GetEInvoiceBooksResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetEInvoiceBooksResponse_GetEInvoiceBooksResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetEInvoiceBooksResponse_GetEInvoiceBooksResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetARListDataResponse_GetARListDataResponse getARListData(mypackage.GetARListDataRequest_GetARListDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[179]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetARListData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetARListDataResponse_GetARListDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetARListDataResponse_GetARListDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetARListDataResponse_GetARListDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetProjectWBSDataResponse_GetProjectWBSDataResponse getProjectWBSData(mypackage.GetProjectWBSDataRequest_GetProjectWBSDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[180]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetProjectWBSData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetProjectWBSDataResponse_GetProjectWBSDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetProjectWBSDataResponse_GetProjectWBSDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetProjectWBSDataResponse_GetProjectWBSDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.CheckGiftNoResponse_CheckGiftNoResponse checkGiftNo(mypackage.CheckGiftNoRequest_CheckGiftNoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[181]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "CheckGiftNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.CheckGiftNoResponse_CheckGiftNoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.CheckGiftNoResponse_CheckGiftNoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.CheckGiftNoResponse_CheckGiftNoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.DeductGiftNOResponse_DeductGiftNOResponse deductGiftNO(mypackage.DeductGiftNORequest_DeductGiftNORequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[182]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeductGiftNO"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.DeductGiftNOResponse_DeductGiftNOResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.DeductGiftNOResponse_DeductGiftNOResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.DeductGiftNOResponse_DeductGiftNOResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.DeductMoneyResponse_DeductMoneyResponse deductMoney(mypackage.DeductMoneyRequest_DeductMoneyRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[183]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeductMoney"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.DeductMoneyResponse_DeductMoneyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.DeductMoneyResponse_DeductMoneyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.DeductMoneyResponse_DeductMoneyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetClassDataResponse_GetClassDataResponse getClassData(mypackage.GetClassDataRequest_GetClassDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[184]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetClassData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetClassDataResponse_GetClassDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetClassDataResponse_GetClassDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetClassDataResponse_GetClassDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.DeductScoreResponse_DeductScoreResponse deductScore(mypackage.DeductScoreRequest_DeductScoreRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[185]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "DeductScore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.DeductScoreResponse_DeductScoreResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.DeductScoreResponse_DeductScoreResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.DeductScoreResponse_DeductScoreResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetMemberCardInfoResponse_GetMemberCardInfoResponse getMemberCardInfo(mypackage.GetMemberCardInfoRequest_GetMemberCardInfoRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[186]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetMemberCardInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetMemberCardInfoResponse_GetMemberCardInfoResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetMemberCardInfoResponse_GetMemberCardInfoResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetMemberCardInfoResponse_GetMemberCardInfoResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetScoreResponse_GetScoreResponse getScore(mypackage.GetScoreRequest_GetScoreRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[187]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetScore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetScoreResponse_GetScoreResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetScoreResponse_GetScoreResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetScoreResponse_GetScoreResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.ModPassWordResponse_ModPassWordResponse modPassWord(mypackage.ModPassWordRequest_ModPassWordRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[188]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "ModPassWord"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.ModPassWordResponse_ModPassWordResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.ModPassWordResponse_ModPassWordResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.ModPassWordResponse_ModPassWordResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.WritePointResponse_WritePointResponse writePoint(mypackage.WritePointRequest_WritePointRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[189]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "WritePoint"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.WritePointResponse_WritePointResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.WritePointResponse_WritePointResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.WritePointResponse_WritePointResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetExchangeRateDataResponse_GetExchangeRateDataResponse getExchangeRateData(mypackage.GetExchangeRateDataRequest_GetExchangeRateDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[190]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetExchangeRateData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetExchangeRateDataResponse_GetExchangeRateDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetExchangeRateDataResponse_GetExchangeRateDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetExchangeRateDataResponse_GetExchangeRateDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetAreaDataResponse_GetAreaDataResponse getAreaData(mypackage.GetAreaDataRequest_GetAreaDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[191]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAreaData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetAreaDataResponse_GetAreaDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetAreaDataResponse_GetAreaDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetAreaDataResponse_GetAreaDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetAreaListResponse_GetAreaListResponse getAreaList(mypackage.GetAreaListRequest_GetAreaListRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[192]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAreaList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetAreaListResponse_GetAreaListResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetAreaListResponse_GetAreaListResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetAreaListResponse_GetAreaListResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetAxmDocumentResponse_GetAxmDocumentResponse getAxmDocument(mypackage.GetAxmDocumentRequest_GetAxmDocumentRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[193]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetAxmDocument"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetAxmDocumentResponse_GetAxmDocumentResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetAxmDocumentResponse_GetAxmDocumentResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetAxmDocumentResponse_GetAxmDocumentResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetPurchaseStockInQtyResponse_GetPurchaseStockInQtyResponse getPurchaseStockInQty(mypackage.GetPurchaseStockInQtyRequest_GetPurchaseStockInQtyRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[194]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetPurchaseStockInQty"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetPurchaseStockInQtyResponse_GetPurchaseStockInQtyResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetPurchaseStockInQtyResponse_GetPurchaseStockInQtyResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetPurchaseStockInQtyResponse_GetPurchaseStockInQtyResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetBasicCodeDataResponse_GetBasicCodeDataResponse getBasicCodeData(mypackage.GetBasicCodeDataRequest_GetBasicCodeDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[195]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetBasicCodeData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetBasicCodeDataResponse_GetBasicCodeDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetBasicCodeDataResponse_GetBasicCodeDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetBasicCodeDataResponse_GetBasicCodeDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.GetComponentrepsubDataResponse_GetComponentrepsubDataResponse getComponentrepsubData(mypackage.GetComponentrepsubDataRequest_GetComponentrepsubDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[196]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "GetComponentrepsubData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.GetComponentrepsubDataResponse_GetComponentrepsubDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.GetComponentrepsubDataResponse_GetComponentrepsubDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.GetComponentrepsubDataResponse_GetComponentrepsubDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.Createasfi5IcdResponse_createasfi5IcdResponse createasfi5Icd(mypackage.Createasfi5IcdRequest_createasfi5IcdRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[197]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createasfi5icd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.Createasfi5IcdResponse_createasfi5IcdResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.Createasfi5IcdResponse_createasfi5IcdResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.Createasfi5IcdResponse_createasfi5IcdResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.Createasft300Response_createasft300Response createasft300(mypackage.Createasft300Request_createasft300Request parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[198]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "createasft300"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.Createasft300Response_createasft300Response) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.Createasft300Response_createasft300Response) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.Createasft300Response_createasft300Response.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.QueryDataResponse_QueryDataResponse queryData(mypackage.QueryDataRequest_QueryDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[199]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "QueryData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.QueryDataResponse_QueryDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.QueryDataResponse_QueryDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.QueryDataResponse_QueryDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.UpdateStatusResponse_UpdateStatusResponse updateStatus(mypackage.UpdateStatusRequest_UpdateStatusRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[200]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "UpdateStatus"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.UpdateStatusResponse_UpdateStatusResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.UpdateStatusResponse_UpdateStatusResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.UpdateStatusResponse_UpdateStatusResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public mypackage.MergeDataResponse_MergeDataResponse mergeData(mypackage.MergeDataRequest_MergeDataRequest parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[201]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "MergeData"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (mypackage.MergeDataResponse_MergeDataResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (mypackage.MergeDataResponse_MergeDataResponse) org.apache.axis.utils.JavaUtils.convert(_resp, mypackage.MergeDataResponse_MergeDataResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String invokeSrv(java.lang.String request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[202]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "invokeSrv"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String callbackSrv(java.lang.String request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[203]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "callbackSrv"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String syncProd(java.lang.String request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[204]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "syncProd"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String invokeMdm(java.lang.String request) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[205]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "invokeMdm"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {request});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
