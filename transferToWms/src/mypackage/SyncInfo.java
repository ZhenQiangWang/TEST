/**
 * SyncInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class SyncInfo  implements java.io.Serializable {
    private java.lang.String application;

    private java.lang.String plant;

    private java.lang.String userid;

    public SyncInfo() {
    }

    public SyncInfo(
           java.lang.String application,
           java.lang.String plant,
           java.lang.String userid) {
           this.application = application;
           this.plant = plant;
           this.userid = userid;
    }


    /**
     * Gets the application value for this SyncInfo.
     * 
     * @return application
     */
    public java.lang.String getApplication() {
        return application;
    }


    /**
     * Sets the application value for this SyncInfo.
     * 
     * @param application
     */
    public void setApplication(java.lang.String application) {
        this.application = application;
    }


    /**
     * Gets the plant value for this SyncInfo.
     * 
     * @return plant
     */
    public java.lang.String getPlant() {
        return plant;
    }


    /**
     * Sets the plant value for this SyncInfo.
     * 
     * @param plant
     */
    public void setPlant(java.lang.String plant) {
        this.plant = plant;
    }


    /**
     * Gets the userid value for this SyncInfo.
     * 
     * @return userid
     */
    public java.lang.String getUserid() {
        return userid;
    }


    /**
     * Sets the userid value for this SyncInfo.
     * 
     * @param userid
     */
    public void setUserid(java.lang.String userid) {
        this.userid = userid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SyncInfo)) return false;
        SyncInfo other = (SyncInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.application==null && other.getApplication()==null) || 
             (this.application!=null &&
              this.application.equals(other.getApplication()))) &&
            ((this.plant==null && other.getPlant()==null) || 
             (this.plant!=null &&
              this.plant.equals(other.getPlant()))) &&
            ((this.userid==null && other.getUserid()==null) || 
             (this.userid!=null &&
              this.userid.equals(other.getUserid())));
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
        if (getApplication() != null) {
            _hashCode += getApplication().hashCode();
        }
        if (getPlant() != null) {
            _hashCode += getPlant().hashCode();
        }
        if (getUserid() != null) {
            _hashCode += getUserid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SyncInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.e1.cy.com", "syncInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("application");
        elemField.setXmlName(new javax.xml.namespace.QName("", "application"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userid");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userid"));
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
