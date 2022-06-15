package Services;

public class StudentServiceImpProxy implements Services.StudentServiceImp {
  private String _endpoint = null;
  private Services.StudentServiceImp studentServiceImp = null;
  
  public StudentServiceImpProxy() {
    _initStudentServiceImpProxy();
  }
  
  public StudentServiceImpProxy(String endpoint) {
    _endpoint = endpoint;
    _initStudentServiceImpProxy();
  }
  
  private void _initStudentServiceImpProxy() {
    try {
      studentServiceImp = (new Services.StudentServiceImpServiceLocator()).getStudentServiceImp();
      if (studentServiceImp != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)studentServiceImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)studentServiceImp)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (studentServiceImp != null)
      ((javax.xml.rpc.Stub)studentServiceImp)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public Services.StudentServiceImp getStudentServiceImp() {
    if (studentServiceImp == null)
      _initStudentServiceImpProxy();
    return studentServiceImp;
  }
  
  public java.lang.Object getSession() throws java.rmi.RemoteException{
    if (studentServiceImp == null)
      _initStudentServiceImpProxy();
    return studentServiceImp.getSession();
  }
  
  public java.lang.String getStudentNamebyId(int id) throws java.rmi.RemoteException{
    if (studentServiceImp == null)
      _initStudentServiceImpProxy();
    return studentServiceImp.getStudentNamebyId(id);
  }
  
  
}