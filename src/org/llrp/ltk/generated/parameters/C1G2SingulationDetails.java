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
import org.llrp.ltk.generated.interfaces.AirProtocolSingulationDetails;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;

/**
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=111&view=fit">LLRP Specification Section 15.2.1.5.4</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=159&view=fit">LLRP Specification Section 16.3.1.5.4</a>}
 *
 *
 */
/**
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=111&view=fit">LLRP Specification Section 15.2.1.5.4</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=159&view=fit">LLRP Specification Section 16.3.1.5.4</a>}
 *
 * .
 */
public class C1G2SingulationDetails extends TVParameter
  implements AirProtocolSingulationDetails {

  public static final SignedShort TYPENUM = new SignedShort(18);
  private static final Logger LOGGER = Logger.getLogger(C1G2SingulationDetails.class);
  protected UnsignedShort numCollisionSlots;
  protected UnsignedShort numEmptySlots;

  /**
   * empty constructor to create new parameter.
   */
  public C1G2SingulationDetails() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public C1G2SingulationDetails(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public C1G2SingulationDetails(Element element)
    throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (numCollisionSlots == null) {
      LOGGER.warn(" numCollisionSlots not set");
      throw new MissingParameterException(
        " numCollisionSlots not set  for Parameter of Type C1G2SingulationDetails");
    }

    resultBits.append(numCollisionSlots.encodeBinary());

    if (numEmptySlots == null) {
      LOGGER.warn(" numEmptySlots not set");
      throw new MissingParameterException(
        " numEmptySlots not set  for Parameter of Type C1G2SingulationDetails");
    }

    resultBits.append(numEmptySlots.encodeBinary());

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

    if (numCollisionSlots == null) {
      LOGGER.warn(" numCollisionSlots not set");
      throw new MissingParameterException(" numCollisionSlots not set");
    } else {
      element.addContent(numCollisionSlots.encodeXML(
        "NumCollisionSlots", ns));
    }

    if (numEmptySlots == null) {
      LOGGER.warn(" numEmptySlots not set");
      throw new MissingParameterException(" numEmptySlots not set");
    } else {
      element.addContent(numEmptySlots.encodeXML("NumEmptySlots", ns));
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
    numCollisionSlots = new UnsignedShort(binary.subList(position,
      UnsignedShort.length()));
    position += UnsignedShort.length();
    numEmptySlots = new UnsignedShort(binary.subList(position,
      UnsignedShort.length()));
    position += UnsignedShort.length();
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

    temp = element.getChild("NumCollisionSlots", ns);

    if (temp != null) {
      numCollisionSlots = new UnsignedShort(temp);
    }

    element.removeChild("NumCollisionSlots", ns);
    temp = element.getChild("NumEmptySlots", ns);

    if (temp != null) {
      numEmptySlots = new UnsignedShort(temp);
    }

    element.removeChild("NumEmptySlots", ns);

    if (element.getChildren().size() > 0) {
      String message = "C1G2SingulationDetails has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set numCollisionSlots of type UnsignedShort .
   *
   * @param numCollisionSlots to be set
   */
  public void setNumCollisionSlots(final UnsignedShort numCollisionSlots) {
    this.numCollisionSlots = numCollisionSlots;
  }

  /**
   * set numEmptySlots of type UnsignedShort .
   *
   * @param numEmptySlots to be set
   */
  public void setNumEmptySlots(final UnsignedShort numEmptySlots) {
    this.numEmptySlots = numEmptySlots;
  }

  // end setter
  //getters
  /**
   * get numCollisionSlots of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getNumCollisionSlots() {
    return this.numCollisionSlots;
  }

  /**
   * get numEmptySlots of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getNumEmptySlots() {
    return this.numEmptySlots;
  }

  // end getters
  //add methods
  // end add
  /**
   * return length of parameter. For TV Parameter it is always length of its field plus 8 bits for type.
   *
   * @return Integer giving length
   */
  public static Integer length() {
    int tempLength = PARAMETERTYPELENGTH;
    // the length of a TV parameter in bits is always the type
    tempLength += UnsignedShort.length();
    // the length of a TV parameter in bits is always the type
    tempLength += UnsignedShort.length();

    return tempLength;
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
    return "C1G2SingulationDetails";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "C1G2SingulationDetails: ";
    result += ", numCollisionSlots: ";
    result += numCollisionSlots;
    result += ", numEmptySlots: ";
    result += numEmptySlots;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
