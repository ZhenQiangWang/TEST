/**
 * BaseItemStockEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class BaseItemStockEntity  implements java.io.Serializable {
    private java.lang.String blegal;

    private java.lang.String bplant;

    private java.lang.Long id;

    private java.lang.String isBatch;

    private java.lang.String isItemno;

    private java.math.BigDecimal isQty;

    private java.lang.String isStore;

    private java.lang.String isUnit;

    private java.lang.String isWare;

    public BaseItemStockEntity() {
    }

    public BaseItemStockEntity(
           java.lang.String blegal,
           java.lang.String bplant,
           java.lang.Long id,
           java.lang.String isBatch,
           java.lang.String isItemno,
           java.math.BigDecimal isQty,
           java.lang.String isStore,
           java.lang.String isUnit,
           java.lang.String isWare) {
           this.blegal = blegal;
           this.bplant = bplant;
           this.id = id;
           this.isBatch = isBatch;
           this.isItemno = isItemno;
           this.isQty = isQty;
           this.isStore = isStore;
           this.isUnit = isUnit;
           this.isWare = isWare;
    }


    /**
     * Gets the blegal value for this BaseItemStockEntity.
     * 
     * @return blegal
     */
    public java.lang.String getBlegal() {
        return blegal;
    }


    /**
     * Sets the blegal value for this BaseItemStockEntity.
     * 
     * @param blegal
     */
    public void setBlegal(java.lang.String blegal) {
        this.blegal = blegal;
    }


    /**
     * Gets the bplant value for this BaseItemStockEntity.
     * 
     * @return bplant
     */
    public java.lang.String getBplant() {
        return bplant;
    }


    /**
     * Sets the bplant value for this BaseItemStockEntity.
     * 
     * @param bplant
     */
    public void setBplant(java.lang.String bplant) {
        this.bplant = bplant;
    }


    /**
     * Gets the id value for this BaseItemStockEntity.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this BaseItemStockEntity.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the isBatch value for this BaseItemStockEntity.
     * 
     * @return isBatch
     */
    public java.lang.String getIsBatch() {
        return isBatch;
    }


    /**
     * Sets the isBatch value for this BaseItemStockEntity.
     * 
     * @param isBatch
     */
    public void setIsBatch(java.lang.String isBatch) {
        this.isBatch = isBatch;
    }


    /**
     * Gets the isItemno value for this BaseItemStockEntity.
     * 
     * @return isItemno
     */
    public java.lang.String getIsItemno() {
        return isItemno;
    }


    /**
     * Sets the isItemno value for this BaseItemStockEntity.
     * 
     * @param isItemno
     */
    public void setIsItemno(java.lang.String isItemno) {
        this.isItemno = isItemno;
    }


    /**
     * Gets the isQty value for this BaseItemStockEntity.
     * 
     * @return isQty
     */
    public java.math.BigDecimal getIsQty() {
        return isQty;
    }


    /**
     * Sets the isQty value for this BaseItemStockEntity.
     * 
     * @param isQty
     */
    public void setIsQty(java.math.BigDecimal isQty) {
        this.isQty = isQty;
    }


    /**
     * Gets the isStore value for this BaseItemStockEntity.
     * 
     * @return isStore
     */
    public java.lang.String getIsStore() {
        return isStore;
    }


    /**
     * Sets the isStore value for this BaseItemStockEntity.
     * 
     * @param isStore
     */
    public void setIsStore(java.lang.String isStore) {
        this.isStore = isStore;
    }


    /**
     * Gets the isUnit value for this BaseItemStockEntity.
     * 
     * @return isUnit
     */
    public java.lang.String getIsUnit() {
        return isUnit;
    }


    /**
     * Sets the isUnit value for this BaseItemStockEntity.
     * 
     * @param isUnit
     */
    public void setIsUnit(java.lang.String isUnit) {
        this.isUnit = isUnit;
    }


    /**
     * Gets the isWare value for this BaseItemStockEntity.
     * 
     * @return isWare
     */
    public java.lang.String getIsWare() {
        return isWare;
    }


    /**
     * Sets the isWare value for this BaseItemStockEntity.
     * 
     * @param isWare
     */
    public void setIsWare(java.lang.String isWare) {
        this.isWare = isWare;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BaseItemStockEntity)) return false;
        BaseItemStockEntity other = (BaseItemStockEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.blegal==null && other.getBlegal()==null) || 
             (this.blegal!=null &&
              this.blegal.equals(other.getBlegal()))) &&
            ((this.bplant==null && other.getBplant()==null) || 
             (this.bplant!=null &&
              this.bplant.equals(other.getBplant()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.isBatch==null && other.getIsBatch()==null) || 
             (this.isBatch!=null &&
              this.isBatch.equals(other.getIsBatch()))) &&
            ((this.isItemno==null && other.getIsItemno()==null) || 
             (this.isItemno!=null &&
              this.isItemno.equals(other.getIsItemno()))) &&
            ((this.isQty==null && other.getIsQty()==null) || 
             (this.isQty!=null &&
              this.isQty.equals(other.getIsQty()))) &&
            ((this.isStore==null && other.getIsStore()==null) || 
             (this.isStore!=null &&
              this.isStore.equals(other.getIsStore()))) &&
            ((this.isUnit==null && other.getIsUnit()==null) || 
             (this.isUnit!=null &&
              this.isUnit.equals(other.getIsUnit()))) &&
            ((this.isWare==null && other.getIsWare()==null) || 
             (this.isWare!=null &&
              this.isWare.equals(other.getIsWare())));
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
        if (getBlegal() != null) {
            _hashCode += getBlegal().hashCode();
        }
        if (getBplant() != null) {
            _hashCode += getBplant().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIsBatch() != null) {
            _hashCode += getIsBatch().hashCode();
        }
        if (getIsItemno() != null) {
            _hashCode += getIsItemno().hashCode();
        }
        if (getIsQty() != null) {
            _hashCode += getIsQty().hashCode();
        }
        if (getIsStore() != null) {
            _hashCode += getIsStore().hashCode();
        }
        if (getIsUnit() != null) {
            _hashCode += getIsUnit().hashCode();
        }
        if (getIsWare() != null) {
            _hashCode += getIsWare().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BaseItemStockEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.e1.cy.com", "baseItemStockEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blegal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "blegal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bplant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bplant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBatch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isBatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isItemno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isItemno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isQty");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isQty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isStore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isStore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWare");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isWare"));
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
