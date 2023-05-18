/*
 *
 * This file was generated by LLRP Code Generator
 * see http://llrp-toolkit.cvs.sourceforge.net/llrp-toolkit/
 * for more information
 * Generated on: Sun Apr 08 14:14:12 EDT 2012;
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
import org.llrp.ltk.generated.interfaces.AccessCommandOpSpec;
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
 * Kill Password is the value of the kill password to be used or set.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=108&view=fit">LLRP Specification Section 15.2.1.3.2.3</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=157&view=fit">LLRP Specification Section 16.3.1.3.2.3</a>}


 */

/**
 * Kill Password is the value of the kill password to be used or set.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=108&view=fit">LLRP Specification Section 15.2.1.3.2.3</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=157&view=fit">LLRP Specification Section 16.3.1.3.2.3</a>}

      .
 */
public class C1G2Kill extends TLVParameter implements AccessCommandOpSpec {
    public static final SignedShort TYPENUM = new SignedShort(343);
    private static final Logger LOGGER = Logger.getLogger(C1G2Kill.class);
    protected UnsignedShort opSpecID;
    protected UnsignedInteger killPassword;

    /**
     * empty constructor to create new parameter.
     */
    public C1G2Kill() {
    }

    /**
     * Constructor to create parameter from binary encoded parameter
     * calls decodeBinary to decode parameter.
     * @param list to be decoded
     */
    public C1G2Kill(LLRPBitList list) {
        decodeBinary(list);
    }

    /**
    * Constructor to create parameter from xml encoded parameter
    * calls decodeXML to decode parameter.
    * @param element to be decoded
    */
    public C1G2Kill(Element element) throws InvalidLLRPMessageException {
        decodeXML(element);
    }

    /**
    * {@inheritDoc}
    */
    public LLRPBitList encodeBinarySpecific() {
        LLRPBitList resultBits = new LLRPBitList();

        if (opSpecID == null) {
            LOGGER.warn(" opSpecID not set");
            throw new MissingParameterException(
                " opSpecID not set  for Parameter of Type C1G2Kill");
        }

        resultBits.append(opSpecID.encodeBinary());

        if (killPassword == null) {
            LOGGER.warn(" killPassword not set");
            throw new MissingParameterException(
                " killPassword not set  for Parameter of Type C1G2Kill");
        }

        resultBits.append(killPassword.encodeBinary());

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

        if (opSpecID == null) {
            LOGGER.warn(" opSpecID not set");
            throw new MissingParameterException(" opSpecID not set");
        } else {
            element.addContent(opSpecID.encodeXML("OpSpecID", ns));
        }

        if (killPassword == null) {
            LOGGER.warn(" killPassword not set");
            throw new MissingParameterException(" killPassword not set");
        } else {
            element.addContent(killPassword.encodeXML("KillPassword", ns));
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
        opSpecID = new UnsignedShort(binary.subList(position,
                    UnsignedShort.length()));
        position += UnsignedShort.length();
        killPassword = new UnsignedInteger(binary.subList(position,
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

        temp = element.getChild("OpSpecID", ns);

        if (temp != null) {
            opSpecID = new UnsignedShort(temp);
        }

        element.removeChild("OpSpecID", ns);
        temp = element.getChild("KillPassword", ns);

        if (temp != null) {
            killPassword = new UnsignedInteger(temp);
        }

        element.removeChild("KillPassword", ns);

        if (element.getChildren().size() > 0) {
            String message = "C1G2Kill has unknown element " +
                ((Element) element.getChildren().get(0)).getName();
            throw new InvalidLLRPMessageException(message);
        }
    }

    //setters
    /**
    * set   opSpecID of type UnsignedShort .
    * @param   opSpecID to be set
    */
    public void setOpSpecID(final UnsignedShort opSpecID) {
        this.opSpecID = opSpecID;
    }

    /**
    * set   killPassword of type UnsignedInteger .
    * @param   killPassword to be set
    */
    public void setKillPassword(final UnsignedInteger killPassword) {
        this.killPassword = killPassword;
    }

    // end setter

    //getters
    /**
    * get   opSpecID of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getOpSpecID() {
        return this.opSpecID;
    }

    /**
    * get   killPassword of type UnsignedInteger.
    * @return   type UnsignedInteger to be set
    */
    public UnsignedInteger getKillPassword() {
        return this.killPassword;
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
        return "C1G2Kill";
    }

    /**
    * return string representation. All field values but no parameters are included
    * @return String
    */
    public String toString() {
        String result = "C1G2Kill: ";
        result += ", opSpecID: ";
        result += opSpecID;
        result += ", killPassword: ";
        result += killPassword;
        result = result.replaceFirst(", ", "");

        return result;
    }
}
