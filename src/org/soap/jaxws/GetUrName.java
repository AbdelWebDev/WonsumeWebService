
package org.soap.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 3.1.7
 * Tue Sep 20 11:03:21 CEST 2016
 * Generated source version: 3.1.7
 */

@XmlRootElement(name = "getUrName", namespace = "http://soap.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getUrName", namespace = "http://soap.org/")

public class GetUrName {

    @XmlElement(name = "arg0")
    private java.lang.String arg0;

    public java.lang.String getArg0() {
        return this.arg0;
    }

    public void setArg0(java.lang.String newArg0)  {
        this.arg0 = newArg0;
    }

}

