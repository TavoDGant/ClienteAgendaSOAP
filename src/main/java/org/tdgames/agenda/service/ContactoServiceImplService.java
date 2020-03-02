
package org.tdgames.agenda.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ContactoServiceImplService", targetNamespace = "http://service.agenda.tdgames.org/", wsdlLocation = "http://aqueous-dawn-67673.herokuapp.com/ContactoService?wsdl")
public class ContactoServiceImplService
    extends Service
{

    private final static URL CONTACTOSERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CONTACTOSERVICEIMPLSERVICE_EXCEPTION;
    private final static QName CONTACTOSERVICEIMPLSERVICE_QNAME = new QName("http://service.agenda.tdgames.org/", "ContactoServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://aqueous-dawn-67673.herokuapp.com/ContactoService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CONTACTOSERVICEIMPLSERVICE_WSDL_LOCATION = url;
        CONTACTOSERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public ContactoServiceImplService() {
        super(__getWsdlLocation(), CONTACTOSERVICEIMPLSERVICE_QNAME);
    }

    public ContactoServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CONTACTOSERVICEIMPLSERVICE_QNAME, features);
    }

    public ContactoServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, CONTACTOSERVICEIMPLSERVICE_QNAME);
    }

    public ContactoServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CONTACTOSERVICEIMPLSERVICE_QNAME, features);
    }

    public ContactoServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ContactoServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ContactoService
     */
    @WebEndpoint(name = "ContactoServiceImplPort")
    public ContactoService getContactoServiceImplPort() {
        return super.getPort(new QName("http://service.agenda.tdgames.org/", "ContactoServiceImplPort"), ContactoService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ContactoService
     */
    @WebEndpoint(name = "ContactoServiceImplPort")
    public ContactoService getContactoServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.agenda.tdgames.org/", "ContactoServiceImplPort"), ContactoService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CONTACTOSERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw CONTACTOSERVICEIMPLSERVICE_EXCEPTION;
        }
        return CONTACTOSERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
