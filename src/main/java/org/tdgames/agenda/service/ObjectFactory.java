
package org.tdgames.agenda.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tdgames.agenda.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ObtenerContactos_QNAME = new QName("http://service.agenda.tdgames.org/", "obtenerContactos");
    private final static QName _ObtenerContactosResponse_QNAME = new QName("http://service.agenda.tdgames.org/", "obtenerContactosResponse");
    private final static QName _CrearContactoResponse_QNAME = new QName("http://service.agenda.tdgames.org/", "crearContactoResponse");
    private final static QName _CrearContacto_QNAME = new QName("http://service.agenda.tdgames.org/", "crearContacto");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tdgames.agenda.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearContacto }
     * 
     */
    public CrearContacto createCrearContacto() {
        return new CrearContacto();
    }

    /**
     * Create an instance of {@link CrearContactoResponse }
     * 
     */
    public CrearContactoResponse createCrearContactoResponse() {
        return new CrearContactoResponse();
    }

    /**
     * Create an instance of {@link ObtenerContactos }
     * 
     */
    public ObtenerContactos createObtenerContactos() {
        return new ObtenerContactos();
    }

    /**
     * Create an instance of {@link ObtenerContactosResponse }
     * 
     */
    public ObtenerContactosResponse createObtenerContactosResponse() {
        return new ObtenerContactosResponse();
    }

    /**
     * Create an instance of {@link Contacto }
     * 
     */
    public Contacto createContacto() {
        return new Contacto();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerContactos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.agenda.tdgames.org/", name = "obtenerContactos")
    public JAXBElement<ObtenerContactos> createObtenerContactos(ObtenerContactos value) {
        return new JAXBElement<ObtenerContactos>(_ObtenerContactos_QNAME, ObtenerContactos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerContactosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.agenda.tdgames.org/", name = "obtenerContactosResponse")
    public JAXBElement<ObtenerContactosResponse> createObtenerContactosResponse(ObtenerContactosResponse value) {
        return new JAXBElement<ObtenerContactosResponse>(_ObtenerContactosResponse_QNAME, ObtenerContactosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearContactoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.agenda.tdgames.org/", name = "crearContactoResponse")
    public JAXBElement<CrearContactoResponse> createCrearContactoResponse(CrearContactoResponse value) {
        return new JAXBElement<CrearContactoResponse>(_CrearContactoResponse_QNAME, CrearContactoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearContacto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.agenda.tdgames.org/", name = "crearContacto")
    public JAXBElement<CrearContacto> createCrearContacto(CrearContacto value) {
        return new JAXBElement<CrearContacto>(_CrearContacto_QNAME, CrearContacto.class, null, value);
    }

}
