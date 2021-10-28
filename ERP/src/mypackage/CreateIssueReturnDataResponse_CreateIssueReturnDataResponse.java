/**
 * CreateIssueReturnDataResponse_CreateIssueReturnDataResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class CreateIssueReturnDataResponse_CreateIssueReturnDataResponse  implements java.io.Serializable {
    private java.lang.String response;

    public CreateIssueReturnDataResponse_CreateIssueReturnDataResponse() {
    }

    public CreateIssueReturnDataResponse_CreateIssueReturnDataResponse(
           java.lang.String response) {
           this.response = response;
    }


    /**
     * Gets the response value for this CreateIssueReturnDataResponse_CreateIssueReturnDataResponse.
     * 
     * @return response
     */
    public java.lang.String getResponse() {
        return response;
    }


    /**
     * Sets the response value for this CreateIssueReturnDataResponse_CreateIssueReturnDataResponse.
     * 
     * @param response
     */
    public void setResponse(java.lang.String response) {
        this.response = response;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateIssueReturnDataResponse_CreateIssueReturnDataResponse)) return false;
        CreateIssueReturnDataResponse_CreateIssueReturnDataResponse other = (CreateIssueReturnDataResponse_CreateIssueReturnDataResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateIssueReturnDataResponse_CreateIssueReturnDataResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "CreateIssueReturnDataResponse_CreateIssueReturnDataResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.dsc.com.tw/tiptop/TIPTOPServiceGateWay", "response"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
