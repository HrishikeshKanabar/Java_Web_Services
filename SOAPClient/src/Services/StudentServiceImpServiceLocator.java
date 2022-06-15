/**
 * StudentServiceImpServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package Services;

public class StudentServiceImpServiceLocator extends org.apache.axis.client.Service implements Services.StudentServiceImpService {

    public StudentServiceImpServiceLocator() {
    }


    public StudentServiceImpServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StudentServiceImpServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StudentServiceImp
    private java.lang.String StudentServiceImp_address = "http://localhost:1993/SoapDatabaseService/services/StudentServiceImp";

    public java.lang.String getStudentServiceImpAddress() {
        return StudentServiceImp_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StudentServiceImpWSDDServiceName = "StudentServiceImp";

    public java.lang.String getStudentServiceImpWSDDServiceName() {
        return StudentServiceImpWSDDServiceName;
    }

    public void setStudentServiceImpWSDDServiceName(java.lang.String name) {
        StudentServiceImpWSDDServiceName = name;
    }

    public Services.StudentServiceImp getStudentServiceImp() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StudentServiceImp_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStudentServiceImp(endpoint);
    }

    public Services.StudentServiceImp getStudentServiceImp(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            Services.StudentServiceImpSoapBindingStub _stub = new Services.StudentServiceImpSoapBindingStub(portAddress, this);
            _stub.setPortName(getStudentServiceImpWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStudentServiceImpEndpointAddress(java.lang.String address) {
        StudentServiceImp_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (Services.StudentServiceImp.class.isAssignableFrom(serviceEndpointInterface)) {
                Services.StudentServiceImpSoapBindingStub _stub = new Services.StudentServiceImpSoapBindingStub(new java.net.URL(StudentServiceImp_address), this);
                _stub.setPortName(getStudentServiceImpWSDDServiceName());
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
        if ("StudentServiceImp".equals(inputPortName)) {
            return getStudentServiceImp();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Services", "StudentServiceImpService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Services", "StudentServiceImp"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StudentServiceImp".equals(portName)) {
            setStudentServiceImpEndpointAddress(address);
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
