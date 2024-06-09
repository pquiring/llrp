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
 * This parameter describes the GPIO capabilities of the Reader. A value of zero for NumGPIs indicates that the Reader does not have general purpose inputs. A value of zero for
 * NumGPOs indicates that the Reader does not have general purpose outputs.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=47&view=fit">LLRP Specification Section 9.2.1.4</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=133&view=fit">LLRP Specification Section 16.2.3.1.4</a>}
 *
 *
 */
/**
 * This parameter describes the GPIO capabilities of the Reader. A value of zero for NumGPIs indicates that the Reader does not have general purpose inputs. A value of zero for
 * NumGPOs indicates that the Reader does not have general purpose outputs.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=47&view=fit">LLRP Specification Section 9.2.1.4</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=133&view=fit">LLRP Specification Section 16.2.3.1.4</a>}
 *
 * .
 */
public class GPIOCapabilities extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(141);
  private static final Logger LOGGER = Logger.getLogger(GPIOCapabilities.class);
  protected UnsignedShort numGPIs;
  protected UnsignedShort numGPOs;

  /**
   * empty constructor to create new parameter.
   */
  public GPIOCapabilities() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public GPIOCapabilities(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public GPIOCapabilities(Element element) throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (numGPIs == null) {
      LOGGER.warn(" numGPIs not set");
      throw new MissingParameterException(
        " numGPIs not set  for Parameter of Type GPIOCapabilities");
    }

    resultBits.append(numGPIs.encodeBinary());

    if (numGPOs == null) {
      LOGGER.warn(" numGPOs not set");
      throw new MissingParameterException(
        " numGPOs not set  for Parameter of Type GPIOCapabilities");
    }

    resultBits.append(numGPOs.encodeBinary());

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

    if (numGPIs == null) {
      LOGGER.warn(" numGPIs not set");
      throw new MissingParameterException(" numGPIs not set");
    } else {
      element.addContent(numGPIs.encodeXML("NumGPIs", ns));
    }

    if (numGPOs == null) {
      LOGGER.warn(" numGPOs not set");
      throw new MissingParameterException(" numGPOs not set");
    } else {
      element.addContent(numGPOs.encodeXML("NumGPOs", ns));
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
    numGPIs = new UnsignedShort(binary.subList(position,
      UnsignedShort.length()));
    position += UnsignedShort.length();
    numGPOs = new UnsignedShort(binary.subList(position,
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

    temp = element.getChild("NumGPIs", ns);

    if (temp != null) {
      numGPIs = new UnsignedShort(temp);
    }

    element.removeChild("NumGPIs", ns);
    temp = element.getChild("NumGPOs", ns);

    if (temp != null) {
      numGPOs = new UnsignedShort(temp);
    }

    element.removeChild("NumGPOs", ns);

    if (element.getChildren().size() > 0) {
      String message = "GPIOCapabilities has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set numGPIs of type UnsignedShort .
   *
   * @param numGPIs to be set
   */
  public void setNumGPIs(final UnsignedShort numGPIs) {
    this.numGPIs = numGPIs;
  }

  /**
   * set numGPOs of type UnsignedShort .
   *
   * @param numGPOs to be set
   */
  public void setNumGPOs(final UnsignedShort numGPOs) {
    this.numGPOs = numGPOs;
  }

  // end setter
  //getters
  /**
   * get numGPIs of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getNumGPIs() {
    return this.numGPIs;
  }

  /**
   * get numGPOs of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getNumGPOs() {
    return this.numGPOs;
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
    return "GPIOCapabilities";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "GPIOCapabilities: ";
    result += ", numGPIs: ";
    result += numGPIs;
    result += ", numGPOs: ";
    result += numGPOs;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
