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

import org.jdom2.Content;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;

import org.llrp.ltk.exceptions.InvalidLLRPMessageException;
import org.llrp.ltk.exceptions.MissingParameterException;
import org.llrp.ltk.generated.LLRPConstants;
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
 * This parameter carries the AccessSpecID information.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=85&view=fit">LLRP Specification Section 13.2.3.15</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=146&view=fit">LLRP Specification Section 16.2.7.3.15</a>}
 *
 *
 */
/**
 * This parameter carries the AccessSpecID information.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=85&view=fit">LLRP Specification Section 13.2.3.15</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=146&view=fit">LLRP Specification Section 16.2.7.3.15</a>}
 *
 * .
 */
public class AccessSpecID extends TVParameter {

  public static final SignedShort TYPENUM = new SignedShort(16);
  private static final Logger LOGGER = Logger.getLogger(AccessSpecID.class);
  protected UnsignedInteger accessSpecID;

  /**
   * empty constructor to create new parameter.
   */
  public AccessSpecID() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public AccessSpecID(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public AccessSpecID(Element element) throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (accessSpecID == null) {
      LOGGER.warn(" accessSpecID not set");
      throw new MissingParameterException(
        " accessSpecID not set  for Parameter of Type AccessSpecID");
    }

    resultBits.append(accessSpecID.encodeBinary());

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

    if (accessSpecID == null) {
      LOGGER.warn(" accessSpecID not set");
      throw new MissingParameterException(" accessSpecID not set");
    } else {
      element.addContent(accessSpecID.encodeXML("AccessSpecID", ns));
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
    accessSpecID = new UnsignedInteger(binary.subList(position,
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

    temp = element.getChild("AccessSpecID", ns);

    if (temp != null) {
      accessSpecID = new UnsignedInteger(temp);
    }

    element.removeChild("AccessSpecID", ns);

    if (element.getChildren().size() > 0) {
      String message = "AccessSpecID has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set accessSpecID of type UnsignedInteger .
   *
   * @param accessSpecID to be set
   */
  public void setAccessSpecID(final UnsignedInteger accessSpecID) {
    this.accessSpecID = accessSpecID;
  }

  // end setter
  //getters
  /**
   * get accessSpecID of type UnsignedInteger.
   *
   * @return type UnsignedInteger to be set
   */
  public UnsignedInteger getAccessSpecID() {
    return this.accessSpecID;
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
    tempLength += UnsignedInteger.length();

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
    return "AccessSpecID";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "AccessSpecID: ";
    result += ", accessSpecID: ";
    result += accessSpecID;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
