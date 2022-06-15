/**
 * GetStudentNamebyIdResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Services;

public class GetStudentNamebyIdResponse  implements java.io.Serializable {
    private java.lang.String getStudentNamebyIdReturn;

    public GetStudentNamebyIdResponse() {
    }

    public GetStudentNamebyIdResponse(
           java.lang.String getStudentNamebyIdReturn) {
           this.getStudentNamebyIdReturn = getStudentNamebyIdReturn;
    }


    /**
     * Gets the getStudentNamebyIdReturn value for this GetStudentNamebyIdResponse.
     * 
     * @return getStudentNamebyIdReturn
     */
    public java.lang.String getGetStudentNamebyIdReturn() {
        return getStudentNamebyIdReturn;
    }


    /**
     * Sets the getStudentNamebyIdReturn value for this GetStudentNamebyIdResponse.
     * 
     * @param getStudentNamebyIdReturn
     */
    public void setGetStudentNamebyIdReturn(java.lang.String getStudentNamebyIdReturn) {
        this.getStudentNamebyIdReturn = getStudentNamebyIdReturn;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetStudentNamebyIdResponse)) return false;
        GetStudentNamebyIdResponse other = (GetStudentNamebyIdResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getStudentNamebyIdReturn==null && other.getGetStudentNamebyIdReturn()==null) || 
             (this.getStudentNamebyIdReturn!=null &&
              this.getStudentNamebyIdReturn.equals(other.getGetStudentNamebyIdReturn())));
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
        if (getGetStudentNamebyIdReturn() != null) {
            _hashCode += getGetStudentNamebyIdReturn().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetStudentNamebyIdResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://Services", ">getStudentNamebyIdResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getStudentNamebyIdReturn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://Services", "getStudentNamebyIdReturn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
