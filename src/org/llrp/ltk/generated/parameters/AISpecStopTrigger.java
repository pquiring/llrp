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
import org.llrp.ltk.generated.enumerations.AISpecStopTriggerType;
import org.llrp.ltk.generated.parameters.GPITriggerValue;
import org.llrp.ltk.generated.parameters.TagObservationTrigger;
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
 * This parameter defines the stop (i.e., terminating boundary) of an antenna inventory operation.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=58&view=fit">LLRP Specification Section 10.2.2.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=137&view=fit">LLRP Specification Section 16.2.4.2.1</a>}
 *
 *
 */
/**
 * This parameter defines the stop (i.e., terminating boundary) of an antenna inventory operation.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=58&view=fit">LLRP Specification Section 10.2.2.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=137&view=fit">LLRP Specification Section 16.2.4.2.1</a>}
 *
 * .
 */
public class AISpecStopTrigger extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(184);
  private static final Logger LOGGER = Logger.getLogger(AISpecStopTrigger.class);
  protected AISpecStopTriggerType aISpecStopTriggerType;
  protected UnsignedInteger durationTrigger;
  protected GPITriggerValue gPITriggerValue;
  protected TagObservationTrigger tagObservationTrigger;

  /**
   * empty constructor to create new parameter.
   */
  public AISpecStopTrigger() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public AISpecStopTrigger(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public AISpecStopTrigger(Element element)
    throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (aISpecStopTriggerType == null) {
      LOGGER.warn(" aISpecStopTriggerType not set");
      throw new MissingParameterException(
        " aISpecStopTriggerType not set  for Parameter of Type AISpecStopTrigger");
    }

    resultBits.append(aISpecStopTriggerType.encodeBinary());

    if (durationTrigger == null) {
      LOGGER.warn(" durationTrigger not set");
      throw new MissingParameterException(
        " durationTrigger not set  for Parameter of Type AISpecStopTrigger");
    }

    resultBits.append(durationTrigger.encodeBinary());

    if (gPITriggerValue == null) {
      // optional parameter, may be null
      LOGGER.info(" gPITriggerValue not set");
    } else {
      resultBits.append(gPITriggerValue.encodeBinary());
    }

    if (tagObservationTrigger == null) {
      // optional parameter, may be null
      LOGGER.info(" tagObservationTrigger not set");
    } else {
      resultBits.append(tagObservationTrigger.encodeBinary());
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

    if (aISpecStopTriggerType == null) {
      LOGGER.warn(" aISpecStopTriggerType not set");
      throw new MissingParameterException(
        " aISpecStopTriggerType not set");
    } else {
      element.addContent(aISpecStopTriggerType.encodeXML(
        "AISpecStopTriggerType", ns));
    }

    if (durationTrigger == null) {
      LOGGER.warn(" durationTrigger not set");
      throw new MissingParameterException(" durationTrigger not set");
    } else {
      element.addContent(durationTrigger.encodeXML("DurationTrigger", ns));
    }

    //parameters
    if (gPITriggerValue == null) {
      LOGGER.info("gPITriggerValue not set");
    } else {
      element.addContent(gPITriggerValue.encodeXML(
        gPITriggerValue.getClass().getSimpleName(), ns));
    }

    if (tagObservationTrigger == null) {
      LOGGER.info("tagObservationTrigger not set");
    } else {
      element.addContent(tagObservationTrigger.encodeXML(
        tagObservationTrigger.getClass().getSimpleName(), ns));
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
    aISpecStopTriggerType = new AISpecStopTriggerType(binary.subList(
      position, AISpecStopTriggerType.length()));
    position += AISpecStopTriggerType.length();
    durationTrigger = new UnsignedInteger(binary.subList(position,
      UnsignedInteger.length()));
    position += UnsignedInteger.length();

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
        "AISpecStopTrigger misses optional parameter of type GPITriggerValue");
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
        "AISpecStopTrigger misses optional parameter of type GPITriggerValue");
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
        "AISpecStopTrigger misses optional parameter of type TagObservationTrigger");
    }

    if (binary.get(position)) {
      // length can statically be determined for TV Parameters
      tempLength = tagObservationTrigger.length();
    }

    if ((type != null) && type.equals(TagObservationTrigger.TYPENUM)) {
      tagObservationTrigger = new TagObservationTrigger(binary.subList(
        position, tempLength));
      position += tempLength;
      LOGGER.debug(
        " tagObservationTrigger is instantiated with TagObservationTrigger with length"
        + tempLength);
    } else {
      LOGGER.info(
        "AISpecStopTrigger misses optional parameter of type TagObservationTrigger");
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

    temp = element.getChild("AISpecStopTriggerType", ns);

    if (temp != null) {
      aISpecStopTriggerType = new AISpecStopTriggerType(temp);
    }

    element.removeChild("AISpecStopTriggerType", ns);
    temp = element.getChild("DurationTrigger", ns);

    if (temp != null) {
      durationTrigger = new UnsignedInteger(temp);
    }

    element.removeChild("DurationTrigger", ns);

    //parameter - not choices - no special actions needed
    temp = element.getChild("GPITriggerValue", ns);

    if (temp != null) {
      gPITriggerValue = new GPITriggerValue(temp);
      LOGGER.info(
        "setting parameter gPITriggerValue for parameter AISpecStopTrigger");
    }

    if (temp == null) {
      LOGGER.info(
        "AISpecStopTrigger misses optional parameter of type gPITriggerValue");
    }

    element.removeChild("GPITriggerValue", ns);
    //parameter - not choices - no special actions needed
    temp = element.getChild("TagObservationTrigger", ns);

    if (temp != null) {
      tagObservationTrigger = new TagObservationTrigger(temp);
      LOGGER.info(
        "setting parameter tagObservationTrigger for parameter AISpecStopTrigger");
    }

    if (temp == null) {
      LOGGER.info(
        "AISpecStopTrigger misses optional parameter of type tagObservationTrigger");
    }

    element.removeChild("TagObservationTrigger", ns);

    if (element.getChildren().size() > 0) {
      String message = "AISpecStopTrigger has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set aISpecStopTriggerType of type AISpecStopTriggerType .
   *
   * @param aISpecStopTriggerType to be set
   */
  public void setAISpecStopTriggerType(
    final AISpecStopTriggerType aISpecStopTriggerType) {
    this.aISpecStopTriggerType = aISpecStopTriggerType;
  }

  /**
   * set durationTrigger of type UnsignedInteger .
   *
   * @param durationTrigger to be set
   */
  public void setDurationTrigger(final UnsignedInteger durationTrigger) {
    this.durationTrigger = durationTrigger;
  }

  /**
   * set gPITriggerValue of type GPITriggerValue.
   *
   * @param gPITriggerValue to be set
   */
  public void setGPITriggerValue(final GPITriggerValue gPITriggerValue) {
    this.gPITriggerValue = gPITriggerValue;
  }

  /**
   * set tagObservationTrigger of type TagObservationTrigger.
   *
   * @param tagObservationTrigger to be set
   */
  public void setTagObservationTrigger(
    final TagObservationTrigger tagObservationTrigger) {
    this.tagObservationTrigger = tagObservationTrigger;
  }

  // end setter
  //getters
  /**
   * get aISpecStopTriggerType of type AISpecStopTriggerType.
   *
   * @return AISpecStopTriggerType
   */
  public AISpecStopTriggerType getAISpecStopTriggerType() {
    return aISpecStopTriggerType;
  }

  /**
   * get durationTrigger of type UnsignedInteger.
   *
   * @return type UnsignedInteger to be set
   */
  public UnsignedInteger getDurationTrigger() {
    return this.durationTrigger;
  }

  /**
   * get gPITriggerValue of type GPITriggerValue .
   *
   * @return GPITriggerValue
   */
  public GPITriggerValue getGPITriggerValue() {
    return gPITriggerValue;
  }

  /**
   * get tagObservationTrigger of type TagObservationTrigger .
   *
   * @return TagObservationTrigger
   */
  public TagObservationTrigger getTagObservationTrigger() {
    return tagObservationTrigger;
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
    return "AISpecStopTrigger";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "AISpecStopTrigger: ";
    result += ", aISpecStopTriggerType: ";
    result += aISpecStopTriggerType;
    result += ", durationTrigger: ";
    result += durationTrigger;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
