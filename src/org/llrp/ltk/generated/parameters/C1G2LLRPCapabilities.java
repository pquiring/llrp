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
import org.llrp.ltk.generated.interfaces.AirProtocolLLRPCapabilities;
import org.llrp.ltk.types.Bit;
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
 * Readers MAY support BlockErase, and MAY support BlockWrite. Readers SHALL support at least one select filter per query.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=98&view=fit">LLRP Specification Section 15.2.1.1.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=153&view=fit">LLRP Specification Section 16.3.1.1.1</a>}
 *
 *
 */
/**
 * Readers MAY support BlockErase, and MAY support BlockWrite. Readers SHALL support at least one select filter per query.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=98&view=fit">LLRP Specification Section 15.2.1.1.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=153&view=fit">LLRP Specification Section 16.3.1.1.1</a>}
 *
 * .
 */
public class C1G2LLRPCapabilities extends TLVParameter
  implements AirProtocolLLRPCapabilities {

  public static final SignedShort TYPENUM = new SignedShort(327);
  private static final Logger LOGGER = Logger.getLogger(C1G2LLRPCapabilities.class);
  protected Bit canSupportBlockErase;
  protected Bit canSupportBlockWrite;
  protected BitList reserved0 = new BitList(6);
  protected UnsignedShort maxNumSelectFiltersPerQuery;

  /**
   * empty constructor to create new parameter.
   */
  public C1G2LLRPCapabilities() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public C1G2LLRPCapabilities(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public C1G2LLRPCapabilities(Element element)
    throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (canSupportBlockErase == null) {
      LOGGER.warn(" canSupportBlockErase not set");
      throw new MissingParameterException(
        " canSupportBlockErase not set  for Parameter of Type C1G2LLRPCapabilities");
    }

    resultBits.append(canSupportBlockErase.encodeBinary());

    if (canSupportBlockWrite == null) {
      LOGGER.warn(" canSupportBlockWrite not set");
      throw new MissingParameterException(
        " canSupportBlockWrite not set  for Parameter of Type C1G2LLRPCapabilities");
    }

    resultBits.append(canSupportBlockWrite.encodeBinary());
    resultBits.append(reserved0.encodeBinary());

    if (maxNumSelectFiltersPerQuery == null) {
      LOGGER.warn(" maxNumSelectFiltersPerQuery not set");
      throw new MissingParameterException(
        " maxNumSelectFiltersPerQuery not set  for Parameter of Type C1G2LLRPCapabilities");
    }

    resultBits.append(maxNumSelectFiltersPerQuery.encodeBinary());

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

    if (canSupportBlockErase == null) {
      LOGGER.warn(" canSupportBlockErase not set");
      throw new MissingParameterException(" canSupportBlockErase not set");
    } else {
      element.addContent(canSupportBlockErase.encodeXML(
        "CanSupportBlockErase", ns));
    }

    if (canSupportBlockWrite == null) {
      LOGGER.warn(" canSupportBlockWrite not set");
      throw new MissingParameterException(" canSupportBlockWrite not set");
    } else {
      element.addContent(canSupportBlockWrite.encodeXML(
        "CanSupportBlockWrite", ns));
    }

    //element.addContent(reserved0.encodeXML("reserved",ns));
    if (maxNumSelectFiltersPerQuery == null) {
      LOGGER.warn(" maxNumSelectFiltersPerQuery not set");
      throw new MissingParameterException(
        " maxNumSelectFiltersPerQuery not set");
    } else {
      element.addContent(maxNumSelectFiltersPerQuery.encodeXML(
        "MaxNumSelectFiltersPerQuery", ns));
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
    canSupportBlockErase = new Bit(binary.subList(position, Bit.length()));
    position += Bit.length();
    canSupportBlockWrite = new Bit(binary.subList(position, Bit.length()));
    position += Bit.length();
    position += reserved0.length();
    maxNumSelectFiltersPerQuery = new UnsignedShort(binary.subList(
      position, UnsignedShort.length()));
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

    temp = element.getChild("CanSupportBlockErase", ns);

    if (temp != null) {
      canSupportBlockErase = new Bit(temp);
    }

    element.removeChild("CanSupportBlockErase", ns);
    temp = element.getChild("CanSupportBlockWrite", ns);

    if (temp != null) {
      canSupportBlockWrite = new Bit(temp);
    }

    element.removeChild("CanSupportBlockWrite", ns);
    temp = element.getChild("MaxNumSelectFiltersPerQuery", ns);

    if (temp != null) {
      maxNumSelectFiltersPerQuery = new UnsignedShort(temp);
    }

    element.removeChild("MaxNumSelectFiltersPerQuery", ns);

    if (element.getChildren().size() > 0) {
      String message = "C1G2LLRPCapabilities has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set canSupportBlockErase of type Bit .
   *
   * @param canSupportBlockErase to be set
   */
  public void setCanSupportBlockErase(final Bit canSupportBlockErase) {
    this.canSupportBlockErase = canSupportBlockErase;
  }

  /**
   * set canSupportBlockWrite of type Bit .
   *
   * @param canSupportBlockWrite to be set
   */
  public void setCanSupportBlockWrite(final Bit canSupportBlockWrite) {
    this.canSupportBlockWrite = canSupportBlockWrite;
  }

  /**
   * set maxNumSelectFiltersPerQuery of type UnsignedShort .
   *
   * @param maxNumSelectFiltersPerQuery to be set
   */
  public void setMaxNumSelectFiltersPerQuery(
    final UnsignedShort maxNumSelectFiltersPerQuery) {
    this.maxNumSelectFiltersPerQuery = maxNumSelectFiltersPerQuery;
  }

  // end setter
  //getters
  /**
   * get canSupportBlockErase of type Bit.
   *
   * @return type Bit to be set
   */
  public Bit getCanSupportBlockErase() {
    return this.canSupportBlockErase;
  }

  /**
   * get canSupportBlockWrite of type Bit.
   *
   * @return type Bit to be set
   */
  public Bit getCanSupportBlockWrite() {
    return this.canSupportBlockWrite;
  }

  /**
   * get maxNumSelectFiltersPerQuery of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getMaxNumSelectFiltersPerQuery() {
    return this.maxNumSelectFiltersPerQuery;
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
    return "C1G2LLRPCapabilities";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "C1G2LLRPCapabilities: ";
    result += ", canSupportBlockErase: ";
    result += canSupportBlockErase;
    result += ", canSupportBlockWrite: ";
    result += canSupportBlockWrite;

    result += ", maxNumSelectFiltersPerQuery: ";
    result += maxNumSelectFiltersPerQuery;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
