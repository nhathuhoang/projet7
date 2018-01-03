/**
 * AccountOperation_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.proxibanqueSI.www.AccountOperation;

public interface AccountOperation_PortType extends java.rmi.Remote {
    public java.lang.String createOperation(org.proxibanqueSI.www.AccountOperation.OperationType operation) throws java.rmi.RemoteException;
    public org.proxibanqueSI.www.AccountOperation.OperationType[] getOperationByIdClient(int idClient) throws java.rmi.RemoteException;
}
