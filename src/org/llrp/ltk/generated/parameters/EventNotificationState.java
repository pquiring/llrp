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
import org.llrp.ltk.generated.enumerations.NotificationEventType;
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
 * This parameter is used to enable or disable notification of a single Reader event type.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=86&view=fit">LLRP Specification Section 13.2.5.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=148&view=fit">LLRP Specification Section 16.2.7.5.1</a>}
 *
 *
 */
/**
 * This parameter is used to enable or disable notification of a single Reader event type.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=86&view=fit">LLRP Specification Section 13.2.5.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=148&view=fit">LLRP Specification Section 16.2.7.5.1</a>}
 *
 * .
 */
public class EventNotificationState extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(245);
  private static final Logger LOGGER = Logger.getLogger(EventNotificationState.class);
  protected NotificationEventType eventType;
  protected Bit notificationState;
  protected BitList reserved0 = new BitList(7);

  /**
   * empty constructor to create new parameter.
   */
  public EventNotificationState() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public EventNotificationState(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public EventNotificationState(Element element)
    throws InvalidLLRPMessageException {
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
        " eventType not set  for Parameter of Type EventNotificationState");
    }

    resultBits.append(eventType.encodeBinary());

    if (notificationState == null) {
      LOGGER.warn(" notificationState not set");
      throw new MissingParameterException(
        " notificationState not set  for Parameter of Type EventNotificationState");
    }

    resultBits.append(notificationState.encodeBinary());
    resultBits.append(reserved0.encodeBinary());

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

    if (notificationState == null) {
      LOGGER.warn(" notificationState not set");
      throw new MissingParameterException(" notificationState not set");
    } else {
      element.addContent(notificationState.encodeXML(
        "NotificationState", ns));
    }

    //element.addContent(reserved0.encodeXML("reserved",ns));
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
    eventType = new NotificationEventType(binary.subList(position,
      NotificationEventType.length()));
    position += NotificationEventType.length();
    notificationState = new Bit(binary.subList(position, Bit.length()));
    position += Bit.length();
    position += reserved0.length();
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
      eventType = new NotificationEventType(temp);
    }

    element.removeChild("EventType", ns);
    temp = element.getChild("NotificationState", ns);

    if (temp != null) {
      notificationState = new Bit(temp);
    }

    element.removeChild("NotificationState", ns);

    if (element.getChildren().size() > 0) {
      String message = "EventNotificationState has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set eventType of type NotificationEventType .
   *
   * @param eventType to be set
   */
  public void setEventType(final NotificationEventType eventType) {
    this.eventType = eventType;
  }

  /**
   * set notificationState of type Bit .
   *
   * @param notificationState to be set
   */
  public void setNotificationState(final Bit notificationState) {
    this.notificationState = notificationState;
  }

  // end setter
  //getters
  /**
   * get eventType of type NotificationEventType.
   *
   * @return NotificationEventType
   */
  public NotificationEventType getEventType() {
    return eventType;
  }

  /**
   * get notificationState of type Bit.
   *
   * @return type Bit to be set
   */
  public Bit getNotificationState() {
    return this.notificationState;
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
    return "EventNotificationState";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "EventNotificationState: ";
    result += ", eventType: ";
    result += eventType;
    result += ", notificationState: ";
    result += notificationState;

    result = result.replaceFirst(", ", "");

    return result;
  }
}
