package org.proxibanqueSI.www.AccountOperation;

public class AccountOperationProxy implements org.proxibanqueSI.www.AccountOperation.AccountOperation_PortType {
  private String _endpoint = null;
  private org.proxibanqueSI.www.AccountOperation.AccountOperation_PortType accountOperation_PortType = null;
  
  public AccountOperationProxy() {
    _initAccountOperationProxy();
  }
  
  public AccountOperationProxy(String endpoint) {
    _endpoint = endpoint;
    _initAccountOperationProxy();
  }
  
  private void _initAccountOperationProxy() {
    try {
      accountOperation_PortType = (new org.proxibanqueSI.www.AccountOperation.AccountOperation_ServiceLocator()).getAccountOperationSOAP();
      if (accountOperation_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)accountOperation_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)accountOperation_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (accountOperation_PortType != null)
      ((javax.xml.rpc.Stub)accountOperation_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.proxibanqueSI.www.AccountOperation.AccountOperation_PortType getAccountOperation_PortType() {
    if (accountOperation_PortType == null)
      _initAccountOperationProxy();
    return accountOperation_PortType;
  }
  
  public java.lang.String createOperation(org.proxibanqueSI.www.AccountOperation.OperationType operation) throws java.rmi.RemoteException{
    if (accountOperation_PortType == null)
      _initAccountOperationProxy();
    return accountOperation_PortType.createOperation(operation);
  }
  
  public org.proxibanqueSI.www.AccountOperation.OperationType[] getOperationByIdClient(int idClient) throws java.rmi.RemoteException{
    if (accountOperation_PortType == null)
      _initAccountOperationProxy();
    return accountOperation_PortType.getOperationByIdClient(idClient);
  }
  
  
}