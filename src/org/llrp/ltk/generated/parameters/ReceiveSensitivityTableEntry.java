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
 * This parameter specifies the index into the Receive Sensitivity Table for a receive sensitivity value. The receive sensitivity is expressed in dB and the value is relative to
 * the maximum sensitivity. If the Reader does not allow control of receive sensitivity, a table of one entry is returned, the entry having the value of zero.If the Reader allows
 * control of receive sensitivity and the Reader also supports multiple antennas where the antennas can have different receive sensitivity values, then the Receive Sensitivity
 * Table should be a set of values representing the union of sensitivity values for all antennas.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=45&view=fit">LLRP Specification Section 9.2.1.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=132&view=fit">LLRP Specification Section 16.2.3.1.1</a>}
 *
 *
 */
/**
 * This parameter specifies the index into the Receive Sensitivity Table for a receive sensitivity value. The receive sensitivity is expressed in dB and the value is relative to
 * the maximum sensitivity. If the Reader does not allow control of receive sensitivity, a table of one entry is returned, the entry having the value of zero.If the Reader allows
 * control of receive sensitivity and the Reader also supports multiple antennas where the antennas can have different receive sensitivity values, then the Receive Sensitivity
 * Table should be a set of values representing the union of sensitivity values for all antennas.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=45&view=fit">LLRP Specification Section 9.2.1.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=132&view=fit">LLRP Specification Section 16.2.3.1.1</a>}
 *
 * .
 */
public class ReceiveSensitivityTableEntry extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(139);
  private static final Logger LOGGER = Logger.getLogger(ReceiveSensitivityTableEntry.class);
  protected UnsignedShort index;
  protected SignedShort receiveSensitivityValue;

  /**
   * empty constructor to create new parameter.
   */
  public ReceiveSensitivityTableEntry() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public ReceiveSensitivityTableEntry(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public ReceiveSensitivityTableEntry(Element element)
    throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (index == null) {
      LOGGER.warn(" index not set");
      throw new MissingParameterException(
        " index not set  for Parameter of Type ReceiveSensitivityTableEntry");
    }

    resultBits.append(index.encodeBinary());

    if (receiveSensitivityValue == null) {
      LOGGER.warn(" receiveSensitivityValue not set");
      throw new MissingParameterException(
        " receiveSensitivityValue not set  for Parameter of Type ReceiveSensitivityTableEntry");
    }

    resultBits.append(receiveSensitivityValue.encodeBinary());

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

    if (index == null) {
      LOGGER.warn(" index not set");
      throw new MissingParameterException(" index not set");
    } else {
      element.addContent(index.encodeXML("Index", ns));
    }

    if (receiveSensitivityValue == null) {
      LOGGER.warn(" receiveSensitivityValue not set");
      throw new MissingParameterException(
        " receiveSensitivityValue not set");
    } else {
      element.addContent(receiveSensitivityValue.encodeXML(
        "ReceiveSensitivityValue", ns));
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
    index = new UnsignedShort(binary.subList(position,
      UnsignedShort.length()));
    position += UnsignedShort.length();
    receiveSensitivityValue = new SignedShort(binary.subList(position,
      SignedShort.length()));
    position += SignedShort.length();
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

    temp = element.getChild("Index", ns);

    if (temp != null) {
      index = new UnsignedShort(temp);
    }

    element.removeChild("Index", ns);
    temp = element.getChild("ReceiveSensitivityValue", ns);

    if (temp != null) {
      receiveSensitivityValue = new SignedShort(temp);
    }

    element.removeChild("ReceiveSensitivityValue", ns);

    if (element.getChildren().size() > 0) {
      String message = "ReceiveSensitivityTableEntry has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set index of type UnsignedShort .
   *
   * @param index to be set
   */
  public void setIndex(final UnsignedShort index) {
    this.index = index;
  }

  /**
   * set receiveSensitivityValue of type SignedShort .
   *
   * @param receiveSensitivityValue to be set
   */
  public void setReceiveSensitivityValue(
    final SignedShort receiveSensitivityValue) {
    this.receiveSensitivityValue = receiveSensitivityValue;
  }

  // end setter
  //getters
  /**
   * get index of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getIndex() {
    return this.index;
  }

  /**
   * get receiveSensitivityValue of type SignedShort.
   *
   * @return type SignedShort to be set
   */
  public SignedShort getReceiveSensitivityValue() {
    return this.receiveSensitivityValue;
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
    return "ReceiveSensitivityTableEntry";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "ReceiveSensitivityTableEntry: ";
    result += ", index: ";
    result += index;
    result += ", receiveSensitivityValue: ";
    result += receiveSensitivityValue;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
