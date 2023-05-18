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
import org.llrp.ltk.generated.enumerations.C1G2TruncateAction;
import org.llrp.ltk.generated.parameters.C1G2TagInventoryMask;
import org.llrp.ltk.generated.parameters.C1G2TagInventoryStateAwareFilterAction;
import org.llrp.ltk.generated.parameters.C1G2TagInventoryStateUnawareFilterAction;
import org.llrp.ltk.types.BitList;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;


/**
 * This parameter carries information specific to C1G2 filter (in particular, the parameters for the select command) operation, and are optionally sent with each inventory command from the Client to the Reader. This sets up the target tag population that gets inventoried. For an inventory operation with multiple filters, multiple instances of filter parameters are sent. A filter parameter contains the following fields:Target tag mask: This contains the information for the tag memory data pattern used for the select operation.T:  This value is set if the Client is interested in only a truncated portion of the tag to be backscattered by the tag. The portion that gets backscattered includes the portion of the tag ID following the mask. This bit has to be set only in the last filter-spec.TagInventoryStateAwareFilterAction: This is used if the TagInventoryStateAware flag is set to true in the InventoryParameterSpec. TagInventoryStateUnawareFilterAction: This is used if the TagInventoryStateAware flag is set to false in the InventoryParameterSpec.


See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=101&view=fit">LLRP Specification Section 15.2.1.2.1.1</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=154&view=fit">LLRP Specification Section 16.3.1.2.1.1</a>}


 */

/**
 * This parameter carries information specific to C1G2 filter (in particular, the parameters for the select command) operation, and are optionally sent with each inventory command from the Client to the Reader. This sets up the target tag population that gets inventoried. For an inventory operation with multiple filters, multiple instances of filter parameters are sent. A filter parameter contains the following fields:Target tag mask: This contains the information for the tag memory data pattern used for the select operation.T:  This value is set if the Client is interested in only a truncated portion of the tag to be backscattered by the tag. The portion that gets backscattered includes the portion of the tag ID following the mask. This bit has to be set only in the last filter-spec.TagInventoryStateAwareFilterAction: This is used if the TagInventoryStateAware flag is set to true in the InventoryParameterSpec. TagInventoryStateUnawareFilterAction: This is used if the TagInventoryStateAware flag is set to false in the InventoryParameterSpec.


See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=101&view=fit">LLRP Specification Section 15.2.1.2.1.1</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=154&view=fit">LLRP Specification Section 16.3.1.2.1.1</a>}

      .
 */
public class C1G2Filter extends TLVParameter {
    public static final SignedShort TYPENUM = new SignedShort(331);
    private static final Logger LOGGER = Logger.getLogger(C1G2Filter.class);
    protected C1G2TruncateAction t;
    protected BitList reserved0 = new BitList(6);
    protected C1G2TagInventoryMask c1G2TagInventoryMask;
    protected C1G2TagInventoryStateAwareFilterAction c1G2TagInventoryStateAwareFilterAction;
    protected C1G2TagInventoryStateUnawareFilterAction c1G2TagInventoryStateUnawareFilterAction;

    /**
     * empty constructor to create new parameter.
     */
    public C1G2Filter() {
    }

    /**
     * Constructor to create parameter from binary encoded parameter
     * calls decodeBinary to decode parameter.
     * @param list to be decoded
     */
    public C1G2Filter(LLRPBitList list) {
        decodeBinary(list);
    }

    /**
    * Constructor to create parameter from xml encoded parameter
    * calls decodeXML to decode parameter.
    * @param element to be decoded
    */
    public C1G2Filter(Element element) throws InvalidLLRPMessageException {
        decodeXML(element);
    }

    /**
    * {@inheritDoc}
    */
    public LLRPBitList encodeBinarySpecific() {
        LLRPBitList resultBits = new LLRPBitList();

        if (t == null) {
            LOGGER.warn(" t not set");
            throw new MissingParameterException(
                " t not set  for Parameter of Type C1G2Filter");
        }

        resultBits.append(t.encodeBinary());
        resultBits.append(reserved0.encodeBinary());

        if (c1G2TagInventoryMask == null) {
            // single parameter, may not be null
            LOGGER.warn(" c1G2TagInventoryMask not set");
            throw new MissingParameterException(" c1G2TagInventoryMask not set");
        } else {
            resultBits.append(c1G2TagInventoryMask.encodeBinary());
        }

        if (c1G2TagInventoryStateAwareFilterAction == null) {
            // optional parameter, may be null
            LOGGER.info(" c1G2TagInventoryStateAwareFilterAction not set");
        } else {
            resultBits.append(c1G2TagInventoryStateAwareFilterAction.encodeBinary());
        }

        if (c1G2TagInventoryStateUnawareFilterAction == null) {
            // optional parameter, may be null
            LOGGER.info(" c1G2TagInventoryStateUnawareFilterAction not set");
        } else {
            resultBits.append(c1G2TagInventoryStateUnawareFilterAction.encodeBinary());
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

        if (t == null) {
            LOGGER.warn(" t not set");
            throw new MissingParameterException(" t not set");
        } else {
            element.addContent(t.encodeXML("T", ns));
        }

        //element.addContent(reserved0.encodeXML("reserved",ns));
        //parameters
        if (c1G2TagInventoryMask == null) {
            LOGGER.info("c1G2TagInventoryMask not set");
            throw new MissingParameterException("c1G2TagInventoryMask not set");
        } else {
            element.addContent(c1G2TagInventoryMask.encodeXML(
                    c1G2TagInventoryMask.getClass().getSimpleName(), ns));
        }

        if (c1G2TagInventoryStateAwareFilterAction == null) {
            LOGGER.info("c1G2TagInventoryStateAwareFilterAction not set");
        } else {
            element.addContent(c1G2TagInventoryStateAwareFilterAction.encodeXML(
                    c1G2TagInventoryStateAwareFilterAction.getClass()
                                                          .getSimpleName(), ns));
        }

        if (c1G2TagInventoryStateUnawareFilterAction == null) {
            LOGGER.info("c1G2TagInventoryStateUnawareFilterAction not set");
        } else {
            element.addContent(c1G2TagInventoryStateUnawareFilterAction.encodeXML(
                    c1G2TagInventoryStateUnawareFilterAction.getClass()
                                                            .getSimpleName(), ns));
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
        t = new C1G2TruncateAction(binary.subList(position,
                    C1G2TruncateAction.length()));
        position += C1G2TruncateAction.length();
        position += reserved0.length();

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
            LOGGER.warn(
                "C1G2Filter misses non optional parameter of type C1G2TagInventoryMask");
            throw new MissingParameterException(
                "C1G2Filter misses non optional parameter of type C1G2TagInventoryMask");
        }

        if (binary.get(position)) {
            // length can statically be determined for TV Parameters
            tempLength = c1G2TagInventoryMask.length();
        }

        if ((type != null) && type.equals(C1G2TagInventoryMask.TYPENUM)) {
            c1G2TagInventoryMask = new C1G2TagInventoryMask(binary.subList(
                        position, tempLength));
            position += tempLength;
            LOGGER.debug(
                " c1G2TagInventoryMask is instantiated with C1G2TagInventoryMask with length" +
                tempLength);
        } else {
            LOGGER.warn(
                "C1G2Filter misses non optional parameter of type C1G2TagInventoryMask");
            throw new MissingParameterException(
                "C1G2Filter misses non optional parameter of type C1G2TagInventoryMask");
        }

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
                "C1G2Filter misses optional parameter of type C1G2TagInventoryStateAwareFilterAction");
        }

        if (binary.get(position)) {
            // length can statically be determined for TV Parameters
            tempLength = c1G2TagInventoryStateAwareFilterAction.length();
        }

        if ((type != null) &&
                type.equals(C1G2TagInventoryStateAwareFilterAction.TYPENUM)) {
            c1G2TagInventoryStateAwareFilterAction = new C1G2TagInventoryStateAwareFilterAction(binary.subList(
                        position, tempLength));
            position += tempLength;
            LOGGER.debug(
                " c1G2TagInventoryStateAwareFilterAction is instantiated with C1G2TagInventoryStateAwareFilterAction with length" +
                tempLength);
        } else {
            LOGGER.info(
                "C1G2Filter misses optional parameter of type C1G2TagInventoryStateAwareFilterAction");
        }

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
                "C1G2Filter misses optional parameter of type C1G2TagInventoryStateUnawareFilterAction");
        }

        if (binary.get(position)) {
            // length can statically be determined for TV Parameters
            tempLength = c1G2TagInventoryStateUnawareFilterAction.length();
        }

        if ((type != null) &&
                type.equals(C1G2TagInventoryStateUnawareFilterAction.TYPENUM)) {
            c1G2TagInventoryStateUnawareFilterAction = new C1G2TagInventoryStateUnawareFilterAction(binary.subList(
                        position, tempLength));
            position += tempLength;
            LOGGER.debug(
                " c1G2TagInventoryStateUnawareFilterAction is instantiated with C1G2TagInventoryStateUnawareFilterAction with length" +
                tempLength);
        } else {
            LOGGER.info(
                "C1G2Filter misses optional parameter of type C1G2TagInventoryStateUnawareFilterAction");
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

        temp = element.getChild("T", ns);

        if (temp != null) {
            t = new C1G2TruncateAction(temp);
        }

        element.removeChild("T", ns);

        //parameter - not choices - no special actions needed
        temp = element.getChild("C1G2TagInventoryMask", ns);

        if (temp != null) {
            c1G2TagInventoryMask = new C1G2TagInventoryMask(temp);
            LOGGER.info(
                "setting parameter c1G2TagInventoryMask for parameter C1G2Filter");
        }

        if (temp == null) {
            LOGGER.warn(
                "C1G2Filter misses non optional parameter of type c1G2TagInventoryMask");
            throw new MissingParameterException(
                "C1G2Filter misses non optional parameter of type c1G2TagInventoryMask");
        }

        element.removeChild("C1G2TagInventoryMask", ns);
        //parameter - not choices - no special actions needed
        temp = element.getChild("C1G2TagInventoryStateAwareFilterAction", ns);

        if (temp != null) {
            c1G2TagInventoryStateAwareFilterAction = new C1G2TagInventoryStateAwareFilterAction(temp);
            LOGGER.info(
                "setting parameter c1G2TagInventoryStateAwareFilterAction for parameter C1G2Filter");
        }

        if (temp == null) {
            LOGGER.info(
                "C1G2Filter misses optional parameter of type c1G2TagInventoryStateAwareFilterAction");
        }

        element.removeChild("C1G2TagInventoryStateAwareFilterAction", ns);
        //parameter - not choices - no special actions needed
        temp = element.getChild("C1G2TagInventoryStateUnawareFilterAction", ns);

        if (temp != null) {
            c1G2TagInventoryStateUnawareFilterAction = new C1G2TagInventoryStateUnawareFilterAction(temp);
            LOGGER.info(
                "setting parameter c1G2TagInventoryStateUnawareFilterAction for parameter C1G2Filter");
        }

        if (temp == null) {
            LOGGER.info(
                "C1G2Filter misses optional parameter of type c1G2TagInventoryStateUnawareFilterAction");
        }

        element.removeChild("C1G2TagInventoryStateUnawareFilterAction", ns);

        if (element.getChildren().size() > 0) {
            String message = "C1G2Filter has unknown element " +
                ((Element) element.getChildren().get(0)).getName();
            throw new InvalidLLRPMessageException(message);
        }
    }

    //setters
    /**
    * set t of type C1G2TruncateAction .
    * @param  t to be set
    */
    public void setT(final C1G2TruncateAction t) {
        this.t = t;
    }

    /**
    * set c1G2TagInventoryMask of type C1G2TagInventoryMask.
    * @param  c1G2TagInventoryMask to be set
    */
    public void setC1G2TagInventoryMask(
        final C1G2TagInventoryMask c1G2TagInventoryMask) {
        this.c1G2TagInventoryMask = c1G2TagInventoryMask;
    }

    /**
    * set c1G2TagInventoryStateAwareFilterAction of type C1G2TagInventoryStateAwareFilterAction.
    * @param  c1G2TagInventoryStateAwareFilterAction to be set
    */
    public void setC1G2TagInventoryStateAwareFilterAction(
        final C1G2TagInventoryStateAwareFilterAction c1G2TagInventoryStateAwareFilterAction) {
        this.c1G2TagInventoryStateAwareFilterAction = c1G2TagInventoryStateAwareFilterAction;
    }

    /**
    * set c1G2TagInventoryStateUnawareFilterAction of type C1G2TagInventoryStateUnawareFilterAction.
    * @param  c1G2TagInventoryStateUnawareFilterAction to be set
    */
    public void setC1G2TagInventoryStateUnawareFilterAction(
        final C1G2TagInventoryStateUnawareFilterAction c1G2TagInventoryStateUnawareFilterAction) {
        this.c1G2TagInventoryStateUnawareFilterAction = c1G2TagInventoryStateUnawareFilterAction;
    }

    // end setter

    //getters
    /**
    * get t of type C1G2TruncateAction.
    * @return  C1G2TruncateAction
    */
    public C1G2TruncateAction getT() {
        return t;
    }

    /**
    * get c1G2TagInventoryMask of type C1G2TagInventoryMask .
    * @return  C1G2TagInventoryMask
    */
    public C1G2TagInventoryMask getC1G2TagInventoryMask() {
        return c1G2TagInventoryMask;
    }

    /**
    * get c1G2TagInventoryStateAwareFilterAction of type C1G2TagInventoryStateAwareFilterAction .
    * @return  C1G2TagInventoryStateAwareFilterAction
    */
    public C1G2TagInventoryStateAwareFilterAction getC1G2TagInventoryStateAwareFilterAction() {
        return c1G2TagInventoryStateAwareFilterAction;
    }

    /**
    * get c1G2TagInventoryStateUnawareFilterAction of type C1G2TagInventoryStateUnawareFilterAction .
    * @return  C1G2TagInventoryStateUnawareFilterAction
    */
    public C1G2TagInventoryStateUnawareFilterAction getC1G2TagInventoryStateUnawareFilterAction() {
        return c1G2TagInventoryStateUnawareFilterAction;
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
        return "C1G2Filter";
    }

    /**
    * return string representation. All field values but no parameters are included
    * @return String
    */
    public String toString() {
        String result = "C1G2Filter: ";
        result += ", t: ";
        result += t;

        result = result.replaceFirst(", ", "");

        return result;
    }
}
