<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://www.imestech.com/wsERP" xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" targetNamespace="http://www.imestech.com/wsERP" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://www.imestech.com/wsERP">
      <s:element name="CreateMaterial">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateMaterialResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateMaterialResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelMaterial">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelMaterialResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DelMaterialResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateProduct">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateProductResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateProductResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelProduct">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelProductResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DelProductResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateCustomer">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateCustomerResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateCustomerResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelCustomer">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelCustomerResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DelCustomerResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateOperation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateOperationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateOperationResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelOperation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelOperationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DelOperationResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateInventory">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateInventoryResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateInventoryResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelInventory">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelInventoryResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DelInventoryResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateLocation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateLocationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateLocationResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelLocation">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelLocationResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DelLocationResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateDepartment">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateDepartmentResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateDepartmentResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelDepartment">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelDepartmentResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DelDepartmentResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddMO">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddMOResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AddMOResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EditMO">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="EditMOResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="EditMOResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelMO">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelMOResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DelMOResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CloseMO">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CloseMOResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CloseMOResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UndoCloseMO">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UndoCloseMOResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="UndoCloseMOResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddMaterial2MO">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="AddMaterial2MOResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="AddMaterial2MOResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UndoAddMaterial2MO">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UndoAddMaterial2MOResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="UndoAddMaterial2MOResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateEquipment">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateEquipmentResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateEquipmentResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelEquipment">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelEquipmentResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DelEquipmentResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateVendor">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateVendorResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateVendorResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelVendor">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelVendorResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DelVendorResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateMaterialVendor">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateMaterialVendorResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateMaterialVendorResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelMaterialVendor">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelMaterialVendorResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DelMaterialVendorResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateShift">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateShiftResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateShiftResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelShift">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelShiftResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DelShiftResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateOPGroup">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateOPGroupResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateOPGroupResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelOPGroup">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelOPGroupResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DelOPGroupResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReturnMaterial2MO">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReturnMaterial2MOResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ReturnMaterial2MOResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UndoReturnMaterial2MO">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="UndoReturnMaterial2MOResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="UndoReturnMaterial2MOResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateSubcontractor">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateSubcontractorResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateSubcontractorResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelSubcontractor">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelSubcontractorResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DelSubcontractorResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TestDBConnection">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="UserNo" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="TestDBConnectionResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="TestDBConnectionResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="invokeSrv">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="RequestId" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="MethodName" type="s:string" />
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="invokeSrvResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="invokeSrvResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="qc_create">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="qc_createResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="qc_createResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="qc_process">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="qc_processResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="qc_processResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateWipInvRaw">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateWipInvRawResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateWipInvRawResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateUser">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="CreateUserResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="CreateUserResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReturnERFDispositionResut">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="ReturnERFDispositionResutResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="ReturnERFDispositionResutResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelWipInvRaw">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="InXml" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="DelWipInvRawResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="DelWipInvRawResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
    </s:schema>
  </wsdl:types>
  <wsdl:message name="CreateMaterialSoapIn">
    <wsdl:part name="parameters" element="tns:CreateMaterial" />
  </wsdl:message>
  <wsdl:message name="CreateMaterialSoapOut">
    <wsdl:part name="parameters" element="tns:CreateMaterialResponse" />
  </wsdl:message>
  <wsdl:message name="DelMaterialSoapIn">
    <wsdl:part name="parameters" element="tns:DelMaterial" />
  </wsdl:message>
  <wsdl:message name="DelMaterialSoapOut">
    <wsdl:part name="parameters" element="tns:DelMaterialResponse" />
  </wsdl:message>
  <wsdl:message name="CreateProductSoapIn">
    <wsdl:part name="parameters" element="tns:CreateProduct" />
  </wsdl:message>
  <wsdl:message name="CreateProductSoapOut">
    <wsdl:part name="parameters" element="tns:CreateProductResponse" />
  </wsdl:message>
  <wsdl:message name="DelProductSoapIn">
    <wsdl:part name="parameters" element="tns:DelProduct" />
  </wsdl:message>
  <wsdl:message name="DelProductSoapOut">
    <wsdl:part name="parameters" element="tns:DelProductResponse" />
  </wsdl:message>
  <wsdl:message name="CreateCustomerSoapIn">
    <wsdl:part name="parameters" element="tns:CreateCustomer" />
  </wsdl:message>
  <wsdl:message name="CreateCustomerSoapOut">
    <wsdl:part name="parameters" element="tns:CreateCustomerResponse" />
  </wsdl:message>
  <wsdl:message name="DelCustomerSoapIn">
    <wsdl:part name="parameters" element="tns:DelCustomer" />
  </wsdl:message>
  <wsdl:message name="DelCustomerSoapOut">
    <wsdl:part name="parameters" element="tns:DelCustomerResponse" />
  </wsdl:message>
  <wsdl:message name="CreateOperationSoapIn">
    <wsdl:part name="parameters" element="tns:CreateOperation" />
  </wsdl:message>
  <wsdl:message name="CreateOperationSoapOut">
    <wsdl:part name="parameters" element="tns:CreateOperationResponse" />
  </wsdl:message>
  <wsdl:message name="DelOperationSoapIn">
    <wsdl:part name="parameters" element="tns:DelOperation" />
  </wsdl:message>
  <wsdl:message name="DelOperationSoapOut">
    <wsdl:part name="parameters" element="tns:DelOperationResponse" />
  </wsdl:message>
  <wsdl:message name="CreateInventorySoapIn">
    <wsdl:part name="parameters" element="tns:CreateInventory" />
  </wsdl:message>
  <wsdl:message name="CreateInventorySoapOut">
    <wsdl:part name="parameters" element="tns:CreateInventoryResponse" />
  </wsdl:message>
  <wsdl:message name="DelInventorySoapIn">
    <wsdl:part name="parameters" element="tns:DelInventory" />
  </wsdl:message>
  <wsdl:message name="DelInventorySoapOut">
    <wsdl:part name="parameters" element="tns:DelInventoryResponse" />
  </wsdl:message>
  <wsdl:message name="CreateLocationSoapIn">
    <wsdl:part name="parameters" element="tns:CreateLocation" />
  </wsdl:message>
  <wsdl:message name="CreateLocationSoapOut">
    <wsdl:part name="parameters" element="tns:CreateLocationResponse" />
  </wsdl:message>
  <wsdl:message name="DelLocationSoapIn">
    <wsdl:part name="parameters" element="tns:DelLocation" />
  </wsdl:message>
  <wsdl:message name="DelLocationSoapOut">
    <wsdl:part name="parameters" element="tns:DelLocationResponse" />
  </wsdl:message>
  <wsdl:message name="CreateDepartmentSoapIn">
    <wsdl:part name="parameters" element="tns:CreateDepartment" />
  </wsdl:message>
  <wsdl:message name="CreateDepartmentSoapOut">
    <wsdl:part name="parameters" element="tns:CreateDepartmentResponse" />
  </wsdl:message>
  <wsdl:message name="DelDepartmentSoapIn">
    <wsdl:part name="parameters" element="tns:DelDepartment" />
  </wsdl:message>
  <wsdl:message name="DelDepartmentSoapOut">
    <wsdl:part name="parameters" element="tns:DelDepartmentResponse" />
  </wsdl:message>
  <wsdl:message name="AddMOSoapIn">
    <wsdl:part name="parameters" element="tns:AddMO" />
  </wsdl:message>
  <wsdl:message name="AddMOSoapOut">
    <wsdl:part name="parameters" element="tns:AddMOResponse" />
  </wsdl:message>
  <wsdl:message name="EditMOSoapIn">
    <wsdl:part name="parameters" element="tns:EditMO" />
  </wsdl:message>
  <wsdl:message name="EditMOSoapOut">
    <wsdl:part name="parameters" element="tns:EditMOResponse" />
  </wsdl:message>
  <wsdl:message name="DelMOSoapIn">
    <wsdl:part name="parameters" element="tns:DelMO" />
  </wsdl:message>
  <wsdl:message name="DelMOSoapOut">
    <wsdl:part name="parameters" element="tns:DelMOResponse" />
  </wsdl:message>
  <wsdl:message name="CloseMOSoapIn">
    <wsdl:part name="parameters" element="tns:CloseMO" />
  </wsdl:message>
  <wsdl:message name="CloseMOSoapOut">
    <wsdl:part name="parameters" element="tns:CloseMOResponse" />
  </wsdl:message>
  <wsdl:message name="UndoCloseMOSoapIn">
    <wsdl:part name="parameters" element="tns:UndoCloseMO" />
  </wsdl:message>
  <wsdl:message name="UndoCloseMOSoapOut">
    <wsdl:part name="parameters" element="tns:UndoCloseMOResponse" />
  </wsdl:message>
  <wsdl:message name="AddMaterial2MOSoapIn">
    <wsdl:part name="parameters" element="tns:AddMaterial2MO" />
  </wsdl:message>
  <wsdl:message name="AddMaterial2MOSoapOut">
    <wsdl:part name="parameters" element="tns:AddMaterial2MOResponse" />
  </wsdl:message>
  <wsdl:message name="UndoAddMaterial2MOSoapIn">
    <wsdl:part name="parameters" element="tns:UndoAddMaterial2MO" />
  </wsdl:message>
  <wsdl:message name="UndoAddMaterial2MOSoapOut">
    <wsdl:part name="parameters" element="tns:UndoAddMaterial2MOResponse" />
  </wsdl:message>
  <wsdl:message name="CreateEquipmentSoapIn">
    <wsdl:part name="parameters" element="tns:CreateEquipment" />
  </wsdl:message>
  <wsdl:message name="CreateEquipmentSoapOut">
    <wsdl:part name="parameters" element="tns:CreateEquipmentResponse" />
  </wsdl:message>
  <wsdl:message name="DelEquipmentSoapIn">
    <wsdl:part name="parameters" element="tns:DelEquipment" />
  </wsdl:message>
  <wsdl:message name="DelEquipmentSoapOut">
    <wsdl:part name="parameters" element="tns:DelEquipmentResponse" />
  </wsdl:message>
  <wsdl:message name="CreateVendorSoapIn">
    <wsdl:part name="parameters" element="tns:CreateVendor" />
  </wsdl:message>
  <wsdl:message name="CreateVendorSoapOut">
    <wsdl:part name="parameters" element="tns:CreateVendorResponse" />
  </wsdl:message>
  <wsdl:message name="DelVendorSoapIn">
    <wsdl:part name="parameters" element="tns:DelVendor" />
  </wsdl:message>
  <wsdl:message name="DelVendorSoapOut">
    <wsdl:part name="parameters" element="tns:DelVendorResponse" />
  </wsdl:message>
  <wsdl:message name="CreateMaterialVendorSoapIn">
    <wsdl:part name="parameters" element="tns:CreateMaterialVendor" />
  </wsdl:message>
  <wsdl:message name="CreateMaterialVendorSoapOut">
    <wsdl:part name="parameters" element="tns:CreateMaterialVendorResponse" />
  </wsdl:message>
  <wsdl:message name="DelMaterialVendorSoapIn">
    <wsdl:part name="parameters" element="tns:DelMaterialVendor" />
  </wsdl:message>
  <wsdl:message name="DelMaterialVendorSoapOut">
    <wsdl:part name="parameters" element="tns:DelMaterialVendorResponse" />
  </wsdl:message>
  <wsdl:message name="CreateShiftSoapIn">
    <wsdl:part name="parameters" element="tns:CreateShift" />
  </wsdl:message>
  <wsdl:message name="CreateShiftSoapOut">
    <wsdl:part name="parameters" element="tns:CreateShiftResponse" />
  </wsdl:message>
  <wsdl:message name="DelShiftSoapIn">
    <wsdl:part name="parameters" element="tns:DelShift" />
  </wsdl:message>
  <wsdl:message name="DelShiftSoapOut">
    <wsdl:part name="parameters" element="tns:DelShiftResponse" />
  </wsdl:message>
  <wsdl:message name="CreateOPGroupSoapIn">
    <wsdl:part name="parameters" element="tns:CreateOPGroup" />
  </wsdl:message>
  <wsdl:message name="CreateOPGroupSoapOut">
    <wsdl:part name="parameters" element="tns:CreateOPGroupResponse" />
  </wsdl:message>
  <wsdl:message name="DelOPGroupSoapIn">
    <wsdl:part name="parameters" element="tns:DelOPGroup" />
  </wsdl:message>
  <wsdl:message name="DelOPGroupSoapOut">
    <wsdl:part name="parameters" element="tns:DelOPGroupResponse" />
  </wsdl:message>
  <wsdl:message name="ReturnMaterial2MOSoapIn">
    <wsdl:part name="parameters" element="tns:ReturnMaterial2MO" />
  </wsdl:message>
  <wsdl:message name="ReturnMaterial2MOSoapOut">
    <wsdl:part name="parameters" element="tns:ReturnMaterial2MOResponse" />
  </wsdl:message>
  <wsdl:message name="UndoReturnMaterial2MOSoapIn">
    <wsdl:part name="parameters" element="tns:UndoReturnMaterial2MO" />
  </wsdl:message>
  <wsdl:message name="UndoReturnMaterial2MOSoapOut">
    <wsdl:part name="parameters" element="tns:UndoReturnMaterial2MOResponse" />
  </wsdl:message>
  <wsdl:message name="CreateSubcontractorSoapIn">
    <wsdl:part name="parameters" element="tns:CreateSubcontractor" />
  </wsdl:message>
  <wsdl:message name="CreateSubcontractorSoapOut">
    <wsdl:part name="parameters" element="tns:CreateSubcontractorResponse" />
  </wsdl:message>
  <wsdl:message name="DelSubcontractorSoapIn">
    <wsdl:part name="parameters" element="tns:DelSubcontractor" />
  </wsdl:message>
  <wsdl:message name="DelSubcontractorSoapOut">
    <wsdl:part name="parameters" element="tns:DelSubcontractorResponse" />
  </wsdl:message>
  <wsdl:message name="TestDBConnectionSoapIn">
    <wsdl:part name="parameters" element="tns:TestDBConnection" />
  </wsdl:message>
  <wsdl:message name="TestDBConnectionSoapOut">
    <wsdl:part name="parameters" element="tns:TestDBConnectionResponse" />
  </wsdl:message>
  <wsdl:message name="invokeSrvSoapIn">
    <wsdl:part name="parameters" element="tns:invokeSrv" />
  </wsdl:message>
  <wsdl:message name="invokeSrvSoapOut">
    <wsdl:part name="parameters" element="tns:invokeSrvResponse" />
  </wsdl:message>
  <wsdl:message name="qc_createSoapIn">
    <wsdl:part name="parameters" element="tns:qc_create" />
  </wsdl:message>
  <wsdl:message name="qc_createSoapOut">
    <wsdl:part name="parameters" element="tns:qc_createResponse" />
  </wsdl:message>
  <wsdl:message name="qc_processSoapIn">
    <wsdl:part name="parameters" element="tns:qc_process" />
  </wsdl:message>
  <wsdl:message name="qc_processSoapOut">
    <wsdl:part name="parameters" element="tns:qc_processResponse" />
  </wsdl:message>
  <wsdl:message name="CreateWipInvRawSoapIn">
    <wsdl:part name="parameters" element="tns:CreateWipInvRaw" />
  </wsdl:message>
  <wsdl:message name="CreateWipInvRawSoapOut">
    <wsdl:part name="parameters" element="tns:CreateWipInvRawResponse" />
  </wsdl:message>
  <wsdl:message name="CreateUserSoapIn">
    <wsdl:part name="parameters" element="tns:CreateUser" />
  </wsdl:message>
  <wsdl:message name="CreateUserSoapOut">
    <wsdl:part name="parameters" element="tns:CreateUserResponse" />
  </wsdl:message>
  <wsdl:message name="ReturnERFDispositionResutSoapIn">
    <wsdl:part name="parameters" element="tns:ReturnERFDispositionResut" />
  </wsdl:message>
  <wsdl:message name="ReturnERFDispositionResutSoapOut">
    <wsdl:part name="parameters" element="tns:ReturnERFDispositionResutResponse" />
  </wsdl:message>
  <wsdl:message name="DelWipInvRawSoapIn">
    <wsdl:part name="parameters" element="tns:DelWipInvRaw" />
  </wsdl:message>
  <wsdl:message name="DelWipInvRawSoapOut">
    <wsdl:part name="parameters" element="tns:DelWipInvRawResponse" />
  </wsdl:message>
  <wsdl:portType name="wsERPSoap">
    <wsdl:operation name="CreateMaterial">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI002 / Material Basis Integration -- Create Material</wsdl:documentation>
      <wsdl:input message="tns:CreateMaterialSoapIn" />
      <wsdl:output message="tns:CreateMaterialSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelMaterial">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI002 / Material Basis Integration -- Delete Material</wsdl:documentation>
      <wsdl:input message="tns:DelMaterialSoapIn" />
      <wsdl:output message="tns:DelMaterialSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateProduct">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI003 / Product Basis Integration -- Create Product</wsdl:documentation>
      <wsdl:input message="tns:CreateProductSoapIn" />
      <wsdl:output message="tns:CreateProductSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelProduct">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI003 / Product Basis Integration -- Delete Product</wsdl:documentation>
      <wsdl:input message="tns:DelProductSoapIn" />
      <wsdl:output message="tns:DelProductSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateCustomer">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI004 / Customer Basis Integration -- Create Customer</wsdl:documentation>
      <wsdl:input message="tns:CreateCustomerSoapIn" />
      <wsdl:output message="tns:CreateCustomerSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelCustomer">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI004 / Customer Basis Integration -- Delete Customer</wsdl:documentation>
      <wsdl:input message="tns:DelCustomerSoapIn" />
      <wsdl:output message="tns:DelCustomerSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateOperation">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI005 / Operation Basis Integration -- Create Operation</wsdl:documentation>
      <wsdl:input message="tns:CreateOperationSoapIn" />
      <wsdl:output message="tns:CreateOperationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelOperation">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI005 / Operation Basis Integration -- Delete Operation</wsdl:documentation>
      <wsdl:input message="tns:DelOperationSoapIn" />
      <wsdl:output message="tns:DelOperationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateInventory">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI006 / Inventory Basis Integration -- Create Inventory</wsdl:documentation>
      <wsdl:input message="tns:CreateInventorySoapIn" />
      <wsdl:output message="tns:CreateInventorySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelInventory">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI006 / Inventory Basis Integration -- Delete Inventory</wsdl:documentation>
      <wsdl:input message="tns:DelInventorySoapIn" />
      <wsdl:output message="tns:DelInventorySoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateLocation">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI007 / Locator Basis Integration -- Create Location</wsdl:documentation>
      <wsdl:input message="tns:CreateLocationSoapIn" />
      <wsdl:output message="tns:CreateLocationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelLocation">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI007 / Locator Basis Integration -- Delete Location</wsdl:documentation>
      <wsdl:input message="tns:DelLocationSoapIn" />
      <wsdl:output message="tns:DelLocationSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateDepartment">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI008 / Department Basis Integration -- Create Department</wsdl:documentation>
      <wsdl:input message="tns:CreateDepartmentSoapIn" />
      <wsdl:output message="tns:CreateDepartmentSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelDepartment">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI008 / Department Basis Integration -- Delete Department</wsdl:documentation>
      <wsdl:input message="tns:DelDepartmentSoapIn" />
      <wsdl:output message="tns:DelDepartmentSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddMO">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI009 / 工單整合 -- Add MO</wsdl:documentation>
      <wsdl:input message="tns:AddMOSoapIn" />
      <wsdl:output message="tns:AddMOSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="EditMO">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI009 / 工單整合 -- Edit MO</wsdl:documentation>
      <wsdl:input message="tns:EditMOSoapIn" />
      <wsdl:output message="tns:EditMOSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelMO">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI009 / 工單整合 -- Delete MO</wsdl:documentation>
      <wsdl:input message="tns:DelMOSoapIn" />
      <wsdl:output message="tns:DelMOSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CloseMO">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI009 / 工單整合 -- Close MO</wsdl:documentation>
      <wsdl:input message="tns:CloseMOSoapIn" />
      <wsdl:output message="tns:CloseMOSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UndoCloseMO">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI009 / 工單整合 -- Undo Close MO</wsdl:documentation>
      <wsdl:input message="tns:UndoCloseMOSoapIn" />
      <wsdl:output message="tns:UndoCloseMOSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="AddMaterial2MO">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI010 / 工單發料作業</wsdl:documentation>
      <wsdl:input message="tns:AddMaterial2MOSoapIn" />
      <wsdl:output message="tns:AddMaterial2MOSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UndoAddMaterial2MO">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI010 / 還原工單發料作業</wsdl:documentation>
      <wsdl:input message="tns:UndoAddMaterial2MOSoapIn" />
      <wsdl:output message="tns:UndoAddMaterial2MOSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateEquipment">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI011 / Equipment Basis Integration -- Create Equipment</wsdl:documentation>
      <wsdl:input message="tns:CreateEquipmentSoapIn" />
      <wsdl:output message="tns:CreateEquipmentSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelEquipment">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI011 / Equipment Basis Integration -- Delete Equipment</wsdl:documentation>
      <wsdl:input message="tns:DelEquipmentSoapIn" />
      <wsdl:output message="tns:DelEquipmentSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateVendor">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI012 / Vendor Basis Integration -- Create Vendor</wsdl:documentation>
      <wsdl:input message="tns:CreateVendorSoapIn" />
      <wsdl:output message="tns:CreateVendorSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelVendor">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI012 / Vendor Basis Integration -- Delete Vendor</wsdl:documentation>
      <wsdl:input message="tns:DelVendorSoapIn" />
      <wsdl:output message="tns:DelVendorSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateMaterialVendor">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI013 / Material Vendor Basis Integration -- Create Material Vendor</wsdl:documentation>
      <wsdl:input message="tns:CreateMaterialVendorSoapIn" />
      <wsdl:output message="tns:CreateMaterialVendorSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelMaterialVendor">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI013 / Material Vendor Basis Integration -- Delete Material Vendor</wsdl:documentation>
      <wsdl:input message="tns:DelMaterialVendorSoapIn" />
      <wsdl:output message="tns:DelMaterialVendorSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateShift">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI014 / Shift Basis Integration -- Create Shift</wsdl:documentation>
      <wsdl:input message="tns:CreateShiftSoapIn" />
      <wsdl:output message="tns:CreateShiftSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelShift">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI014 / Shift Basis Integration -- Delete Shift</wsdl:documentation>
      <wsdl:input message="tns:DelShiftSoapIn" />
      <wsdl:output message="tns:DelShiftSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateOPGroup">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI015 / OPGroup Basis Integration -- Create OPGroup</wsdl:documentation>
      <wsdl:input message="tns:CreateOPGroupSoapIn" />
      <wsdl:output message="tns:CreateOPGroupSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelOPGroup">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI015 / OPGroup Basis Integration -- Delete OPGroup</wsdl:documentation>
      <wsdl:input message="tns:DelOPGroupSoapIn" />
      <wsdl:output message="tns:DelOPGroupSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ReturnMaterial2MO">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI016 / 工單退料作業</wsdl:documentation>
      <wsdl:input message="tns:ReturnMaterial2MOSoapIn" />
      <wsdl:output message="tns:ReturnMaterial2MOSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="UndoReturnMaterial2MO">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI016 / 還原工單退料作業</wsdl:documentation>
      <wsdl:input message="tns:UndoReturnMaterial2MOSoapIn" />
      <wsdl:output message="tns:UndoReturnMaterial2MOSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateSubcontractor">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI017 / Subcontractor Basis Integration -- Create Subcontractor</wsdl:documentation>
      <wsdl:input message="tns:CreateSubcontractorSoapIn" />
      <wsdl:output message="tns:CreateSubcontractorSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelSubcontractor">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">SD_DSC_SI017 / Subcontractor Basis Integration -- Delete Subcontractor</wsdl:documentation>
      <wsdl:input message="tns:DelSubcontractorSoapIn" />
      <wsdl:output message="tns:DelSubcontractorSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="TestDBConnection">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Web service and database connection test</wsdl:documentation>
      <wsdl:input message="tns:TestDBConnectionSoapIn" />
      <wsdl:output message="tns:TestDBConnectionSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="invokeSrv">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">Invoke Web Service</wsdl:documentation>
      <wsdl:input message="tns:invokeSrvSoapIn" />
      <wsdl:output message="tns:invokeSrvSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="qc_create">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">qc.create /檢驗單新增</wsdl:documentation>
      <wsdl:input message="tns:qc_createSoapIn" />
      <wsdl:output message="tns:qc_createSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="qc_process">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">qc.process /檢驗單還原</wsdl:documentation>
      <wsdl:input message="tns:qc_processSoapIn" />
      <wsdl:output message="tns:qc_processSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateWipInvRaw">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">MES &amp; WMS线边仓投料接口</wsdl:documentation>
      <wsdl:input message="tns:CreateWipInvRawSoapIn" />
      <wsdl:output message="tns:CreateWipInvRawSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="CreateUser">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">MES &amp; OA / User Basis Integration -- Create User</wsdl:documentation>
      <wsdl:input message="tns:CreateUserSoapIn" />
      <wsdl:output message="tns:CreateUserSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="ReturnERFDispositionResut">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">MES &amp; OA / 异常审核结果回抛接口 -- ReturnERFDispositionResut</wsdl:documentation>
      <wsdl:input message="tns:ReturnERFDispositionResutSoapIn" />
      <wsdl:output message="tns:ReturnERFDispositionResutSoapOut" />
    </wsdl:operation>
    <wsdl:operation name="DelWipInvRaw">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">MES &amp; OA / MES线边仓扣料接口 -- ReturnERFDispositionResut</wsdl:documentation>
      <wsdl:input message="tns:DelWipInvRawSoapIn" />
      <wsdl:output message="tns:DelWipInvRawSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="wsERPSoap" type="tns:wsERPSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="CreateMaterial">
      <soap:operation soapAction="http://www.imestech.com/wsERP/CreateMaterial" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelMaterial">
      <soap:operation soapAction="http://www.imestech.com/wsERP/DelMaterial" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateProduct">
      <soap:operation soapAction="http://www.imestech.com/wsERP/CreateProduct" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelProduct">
      <soap:operation soapAction="http://www.imestech.com/wsERP/DelProduct" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateCustomer">
      <soap:operation soapAction="http://www.imestech.com/wsERP/CreateCustomer" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelCustomer">
      <soap:operation soapAction="http://www.imestech.com/wsERP/DelCustomer" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateOperation">
      <soap:operation soapAction="http://www.imestech.com/wsERP/CreateOperation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelOperation">
      <soap:operation soapAction="http://www.imestech.com/wsERP/DelOperation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateInventory">
      <soap:operation soapAction="http://www.imestech.com/wsERP/CreateInventory" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelInventory">
      <soap:operation soapAction="http://www.imestech.com/wsERP/DelInventory" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateLocation">
      <soap:operation soapAction="http://www.imestech.com/wsERP/CreateLocation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelLocation">
      <soap:operation soapAction="http://www.imestech.com/wsERP/DelLocation" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateDepartment">
      <soap:operation soapAction="http://www.imestech.com/wsERP/CreateDepartment" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelDepartment">
      <soap:operation soapAction="http://www.imestech.com/wsERP/DelDepartment" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddMO">
      <soap:operation soapAction="http://www.imestech.com/wsERP/AddMO" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EditMO">
      <soap:operation soapAction="http://www.imestech.com/wsERP/EditMO" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelMO">
      <soap:operation soapAction="http://www.imestech.com/wsERP/DelMO" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CloseMO">
      <soap:operation soapAction="http://www.imestech.com/wsERP/CloseMO" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UndoCloseMO">
      <soap:operation soapAction="http://www.imestech.com/wsERP/UndoCloseMO" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddMaterial2MO">
      <soap:operation soapAction="http://www.imestech.com/wsERP/AddMaterial2MO" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UndoAddMaterial2MO">
      <soap:operation soapAction="http://www.imestech.com/wsERP/UndoAddMaterial2MO" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateEquipment">
      <soap:operation soapAction="http://www.imestech.com/wsERP/CreateEquipment" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelEquipment">
      <soap:operation soapAction="http://www.imestech.com/wsERP/DelEquipment" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateVendor">
      <soap:operation soapAction="http://www.imestech.com/wsERP/CreateVendor" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelVendor">
      <soap:operation soapAction="http://www.imestech.com/wsERP/DelVendor" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateMaterialVendor">
      <soap:operation soapAction="http://www.imestech.com/wsERP/CreateMaterialVendor" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelMaterialVendor">
      <soap:operation soapAction="http://www.imestech.com/wsERP/DelMaterialVendor" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateShift">
      <soap:operation soapAction="http://www.imestech.com/wsERP/CreateShift" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelShift">
      <soap:operation soapAction="http://www.imestech.com/wsERP/DelShift" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateOPGroup">
      <soap:operation soapAction="http://www.imestech.com/wsERP/CreateOPGroup" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelOPGroup">
      <soap:operation soapAction="http://www.imestech.com/wsERP/DelOPGroup" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReturnMaterial2MO">
      <soap:operation soapAction="http://www.imestech.com/wsERP/ReturnMaterial2MO" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UndoReturnMaterial2MO">
      <soap:operation soapAction="http://www.imestech.com/wsERP/UndoReturnMaterial2MO" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateSubcontractor">
      <soap:operation soapAction="http://www.imestech.com/wsERP/CreateSubcontractor" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelSubcontractor">
      <soap:operation soapAction="http://www.imestech.com/wsERP/DelSubcontractor" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TestDBConnection">
      <soap:operation soapAction="http://www.imestech.com/wsERP/TestDBConnection" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="invokeSrv">
      <soap:operation soapAction="http://www.imestech.com/wsERP/invokeSrv" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="qc_create">
      <soap:operation soapAction="http://www.imestech.com/wsERP/qc_create" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="qc_process">
      <soap:operation soapAction="http://www.imestech.com/wsERP/qc_process" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateWipInvRaw">
      <soap:operation soapAction="http://www.imestech.com/wsERP/CreateWipInvRaw" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateUser">
      <soap:operation soapAction="http://www.imestech.com/wsERP/CreateUser" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReturnERFDispositionResut">
      <soap:operation soapAction="http://www.imestech.com/wsERP/ReturnERFDispositionResut" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelWipInvRaw">
      <soap:operation soapAction="http://www.imestech.com/wsERP/DelWipInvRaw" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="wsERPSoap12" type="tns:wsERPSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="CreateMaterial">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/CreateMaterial" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelMaterial">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/DelMaterial" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateProduct">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/CreateProduct" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelProduct">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/DelProduct" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateCustomer">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/CreateCustomer" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelCustomer">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/DelCustomer" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateOperation">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/CreateOperation" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelOperation">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/DelOperation" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateInventory">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/CreateInventory" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelInventory">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/DelInventory" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateLocation">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/CreateLocation" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelLocation">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/DelLocation" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateDepartment">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/CreateDepartment" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelDepartment">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/DelDepartment" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddMO">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/AddMO" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="EditMO">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/EditMO" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelMO">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/DelMO" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CloseMO">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/CloseMO" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UndoCloseMO">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/UndoCloseMO" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="AddMaterial2MO">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/AddMaterial2MO" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UndoAddMaterial2MO">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/UndoAddMaterial2MO" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateEquipment">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/CreateEquipment" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelEquipment">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/DelEquipment" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateVendor">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/CreateVendor" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelVendor">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/DelVendor" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateMaterialVendor">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/CreateMaterialVendor" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelMaterialVendor">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/DelMaterialVendor" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateShift">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/CreateShift" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelShift">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/DelShift" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateOPGroup">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/CreateOPGroup" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelOPGroup">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/DelOPGroup" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReturnMaterial2MO">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/ReturnMaterial2MO" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="UndoReturnMaterial2MO">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/UndoReturnMaterial2MO" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateSubcontractor">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/CreateSubcontractor" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelSubcontractor">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/DelSubcontractor" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="TestDBConnection">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/TestDBConnection" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="invokeSrv">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/invokeSrv" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="qc_create">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/qc_create" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="qc_process">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/qc_process" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateWipInvRaw">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/CreateWipInvRaw" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="CreateUser">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/CreateUser" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="ReturnERFDispositionResut">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/ReturnERFDispositionResut" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
    <wsdl:operation name="DelWipInvRaw">
      <soap12:operation soapAction="http://www.imestech.com/wsERP/DelWipInvRaw" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="wsERP">
    <wsdl:port name="wsERPSoap" binding="tns:wsERPSoap">
      <soap:address location="http://192.168.68.167/MES_TEST_MESws_EAI/wsERP.asmx" />
    </wsdl:port>
    <wsdl:port name="wsERPSoap12" binding="tns:wsERPSoap12">
      <soap12:address location="http://192.168.68.167/MES_TEST_MESws_EAI/wsERP.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>