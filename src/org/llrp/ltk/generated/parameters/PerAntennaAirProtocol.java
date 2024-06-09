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
import org.llrp.ltk.generated.enumerations.AirProtocolsArray;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;

/**
 * Describes the air-protocols supporter on a per-antenna basis.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=46&view=fit">LLRP Specification Section 9.2.1.3</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=132&view=fit">LLRP Specification Section 16.2.3.1.3</a>}
 *
 *
 */
/**
 * Describes the air-protocols supporter on a per-antenna basis.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=46&view=fit">LLRP Specification Section 9.2.1.3</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=132&view=fit">LLRP Specification Section 16.2.3.1.3</a>}
 *
 * .
 */
public class PerAntennaAirProtocol extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(140);
  private static final Logger LOGGER = Logger.getLogger(PerAntennaAirProtocol.class);
  protected UnsignedShort antennaID;
  protected AirProtocolsArray protocolID;

  /**
   * empty constructor to create new parameter.
   */
  public PerAntennaAirProtocol() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public PerAntennaAirProtocol(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public PerAntennaAirProtocol(Element element)
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
        " antennaID not set  for Parameter of Type PerAntennaAirProtocol");
    }

    resultBits.append(antennaID.encodeBinary());

    if (protocolID == null) {
      LOGGER.warn(" protocolID not set");
      throw new MissingParameterException(
        " protocolID not set  for Parameter of Type PerAntennaAirProtocol");
    }

    resultBits.append(protocolID.encodeBinary());

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

    if (protocolID == null) {
      LOGGER.warn(" protocolID not set");
      throw new MissingParameterException(" protocolID not set");
    } else {
      element.addContent(protocolID.encodeXML("ProtocolID", ns));
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
    antennaID = new UnsignedShort(binary.subList(position,
      UnsignedShort.length()));
    position += UnsignedShort.length();
    // array. first 16 bits indicate length of array
    fieldCount = new UnsignedShort(binary.subList(position,
      UnsignedShort.length())).toShort();
    tempLength = (AirProtocolsArray.length() * fieldCount)
      + UnsignedShort.length();
    protocolID = new AirProtocolsArray(binary.subList(position, tempLength));
    position += tempLength;
    LOGGER.debug("decoding array of type: AirProtocolsArray with "
      + tempLength + " length");

    //might need padding
    // must always be blocks of 8 bites, if it is a bitlist, this might not be automatically the case
    if ((tempLength % 8) > 0) {
      position += (8 - (tempLength % 8));
      LOGGER.info("padding needed for protocolID ");
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
    temp = element.getChild("ProtocolID", ns);

    if (temp != null) {
      protocolID = new AirProtocolsArray(temp);
    }

    element.removeChild("ProtocolID", ns);

    if (element.getChildren().size() > 0) {
      String message = "PerAntennaAirProtocol has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set antennaID of type UnsignedShort .
   *
   * @param antennaID to be set
   */
  public void setAntennaID(final UnsignedShort antennaID) {
    this.antennaID = antennaID;
  }

  /**
   * set protocolID of type AirProtocolsArray .
   *
   * @param protocolID to be set
   */
  public void setProtocolID(final AirProtocolsArray protocolID) {
    this.protocolID = protocolID;
  }

  // end setter
  //getters
  /**
   * get antennaID of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getAntennaID() {
    return this.antennaID;
  }

  /**
   * get protocolID of type AirProtocolsArray.
   *
   * @return AirProtocolsArray
   */
  public AirProtocolsArray getProtocolID() {
    return protocolID;
  }

  // end getters
  //add methods
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
    return "PerAntennaAirProtocol";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "PerAntennaAirProtocol: ";
    result += ", antennaID: ";
    result += antennaID;
    result += ", protocolID: ";
    result += protocolID;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
