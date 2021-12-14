/**
 * SubCompanyBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class SubCompanyBean  implements java.io.Serializable {
    private java.lang.String _canceled;

    private java.lang.String _code;

    private java.lang.String _fullname;

    private java.lang.String _shortname;

    private java.lang.String _showorder;

    private java.lang.String _subcompanyid;

    private java.lang.String _supsubcompanyid;

    private java.lang.String _website;

    private java.lang.String action;

    private java.lang.String lastChangdate;

    public SubCompanyBean() {
    }

    public SubCompanyBean(
           java.lang.String _canceled,
           java.lang.String _code,
           java.lang.String _fullname,
           java.lang.String _shortname,
           java.lang.String _showorder,
           java.lang.String _subcompanyid,
           java.lang.String _supsubcompanyid,
           java.lang.String _website,
           java.lang.String action,
           java.lang.String lastChangdate) {
           this._canceled = _canceled;
           this._code = _code;
           this._fullname = _fullname;
           this._shortname = _shortname;
           this._showorder = _showorder;
           this._subcompanyid = _subcompanyid;
           this._supsubcompanyid = _supsubcompanyid;
           this._website = _website;
           this.action = action;
           this.lastChangdate = lastChangdate;
    }


    /**
     * Gets the _canceled value for this SubCompanyBean.
     * 
     * @return _canceled
     */
    public java.lang.String get_canceled() {
        return _canceled;
    }


    /**
     * Sets the _canceled value for this SubCompanyBean.
     * 
     * @param _canceled
     */
    public void set_canceled(java.lang.String _canceled) {
        this._canceled = _canceled;
    }


    /**
     * Gets the _code value for this SubCompanyBean.
     * 
     * @return _code
     */
    public java.lang.String get_code() {
        return _code;
    }


    /**
     * Sets the _code value for this SubCompanyBean.
     * 
     * @param _code
     */
    public void set_code(java.lang.String _code) {
        this._code = _code;
    }


    /**
     * Gets the _fullname value for this SubCompanyBean.
     * 
     * @return _fullname
     */
    public java.lang.String get_fullname() {
        return _fullname;
    }


    /**
     * Sets the _fullname value for this SubCompanyBean.
     * 
     * @param _fullname
     */
    public void set_fullname(java.lang.String _fullname) {
        this._fullname = _fullname;
    }


    /**
     * Gets the _shortname value for this SubCompanyBean.
     * 
     * @return _shortname
     */
    public java.lang.String get_shortname() {
        return _shortname;
    }


    /**
     * Sets the _shortname value for this SubCompanyBean.
     * 
     * @param _shortname
     */
    public void set_shortname(java.lang.String _shortname) {
        this._shortname = _shortname;
    }


    /**
     * Gets the _showorder value for this SubCompanyBean.
     * 
     * @return _showorder
     */
    public java.lang.String get_showorder() {
        return _showorder;
    }


    /**
     * Sets the _showorder value for this SubCompanyBean.
     * 
     * @param _showorder
     */
    public void set_showorder(java.lang.String _showorder) {
        this._showorder = _showorder;
    }


    /**
     * Gets the _subcompanyid value for this SubCompanyBean.
     * 
     * @return _subcompanyid
     */
    public java.lang.String get_subcompanyid() {
        return _subcompanyid;
    }


    /**
     * Sets the _subcompanyid value for this SubCompanyBean.
     * 
     * @param _subcompanyid
     */
    public void set_subcompanyid(java.lang.String _subcompanyid) {
        this._subcompanyid = _subcompanyid;
    }


    /**
     * Gets the _supsubcompanyid value for this SubCompanyBean.
     * 
     * @return _supsubcompanyid
     */
    public java.lang.String get_supsubcompanyid() {
        return _supsubcompanyid;
    }


    /**
     * Sets the _supsubcompanyid value for this SubCompanyBean.
     * 
     * @param _supsubcompanyid
     */
    public void set_supsubcompanyid(java.lang.String _supsubcompanyid) {
        this._supsubcompanyid = _supsubcompanyid;
    }


    /**
     * Gets the _website value for this SubCompanyBean.
     * 
     * @return _website
     */
    public java.lang.String get_website() {
        return _website;
    }


    /**
     * Sets the _website value for this SubCompanyBean.
     * 
     * @param _website
     */
    public void set_website(java.lang.String _website) {
        this._website = _website;
    }


    /**
     * Gets the action value for this SubCompanyBean.
     * 
     * @return action
     */
    public java.lang.String getAction() {
        return action;
    }


    /**
     * Sets the action value for this SubCompanyBean.
     * 
     * @param action
     */
    public void setAction(java.lang.String action) {
        this.action = action;
    }


    /**
     * Gets the lastChangdate value for this SubCompanyBean.
     * 
     * @return lastChangdate
     */
    public java.lang.String getLastChangdate() {
        return lastChangdate;
    }


    /**
     * Sets the lastChangdate value for this SubCompanyBean.
     * 
     * @param lastChangdate
     */
    public void setLastChangdate(java.lang.String lastChangdate) {
        this.lastChangdate = lastChangdate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubCompanyBean)) return false;
        SubCompanyBean other = (SubCompanyBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this._canceled==null && other.get_canceled()==null) || 
             (this._canceled!=null &&
              this._canceled.equals(other.get_canceled()))) &&
            ((this._code==null && other.get_code()==null) || 
             (this._code!=null &&
              this._code.equals(other.get_code()))) &&
            ((this._fullname==null && other.get_fullname()==null) || 
             (this._fullname!=null &&
              this._fullname.equals(other.get_fullname()))) &&
            ((this._shortname==null && other.get_shortname()==null) || 
             (this._shortname!=null &&
              this._shortname.equals(other.get_shortname()))) &&
            ((this._showorder==null && other.get_showorder()==null) || 
             (this._showorder!=null &&
              this._showorder.equals(other.get_showorder()))) &&
            ((this._subcompanyid==null && other.get_subcompanyid()==null) || 
             (this._subcompanyid!=null &&
              this._subcompanyid.equals(other.get_subcompanyid()))) &&
            ((this._supsubcompanyid==null && other.get_supsubcompanyid()==null) || 
             (this._supsubcompanyid!=null &&
              this._supsubcompanyid.equals(other.get_supsubcompanyid()))) &&
            ((this._website==null && other.get_website()==null) || 
             (this._website!=null &&
              this._website.equals(other.get_website()))) &&
            ((this.action==null && other.getAction()==null) || 
             (this.action!=null &&
              this.action.equals(other.getAction()))) &&
            ((this.lastChangdate==null && other.getLastChangdate()==null) || 
             (this.lastChangdate!=null &&
              this.lastChangdate.equals(other.getLastChangdate())));
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
        if (get_canceled() != null) {
            _hashCode += get_canceled().hashCode();
        }
        if (get_code() != null) {
            _hashCode += get_code().hashCode();
        }
        if (get_fullname() != null) {
            _hashCode += get_fullname().hashCode();
        }
        if (get_shortname() != null) {
            _hashCode += get_shortname().hashCode();
        }
        if (get_showorder() != null) {
            _hashCode += get_showorder().hashCode();
        }
        if (get_subcompanyid() != null) {
            _hashCode += get_subcompanyid().hashCode();
        }
        if (get_supsubcompanyid() != null) {
            _hashCode += get_supsubcompanyid().hashCode();
        }
        if (get_website() != null) {
            _hashCode += get_website().hashCode();
        }
        if (getAction() != null) {
            _hashCode += getAction().hashCode();
        }
        if (getLastChangdate() != null) {
            _hashCode += getLastChangdate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubCompanyBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "SubCompanyBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_canceled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_canceled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_fullname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_fullname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_shortname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_shortname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_showorder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_showorder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_subcompanyid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_subcompanyid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_supsubcompanyid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_supsubcompanyid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_website");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "_website"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("action");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastChangdate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://webservice.hrm.weaver", "lastChangdate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
