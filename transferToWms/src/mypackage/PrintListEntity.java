/**
 * PrintListEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class PrintListEntity  implements java.io.Serializable {
    private java.lang.Integer copy;

    private java.lang.String direction;

    private java.lang.Integer id;

    private java.lang.String memo;

    private java.lang.String paper;

    private java.lang.String print;

    private java.lang.String pskey;

    private java.lang.String status;

    private java.lang.String url;

    public PrintListEntity() {
    }

    public PrintListEntity(
           java.lang.Integer copy,
           java.lang.String direction,
           java.lang.Integer id,
           java.lang.String memo,
           java.lang.String paper,
           java.lang.String print,
           java.lang.String pskey,
           java.lang.String status,
           java.lang.String url) {
           this.copy = copy;
           this.direction = direction;
           this.id = id;
           this.memo = memo;
           this.paper = paper;
           this.print = print;
           this.pskey = pskey;
           this.status = status;
           this.url = url;
    }


    /**
     * Gets the copy value for this PrintListEntity.
     * 
     * @return copy
     */
    public java.lang.Integer getCopy() {
        return copy;
    }


    /**
     * Sets the copy value for this PrintListEntity.
     * 
     * @param copy
     */
    public void setCopy(java.lang.Integer copy) {
        this.copy = copy;
    }


    /**
     * Gets the direction value for this PrintListEntity.
     * 
     * @return direction
     */
    public java.lang.String getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this PrintListEntity.
     * 
     * @param direction
     */
    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }


    /**
     * Gets the id value for this PrintListEntity.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this PrintListEntity.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the memo value for this PrintListEntity.
     * 
     * @return memo
     */
    public java.lang.String getMemo() {
        return memo;
    }


    /**
     * Sets the memo value for this PrintListEntity.
     * 
     * @param memo
     */
    public void setMemo(java.lang.String memo) {
        this.memo = memo;
    }


    /**
     * Gets the paper value for this PrintListEntity.
     * 
     * @return paper
     */
    public java.lang.String getPaper() {
        return paper;
    }


    /**
     * Sets the paper value for this PrintListEntity.
     * 
     * @param paper
     */
    public void setPaper(java.lang.String paper) {
        this.paper = paper;
    }


    /**
     * Gets the print value for this PrintListEntity.
     * 
     * @return print
     */
    public java.lang.String getPrint() {
        return print;
    }


    /**
     * Sets the print value for this PrintListEntity.
     * 
     * @param print
     */
    public void setPrint(java.lang.String print) {
        this.print = print;
    }


    /**
     * Gets the pskey value for this PrintListEntity.
     * 
     * @return pskey
     */
    public java.lang.String getPskey() {
        return pskey;
    }


    /**
     * Sets the pskey value for this PrintListEntity.
     * 
     * @param pskey
     */
    public void setPskey(java.lang.String pskey) {
        this.pskey = pskey;
    }


    /**
     * Gets the status value for this PrintListEntity.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this PrintListEntity.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the url value for this PrintListEntity.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this PrintListEntity.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PrintListEntity)) return false;
        PrintListEntity other = (PrintListEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.copy==null && other.getCopy()==null) || 
             (this.copy!=null &&
              this.copy.equals(other.getCopy()))) &&
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.memo==null && other.getMemo()==null) || 
             (this.memo!=null &&
              this.memo.equals(other.getMemo()))) &&
            ((this.paper==null && other.getPaper()==null) || 
             (this.paper!=null &&
              this.paper.equals(other.getPaper()))) &&
            ((this.print==null && other.getPrint()==null) || 
             (this.print!=null &&
              this.print.equals(other.getPrint()))) &&
            ((this.pskey==null && other.getPskey()==null) || 
             (this.pskey!=null &&
              this.pskey.equals(other.getPskey()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl())));
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
        if (getCopy() != null) {
            _hashCode += getCopy().hashCode();
        }
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getMemo() != null) {
            _hashCode += getMemo().hashCode();
        }
        if (getPaper() != null) {
            _hashCode += getPaper().hashCode();
        }
        if (getPrint() != null) {
            _hashCode += getPrint().hashCode();
        }
        if (getPskey() != null) {
            _hashCode += getPskey().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PrintListEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.e1.cy.com", "printListEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("copy");
        elemField.setXmlName(new javax.xml.namespace.QName("", "copy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paper");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paper"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("print");
        elemField.setXmlName(new javax.xml.namespace.QName("", "print"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pskey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pskey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("", "url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
