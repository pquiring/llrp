/*
 *
 * This file was generated by LLRP Code Generator
 * see http://llrp-toolkit.cvs.sourceforge.net/llrp-toolkit/
 * for more information
 * Generated on: Sun Apr 08 14:14:10 EDT 2012;
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
import org.llrp.ltk.generated.interfaces.Timestamp;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedLong;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;


/**
 *  The timestamps in LLRP messages or parameters can be either the uptime or the UTC time [UTC]. If a Reader has an UTC clock, all timestamps reported by the Reader SHALL use an UTC timestamp parameter. If a Reader has no UTC clock capability, all timestamps reported by the Reader SHALL use the uptime parameter.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=37&view=fit">LLRP Specification Section 7.1.3.1.1.2</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=131&view=fit">LLRP Specification Section 16.2.2.2</a>}


 */

/**
 *  The timestamps in LLRP messages or parameters can be either the uptime or the UTC time [UTC]. If a Reader has an UTC clock, all timestamps reported by the Reader SHALL use an UTC timestamp parameter. If a Reader has no UTC clock capability, all timestamps reported by the Reader SHALL use the uptime parameter.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=37&view=fit">LLRP Specification Section 7.1.3.1.1.2</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=131&view=fit">LLRP Specification Section 16.2.2.2</a>}

      .
 */
public class Uptime extends TLVParameter implements Timestamp {
    public static final SignedShort TYPENUM = new SignedShort(129);
    private static final Logger LOGGER = Logger.getLogger(Uptime.class);
    protected UnsignedLong microseconds;

    /**
     * empty constructor to create new parameter.
     */
    public Uptime() {
    }

    /**
     * Constructor to create parameter from binary encoded parameter
     * calls decodeBinary to decode parameter.
     * @param list to be decoded
     */
    public Uptime(LLRPBitList list) {
        decodeBinary(list);
    }

    /**
    * Constructor to create parameter from xml encoded parameter
    * calls decodeXML to decode parameter.
    * @param element to be decoded
    */
    public Uptime(Element element) throws InvalidLLRPMessageException {
        decodeXML(element);
    }

    /**
    * {@inheritDoc}
    */
    public LLRPBitList encodeBinarySpecific() {
        LLRPBitList resultBits = new LLRPBitList();

        if (microseconds == null) {
            LOGGER.warn(" microseconds not set");
            throw new MissingParameterException(
                " microseconds not set  for Parameter of Type Uptime");
        }

        resultBits.append(microseconds.encodeBinary());

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

        if (microseconds == null) {
            LOGGER.warn(" microseconds not set");
            throw new MissingParameterException(" microseconds not set");
        } else {
            element.addContent(microseconds.encodeXML("Microseconds", ns));
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
        microseconds = new UnsignedLong(binary.subList(position,
                    UnsignedLong.length()));
        position += UnsignedLong.length();
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

        temp = element.getChild("Microseconds", ns);

        if (temp != null) {
            microseconds = new UnsignedLong(temp);
        }

        element.removeChild("Microseconds", ns);

        if (element.getChildren().size() > 0) {
            String message = "Uptime has unknown element " +
                ((Element) element.getChildren().get(0)).getName();
            throw new InvalidLLRPMessageException(message);
        }
    }

    //setters
    /**
    * set   microseconds of type UnsignedLong .
    * @param   microseconds to be set
    */
    public void setMicroseconds(final UnsignedLong microseconds) {
        this.microseconds = microseconds;
    }

    // end setter

    //getters
    /**
    * get   microseconds of type UnsignedLong.
    * @return   type UnsignedLong to be set
    */
    public UnsignedLong getMicroseconds() {
        return this.microseconds;
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
        return "Uptime";
    }

    /**
    * return string representation. All field values but no parameters are included
    * @return String
    */
    public String toString() {
        String result = "Uptime: ";
        result += ", microseconds: ";
        result += microseconds;
        result = result.replaceFirst(", ", "");

        return result;
    }
}
