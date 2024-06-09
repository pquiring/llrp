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
import org.llrp.ltk.generated.enumerations.AccessSpecStopTriggerType;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;

/**
 * Defines the condition upon which an AccessSpec will be automatically deletedOperationCountValue: A count to indicate the number of times this Spec is executed before it is
 * deleted. If set to zero, this is equivalent to no stop trigger defined.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=65&view=fit">LLRP Specification Section 11.2.1.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=139&view=fit">LLRP Specification Section 16.2.5.1.1</a>}
 *
 *
 */
/**
 * Defines the condition upon which an AccessSpec will be automatically deletedOperationCountValue: A count to indicate the number of times this Spec is executed before it is
 * deleted. If set to zero, this is equivalent to no stop trigger defined.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=65&view=fit">LLRP Specification Section 11.2.1.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=139&view=fit">LLRP Specification Section 16.2.5.1.1</a>}
 *
 * .
 */
public class AccessSpecStopTrigger extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(208);
  private static final Logger LOGGER = Logger.getLogger(AccessSpecStopTrigger.class);
  protected AccessSpecStopTriggerType accessSpecStopTrigger;
  protected UnsignedShort operationCountValue;

  /**
   * empty constructor to create new parameter.
   */
  public AccessSpecStopTrigger() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public AccessSpecStopTrigger(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public AccessSpecStopTrigger(Element element)
    throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (accessSpecStopTrigger == null) {
      LOGGER.warn(" accessSpecStopTrigger not set");
      throw new MissingParameterException(
        " accessSpecStopTrigger not set  for Parameter of Type AccessSpecStopTrigger");
    }

    resultBits.append(accessSpecStopTrigger.encodeBinary());

    if (operationCountValue == null) {
      LOGGER.warn(" operationCountValue not set");
      throw new MissingParameterException(
        " operationCountValue not set  for Parameter of Type AccessSpecStopTrigger");
    }

    resultBits.append(operationCountValue.encodeBinary());

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

    if (accessSpecStopTrigger == null) {
      LOGGER.warn(" accessSpecStopTrigger not set");
      throw new MissingParameterException(
        " accessSpecStopTrigger not set");
    } else {
      element.addContent(accessSpecStopTrigger.encodeXML(
        "AccessSpecStopTrigger", ns));
    }

    if (operationCountValue == null) {
      LOGGER.warn(" operationCountValue not set");
      throw new MissingParameterException(" operationCountValue not set");
    } else {
      element.addContent(operationCountValue.encodeXML(
        "OperationCountValue", ns));
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
    accessSpecStopTrigger = new AccessSpecStopTriggerType(binary.subList(
      position, AccessSpecStopTriggerType.length()));
    position += AccessSpecStopTriggerType.length();
    operationCountValue = new UnsignedShort(binary.subList(position,
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

    temp = element.getChild("AccessSpecStopTrigger", ns);

    if (temp != null) {
      accessSpecStopTrigger = new AccessSpecStopTriggerType(temp);
    }

    element.removeChild("AccessSpecStopTrigger", ns);
    temp = element.getChild("OperationCountValue", ns);

    if (temp != null) {
      operationCountValue = new UnsignedShort(temp);
    }

    element.removeChild("OperationCountValue", ns);

    if (element.getChildren().size() > 0) {
      String message = "AccessSpecStopTrigger has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set accessSpecStopTrigger of type AccessSpecStopTriggerType .
   *
   * @param accessSpecStopTrigger to be set
   */
  public void setAccessSpecStopTrigger(
    final AccessSpecStopTriggerType accessSpecStopTrigger) {
    this.accessSpecStopTrigger = accessSpecStopTrigger;
  }

  /**
   * set operationCountValue of type UnsignedShort .
   *
   * @param operationCountValue to be set
   */
  public void setOperationCountValue(final UnsignedShort operationCountValue) {
    this.operationCountValue = operationCountValue;
  }

  // end setter
  //getters
  /**
   * get accessSpecStopTrigger of type AccessSpecStopTriggerType.
   *
   * @return AccessSpecStopTriggerType
   */
  public AccessSpecStopTriggerType getAccessSpecStopTrigger() {
    return accessSpecStopTrigger;
  }

  /**
   * get operationCountValue of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getOperationCountValue() {
    return this.operationCountValue;
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
    return "AccessSpecStopTrigger";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "AccessSpecStopTrigger: ";
    result += ", accessSpecStopTrigger: ";
    result += accessSpecStopTrigger;
    result += ", operationCountValue: ";
    result += operationCountValue;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
