//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.06 at 11:33:52 AM EDT 
//


package gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for channel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="channel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="startingSlot" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="routingPath" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "channel", propOrder = {
    "requestIndex",
    "startingSlot",
    "routingPath"
})
public class Channel {

    protected int requestIndex;
    protected int startingSlot;
    @XmlElement(type = Integer.class)
    protected List<Integer> routingPath;

    /**
     * Gets the value of the requestIndex property.
     * 
     */
    public int getRequestIndex() {
        return requestIndex;
    }

    /**
     * Sets the value of the requestIndex property.
     * 
     */
    public void setRequestIndex(int value) {
        this.requestIndex = value;
    }

    /**
     * Gets the value of the startingSlot property.
     * 
     */
    public int getStartingSlot() {
        return startingSlot;
    }

    /**
     * Sets the value of the startingSlot property.
     * 
     */
    public void setStartingSlot(int value) {
        this.startingSlot = value;
    }

    /**
     * Gets the value of the routingPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getRoutingPath() {
        if (routingPath == null) {
            routingPath = new ArrayList<Integer>();
        }
        return this.routingPath;
    }

}