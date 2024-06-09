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
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;

/**
 * This parameter carries the tag seen count information. If TagSeenCount > 65535 for the report period, the reader SHALL report 65535.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=84&view=fit">LLRP Specification Section 13.2.3.13</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=146&view=fit">LLRP Specification Section 16.2.7.3.13</a>}
 *
 *
 */
/**
 * This parameter carries the tag seen count information. If TagSeenCount > 65535 for the report period, the reader SHALL report 65535.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=84&view=fit">LLRP Specification Section 13.2.3.13</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=146&view=fit">LLRP Specification Section 16.2.7.3.13</a>}
 *
 * .
 */
public class TagSeenCount extends TVParameter {

  public static final SignedShort TYPENUM = new SignedShort(8);
  private static final Logger LOGGER = Logger.getLogger(TagSeenCount.class);
  protected UnsignedShort tagCount;

  /**
   * empty constructor to create new parameter.
   */
  public TagSeenCount() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public TagSeenCount(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public TagSeenCount(Element element) throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (tagCount == null) {
      LOGGER.warn(" tagCount not set");
      throw new MissingParameterException(
        " tagCount not set  for Parameter of Type TagSeenCount");
    }

    resultBits.append(tagCount.encodeBinary());

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

    if (tagCount == null) {
      LOGGER.warn(" tagCount not set");
      throw new MissingParameterException(" tagCount not set");
    } else {
      element.addContent(tagCount.encodeXML("TagCount", ns));
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
    tagCount = new UnsignedShort(binary.subList(position,
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

    temp = element.getChild("TagCount", ns);

    if (temp != null) {
      tagCount = new UnsignedShort(temp);
    }

    element.removeChild("TagCount", ns);

    if (element.getChildren().size() > 0) {
      String message = "TagSeenCount has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set tagCount of type UnsignedShort .
   *
   * @param tagCount to be set
   */
  public void setTagCount(final UnsignedShort tagCount) {
    this.tagCount = tagCount;
  }

  // end setter
  //getters
  /**
   * get tagCount of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getTagCount() {
    return this.tagCount;
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
    return "TagSeenCount";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "TagSeenCount: ";
    result += ", tagCount: ";
    result += tagCount;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
