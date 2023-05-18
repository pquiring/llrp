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
import org.llrp.ltk.generated.interfaces.AirProtocolInventoryCommandSettings;
import org.llrp.ltk.generated.parameters.C1G2InventoryCommand;
import org.llrp.ltk.generated.parameters.RFReceiver;
import org.llrp.ltk.generated.parameters.RFTransmitter;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;


/**
 * This parameter carries a single antenna's configuration and it specifies the default values for the parameter set that are passed in this parameter block. The scope of the default values is the antenna. The default values are used for parameters during an operation on this antenna if the parameter was unspecified in the spec that describes the operation.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=74&view=fit">LLRP Specification Section 12.2.6</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=141&view=fit">LLRP Specification Section 16.2.6.6</a>}


 */

/**
 * This parameter carries a single antenna's configuration and it specifies the default values for the parameter set that are passed in this parameter block. The scope of the default values is the antenna. The default values are used for parameters during an operation on this antenna if the parameter was unspecified in the spec that describes the operation.

See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=74&view=fit">LLRP Specification Section 12.2.6</a>}
 and {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=141&view=fit">LLRP Specification Section 16.2.6.6</a>}

      .
 */
public class AntennaConfiguration extends TLVParameter {
    public static final SignedShort TYPENUM = new SignedShort(222);
    private static final Logger LOGGER = Logger.getLogger(AntennaConfiguration.class);
    protected UnsignedShort antennaID;
    protected RFReceiver rFReceiver;
    protected RFTransmitter rFTransmitter;
    protected List<AirProtocolInventoryCommandSettings> airProtocolInventoryCommandSettingsList =
        new LinkedList<AirProtocolInventoryCommandSettings>();

    /**
     * empty constructor to create new parameter.
     */
    public AntennaConfiguration() {
    }

    /**
     * Constructor to create parameter from binary encoded parameter
     * calls decodeBinary to decode parameter.
     * @param list to be decoded
     */
    public AntennaConfiguration(LLRPBitList list) {
        decodeBinary(list);
    }

    /**
    * Constructor to create parameter from xml encoded parameter
    * calls decodeXML to decode parameter.
    * @param element to be decoded
    */
    public AntennaConfiguration(Element element)
        throws InvalidLLRPMessageException {
        decodeXML(element);
    }

    /**
    * {@inheritDoc}
    */
    public LLRPBitList encodeBinarySpecific() {
        LLRPBitList resultBits = new LLRPBitList();

        if (antennaID == null) {
            LOGGER.warn(" antennaID not set");
            throw new MissingParameterException(
                " antennaID not set  for Parameter of Type AntennaConfiguration");
        }

        resultBits.append(antennaID.encodeBinary());

        if (rFReceiver == null) {
            // optional parameter, may be null
            LOGGER.info(" rFReceiver not set");
        } else {
            resultBits.append(rFReceiver.encodeBinary());
        }

        if (rFTransmitter == null) {
            // optional parameter, may be null
            LOGGER.info(" rFTransmitter not set");
        } else {
            resultBits.append(rFTransmitter.encodeBinary());
        }

        if (airProtocolInventoryCommandSettingsList == null) {
            //just warn - it is optional 
            LOGGER.info(" airProtocolInventoryCommandSettingsList not set");
        } else {
            for (AirProtocolInventoryCommandSettings field : airProtocolInventoryCommandSettingsList) {
                resultBits.append(field.encodeBinary());
            }
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

        if (antennaID == null) {
            LOGGER.warn(" antennaID not set");
            throw new MissingParameterException(" antennaID not set");
        } else {
            element.addContent(antennaID.encodeXML("AntennaID", ns));
        }

        //parameters
        if (rFReceiver == null) {
            LOGGER.info("rFReceiver not set");
        } else {
            element.addContent(rFReceiver.encodeXML(rFReceiver.getClass()
                                                              .getSimpleName(),
                    ns));
        }

        if (rFTransmitter == null) {
            LOGGER.info("rFTransmitter not set");
        } else {
            element.addContent(rFTransmitter.encodeXML(
                    rFTransmitter.getClass().getSimpleName(), ns));
        }

        if (airProtocolInventoryCommandSettingsList == null) {
            LOGGER.info("airProtocolInventoryCommandSettingsList not set");
        } else {
            for (AirProtocolInventoryCommandSettings field : airProtocolInventoryCommandSettingsList) {
                element.addContent(field.encodeXML(field.getClass().getName()
                                                        .replaceAll(field.getClass()
                                                                         .getPackage()
                                                                         .getName() +
                            ".", ""), ns));
            }
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
        antennaID = new UnsignedShort(binary.subList(position,
                    UnsignedShort.length()));
        position += UnsignedShort.length();

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
                "AntennaConfiguration misses optional parameter of type RFReceiver");
        }

        if (binary.get(position)) {
            // length can statically be determined for TV Parameters
            tempLength = rFReceiver.length();
        }

        if ((type != null) && type.equals(RFReceiver.TYPENUM)) {
            rFReceiver = new RFReceiver(binary.subList(position, tempLength));
            position += tempLength;
            LOGGER.debug(
                " rFReceiver is instantiated with RFReceiver with length" +
                tempLength);
        } else {
            LOGGER.info(
                "AntennaConfiguration misses optional parameter of type RFReceiver");
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
                "AntennaConfiguration misses optional parameter of type RFTransmitter");
        }

        if (binary.get(position)) {
            // length can statically be determined for TV Parameters
            tempLength = rFTransmitter.length();
        }

        if ((type != null) && type.equals(RFTransmitter.TYPENUM)) {
            rFTransmitter = new RFTransmitter(binary.subList(position,
                        tempLength));
            position += tempLength;
            LOGGER.debug(
                " rFTransmitter is instantiated with RFTransmitter with length" +
                tempLength);
        } else {
            LOGGER.info(
                "AntennaConfiguration misses optional parameter of type RFTransmitter");
        }

        // list of parameters
        airProtocolInventoryCommandSettingsList = new LinkedList<AirProtocolInventoryCommandSettings>();
        LOGGER.debug(
            "decoding parameter airProtocolInventoryCommandSettingsList ");

        while (position < binary.length()) {
            // store if one parameter matched
            boolean atLeastOnce = false;

            // look ahead to see type
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

            //choiceRef
            if ((type != null) && type.equals(C1G2InventoryCommand.TYPENUM)) {
                if (binary.get(position)) {
                    // length can statically be determined for TV Parameters
                    tempLength = C1G2InventoryCommand.length();
                }

                airProtocolInventoryCommandSettingsList.add(new C1G2InventoryCommand(
                        binary.subList(position, tempLength)));
                LOGGER.debug(
                    "adding C1G2InventoryCommand to airProtocolInventoryCommandSettingsList ");
                position += tempLength;
                atLeastOnce = true;
            }

            if (!atLeastOnce) {
                //no parameter matched therefore we jump out of the loop
                break;
            }
        }

        //if list is still empty no parameter matched
        if (airProtocolInventoryCommandSettingsList.isEmpty()) {
            LOGGER.info(
                "encoded message does not contain parameter for optional airProtocolInventoryCommandSettingsList");
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

        temp = element.getChild("AntennaID", ns);

        if (temp != null) {
            antennaID = new UnsignedShort(temp);
        }

        element.removeChild("AntennaID", ns);

        //parameter - not choices - no special actions needed
        temp = element.getChild("RFReceiver", ns);

        if (temp != null) {
            rFReceiver = new RFReceiver(temp);
            LOGGER.info(
                "setting parameter rFReceiver for parameter AntennaConfiguration");
        }

        if (temp == null) {
            LOGGER.info(
                "AntennaConfiguration misses optional parameter of type rFReceiver");
        }

        element.removeChild("RFReceiver", ns);
        //parameter - not choices - no special actions needed
        temp = element.getChild("RFTransmitter", ns);

        if (temp != null) {
            rFTransmitter = new RFTransmitter(temp);
            LOGGER.info(
                "setting parameter rFTransmitter for parameter AntennaConfiguration");
        }

        if (temp == null) {
            LOGGER.info(
                "AntennaConfiguration misses optional parameter of type rFTransmitter");
        }

        element.removeChild("RFTransmitter", ns);
        //choices - must check all possible subtypes
        //list of Choice Type Parameter
        airProtocolInventoryCommandSettingsList = new LinkedList<AirProtocolInventoryCommandSettings>();
        // for each possible subtype get all childs
        tempList = element.getChildren("C1G2InventoryCommand", ns);

        for (Element e : tempList) {
            airProtocolInventoryCommandSettingsList.add(new C1G2InventoryCommand(
                    e));
            LOGGER.debug(
                "adding C1G2InventoryCommand to airProtocolInventoryCommandSettingsList ");
            atLeastOnce = true;
        }

        element.removeChildren("C1G2InventoryCommand", ns);

        if (!atLeastOnce) {
            LOGGER.info(
                "AntennaConfiguration misses optional parameter of type airProtocolInventoryCommandSettingsList");
        }

        atLeastOnce = false;

        if (element.getChildren().size() > 0) {
            String message = "AntennaConfiguration has unknown element " +
                ((Element) element.getChildren().get(0)).getName();
            throw new InvalidLLRPMessageException(message);
        }
    }

    //setters
    /**
    * set   antennaID of type UnsignedShort .
    * @param   antennaID to be set
    */
    public void setAntennaID(final UnsignedShort antennaID) {
        this.antennaID = antennaID;
    }

    /**
    * set rFReceiver of type RFReceiver.
    * @param  rFReceiver to be set
    */
    public void setRFReceiver(final RFReceiver rFReceiver) {
        this.rFReceiver = rFReceiver;
    }

    /**
    * set rFTransmitter of type RFTransmitter.
    * @param  rFTransmitter to be set
    */
    public void setRFTransmitter(final RFTransmitter rFTransmitter) {
        this.rFTransmitter = rFTransmitter;
    }

    /**
    * set airProtocolInventoryCommandSettingsList of type  List &lt;AirProtocolInventoryCommandSettings>.
    * @param  airProtocolInventoryCommandSettingsList to be set
    */
    public void setAirProtocolInventoryCommandSettingsList(
        final List<AirProtocolInventoryCommandSettings> airProtocolInventoryCommandSettingsList) {
        this.airProtocolInventoryCommandSettingsList = airProtocolInventoryCommandSettingsList;
    }

    // end setter

    //getters
    /**
    * get   antennaID of type UnsignedShort.
    * @return   type UnsignedShort to be set
    */
    public UnsignedShort getAntennaID() {
        return this.antennaID;
    }

    /**
    * get rFReceiver of type RFReceiver .
    * @return  RFReceiver
    */
    public RFReceiver getRFReceiver() {
        return rFReceiver;
    }

    /**
    * get rFTransmitter of type RFTransmitter .
    * @return  RFTransmitter
    */
    public RFTransmitter getRFTransmitter() {
        return rFTransmitter;
    }

    /**
    * get airProtocolInventoryCommandSettingsList of type List &lt;AirProtocolInventoryCommandSettings> .
    * @return  List &lt;AirProtocolInventoryCommandSettings>
    */
    public List<AirProtocolInventoryCommandSettings> getAirProtocolInventoryCommandSettingsList() {
        return airProtocolInventoryCommandSettingsList;
    }

    // end getters

    //add methods

    /**
    * add element airProtocolInventoryCommandSettings of type AirProtocolInventoryCommandSettings .
    * @param  airProtocolInventoryCommandSettings of type AirProtocolInventoryCommandSettings
    */
    public void addToAirProtocolInventoryCommandSettingsList(
        AirProtocolInventoryCommandSettings airProtocolInventoryCommandSettings) {
        if (this.airProtocolInventoryCommandSettingsList == null) {
            this.airProtocolInventoryCommandSettingsList = new LinkedList<AirProtocolInventoryCommandSettings>();
        }

        this.airProtocolInventoryCommandSettingsList.add(airProtocolInventoryCommandSettings);
    }

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
        return "AntennaConfiguration";
    }

    /**
    * return string representation. All field values but no parameters are included
    * @return String
    */
    public String toString() {
        String result = "AntennaConfiguration: ";
        result += ", antennaID: ";
        result += antennaID;
        result = result.replaceFirst(", ", "");

        return result;
    }
}
