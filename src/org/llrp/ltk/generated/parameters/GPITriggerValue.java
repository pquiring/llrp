/*
 *
 * This file was generated by LLRP Code Generator
 * see http://llrp-toolkit.cvs.sourceforge.net/llrp-toolkit/
 * for more information
 * Generated on: Sun Apr 08 14:14:11 EDT 2012;
 *
 */

/*
 * Copyright 2007 ETH Zurich
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 */
package org.llrp.ltk.generated.parameters;

import org.apache.log4j.Logger;

import org.jdom.Content;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;

import org.llrp.ltk.exceptions.InvalidLLRPMessageException;
import org.llrp.ltk.exceptions.MissingParameterException;
import org.llrp.ltk.generated.LLRPConstants;
import org.llrp.ltk.types.Bit;
import org.llrp.ltk.types.BitList;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedInteger;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;


/**
 * This trigger is tied to an event on the General Purpose Input (GPI) of the Reader. The event is represented as a boolean type, and it is up to the internal implementation of the Reader to map exact physical event to a boolean type. For example, a 0 to 1 and a 1 to 0 transition on an input pin of the Reader could be mapped to a boolean true and a  boolean false event respectively.This trigger parameter has a timeout value field. The timeout is useful for specifying a fail-safe timeout when this trigger is used as a stop trigger. When the timeout is 0, it indicates that there is no timeout. When used as a start trigger, the timeout value SHALL be ignored.Readers that do not support GPIs SHALL return zero for numGPIs in the capabilities discovery. If the Client sets up the GPI trigger for such a Reader, the Reader SHALL send an error message for the ADD_ROSPEC message and not add the ROSpec.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=57&view=fit">LLRP Specification Section 10.2.1.1.1.2</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=136&view=fit">LLRP Specification Section 16.2.4.1.1.1.2</a>}


 */

/**
 * This trigger is tied to an event on the General Purpose Input (GPI) of the Reader. The event is represented as a boolean type, and it is up to the internal implementation of the Reader to map exact physical event to a boolean type. For example, a 0 to 1 and a 1 to 0 transition on an input pin of the Reader could be mapped to a boolean true and a  boolean false event respectively.This trigger parameter has a timeout value field. The timeout is useful for specifying a fail-safe timeout when this trigger is used as a stop trigger. When the timeout is 0, it indicates that there is no timeout. When used as a start trigger, the timeout value SHALL be ignored.Readers that do not support GPIs SHALL return zero for numGPIs in the capabilities discovery. If the Client sets up the GPI trigger for such a Reader, the Reader SHALL send an error message for the ADD_ROSPEC message and not add the ROSpec.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=57&view=fit">LLRP Specification Section 10.2.1.1.1.2</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=136&view=fit">LLRP Specification Section 16.2.4.1.1.1.2</a>}

      .
 */
public class GPITriggerValue extends TLVParameter {
    public static final SignedShort TYPENUM = new SignedShort(181);
    private static final Logger LOGGER = Logger.getLogger(GPITriggerValue.class);
    protected UnsignedShort gPIPortNum;
    protected Bit gPIEvent;
    protected BitList reserved0 = new BitList(7);
    protected UnsignedInteger timeout;

    /**
     * empty constructor to create new parameter.
     */
    public GPITriggerValue() {
    }

    /**
     * Constructor to create parameter from binary encoded parameter
     * calls decodeBinary to decode parameter.
     * @param list to be decoded
     */
    public GPITriggerValue(LLRPBitList list) {
        decodeBinary(list);
    }

    /**
    * Constructor to create parameter from xml encoded parameter
    * calls decodeXML to decode parameter.
    * @param element to be decoded
    */
    public GPITriggerValue(Element element) throws InvalidLLRPMessageException {
        decodeXML(element);
    }

    /**
    * {@inheritDoc}
    */
    public LLRPBitList encodeBinarySpecific() {
        LLRPBitList resultBits = new LLRPBitList();

        if (gPIPortNum == null) {
            LOGGER.warn(" gPIPortNum not set");
            throw new MissingParameterException(
                " gPIPortNum not set  for Parameter of Type GPITriggerValue");
        }

        resultBits.append(gPIPortNum.encodeBinary());

        if (gPIEvent == null) {
            LOGGER.warn(" gPIEvent not set");
            throw new MissingParameterException(
                " gPIEvent not set  for Parameter of Type GPITriggerValue");
        }

        resultBits.append(gPIEvent.encodeBinary());
        resultBits.append(reserved0.encodeBinary());

        if (timeout == null) {
            LOGGER.warn(" timeout not set");
            throw new MissingParameterException(
                " timeout not set  for Parameter of Type GPITriggerValue");
        }

        resultBits.append(timeout.encodeBinary());

        return resultBits;
    }

    /**
    * {@inheritDoc}
    */
    public Content encodeXML(String name, Namespace ns) {
        // element in namespace defined by parent element
        Element element = new Element(name, ns);
        // child element are always in default LLRP namespace
        ns = Namespace.getNamespace("llrp", LLRPConstants.LLRPNAMESPACE);

        if (gPIPortNum == null) {
            LOGGER.warn(" gPIPortNum not set");
            throw new MissingParameterException(" gPIPortNum not set");
        } else {
            element.addContent(gPIPortNum.encodeXML("GPIPortNum", ns));
        }

        if (gPIEvent == null) {
            LOGGER.warn(" gPIEvent not set");
            throw new MissingParameterException(" gPIEvent not set");
        } else {
            element.addContent(gPIEvent.encodeXML("GPIEvent", ns));
        }

        //element.addContent(reserved0.encodeXML("reserved",ns));
        if (timeout == null) {
            LOGGER.warn(" timeout not set");
            throw new MissingParameterException(" timeout not set");
        } else {
            element.addContent(timeout.encodeXML("Timeout", ns));
        }

        //parameters
        return element;
    }

    /**
    * {@inheritDoc}
    */
    protected void decodeBinarySpecific(LLRPBitList binary) {
        int position = 0;
        int tempByteLength;
        int tempLength = 0;
        int count;
        SignedShort type;
        int fieldCount;
        Custom custom;
        gPIPortNum = new UnsignedShort(binary.subList(position,
                    UnsignedShort.length()));
        position += UnsignedShort.length();
        gPIEvent = new Bit(binary.subList(position, Bit.length()));
        position += Bit.length();
        position += reserved0.length();
        timeout = new UnsignedInteger(binary.subList(position,
                    UnsignedInteger.length()));
        position += UnsignedInteger.length();
    }

    /**
    * {@inheritDoc}
    */
    public void decodeXML(Element element) throws InvalidLLRPMessageException {
        List<Element> tempList = null;
        boolean atLeastOnce = false;
        Custom custom;

        Element temp = null;

        // child element are always in default LLRP namespace
        Namespace ns = Namespace.getNamespace(LLRPConstants.LLRPNAMESPACE);

        temp = element.getChild("GPIPortNum", ns);

        if (temp != null) {
            gPIPortNum = new UnsignedShort(temp);
        }

        element.removeChild("GPIPortNum", ns);
        temp = element.getChild("GPIEvent", ns);

        if (temp != null) {
            gPIEvent = new Bit(temp);
        }

        element.removeChild("GPIEvent", ns);
        temp = element.getChild("Timeout", ns);

        if (temp != null) {
            timeout = new UnsignedInteger(temp);
        }

        element.removeChild("Timeout", ns);

        if (element.getChildren().size() > 0) {
            String message = "GPITriggerValue has unknown element " +
                ((Element) element.getChildren().get(0)).getName();
            throw new InvalidLLRPMessageException(message);
        }
    }

    //setters
    /**
    * set   gPIPortNum of type UnsignedShort .
    * @param   gPIPortNum to be set
    */
    public void setGPIPortNum(final UnsignedShort gPIPortNum) {
        this.gPIPortNum = gPIPortNum;
    }

    /**
    * set   gPIEvent of type Bit .
    * @param   gPIEvent to be set
    */
    public void setGPIEvent(final Bit gPIEvent) {
        this.gPIEvent = gPIEvent;
    }

    /**
    * set   timeout of type UnsignedInteger .
    * @param   timeout to be set
    */
    public void setTimeout(final UnsignedInteger timeout) {
        this.timeout = timeout;
    }

    // end setter

    //getters
    /**
    * get   gPIPortNum of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getGPIPortNum() {
        return this.gPIPortNum;
    }

    /**
    * get   gPIEvent of type Bit.
    * @return   type Bit to be set
    */
    public Bit getGPIEvent() {
        return this.gPIEvent;
    }

    /**
    * get   timeout of type UnsignedInteger.
    * @return   type UnsignedInteger to be set
    */
    public UnsignedInteger getTimeout() {
        return this.timeout;
    }

    // end getters

    //add methods

    // end add

    /**
    * For TLV Parameter length can not be determined at compile time. This method therefore always returns 0.
    * @return Integer always zero
    */
    public static Integer length() {
        return 0;
    }

    /**
    * {@inheritDoc}
    */
    public SignedShort getTypeNum() {
        return TYPENUM;
    }

    /**
    * {@inheritDoc}
    */
    public String getName() {
        return "GPITriggerValue";
    }

    /**
    * return string representation. All field values but no parameters are included
    * @return String
    */
    public String toString() {
        String result = "GPITriggerValue: ";
        result += ", gPIPortNum: ";
        result += gPIPortNum;
        result += ", gPIEvent: ";
        result += gPIEvent;

        result += ", timeout: ";
        result += timeout;
        result = result.replaceFirst(", ", "");

        return result;
    }
}
