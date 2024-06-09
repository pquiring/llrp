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
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;

/**
 * This Parameter carries the settings relevant to RF forward and reverse link control in the C1G2 air protocol. This is basically the C1G2 RF Mode and the Tari value to use for
 * the inventory operation.Tari: Value of Tari to use for this mode specified in nsec. This is specified if the mode selected has a Tari range. If the selected mode has a range,
 * and the Tari is set to zero, the Reader implementation picks up any Tari value within the range. If the selected mode has a range, and the specified Tari is out of that range
 * and is not set to zero, an error message is generated.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=104&view=fit">LLRP Specification Section 15.2.1.2.1.2</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=155&view=fit">LLRP Specification Section 16.3.1.2.1.2</a>}
 *
 *
 */
/**
 * This Parameter carries the settings relevant to RF forward and reverse link control in the C1G2 air protocol. This is basically the C1G2 RF Mode and the Tari value to use for
 * the inventory operation.Tari: Value of Tari to use for this mode specified in nsec. This is specified if the mode selected has a Tari range. If the selected mode has a range,
 * and the Tari is set to zero, the Reader implementation picks up any Tari value within the range. If the selected mode has a range, and the specified Tari is out of that range
 * and is not set to zero, an error message is generated.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=104&view=fit">LLRP Specification Section 15.2.1.2.1.2</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=155&view=fit">LLRP Specification Section 16.3.1.2.1.2</a>}
 *
 * .
 */
public class C1G2RFControl extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(335);
  private static final Logger LOGGER = Logger.getLogger(C1G2RFControl.class);
  protected UnsignedShort modeIndex;
  protected UnsignedShort tari;

  /**
   * empty constructor to create new parameter.
   */
  public C1G2RFControl() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public C1G2RFControl(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public C1G2RFControl(Element element) throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (modeIndex == null) {
      LOGGER.warn(" modeIndex not set");
      throw new MissingParameterException(
        " modeIndex not set  for Parameter of Type C1G2RFControl");
    }

    resultBits.append(modeIndex.encodeBinary());

    if (tari == null) {
      LOGGER.warn(" tari not set");
      throw new MissingParameterException(
        " tari not set  for Parameter of Type C1G2RFControl");
    }

    resultBits.append(tari.encodeBinary());

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

    if (modeIndex == null) {
      LOGGER.warn(" modeIndex not set");
      throw new MissingParameterException(" modeIndex not set");
    } else {
      element.addContent(modeIndex.encodeXML("ModeIndex", ns));
    }

    if (tari == null) {
      LOGGER.warn(" tari not set");
      throw new MissingParameterException(" tari not set");
    } else {
      element.addContent(tari.encodeXML("Tari", ns));
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
    modeIndex = new UnsignedShort(binary.subList(position,
      UnsignedShort.length()));
    position += UnsignedShort.length();
    tari = new UnsignedShort(binary.subList(position, UnsignedShort.length()));
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

    temp = element.getChild("ModeIndex", ns);

    if (temp != null) {
      modeIndex = new UnsignedShort(temp);
    }

    element.removeChild("ModeIndex", ns);
    temp = element.getChild("Tari", ns);

    if (temp != null) {
      tari = new UnsignedShort(temp);
    }

    element.removeChild("Tari", ns);

    if (element.getChildren().size() > 0) {
      String message = "C1G2RFControl has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set modeIndex of type UnsignedShort .
   *
   * @param modeIndex to be set
   */
  public void setModeIndex(final UnsignedShort modeIndex) {
    this.modeIndex = modeIndex;
  }

  /**
   * set tari of type UnsignedShort .
   *
   * @param tari to be set
   */
  public void setTari(final UnsignedShort tari) {
    this.tari = tari;
  }

  // end setter
  //getters
  /**
   * get modeIndex of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getModeIndex() {
    return this.modeIndex;
  }

  /**
   * get tari of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getTari() {
    return this.tari;
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
    return "C1G2RFControl";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "C1G2RFControl: ";
    result += ", modeIndex: ";
    result += modeIndex;
    result += ", tari: ";
    result += tari;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
