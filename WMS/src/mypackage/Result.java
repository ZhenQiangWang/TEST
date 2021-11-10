/**
 * Result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public class Result  implements java.io.Serializable {
    private java.lang.Integer bcode;

    private java.lang.Object data;

    private java.lang.String[] errorMac;

    private java.lang.String lang;

    private java.lang.String mess;

    private java.lang.String msg;

    private java.lang.String status;

    private java.lang.String success;

    private java.lang.String[] taskId;

    private mypackage.ThreadInfo[] threadInfos;

    public Result() {
    }

    public Result(
           java.lang.Integer bcode,
           java.lang.Object data,
           java.lang.String[] errorMac,
           java.lang.String lang,
           java.lang.String mess,
           java.lang.String msg,
           java.lang.String status,
           java.lang.String success,
           java.lang.String[] taskId,
           mypackage.ThreadInfo[] threadInfos) {
           this.bcode = bcode;
           this.data = data;
           this.errorMac = errorMac;
           this.lang = lang;
           this.mess = mess;
           this.msg = msg;
           this.status = status;
           this.success = success;
           this.taskId = taskId;
           this.threadInfos = threadInfos;
    }


    /**
     * Gets the bcode value for this Result.
     * 
     * @return bcode
     */
    public java.lang.Integer getBcode() {
        return bcode;
    }


    /**
     * Sets the bcode value for this Result.
     * 
     * @param bcode
     */
    public void setBcode(java.lang.Integer bcode) {
        this.bcode = bcode;
    }


    /**
     * Gets the data value for this Result.
     * 
     * @return data
     */
    public java.lang.Object getData() {
        return data;
    }


    /**
     * Sets the data value for this Result.
     * 
     * @param data
     */
    public void setData(java.lang.Object data) {
        this.data = data;
    }


    /**
     * Gets the errorMac value for this Result.
     * 
     * @return errorMac
     */
    public java.lang.String[] getErrorMac() {
        return errorMac;
    }


    /**
     * Sets the errorMac value for this Result.
     * 
     * @param errorMac
     */
    public void setErrorMac(java.lang.String[] errorMac) {
        this.errorMac = errorMac;
    }

    public java.lang.String getErrorMac(int i) {
        return this.errorMac[i];
    }

    public void setErrorMac(int i, java.lang.String _value) {
        this.errorMac[i] = _value;
    }


    /**
     * Gets the lang value for this Result.
     * 
     * @return lang
     */
    public java.lang.String getLang() {
        return lang;
    }


    /**
     * Sets the lang value for this Result.
     * 
     * @param lang
     */
    public void setLang(java.lang.String lang) {
        this.lang = lang;
    }


    /**
     * Gets the mess value for this Result.
     * 
     * @return mess
     */
    public java.lang.String getMess() {
        return mess;
    }


    /**
     * Sets the mess value for this Result.
     * 
     * @param mess
     */
    public void setMess(java.lang.String mess) {
        this.mess = mess;
    }


    /**
     * Gets the msg value for this Result.
     * 
     * @return msg
     */
    public java.lang.String getMsg() {
        return msg;
    }


    /**
     * Sets the msg value for this Result.
     * 
     * @param msg
     */
    public void setMsg(java.lang.String msg) {
        this.msg = msg;
    }


    /**
     * Gets the status value for this Result.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Result.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the success value for this Result.
     * 
     * @return success
     */
    public java.lang.String getSuccess() {
        return success;
    }


    /**
     * Sets the success value for this Result.
     * 
     * @param success
     */
    public void setSuccess(java.lang.String success) {
        this.success = success;
    }


    /**
     * Gets the taskId value for this Result.
     * 
     * @return taskId
     */
    public java.lang.String[] getTaskId() {
        return taskId;
    }


    /**
     * Sets the taskId value for this Result.
     * 
     * @param taskId
     */
    public void setTaskId(java.lang.String[] taskId) {
        this.taskId = taskId;
    }

    public java.lang.String getTaskId(int i) {
        return this.taskId[i];
    }

    public void setTaskId(int i, java.lang.String _value) {
        this.taskId[i] = _value;
    }


    /**
     * Gets the threadInfos value for this Result.
     * 
     * @return threadInfos
     */
    public mypackage.ThreadInfo[] getThreadInfos() {
        return threadInfos;
    }


    /**
     * Sets the threadInfos value for this Result.
     * 
     * @param threadInfos
     */
    public void setThreadInfos(mypackage.ThreadInfo[] threadInfos) {
        this.threadInfos = threadInfos;
    }

    public mypackage.ThreadInfo getThreadInfos(int i) {
        return this.threadInfos[i];
    }

    public void setThreadInfos(int i, mypackage.ThreadInfo _value) {
        this.threadInfos[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Result)) return false;
        Result other = (Result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bcode==null && other.getBcode()==null) || 
             (this.bcode!=null &&
              this.bcode.equals(other.getBcode()))) &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.errorMac==null && other.getErrorMac()==null) || 
             (this.errorMac!=null &&
              java.util.Arrays.equals(this.errorMac, other.getErrorMac()))) &&
            ((this.lang==null && other.getLang()==null) || 
             (this.lang!=null &&
              this.lang.equals(other.getLang()))) &&
            ((this.mess==null && other.getMess()==null) || 
             (this.mess!=null &&
              this.mess.equals(other.getMess()))) &&
            ((this.msg==null && other.getMsg()==null) || 
             (this.msg!=null &&
              this.msg.equals(other.getMsg()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.success==null && other.getSuccess()==null) || 
             (this.success!=null &&
              this.success.equals(other.getSuccess()))) &&
            ((this.taskId==null && other.getTaskId()==null) || 
             (this.taskId!=null &&
              java.util.Arrays.equals(this.taskId, other.getTaskId()))) &&
            ((this.threadInfos==null && other.getThreadInfos()==null) || 
             (this.threadInfos!=null &&
              java.util.Arrays.equals(this.threadInfos, other.getThreadInfos())));
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
        if (getBcode() != null) {
            _hashCode += getBcode().hashCode();
        }
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getErrorMac() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrorMac());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrorMac(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLang() != null) {
            _hashCode += getLang().hashCode();
        }
        if (getMess() != null) {
            _hashCode += getMess().hashCode();
        }
        if (getMsg() != null) {
            _hashCode += getMsg().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSuccess() != null) {
            _hashCode += getSuccess().hashCode();
        }
        if (getTaskId() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaskId());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaskId(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThreadInfos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getThreadInfos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getThreadInfos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservices.e1.cy.com", "result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMac");
        elemField.setXmlName(new javax.xml.namespace.QName("", "errorMac"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lang");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lang"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mess");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mess"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("msg");
        elemField.setXmlName(new javax.xml.namespace.QName("", "msg"));
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
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threadInfos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "threadInfos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservices.e1.cy.com", "threadInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
