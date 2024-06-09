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
import org.llrp.ltk.generated.enumerations.ROSpecStartTriggerType;
import org.llrp.ltk.generated.parameters.GPITriggerValue;
import org.llrp.ltk.generated.parameters.PeriodicTriggerValue;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;

/**
 * Describes the condition upon which the ROSpec will start execution.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=56&view=fit">LLRP Specification Section 10.2.1.1.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=136&view=fit">LLRP Specification Section 16.2.4.1.1.1</a>}
 *
 *
 */
/**
 * Describes the condition upon which the ROSpec will start execution.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=56&view=fit">LLRP Specification Section 10.2.1.1.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=136&view=fit">LLRP Specification Section 16.2.4.1.1.1</a>}
 *
 * .
 */
public class ROSpecStartTrigger extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(179);
  private static final Logger LOGGER = Logger.getLogger(ROSpecStartTrigger.class);
  protected ROSpecStartTriggerType rOSpecStartTriggerType;
  protected PeriodicTriggerValue periodicTriggerValue;
  protected GPITriggerValue gPITriggerValue;

  /**
   * empty constructor to create new parameter.
   */
  public ROSpecStartTrigger() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public ROSpecStartTrigger(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public ROSpecStartTrigger(Element element)
    throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (rOSpecStartTriggerType == null) {
      LOGGER.warn(" rOSpecStartTriggerType not set");
      throw new MissingParameterException(
        " rOSpecStartTriggerType not set  for Parameter of Type ROSpecStartTrigger");
    }

    resultBits.append(rOSpecStartTriggerType.encodeBinary());

    if (periodicTriggerValue == null) {
      // optional parameter, may be null
      LOGGER.info(" periodicTriggerValue not set");
    } else {
      resultBits.append(periodicTriggerValue.encodeBinary());
    }

    if (gPITriggerValue == null) {
      // optional parameter, may be null
      LOGGER.info(" gPITriggerValue not set");
    } else {
      resultBits.append(gPITriggerValue.encodeBinary());
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

    if (rOSpecStartTriggerType == null) {
      LOGGER.warn(" rOSpecStartTriggerType not set");
      throw new MissingParameterException(
        " rOSpecStartTriggerType not set");
    } else {
      element.addContent(rOSpecStartTriggerType.encodeXML(
        "ROSpecStartTriggerType", ns));
    }

    //parameters
    if (periodicTriggerValue == null) {
      LOGGER.info("periodicTriggerValue not set");
    } else {
      element.addContent(periodicTriggerValue.encodeXML(
        periodicTriggerValue.getClass().getSimpleName(), ns));
    }

    if (gPITriggerValue == null) {
      LOGGER.info("gPITriggerValue not set");
    } else {
      element.addContent(gPITriggerValue.encodeXML(
        gPITriggerValue.getClass().getSimpleName(), ns));
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
    rOSpecStartTriggerType = new ROSpecStartTriggerType(binary.subList(
      position, ROSpecStartTriggerType.length()));
    position += ROSpecStartTriggerType.length();

    // look ahead to see type
    // may be optional or exactly once
    type = null;
    tempByteLength = 0;
    tempLength = 0;

    try {
      // if first bit is one it is a TV Parameter
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
    } catch (IllegalArgumentException le) {
      // if an IllegalArgumentException is thrown, list was not long enough so the parameter is missing
      LOGGER.info(
        "ROSpecStartTrigger misses optional parameter of type PeriodicTriggerValue");
    }

    if (binary.get(position)) {
      // length can statically be determined for TV Parameters
      tempLength = periodicTriggerValue.length();
    }

    if ((type != null) && type.equals(PeriodicTriggerValue.TYPENUM)) {
      periodicTriggerValue = new PeriodicTriggerValue(binary.subList(
        position, tempLength));
      position += tempLength;
      LOGGER.debug(
        " periodicTriggerValue is instantiated with PeriodicTriggerValue with length"
        + tempLength);
    } else {
      LOGGER.info(
        "ROSpecStartTrigger misses optional parameter of type PeriodicTriggerValue");
    }

    // look ahead to see type
    // may be optional or exactly once
    type = null;
    tempByteLength = 0;
    tempLength = 0;

    try {
      // if first bit is one it is a TV Parameter
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
    } catch (IllegalArgumentException le) {
      // if an IllegalArgumentException is thrown, list was not long enough so the parameter is missing
      LOGGER.info(
        "ROSpecStartTrigger misses optional parameter of type GPITriggerValue");
    }

    if (binary.get(position)) {
      // length can statically be determined for TV Parameters
      tempLength = gPITriggerValue.length();
    }

    if ((type != null) && type.equals(GPITriggerValue.TYPENUM)) {
      gPITriggerValue = new GPITriggerValue(binary.subList(position,
        tempLength));
      position += tempLength;
      LOGGER.debug(
        " gPITriggerValue is instantiated with GPITriggerValue with length"
        + tempLength);
    } else {
      LOGGER.info(
        "ROSpecStartTrigger misses optional parameter of type GPITriggerValue");
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

    temp = element.getChild("ROSpecStartTriggerType", ns);

    if (temp != null) {
      rOSpecStartTriggerType = new ROSpecStartTriggerType(temp);
    }

    element.removeChild("ROSpecStartTriggerType", ns);

    //parameter - not choices - no special actions needed
    temp = element.getChild("PeriodicTriggerValue", ns);

    if (temp != null) {
      periodicTriggerValue = new PeriodicTriggerValue(temp);
      LOGGER.info(
        "setting parameter periodicTriggerValue for parameter ROSpecStartTrigger");
    }

    if (temp == null) {
      LOGGER.info(
        "ROSpecStartTrigger misses optional parameter of type periodicTriggerValue");
    }

    element.removeChild("PeriodicTriggerValue", ns);
    //parameter - not choices - no special actions needed
    temp = element.getChild("GPITriggerValue", ns);

    if (temp != null) {
      gPITriggerValue = new GPITriggerValue(temp);
      LOGGER.info(
        "setting parameter gPITriggerValue for parameter ROSpecStartTrigger");
    }

    if (temp == null) {
      LOGGER.info(
        "ROSpecStartTrigger misses optional parameter of type gPITriggerValue");
    }

    element.removeChild("GPITriggerValue", ns);

    if (element.getChildren().size() > 0) {
      String message = "ROSpecStartTrigger has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set rOSpecStartTriggerType of type ROSpecStartTriggerType .
   *
   * @param rOSpecStartTriggerType to be set
   */
  public void setROSpecStartTriggerType(
    final ROSpecStartTriggerType rOSpecStartTriggerType) {
    this.rOSpecStartTriggerType = rOSpecStartTriggerType;
  }

  /**
   * set periodicTriggerValue of type PeriodicTriggerValue.
   *
   * @param periodicTriggerValue to be set
   */
  public void setPeriodicTriggerValue(
    final PeriodicTriggerValue periodicTriggerValue) {
    this.periodicTriggerValue = periodicTriggerValue;
  }

  /**
   * set gPITriggerValue of type GPITriggerValue.
   *
   * @param gPITriggerValue to be set
   */
  public void setGPITriggerValue(final GPITriggerValue gPITriggerValue) {
    this.gPITriggerValue = gPITriggerValue;
  }

  // end setter
  //getters
  /**
   * get rOSpecStartTriggerType of type ROSpecStartTriggerType.
   *
   * @return ROSpecStartTriggerType
   */
  public ROSpecStartTriggerType getROSpecStartTriggerType() {
    return rOSpecStartTriggerType;
  }

  /**
   * get periodicTriggerValue of type PeriodicTriggerValue .
   *
   * @return PeriodicTriggerValue
   */
  public PeriodicTriggerValue getPeriodicTriggerValue() {
    return periodicTriggerValue;
  }

  /**
   * get gPITriggerValue of type GPITriggerValue .
   *
   * @return GPITriggerValue
   */
  public GPITriggerValue getGPITriggerValue() {
    return gPITriggerValue;
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
    return "ROSpecStartTrigger";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "ROSpecStartTrigger: ";
    result += ", rOSpecStartTriggerType: ";
    result += rOSpecStartTriggerType;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
