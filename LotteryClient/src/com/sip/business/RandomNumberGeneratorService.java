
package com.sip.business;

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
@WebServiceClient(name = "RandomNumberGeneratorService", targetNamespace = "http://business.sip.com/", wsdlLocation = "file:/D:/temp.wsdl")
public class RandomNumberGeneratorService
    extends Service
{

    private final static URL RANDOMNUMBERGENERATORSERVICE_WSDL_LOCATION;
    private final static WebServiceException RANDOMNUMBERGENERATORSERVICE_EXCEPTION;
    private final static QName RANDOMNUMBERGENERATORSERVICE_QNAME = new QName("http://business.sip.com/", "RandomNumberGeneratorService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/temp.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        RANDOMNUMBERGENERATORSERVICE_WSDL_LOCATION = url;
        RANDOMNUMBERGENERATORSERVICE_EXCEPTION = e;
    }

    public RandomNumberGeneratorService() {
        super(__getWsdlLocation(), RANDOMNUMBERGENERATORSERVICE_QNAME);
    }

    public RandomNumberGeneratorService(WebServiceFeature... features) {
        super(__getWsdlLocation(), RANDOMNUMBERGENERATORSERVICE_QNAME, features);
    }

    public RandomNumberGeneratorService(URL wsdlLocation) {
        super(wsdlLocation, RANDOMNUMBERGENERATORSERVICE_QNAME);
    }

    public RandomNumberGeneratorService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, RANDOMNUMBERGENERATORSERVICE_QNAME, features);
    }

    public RandomNumberGeneratorService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public RandomNumberGeneratorService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns RandomNumberGenerator
     */
    @WebEndpoint(name = "RandomNumberGeneratorPort")
    public RandomNumberGenerator getRandomNumberGeneratorPort() {
        return super.getPort(new QName("http://business.sip.com/", "RandomNumberGeneratorPort"), RandomNumberGenerator.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns RandomNumberGenerator
     */
    @WebEndpoint(name = "RandomNumberGeneratorPort")
    public RandomNumberGenerator getRandomNumberGeneratorPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://business.sip.com/", "RandomNumberGeneratorPort"), RandomNumberGenerator.class, features);
    }

    private static URL __getWsdlLocation() {
        if (RANDOMNUMBERGENERATORSERVICE_EXCEPTION!= null) {
            throw RANDOMNUMBERGENERATORSERVICE_EXCEPTION;
        }
        return RANDOMNUMBERGENERATORSERVICE_WSDL_LOCATION;
    }

}
