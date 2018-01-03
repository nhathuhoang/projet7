/**
 * OperationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.proxibanqueSI.www.AccountOperation;

public class OperationType  implements java.io.Serializable {
    private java.lang.Integer idClient;

    private java.util.Date date;

    private java.lang.String type;

    private java.lang.Double montant;

    private java.lang.Integer idCompteDepart;

    private java.lang.Integer idCompteCible;

    private java.lang.String status;

    public OperationType() {
    }

    public OperationType(
           java.lang.Integer idClient,
           java.util.Date date,
           java.lang.String type,
           java.lang.Double montant,
           java.lang.Integer idCompteDepart,
           java.lang.Integer idCompteCible,
           java.lang.String status) {
           this.idClient = idClient;
           this.date = date;
           this.type = type;
           this.montant = montant;
           this.idCompteDepart = idCompteDepart;
           this.idCompteCible = idCompteCible;
           this.status = status;
    }


    /**
     * Gets the idClient value for this OperationType.
     * 
     * @return idClient
     */
    public java.lang.Integer getIdClient() {
        return idClient;
    }


    /**
     * Sets the idClient value for this OperationType.
     * 
     * @param idClient
     */
    public void setIdClient(java.lang.Integer idClient) {
        this.idClient = idClient;
    }


    /**
     * Gets the date value for this OperationType.
     * 
     * @return date
     */
    public java.util.Date getDate() {
        return date;
    }


    /**
     * Sets the date value for this OperationType.
     * 
     * @param date
     */
    public void setDate(java.util.Date date) {
        this.date = date;
    }


    /**
     * Gets the type value for this OperationType.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this OperationType.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the montant value for this OperationType.
     * 
     * @return montant
     */
    public java.lang.Double getMontant() {
        return montant;
    }


    /**
     * Sets the montant value for this OperationType.
     * 
     * @param montant
     */
    public void setMontant(java.lang.Double montant) {
        this.montant = montant;
    }


    /**
     * Gets the idCompteDepart value for this OperationType.
     * 
     * @return idCompteDepart
     */
    public java.lang.Integer getIdCompteDepart() {
        return idCompteDepart;
    }


    /**
     * Sets the idCompteDepart value for this OperationType.
     * 
     * @param idCompteDepart
     */
    public void setIdCompteDepart(java.lang.Integer idCompteDepart) {
        this.idCompteDepart = idCompteDepart;
    }


    /**
     * Gets the idCompteCible value for this OperationType.
     * 
     * @return idCompteCible
     */
    public java.lang.Integer getIdCompteCible() {
        return idCompteCible;
    }


    /**
     * Sets the idCompteCible value for this OperationType.
     * 
     * @param idCompteCible
     */
    public void setIdCompteCible(java.lang.Integer idCompteCible) {
        this.idCompteCible = idCompteCible;
    }


    /**
     * Gets the status value for this OperationType.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this OperationType.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationType)) return false;
        OperationType other = (OperationType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idClient==null && other.getIdClient()==null) || 
             (this.idClient!=null &&
              this.idClient.equals(other.getIdClient()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.montant==null && other.getMontant()==null) || 
             (this.montant!=null &&
              this.montant.equals(other.getMontant()))) &&
            ((this.idCompteDepart==null && other.getIdCompteDepart()==null) || 
             (this.idCompteDepart!=null &&
              this.idCompteDepart.equals(other.getIdCompteDepart()))) &&
            ((this.idCompteCible==null && other.getIdCompteCible()==null) || 
             (this.idCompteCible!=null &&
              this.idCompteCible.equals(other.getIdCompteCible()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getIdClient() != null) {
            _hashCode += getIdClient().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getMontant() != null) {
            _hashCode += getMontant().hashCode();
        }
        if (getIdCompteDepart() != null) {
            _hashCode += getIdCompteDepart().hashCode();
        }
        if (getIdCompteCible() != null) {
            _hashCode += getIdCompteCible().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.proxibanqueSI.org/AccountOperation/", "OperationType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idClient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdClient"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Montant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCompteDepart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdCompteDepart"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCompteCible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IdCompteCible"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Status"));
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "OperationType [idClient=" + idClient + ", date=" + date + ", type=" + type + ", montant=" + montant
				+ ", idCompteDepart=" + idCompteDepart + ", idCompteCible=" + idCompteCible + ", status=" + status
				+ "]";
	}
    

}
