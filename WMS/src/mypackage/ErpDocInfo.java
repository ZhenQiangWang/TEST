/**
 * ErpDocInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class ErpDocInfo  implements java.io.Serializable {
    private java.lang.String[] argvs;

    private java.lang.Integer cnt;

    private java.lang.String db;

    private mypackage.DocnoInfo[] details;

    private java.lang.String docno;

    private java.lang.String plant;

    private java.lang.String refdocno;

    private java.lang.String user;

    public ErpDocInfo() {
    }

    public ErpDocInfo(
           java.lang.String[] argvs,
           java.lang.Integer cnt,
           java.lang.String db,
           mypackage.DocnoInfo[] details,
           java.lang.String docno,
           java.lang.String plant,
           java.lang.String refdocno,
           java.lang.String user) {
           this.argvs = argvs;
           this.cnt = cnt;
           this.db = db;
           this.details = details;
           this.docno = docno;
           this.plant = plant;
           this.refdocno = refdocno;
           this.user = user;
    }


    /**
     * Gets the argvs value for this ErpDocInfo.
     * 
     * @return argvs
     */
    public java.lang.String[] getArgvs() {
        return argvs;
    }


    /**
     * Sets the argvs value for this ErpDocInfo.
     * 
     * @param argvs
     */
    public void setArgvs(java.lang.String[] argvs) {
        this.argvs = argvs;
    }

    public java.lang.String getArgvs(int i) {
        return this.argvs[i];
    }

    public void setArgvs(int i, java.lang.String _value) {
        this.argvs[i] = _value;
    }


    /**
     * Gets the cnt value for this ErpDocInfo.
     * 
     * @return cnt
     */
    public java.lang.Integer getCnt() {
        return cnt;
    }


    /**
     * Sets the cnt value for this ErpDocInfo.
     * 
     * @param cnt
     */
    public void setCnt(java.lang.Integer cnt) {
        this.cnt = cnt;
    }


    /**
     * Gets the db value for this ErpDocInfo.
     * 
     * @return db
     */
    public java.lang.String getDb() {
        return db;
    }


    /**
     * Sets the db value for this ErpDocInfo.
     * 
     * @param db
     */
    public void setDb(java.lang.String db) {
        this.db = db;
    }


    /**
     * Gets the details value for this ErpDocInfo.
     * 
     * @return details
     */
    public mypackage.DocnoInfo[] getDetails() {
        return details;
    }


    /**
     * Sets the details value for this ErpDocInfo.
     * 
     * @param details
     */
    public void setDetails(mypackage.DocnoInfo[] details) {
        this.details = details;
    }

    public mypackage.DocnoInfo getDetails(int i) {
        return this.details[i];
    }

    public void setDetails(int i, mypackage.DocnoInfo _value) {
        this.details[i] = _value;
    }


    /**
     * Gets the docno value for this ErpDocInfo.
     * 
     * @return docno
     */
    public java.lang.String getDocno() {
        return docno;
    }


    /**
     * Sets the docno value for this ErpDocInfo.
     * 
     * @param docno
     */
    public void setDocno(java.lang.String docno) {
        this.docno = docno;
    }


    /**
     * Gets the plant value for this ErpDocInfo.
     * 
     * @return plant
     */
    public java.lang.String getPlant() {
        return plant;
    }


    /**
     * Sets the plant value for this ErpDocInfo.
     * 
     * @param plant
     */
    public void setPlant(java.lang.String plant) {
        this.plant = plant;
    }


    /**
     * Gets the refdocno value for this ErpDocInfo.
     * 
     * @return refdocno
     */
    public java.lang.String getRefdocno() {
        return refdocno;
    }


    /**
     * Sets the refdocno value for this ErpDocInfo.
     * 
     * @param refdocno
     */
    public void setRefdocno(java.lang.String refdocno) {
        this.refdocno = refdocno;
    }


    /**
     * Gets the user value for this ErpDocInfo.
     * 
     * @return user
     */
    public java.lang.String getUser() {
        return user;
    }


    /**
     * Sets the user value for this ErpDocInfo.
     * 
     * @param user
     */
    public void setUser(java.lang.String user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ErpDocInfo)) return false;
        ErpDocInfo other = (ErpDocInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.argvs==null && other.getArgvs()==null) || 
             (this.argvs!=null &&
              java.util.Arrays.equals(this.argvs, other.getArgvs()))) &&
            ((this.cnt==null && other.getCnt()==null) || 
             (this.cnt!=null &&
              this.cnt.equals(other.getCnt()))) &&
            ((this.db==null && other.getDb()==null) || 
             (this.db!=null &&
              this.db.equals(other.getDb()))) &&
            ((this.details==null && other.getDetails()==null) || 
             (this.details!=null &&
              java.util.Arrays.equals(this.details, other.getDetails()))) &&
            ((this.docno==null && other.getDocno()==null) || 
             (this.docno!=null &&
              this.docno.equals(other.getDocno()))) &&
            ((this.plant==null && other.getPlant()==null) || 
             (this.plant!=null &&
              this.plant.equals(other.getPlant()))) &&
            ((this.refdocno==null && other.getRefdocno()==null) || 
             (this.refdocno!=null &&
              this.refdocno.equals(other.getRefdocno()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser())));
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
        if (getArgvs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArgvs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArgvs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCnt() != null) {
            _hashCode += getCnt().hashCode();
        }
        if (getDb() != null) {
            _hashCode += getDb().hashCode();
        }
        if (getDetails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDetails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDetails(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDocno() != null) {
            _hashCode += getDocno().hashCode();
        }
        if (getPlant() != null) {
            _hashCode += getPlant().hashCode();
        }
        if (getRefdocno() != null) {
            _hashCode += getRefdocno().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ErpDocInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.e1.cy.com", "erpDocInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("argvs");
        elemField.setXmlName(new javax.xml.namespace.QName("", "argvs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnt");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cnt"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("db");
        elemField.setXmlName(new javax.xml.namespace.QName("", "db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("details");
        elemField.setXmlName(new javax.xml.namespace.QName("", "details"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.e1.cy.com", "docnoInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "docno"));
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
        elemField.setFieldName("refdocno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refdocno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("", "user"));
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
