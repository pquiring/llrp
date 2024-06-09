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
import org.llrp.ltk.generated.enumerations.AirProtocols;
import org.llrp.ltk.generated.parameters.AntennaConfiguration;
import org.llrp.ltk.generated.parameters.Custom;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;

/**
 * This parameter defines the inventory operation to be performed at all antennas specified in the corresponding AISpec. This parameter is composed of an InventoryParameterSpecID,
 * a ProtocolID, and zero or more optional antenna configuration parameters. Antenna configurations for antennas not indicated by the AntennaIDs within the AISpec are ignored by
 * the reader.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=59&view=fit">LLRP Specification Section 10.2.2.2</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=137&view=fit">LLRP Specification Section 16.2.4.2.2</a>}
 *
 *
 */
/**
 * This parameter defines the inventory operation to be performed at all antennas specified in the corresponding AISpec. This parameter is composed of an InventoryParameterSpecID,
 * a ProtocolID, and zero or more optional antenna configuration parameters. Antenna configurations for antennas not indicated by the AntennaIDs within the AISpec are ignored by
 * the reader.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=59&view=fit">LLRP Specification Section 10.2.2.2</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=137&view=fit">LLRP Specification Section 16.2.4.2.2</a>}
 *
 * .
 */
public class InventoryParameterSpec extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(186);
  private static final Logger LOGGER = Logger.getLogger(InventoryParameterSpec.class);
  protected UnsignedShort inventoryParameterSpecID;
  protected AirProtocols protocolID;
  protected List<AntennaConfiguration> antennaConfigurationList = new LinkedList<AntennaConfiguration>();
  protected List<Custom> customList = new LinkedList<Custom>();

  /**
   * empty constructor to create new parameter.
   */
  public InventoryParameterSpec() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public InventoryParameterSpec(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public InventoryParameterSpec(Element element)
    throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (inventoryParameterSpecID == null) {
      LOGGER.warn(" inventoryParameterSpecID not set");
      throw new MissingParameterException(
        " inventoryParameterSpecID not set  for Parameter of Type InventoryParameterSpec");
    }

    resultBits.append(inventoryParameterSpecID.encodeBinary());

    if (protocolID == null) {
      LOGGER.warn(" protocolID not set");
      throw new MissingParameterException(
        " protocolID not set  for Parameter of Type InventoryParameterSpec");
    }

    resultBits.append(protocolID.encodeBinary());

    if (antennaConfigurationList == null) {
      //just warn - it is optional
      LOGGER.info(" antennaConfigurationList not set");
    } else {
      for (AntennaConfiguration field : antennaConfigurationList) {
        resultBits.append(field.encodeBinary());
      }
    }

    if (customList == null) {
      //just warn - it is optional
      LOGGER.info(" customList not set");
    } else {
      for (Custom field : customList) {
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

    if (inventoryParameterSpecID == null) {
      LOGGER.warn(" inventoryParameterSpecID not set");
      throw new MissingParameterException(
        " inventoryParameterSpecID not set");
    } else {
      element.addContent(inventoryParameterSpecID.encodeXML(
        "InventoryParameterSpecID", ns));
    }

    if (protocolID == null) {
      LOGGER.warn(" protocolID not set");
      throw new MissingParameterException(" protocolID not set");
    } else {
      element.addContent(protocolID.encodeXML("ProtocolID", ns));
    }

    //parameters
    if (antennaConfigurationList == null) {
      LOGGER.info("antennaConfigurationList not set");
    } else {
      for (AntennaConfiguration field : antennaConfigurationList) {
        element.addContent(field.encodeXML(field.getClass().getName()
          .replaceAll(field.getClass()
            .getPackage()
            .getName()
            + ".", ""), ns));
      }
    }

    if (customList == null) {
      LOGGER.info("customList not set");
    } else {
      for (Custom field : customList) {
        element.addContent(field.encodeXML(field.getClass().getName()
          .replaceAll(field.getClass()
            .getPackage()
            .getName()
            + ".", ""), ns));
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
    inventoryParameterSpecID = new UnsignedShort(binary.subList(position,
      UnsignedShort.length()));
    position += UnsignedShort.length();
    protocolID = new AirProtocols(binary.subList(position,
      AirProtocols.length()));
    position += AirProtocols.length();

    // list of parameters
    antennaConfigurationList = new LinkedList<AntennaConfiguration>();
    LOGGER.debug("decoding parameter antennaConfigurationList ");

    while (position < binary.length()) {
      // store if one parameter matched
      boolean atLeastOnce = false;

      // look ahead to see type
      if (binary.get(position)) {
        // do not take the first bit as it is always 1
        type = new SignedShort(binary.subList(position + 1, 7));
      } else {
        type = new SignedShort(binary.subList(position
          + RESERVEDLENGTH, TYPENUMBERLENGTH));
        tempByteLength = new UnsignedShort(binary.subList(position
          + RESERVEDLENGTH + TYPENUMBERLENGTH,
          UnsignedShort.length())).toShort();
        tempLength = 8 * tempByteLength;
      }

      //add parameter to list if type number matches
      if ((type != null) && type.equals(AntennaConfiguration.TYPENUM)) {
        if (binary.get(position)) {
          // length can statically be determined for TV Parameters
          tempLength = AntennaConfiguration.length();
        }

        antennaConfigurationList.add(new AntennaConfiguration(
          binary.subList(position, tempLength)));
        LOGGER.debug(
          "adding AntennaConfiguration to antennaConfigurationList ");
        atLeastOnce = true;
        position += tempLength;
      }

      if (!atLeastOnce) {
        //no parameter matched therefore we jump out of the loop
        break;
      }
    }

    //if list is still empty no parameter matched
    if (antennaConfigurationList.isEmpty()) {
      LOGGER.info(
        "encoded message does not contain parameter for optional antennaConfigurationList");
    }

    // list of parameters
    customList = new LinkedList<Custom>();
    LOGGER.debug("decoding parameter customList ");

    while (position < binary.length()) {
      // store if one parameter matched
      boolean atLeastOnce = false;

      // look ahead to see type
      if (binary.get(position)) {
        // do not take the first bit as it is always 1
        type = new SignedShort(binary.subList(position + 1, 7));
      } else {
        type = new SignedShort(binary.subList(position
          + RESERVEDLENGTH, TYPENUMBERLENGTH));
        tempByteLength = new UnsignedShort(binary.subList(position
          + RESERVEDLENGTH + TYPENUMBERLENGTH,
          UnsignedShort.length())).toShort();
        tempLength = 8 * tempByteLength;
      }

      // custom
      if ((type != null) && type.equals(Custom.TYPENUM)) {
        Custom cus = new Custom(binary.subList(position, tempLength));
        // custom parameters for this parameter
        // InventoryParameterSpec
        //end  parameters
        //if none matched continue wasn't called and we add just cus as we found no specific vendor implementation
        customList.add(cus);
        position += tempLength;
        atLeastOnce = true;
      }

      if (!atLeastOnce) {
        //no parameter matched therefore we jump out of the loop
        break;
      }
    }

    //if list is still empty no parameter matched
    if (customList.isEmpty()) {
      LOGGER.info(
        "encoded message does not contain parameter for optional customList");
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

    temp = element.getChild("InventoryParameterSpecID", ns);

    if (temp != null) {
      inventoryParameterSpecID = new UnsignedShort(temp);
    }

    element.removeChild("InventoryParameterSpecID", ns);
    temp = element.getChild("ProtocolID", ns);

    if (temp != null) {
      protocolID = new AirProtocols(temp);
    }

    element.removeChild("ProtocolID", ns);

    //parameter - not choices - no special actions needed
    //we expect a list of parameters
    antennaConfigurationList = new LinkedList<AntennaConfiguration>();
    tempList = element.getChildren("AntennaConfiguration", ns);

    if ((tempList == null) || tempList.isEmpty()) {
      LOGGER.info(
        "InventoryParameterSpec misses optional parameter of type antennaConfigurationList");
    } else {
      for (Element e : tempList) {
        antennaConfigurationList.add(new AntennaConfiguration(e));
        LOGGER.debug(
          "adding AntennaConfiguration to antennaConfigurationList ");
      }
    }

    element.removeChildren("AntennaConfiguration", ns);
    //parameter - not choices - no special actions needed
    //we expect a list of parameters
    customList = new LinkedList<Custom>();
    tempList = element.getChildren("Custom", ns);

    if ((tempList == null) || tempList.isEmpty()) {
      LOGGER.info(
        "InventoryParameterSpec misses optional parameter of type customList");
    } else {
      for (Element e : tempList) {
        customList.add(new Custom(e));
        LOGGER.debug("adding Custom to customList ");
      }
    }

    element.removeChildren("Custom", ns);
    //custom parameter
    tempList = element.getChildren("Custom", ns);

    for (Element e : tempList) {
      customList.add(new Custom(e));
      atLeastOnce = true;
      LOGGER.debug("adding custom parameter");
    }

    element.removeChildren("Custom", ns);

    //end custom
    if (element.getChildren().size() > 0) {
      String message = "InventoryParameterSpec has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set inventoryParameterSpecID of type UnsignedShort .
   *
   * @param inventoryParameterSpecID to be set
   */
  public void setInventoryParameterSpecID(
    final UnsignedShort inventoryParameterSpecID) {
    this.inventoryParameterSpecID = inventoryParameterSpecID;
  }

  /**
   * set protocolID of type AirProtocols .
   *
   * @param protocolID to be set
   */
  public void setProtocolID(final AirProtocols protocolID) {
    this.protocolID = protocolID;
  }

  /**
   * set antennaConfigurationList of type List &lt;AntennaConfiguration>.
   *
   * @param antennaConfigurationList to be set
   */
  public void setAntennaConfigurationList(
    final List<AntennaConfiguration> antennaConfigurationList) {
    this.antennaConfigurationList = antennaConfigurationList;
  }

  /**
   * set customList of type List &lt;Custom>.
   *
   * @param customList to be set
   */
  public void setCustomList(final List<Custom> customList) {
    this.customList = customList;
  }

  // end setter
  //getters
  /**
   * get inventoryParameterSpecID of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getInventoryParameterSpecID() {
    return this.inventoryParameterSpecID;
  }

  /**
   * get protocolID of type AirProtocols.
   *
   * @return AirProtocols
   */
  public AirProtocols getProtocolID() {
    return protocolID;
  }

  /**
   * get antennaConfigurationList of type List &lt;AntennaConfiguration> .
   *
   * @return List &lt;AntennaConfiguration>
   */
  public List<AntennaConfiguration> getAntennaConfigurationList() {
    return antennaConfigurationList;
  }

  /**
   * get customList of type List &lt;Custom> .
   *
   * @return List &lt;Custom>
   */
  public List<Custom> getCustomList() {
    return customList;
  }

  // end getters
  //add methods
  /**
   * add element antennaConfiguration of type AntennaConfiguration .
   *
   * @param antennaConfiguration of type AntennaConfiguration
   */
  public void addToAntennaConfigurationList(
    AntennaConfiguration antennaConfiguration) {
    if (this.antennaConfigurationList == null) {
      this.antennaConfigurationList = new LinkedList<AntennaConfiguration>();
    }

    this.antennaConfigurationList.add(antennaConfiguration);
  }

  /**
   * add element custom of type Custom .
   *
   * @param custom of type Custom
   */
  public void addToCustomList(Custom custom) {
    if (this.customList == null) {
      this.customList = new LinkedList<Custom>();
    }

    this.customList.add(custom);
  }

  // end add
  /**
   * For TLV Parameter length can not be determined at compile time. This method therefore always returns 0.
   *
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
    return "InventoryParameterSpec";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "InventoryParameterSpec: ";
    result += ", inventoryParameterSpecID: ";
    result += inventoryParameterSpecID;
    result += ", protocolID: ";
    result += protocolID;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
