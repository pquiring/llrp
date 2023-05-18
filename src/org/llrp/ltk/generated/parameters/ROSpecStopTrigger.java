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
import org.llrp.ltk.generated.enumerations.ROSpecStopTriggerType;
import org.llrp.ltk.generated.parameters.GPITriggerValue;
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
 * Describes the condition upon which the ROSpec will stop.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=57&view=fit">LLRP Specification Section 10.2.1.1.2</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=136&view=fit">LLRP Specification Section 16.2.4.1.1.2</a>}


 */

/**
 * Describes the condition upon which the ROSpec will stop.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=57&view=fit">LLRP Specification Section 10.2.1.1.2</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=136&view=fit">LLRP Specification Section 16.2.4.1.1.2</a>}

      .
 */
public class ROSpecStopTrigger extends TLVParameter {
    public static final SignedShort TYPENUM = new SignedShort(182);
    private static final Logger LOGGER = Logger.getLogger(ROSpecStopTrigger.class);
    protected ROSpecStopTriggerType rOSpecStopTriggerType;
    protected UnsignedInteger durationTriggerValue;
    protected GPITriggerValue gPITriggerValue;

    /**
     * empty constructor to create new parameter.
     */
    public ROSpecStopTrigger() {
    }

    /**
     * Constructor to create parameter from binary encoded parameter
     * calls decodeBinary to decode parameter.
     * @param list to be decoded
     */
    public ROSpecStopTrigger(LLRPBitList list) {
        decodeBinary(list);
    }

    /**
    * Constructor to create parameter from xml encoded parameter
    * calls decodeXML to decode parameter.
    * @param element to be decoded
    */
    public ROSpecStopTrigger(Element element)
        throws InvalidLLRPMessageException {
        decodeXML(element);
    }

    /**
    * {@inheritDoc}
    */
    public LLRPBitList encodeBinarySpecific() {
        LLRPBitList resultBits = new LLRPBitList();

        if (rOSpecStopTriggerType == null) {
            LOGGER.warn(" rOSpecStopTriggerType not set");
            throw new MissingParameterException(
                " rOSpecStopTriggerType not set  for Parameter of Type ROSpecStopTrigger");
        }

        resultBits.append(rOSpecStopTriggerType.encodeBinary());

        if (durationTriggerValue == null) {
            LOGGER.warn(" durationTriggerValue not set");
            throw new MissingParameterException(
                " durationTriggerValue not set  for Parameter of Type ROSpecStopTrigger");
        }

        resultBits.append(durationTriggerValue.encodeBinary());

        if (gPITriggerValue == null) {
            // optional parameter, may be null
            LOGGER.info(" gPITriggerValue not set");
        } else {
            resultBits.append(gPITriggerValue.encodeBinary());
        }

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

        if (rOSpecStopTriggerType == null) {
            LOGGER.warn(" rOSpecStopTriggerType not set");
            throw new MissingParameterException(
                " rOSpecStopTriggerType not set");
        } else {
            element.addContent(rOSpecStopTriggerType.encodeXML(
                    "ROSpecStopTriggerType", ns));
        }

        if (durationTriggerValue == null) {
            LOGGER.warn(" durationTriggerValue not set");
            throw new MissingParameterException(" durationTriggerValue not set");
        } else {
            element.addContent(durationTriggerValue.encodeXML(
                    "DurationTriggerValue", ns));
        }

        //parameters
        if (gPITriggerValue == null) {
            LOGGER.info("gPITriggerValue not set");
        } else {
            element.addContent(gPITriggerValue.encodeXML(
                    gPITriggerValue.getClass().getSimpleName(), ns));
        }

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
        rOSpecStopTriggerType = new ROSpecStopTriggerType(binary.subList(
                    position, ROSpecStopTriggerType.length()));
        position += ROSpecStopTriggerType.length();
        durationTriggerValue = new UnsignedInteger(binary.subList(position,
                    UnsignedInteger.length()));
        position += UnsignedInteger.length();

        // look ahead to see type
        // may be optional or exactly once
        type = null;
        tempByteLength = 0;
        tempLength = 0;

        try {
            // if first bit is one it is a TV Parameter
            if (binary.get(position)) {
                // do not take the first bit as it is always 1
                type = new SignedShort(binary.subList(position + 1, 7));
            } else {
                type = new SignedShort(binary.subList(position +
                            RESERVEDLENGTH, TYPENUMBERLENGTH));
                tempByteLength = new UnsignedShort(binary.subList(position +
                            RESERVEDLENGTH + TYPENUMBERLENGTH,
                            UnsignedShort.length())).toShort();
                tempLength = 8 * tempByteLength;
            }
        } catch (IllegalArgumentException le) {
            // if an IllegalArgumentException is thrown, list was not long enough so the parameter is missing
            LOGGER.info(
                "ROSpecStopTrigger misses optional parameter of type GPITriggerValue");
        }

        if (binary.get(position)) {
            // length can statically be determined for TV Parameters
            tempLength = gPITriggerValue.length();
        }

        if ((type != null) && type.equals(GPITriggerValue.TYPENUM)) {
            gPITriggerValue = new GPITriggerValue(binary.subList(position,
                        tempLength));
            position += tempLength;
            LOGGER.debug(
                " gPITriggerValue is instantiated with GPITriggerValue with length" +
                tempLength);
        } else {
            LOGGER.info(
                "ROSpecStopTrigger misses optional parameter of type GPITriggerValue");
        }
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

        temp = element.getChild("ROSpecStopTriggerType", ns);

        if (temp != null) {
            rOSpecStopTriggerType = new ROSpecStopTriggerType(temp);
        }

        element.removeChild("ROSpecStopTriggerType", ns);
        temp = element.getChild("DurationTriggerValue", ns);

        if (temp != null) {
            durationTriggerValue = new UnsignedInteger(temp);
        }

        element.removeChild("DurationTriggerValue", ns);

        //parameter - not choices - no special actions needed
        temp = element.getChild("GPITriggerValue", ns);

        if (temp != null) {
            gPITriggerValue = new GPITriggerValue(temp);
            LOGGER.info(
                "setting parameter gPITriggerValue for parameter ROSpecStopTrigger");
        }

        if (temp == null) {
            LOGGER.info(
                "ROSpecStopTrigger misses optional parameter of type gPITriggerValue");
        }

        element.removeChild("GPITriggerValue", ns);

        if (element.getChildren().size() > 0) {
            String message = "ROSpecStopTrigger has unknown element " +
                ((Element) element.getChildren().get(0)).getName();
            throw new InvalidLLRPMessageException(message);
        }
    }

    //setters
    /**
    * set rOSpecStopTriggerType of type ROSpecStopTriggerType .
    * @param  rOSpecStopTriggerType to be set
    */
    public void setROSpecStopTriggerType(
        final ROSpecStopTriggerType rOSpecStopTriggerType) {
        this.rOSpecStopTriggerType = rOSpecStopTriggerType;
    }

    /**
    * set   durationTriggerValue of type UnsignedInteger .
    * @param   durationTriggerValue to be set
    */
    public void setDurationTriggerValue(
        final UnsignedInteger durationTriggerValue) {
        this.durationTriggerValue = durationTriggerValue;
    }

    /**
    * set gPITriggerValue of type GPITriggerValue.
    * @param  gPITriggerValue to be set
    */
    public void setGPITriggerValue(final GPITriggerValue gPITriggerValue) {
        this.gPITriggerValue = gPITriggerValue;
    }

    // end setter

    //getters
    /**
    * get rOSpecStopTriggerType of type ROSpecStopTriggerType.
    * @return  ROSpecStopTriggerType
    */
    public ROSpecStopTriggerType getROSpecStopTriggerType() {
        return rOSpecStopTriggerType;
    }

    /**
    * get   durationTriggerValue of type UnsignedInteger.
    * @return   type UnsignedInteger to be set
    */
    public UnsignedInteger getDurationTriggerValue() {
        return this.durationTriggerValue;
    }

    /**
    * get gPITriggerValue of type GPITriggerValue .
    * @return  GPITriggerValue
    */
    public GPITriggerValue getGPITriggerValue() {
        return gPITriggerValue;
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
        return "ROSpecStopTrigger";
    }

    /**
    * return string representation. All field values but no parameters are included
    * @return String
    */
    public String toString() {
        String result = "ROSpecStopTrigger: ";
        result += ", rOSpecStopTriggerType: ";
        result += rOSpecStopTriggerType;
        result += ", durationTriggerValue: ";
        result += durationTriggerValue;
        result = result.replaceFirst(", ", "");

        return result;
    }
}
