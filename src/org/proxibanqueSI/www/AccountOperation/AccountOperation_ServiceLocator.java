/**
 * AccountOperation_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.proxibanqueSI.www.AccountOperation;

public class AccountOperation_ServiceLocator extends org.apache.axis.client.Service implements org.proxibanqueSI.www.AccountOperation.AccountOperation_Service {

    public AccountOperation_ServiceLocator() {
    }


    public AccountOperation_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AccountOperation_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AccountOperationSOAP
    private java.lang.String AccountOperationSOAP_address = "http://localhost:8080/proxibanqueSIv3/services/AccountOperationSOAP";

    public java.lang.String getAccountOperationSOAPAddress() {
        return AccountOperationSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AccountOperationSOAPWSDDServiceName = "AccountOperationSOAP";

    public java.lang.String getAccountOperationSOAPWSDDServiceName() {
        return AccountOperationSOAPWSDDServiceName;
    }

    public void setAccountOperationSOAPWSDDServiceName(java.lang.String name) {
        AccountOperationSOAPWSDDServiceName = name;
    }

    public org.proxibanqueSI.www.AccountOperation.AccountOperation_PortType getAccountOperationSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AccountOperationSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAccountOperationSOAP(endpoint);
    }

    public org.proxibanqueSI.www.AccountOperation.AccountOperation_PortType getAccountOperationSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.proxibanqueSI.www.AccountOperation.AccountOperationSOAPStub _stub = new org.proxibanqueSI.www.AccountOperation.AccountOperationSOAPStub(portAddress, this);
            _stub.setPortName(getAccountOperationSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAccountOperationSOAPEndpointAddress(java.lang.String address) {
        AccountOperationSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.proxibanqueSI.www.AccountOperation.AccountOperation_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.proxibanqueSI.www.AccountOperation.AccountOperationSOAPStub _stub = new org.proxibanqueSI.www.AccountOperation.AccountOperationSOAPStub(new java.net.URL(AccountOperationSOAP_address), this);
                _stub.setPortName(getAccountOperationSOAPWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("AccountOperationSOAP".equals(inputPortName)) {
            return getAccountOperationSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.proxibanqueSI.org/AccountOperation/", "AccountOperation");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.proxibanqueSI.org/AccountOperation/", "AccountOperationSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AccountOperationSOAP".equals(portName)) {
            setAccountOperationSOAPEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
