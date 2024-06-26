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

import org.jdom2.Content;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;

import org.llrp.ltk.exceptions.InvalidLLRPMessageException;
import org.llrp.ltk.exceptions.MissingParameterException;
import org.llrp.ltk.generated.LLRPConstants;
import org.llrp.ltk.generated.interfaces.AirProtocolTagData;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;

/**
 * CRC generated by the tag from the UHF Gen2 Air Interface Protocol
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=111&view=fit">LLRP Specification Section 15.2.1.5.3</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=159&view=fit">LLRP Specification Section 16.3.1.5.3</a>}
 *
 *
 */
/**
 * CRC generated by the tag from the UHF Gen2 Air Interface Protocol
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=111&view=fit">LLRP Specification Section 15.2.1.5.3</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=159&view=fit">LLRP Specification Section 16.3.1.5.3</a>}
 *
 * .
 */
public class C1G2_CRC extends TVParameter implements AirProtocolTagData {

  public static final SignedShort TYPENUM = new SignedShort(11);
  private static final Logger LOGGER = Logger.getLogger(C1G2_CRC.class);
  protected UnsignedShort cRC;

  /**
   * empty constructor to create new parameter.
   */
  public C1G2_CRC() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public C1G2_CRC(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public C1G2_CRC(Element element) throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (cRC == null) {
      LOGGER.warn(" cRC not set");
      throw new MissingParameterException(
        " cRC not set  for Parameter of Type C1G2_CRC");
    }

    resultBits.append(cRC.encodeBinary());

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

    if (cRC == null) {
      LOGGER.warn(" cRC not set");
      throw new MissingParameterException(" cRC not set");
    } else {
      element.addContent(cRC.encodeXML("CRC", ns));
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
    cRC = new UnsignedShort(binary.subList(position, UnsignedShort.length()));
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

    temp = element.getChild("CRC", ns);

    if (temp != null) {
      cRC = new UnsignedShort(temp);
    }

    element.removeChild("CRC", ns);

    if (element.getChildren().size() > 0) {
      String message = "C1G2_CRC has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set cRC of type UnsignedShort .
   *
   * @param cRC to be set
   */
  public void setCRC(final UnsignedShort cRC) {
    this.cRC = cRC;
  }

  // end setter
  //getters
  /**
   * get cRC of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getCRC() {
    return this.cRC;
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
    return "C1G2_CRC";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "C1G2_CRC: ";
    result += ", cRC: ";
    result += cRC;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
