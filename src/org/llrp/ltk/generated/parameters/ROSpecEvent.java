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
import org.llrp.ltk.generated.enumerations.ROSpecEventType;
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
 * This parameter carries the ROSpec event details. The EventType could be start or end of the ROSpec.ROSpecID: This is the ID of the ROSpec that started, ended or got preempted.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=89&view=fit">LLRP Specification Section 13.2.6.4</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=149&view=fit">LLRP Specification Section 16.2.7.6.3</a>}
 *
 *
 */
/**
 * This parameter carries the ROSpec event details. The EventType could be start or end of the ROSpec.ROSpecID: This is the ID of the ROSpec that started, ended or got preempted.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=89&view=fit">LLRP Specification Section 13.2.6.4</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=149&view=fit">LLRP Specification Section 16.2.7.6.3</a>}
 *
 * .
 */
public class ROSpecEvent extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(249);
  private static final Logger LOGGER = Logger.getLogger(ROSpecEvent.class);
  protected ROSpecEventType eventType;
  protected UnsignedInteger rOSpecID;
  protected UnsignedInteger preemptingROSpecID;

  /**
   * empty constructor to create new parameter.
   */
  public ROSpecEvent() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public ROSpecEvent(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public ROSpecEvent(Element element) throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (eventType == null) {
      LOGGER.warn(" eventType not set");
      throw new MissingParameterException(
        " eventType not set  for Parameter of Type ROSpecEvent");
    }

    resultBits.append(eventType.encodeBinary());

    if (rOSpecID == null) {
      LOGGER.warn(" rOSpecID not set");
      throw new MissingParameterException(
        " rOSpecID not set  for Parameter of Type ROSpecEvent");
    }

    resultBits.append(rOSpecID.encodeBinary());

    if (preemptingROSpecID == null) {
      LOGGER.warn(" preemptingROSpecID not set");
      throw new MissingParameterException(
        " preemptingROSpecID not set  for Parameter of Type ROSpecEvent");
    }

    resultBits.append(preemptingROSpecID.encodeBinary());

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

    if (eventType == null) {
      LOGGER.warn(" eventType not set");
      throw new MissingParameterException(" eventType not set");
    } else {
      element.addContent(eventType.encodeXML("EventType", ns));
    }

    if (rOSpecID == null) {
      LOGGER.warn(" rOSpecID not set");
      throw new MissingParameterException(" rOSpecID not set");
    } else {
      element.addContent(rOSpecID.encodeXML("ROSpecID", ns));
    }

    if (preemptingROSpecID == null) {
      LOGGER.warn(" preemptingROSpecID not set");
      throw new MissingParameterException(" preemptingROSpecID not set");
    } else {
      element.addContent(preemptingROSpecID.encodeXML(
        "PreemptingROSpecID", ns));
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
    eventType = new ROSpecEventType(binary.subList(position,
      ROSpecEventType.length()));
    position += ROSpecEventType.length();
    rOSpecID = new UnsignedInteger(binary.subList(position,
      UnsignedInteger.length()));
    position += UnsignedInteger.length();
    preemptingROSpecID = new UnsignedInteger(binary.subList(position,
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

    temp = element.getChild("EventType", ns);

    if (temp != null) {
      eventType = new ROSpecEventType(temp);
    }

    element.removeChild("EventType", ns);
    temp = element.getChild("ROSpecID", ns);

    if (temp != null) {
      rOSpecID = new UnsignedInteger(temp);
    }

    element.removeChild("ROSpecID", ns);
    temp = element.getChild("PreemptingROSpecID", ns);

    if (temp != null) {
      preemptingROSpecID = new UnsignedInteger(temp);
    }

    element.removeChild("PreemptingROSpecID", ns);

    if (element.getChildren().size() > 0) {
      String message = "ROSpecEvent has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set eventType of type ROSpecEventType .
   *
   * @param eventType to be set
   */
  public void setEventType(final ROSpecEventType eventType) {
    this.eventType = eventType;
  }

  /**
   * set rOSpecID of type UnsignedInteger .
   *
   * @param rOSpecID to be set
   */
  public void setROSpecID(final UnsignedInteger rOSpecID) {
    this.rOSpecID = rOSpecID;
  }

  /**
   * set preemptingROSpecID of type UnsignedInteger .
   *
   * @param preemptingROSpecID to be set
   */
  public void setPreemptingROSpecID(final UnsignedInteger preemptingROSpecID) {
    this.preemptingROSpecID = preemptingROSpecID;
  }

  // end setter
  //getters
  /**
   * get eventType of type ROSpecEventType.
   *
   * @return ROSpecEventType
   */
  public ROSpecEventType getEventType() {
    return eventType;
  }

  /**
   * get rOSpecID of type UnsignedInteger.
   *
   * @return type UnsignedInteger to be set
   */
  public UnsignedInteger getROSpecID() {
    return this.rOSpecID;
  }

  /**
   * get preemptingROSpecID of type UnsignedInteger.
   *
   * @return type UnsignedInteger to be set
   */
  public UnsignedInteger getPreemptingROSpecID() {
    return this.preemptingROSpecID;
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
    return "ROSpecEvent";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "ROSpecEvent: ";
    result += ", eventType: ";
    result += eventType;
    result += ", rOSpecID: ";
    result += rOSpecID;
    result += ", preemptingROSpecID: ";
    result += preemptingROSpecID;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
