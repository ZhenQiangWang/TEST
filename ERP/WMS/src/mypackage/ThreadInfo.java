/**
 * ThreadInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class ThreadInfo  implements java.io.Serializable {
    private java.lang.String db;

    private java.lang.String key0;

    private java.lang.String key1;

    private java.lang.String key2;

    private java.lang.String key3;

    private java.lang.String[] stringSet;

    private java.lang.String threadName;

    public ThreadInfo() {
    }

    public ThreadInfo(
           java.lang.String db,
           java.lang.String key0,
           java.lang.String key1,
           java.lang.String key2,
           java.lang.String key3,
           java.lang.String[] stringSet,
           java.lang.String threadName) {
           this.db = db;
           this.key0 = key0;
           this.key1 = key1;
           this.key2 = key2;
           this.key3 = key3;
           this.stringSet = stringSet;
           this.threadName = threadName;
    }


    /**
     * Gets the db value for this ThreadInfo.
     * 
     * @return db
     */
    public java.lang.String getDb() {
        return db;
    }


    /**
     * Sets the db value for this ThreadInfo.
     * 
     * @param db
     */
    public void setDb(java.lang.String db) {
        this.db = db;
    }


    /**
     * Gets the key0 value for this ThreadInfo.
     * 
     * @return key0
     */
    public java.lang.String getKey0() {
        return key0;
    }


    /**
     * Sets the key0 value for this ThreadInfo.
     * 
     * @param key0
     */
    public void setKey0(java.lang.String key0) {
        this.key0 = key0;
    }


    /**
     * Gets the key1 value for this ThreadInfo.
     * 
     * @return key1
     */
    public java.lang.String getKey1() {
        return key1;
    }


    /**
     * Sets the key1 value for this ThreadInfo.
     * 
     * @param key1
     */
    public void setKey1(java.lang.String key1) {
        this.key1 = key1;
    }


    /**
     * Gets the key2 value for this ThreadInfo.
     * 
     * @return key2
     */
    public java.lang.String getKey2() {
        return key2;
    }


    /**
     * Sets the key2 value for this ThreadInfo.
     * 
     * @param key2
     */
    public void setKey2(java.lang.String key2) {
        this.key2 = key2;
    }


    /**
     * Gets the key3 value for this ThreadInfo.
     * 
     * @return key3
     */
    public java.lang.String getKey3() {
        return key3;
    }


    /**
     * Sets the key3 value for this ThreadInfo.
     * 
     * @param key3
     */
    public void setKey3(java.lang.String key3) {
        this.key3 = key3;
    }


    /**
     * Gets the stringSet value for this ThreadInfo.
     * 
     * @return stringSet
     */
    public java.lang.String[] getStringSet() {
        return stringSet;
    }


    /**
     * Sets the stringSet value for this ThreadInfo.
     * 
     * @param stringSet
     */
    public void setStringSet(java.lang.String[] stringSet) {
        this.stringSet = stringSet;
    }

    public java.lang.String getStringSet(int i) {
        return this.stringSet[i];
    }

    public void setStringSet(int i, java.lang.String _value) {
        this.stringSet[i] = _value;
    }


    /**
     * Gets the threadName value for this ThreadInfo.
     * 
     * @return threadName
     */
    public java.lang.String getThreadName() {
        return threadName;
    }


    /**
     * Sets the threadName value for this ThreadInfo.
     * 
     * @param threadName
     */
    public void setThreadName(java.lang.String threadName) {
        this.threadName = threadName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ThreadInfo)) return false;
        ThreadInfo other = (ThreadInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.db==null && other.getDb()==null) || 
             (this.db!=null &&
              this.db.equals(other.getDb()))) &&
            ((this.key0==null && other.getKey0()==null) || 
             (this.key0!=null &&
              this.key0.equals(other.getKey0()))) &&
            ((this.key1==null && other.getKey1()==null) || 
             (this.key1!=null &&
              this.key1.equals(other.getKey1()))) &&
            ((this.key2==null && other.getKey2()==null) || 
             (this.key2!=null &&
              this.key2.equals(other.getKey2()))) &&
            ((this.key3==null && other.getKey3()==null) || 
             (this.key3!=null &&
              this.key3.equals(other.getKey3()))) &&
            ((this.stringSet==null && other.getStringSet()==null) || 
             (this.stringSet!=null &&
              java.util.Arrays.equals(this.stringSet, other.getStringSet()))) &&
            ((this.threadName==null && other.getThreadName()==null) || 
             (this.threadName!=null &&
              this.threadName.equals(other.getThreadName())));
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
        if (getDb() != null) {
            _hashCode += getDb().hashCode();
        }
        if (getKey0() != null) {
            _hashCode += getKey0().hashCode();
        }
        if (getKey1() != null) {
            _hashCode += getKey1().hashCode();
        }
        if (getKey2() != null) {
            _hashCode += getKey2().hashCode();
        }
        if (getKey3() != null) {
            _hashCode += getKey3().hashCode();
        }
        if (getStringSet() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStringSet());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStringSet(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThreadName() != null) {
            _hashCode += getThreadName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ThreadInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.e1.cy.com", "threadInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("db");
        elemField.setXmlName(new javax.xml.namespace.QName("", "db"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key0");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key0"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "key3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stringSet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stringSet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threadName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "threadName"));
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
