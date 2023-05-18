/*
*
* This file was generated by LLRP Code Generator
* see http://llrp-toolkit.cvs.sourceforge.net/llrp-toolkit/
* for more information
* Generated on: Sun Apr 08 14:14:09 EDT 2012;
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
package org.llrp.ltk.generated.messages;

import org.apache.log4j.Logger;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;

import org.llrp.ltk.exceptions.InvalidLLRPMessageException;
import org.llrp.ltk.exceptions.MissingParameterException;
import org.llrp.ltk.generated.LLRPConstants;
import org.llrp.ltk.generated.parameters.AccessSpec;
import org.llrp.ltk.generated.parameters.Custom;
import org.llrp.ltk.generated.parameters.LLRPStatus;
import org.llrp.ltk.types.BitList;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.UnsignedInteger;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;


/**
 * This is the response by the Reader to a GET_ACCESSSPECS command. If there are no AccessSpecs configured at the Reader, the response is just the LLRPStatus parameter with the success code. Else, a list of (AccessSpecID, AccessSpec parameter) is returned by the Reader, along with the LLRPStatus parameter containing the success code. The order of the AccessSpecs listed in the message is normatively the order in which the AccessSpecs were created at the Reader.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=63&view=fit">LLRP Specification Section 11.1.10</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=123&view=fit">LLRP Specification Section 16.1.26</a>}


 */
public class GET_ACCESSSPECS_RESPONSE extends LLRPMessage {
    public static final SignedShort TYPENUM = new SignedShort(54);
    private static final Logger LOGGER = Logger.getLogger(GET_ACCESSSPECS_RESPONSE.class);
    public static final String RESPONSETYPE = "";
    protected LLRPStatus lLRPStatus;
    protected List<AccessSpec> accessSpecList = new LinkedList<AccessSpec>();

    /**
     * empty constructor to create new message
     * with LLRP version set to 1.0 (0x1).
     */
    public GET_ACCESSSPECS_RESPONSE() {
        setVersion(new BitList(0, 0, 1));
    }

    /**
     * Constructor to create message from binary encoded message
     * calls decodeBinary to decode message.
     * @param list to be decoded
     */
    public GET_ACCESSSPECS_RESPONSE(final LLRPBitList list)
        throws InvalidLLRPMessageException {
        decodeBinary(list.toByteArray());
    }

    /**
     * Constructor to create message from binary encoded message
     * calls decodeBinary to decode message.
     * @param byteArray representing message
     */
    public GET_ACCESSSPECS_RESPONSE(final byte[] byteArray)
        throws InvalidLLRPMessageException {
        decodeBinary(byteArray);
    }

    /**
    * Constructor to create message from xml encoded message
    * calls decodeXML to decode message.
    * @param document to be decoded
    */
    public GET_ACCESSSPECS_RESPONSE(final Document document)
        throws InvalidLLRPMessageException {
        decodeXML(document);
    }

    /**
    * {@inheritDoc}
    */
    protected LLRPBitList encodeBinarySpecific()
        throws InvalidLLRPMessageException {
        LLRPBitList resultBits = new LLRPBitList();

        if (lLRPStatus == null) {
            // single parameter, may not be null
            LOGGER.warn(" lLRPStatus not set");
            throw new InvalidLLRPMessageException(" lLRPStatus not set");
        } else {
            resultBits.append(lLRPStatus.encodeBinary());
        }

        if (accessSpecList == null) {
            //just warn - it is optional 
            LOGGER.info(" accessSpecList not set");
        } else {
            for (AccessSpec field : accessSpecList) {
                resultBits.append(field.encodeBinary());
            }
        }

        return resultBits;
    }

    /**
    * {@inheritDoc}
    */
    public Document encodeXML() throws InvalidLLRPMessageException {
        try {
            Namespace ns = Namespace.getNamespace("llrp",
                    LLRPConstants.LLRPNAMESPACE);

            Element root = new Element("GET_ACCESSSPECS_RESPONSE", ns);
            //	Element root = new Element("GET_ACCESSSPECS_RESPONSE");
            root.addNamespaceDeclaration(Namespace.getNamespace("llrp",
                    LLRPConstants.LLRPNAMESPACE));

            if (version == null) {
                throw new InvalidLLRPMessageException("Version not set");
            } else {
                root.setAttribute("Version", version.toInteger().toString());
            }

            if (messageID == null) {
                throw new InvalidLLRPMessageException("MessageID not set");
            } else {
                root.setAttribute("MessageID", messageID.toString(10));
            }

            //parameters
            if (lLRPStatus == null) {
                LOGGER.info("lLRPStatus not set");
                throw new MissingParameterException("lLRPStatus not set");
            } else {
                root.addContent(lLRPStatus.encodeXML(lLRPStatus.getClass()
                                                               .getSimpleName(),
                        ns));
            }

            if (accessSpecList == null) {
                LOGGER.info("accessSpecList not set");
            } else {
                for (AccessSpec field : accessSpecList) {
                    root.addContent(field.encodeXML(field.getClass().getName()
                                                         .replaceAll(field.getClass()
                                                                          .getPackage()
                                                                          .getName() +
                                ".", ""), ns));
                }
            }

            Document doc = new Document(root);

            if (isValidXMLMessage(doc, LLRPConstants.LLRPMESSAGESCHEMAPATH)) {
                return doc;
            } else {
                return null;
            }
        } catch (IllegalArgumentException e) {
            throw new InvalidLLRPMessageException(e.getMessage());
        } catch (MissingParameterException e) {
            throw new InvalidLLRPMessageException(e.getMessage());
        }
    }

    /**
    * {@inheritDoc}
    */
    protected void decodeBinarySpecific(LLRPBitList binary)
        throws InvalidLLRPMessageException {
        int position = 0;
        int tempByteLength;
        int tempLength = 0;
        int count;
        SignedShort type;
        int fieldCount;
        Custom custom;

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
                "GET_ACCESSSPECS_RESPONSE misses non optional parameter of type LLRPStatus");
            throw new InvalidLLRPMessageException(
                "GET_ACCESSSPECS_RESPONSE misses non optional parameter of type LLRPStatus");
        }

        if (binary.get(position)) {
            // length can statically be determined for TV Parameters
            tempLength = lLRPStatus.length();
        }

        if ((type != null) && type.equals(LLRPStatus.TYPENUM)) {
            lLRPStatus = new LLRPStatus(binary.subList(position, tempLength));
            position += tempLength;
            LOGGER.debug(
                " lLRPStatus is instantiated with LLRPStatus with length" +
                tempLength);
        } else {
            LOGGER.warn(
                "GET_ACCESSSPECS_RESPONSE misses non optional parameter of type LLRPStatus");
            throw new InvalidLLRPMessageException(
                "GET_ACCESSSPECS_RESPONSE misses non optional parameter of type LLRPStatus");
        }

        // list of parameters
        accessSpecList = new LinkedList<AccessSpec>();
        LOGGER.debug("decoding parameter accessSpecList ");

        while (position < binary.length()) {
            // store if one parameter matched
            boolean atLeastOnce = false;

            // look ahead to see type
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

            //add parameter to list if type number matches
            if ((type != null) && type.equals(AccessSpec.TYPENUM)) {
                //if first bit is 1 it is a TV Parameter
                if (binary.get(position)) {
                    // length can statically be determined for TV Parameters
                    tempLength = AccessSpec.length();
                }

                accessSpecList.add(new AccessSpec(binary.subList(position,
                            tempLength)));
                LOGGER.debug("adding AccessSpec to accessSpecList ");
                atLeastOnce = true;
                position += tempLength;
            }

            if (!atLeastOnce) {
                //no parameter matched therefore we jump out of the loop
                break;
            }
        }

        //if list is still empty no parameter matched
        if (accessSpecList.isEmpty()) {
            LOGGER.info(
                "encoded message does not contain parameter for optional accessSpecList");
        }
    }

    /**
    * {@inheritDoc}
    */
    public void decodeXML(final Document document)
        throws InvalidLLRPMessageException {
        Element temp = null;
        Custom custom;

        // child element are always in default LLRP namespace
        Namespace ns = Namespace.getNamespace(LLRPConstants.LLRPNAMESPACE);

        try {
            isValidXMLMessage(document, LLRPConstants.LLRPMESSAGESCHEMAPATH);

            Element root = (Element) document.getRootElement().clone();
            List<Element> tempList = null;

            // the version field is always 3 bit long 
            // if the version attribute is not set in the LTK-XML message,
            // it is set to version 001
            String versionAttribute = root.getAttributeValue("Version");

            if (versionAttribute != null) {
                version = new BitList(3);
                version.setValue(new Integer(versionAttribute));
            } else {
                version = new BitList(0, 0, 1);
            }

            messageID = new UnsignedInteger(root.getAttributeValue("MessageID"));

            //parameter - not choices - no special actions needed
            temp = root.getChild("LLRPStatus", ns);

            if (temp != null) {
                lLRPStatus = new LLRPStatus(temp);
                LOGGER.info(
                    "setting parameter lLRPStatus for parameter GET_ACCESSSPECS_RESPONSE");
            } else {
                LOGGER.warn(
                    "GET_ACCESSSPECS_RESPONSE misses non optional parameter of type lLRPStatus");
                throw new MissingParameterException(
                    "GET_ACCESSSPECS_RESPONSE misses non optional parameter of type lLRPStatus");
            }

            root.removeChild("LLRPStatus", ns);
            //parameter - not choices - no special actions needed
            //we expect a list of parameters
            accessSpecList = new LinkedList<AccessSpec>();
            tempList = root.getChildren("AccessSpec", ns);

            if ((tempList == null) || tempList.isEmpty()) {
                LOGGER.info(
                    "GET_ACCESSSPECS_RESPONSE misses optional parameter of type accessSpecList");
            } else {
                for (Element e : tempList) {
                    accessSpecList.add(new AccessSpec(e));
                    LOGGER.debug("adding AccessSpec to accessSpecList ");
                }
            }

            root.removeChildren("AccessSpec", ns);

            if (root.getChildren().size() > 0) {
                String message = "GET_ACCESSSPECS_RESPONSE has unknown element " +
                    ((Element) root.getChildren().get(0)).getName();
                throw new InvalidLLRPMessageException(message);
            }
        } catch (IllegalArgumentException e) {
            throw new InvalidLLRPMessageException(e.getMessage());
        } catch (MissingParameterException e) {
            throw new InvalidLLRPMessageException(e.getMessage());
        }
    }

    //setters

    /**
    * set lLRPStatus of type LLRPStatus.
    * @param  lLRPStatus to be set
    */
    public void setLLRPStatus(final LLRPStatus lLRPStatus) {
        this.lLRPStatus = lLRPStatus;
    }

    /**
    * set accessSpecList of type  List &lt;AccessSpec>.
    * @param  accessSpecList to be set
    */
    public void setAccessSpecList(final List<AccessSpec> accessSpecList) {
        this.accessSpecList = accessSpecList;
    }

    // end setter

    //getters

    /**
    * get lLRPStatus of type LLRPStatus .
    * @return  LLRPStatus
    */
    public LLRPStatus getLLRPStatus() {
        return lLRPStatus;
    }

    /**
    * get accessSpecList of type List &lt;AccessSpec> .
    * @return  List &lt;AccessSpec>
    */
    public List<AccessSpec> getAccessSpecList() {
        return accessSpecList;
    }

    // end getters

    //add methods

    /**
    * add element accessSpec of type AccessSpec .
    * @param  accessSpec of type AccessSpec
    */
    public void addToAccessSpecList(AccessSpec accessSpec) {
        if (this.accessSpecList == null) {
            this.accessSpecList = new LinkedList<AccessSpec>();
        }

        this.accessSpecList.add(accessSpec);
    }

    // end add
    @Override
    public String getResponseType() {
        return RESPONSETYPE;
    }

    @Override
    public String getName() {
        return "GET_ACCESSSPECS_RESPONSE";
    }

    /**
    * return uniuque type number.
    * @return SignedShort holding unique type number
    */
    public SignedShort getTypeNum() {
        return TYPENUM;
    }
}
