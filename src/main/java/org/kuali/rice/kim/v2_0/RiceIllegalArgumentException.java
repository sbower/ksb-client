
package org.kuali.rice.kim.v2_0;

import javax.xml.ws.WebFault;
import org.kuali.rice.core.v2_0.IllegalArgumentFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "IllegalArgumentFault", targetNamespace = "http://rice.kuali.org/core/v2_0")
public class RiceIllegalArgumentException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private IllegalArgumentFault faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public RiceIllegalArgumentException(String message, IllegalArgumentFault faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public RiceIllegalArgumentException(String message, IllegalArgumentFault faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: org.kuali.rice.core.v2_0.IllegalArgumentFault
     */
    public IllegalArgumentFault getFaultInfo() {
        return faultInfo;
    }

}
