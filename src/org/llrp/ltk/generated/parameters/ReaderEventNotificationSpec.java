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
import org.llrp.ltk.generated.parameters.EventNotificationState;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;

/**
 * This parameter is used by the Client to enable or disable notification of one or more Reader events. Notification of buffer overflow events and connection events (attempt/close)
 * are mandatory, and not configurable.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=86&view=fit">LLRP Specification Section 13.2.5</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=147&view=fit">LLRP Specification Section 16.2.7.5</a>}
 *
 *
 */
/**
 * This parameter is used by the Client to enable or disable notification of one or more Reader events. Notification of buffer overflow events and connection events (attempt/close)
 * are mandatory, and not configurable.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=86&view=fit">LLRP Specification Section 13.2.5</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=147&view=fit">LLRP Specification Section 16.2.7.5</a>}
 *
 * .
 */
public class ReaderEventNotificationSpec extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(244);
  private static final Logger LOGGER = Logger.getLogger(ReaderEventNotificationSpec.class);
  protected List<EventNotificationState> eventNotificationStateList = new LinkedList<EventNotificationState>();

  /**
   * empty constructor to create new parameter.
   */
  public ReaderEventNotificationSpec() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public ReaderEventNotificationSpec(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public ReaderEventNotificationSpec(Element element)
    throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (eventNotificationStateList == null) {
      LOGGER.warn(" eventNotificationStateList not set");

      //parameter has to be set - throw exception
      throw new MissingParameterException(
        " eventNotificationStateList not set");
    } else {
      for (EventNotificationState field : eventNotificationStateList) {
        resultBits.append(field.encodeBinary());
      }
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

    //parameters
    if (eventNotificationStateList == null) {
      LOGGER.warn(" eventNotificationStateList not set");
      throw new MissingParameterException(
        "  eventNotificationStateList not set");
    }

    for (EventNotificationState field : eventNotificationStateList) {
      element.addContent(field.encodeXML(field.getClass().getName()
        .replaceAll(field.getClass()
          .getPackage()
          .getName()
          + ".", ""), ns));
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

    // list of parameters
    eventNotificationStateList = new LinkedList<EventNotificationState>();
    LOGGER.debug("decoding parameter eventNotificationStateList ");

    while (position < binary.length()) {
      // store if one parameter matched
      boolean atLeastOnce = false;

      // look ahead to see type
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

      //add parameter to list if type number matches
      if ((type != null) && type.equals(EventNotificationState.TYPENUM)) {
        if (binary.get(position)) {
          // length can statically be determined for TV Parameters
          tempLength = EventNotificationState.length();
        }

        eventNotificationStateList.add(new EventNotificationState(
          binary.subList(position, tempLength)));
        LOGGER.debug(
          "adding EventNotificationState to eventNotificationStateList ");
        atLeastOnce = true;
        position += tempLength;
      }

      if (!atLeastOnce) {
        //no parameter matched therefore we jump out of the loop
        break;
      }
    }

    //if list is still empty no parameter matched
    if (eventNotificationStateList.isEmpty()) {
      LOGGER.warn(
        "encoded message does not contain parameter for non optional eventNotificationStateList");
      throw new MissingParameterException(
        "ReaderEventNotificationSpec misses non optional parameter of type EventNotificationState");
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

    //parameter - not choices - no special actions needed
    //we expect a list of parameters
    eventNotificationStateList = new LinkedList<EventNotificationState>();
    tempList = element.getChildren("EventNotificationState", ns);

    if ((tempList == null) || tempList.isEmpty()) {
      LOGGER.warn(
        "ReaderEventNotificationSpec misses non optional parameter of type eventNotificationStateList");
      throw new MissingParameterException(
        "ReaderEventNotificationSpec misses non optional parameter of type eventNotificationStateList");
    } else {
      for (Element e : tempList) {
        eventNotificationStateList.add(new EventNotificationState(e));
        LOGGER.debug(
          "adding EventNotificationState to eventNotificationStateList ");
      }
    }

    element.removeChildren("EventNotificationState", ns);

    if (element.getChildren().size() > 0) {
      String message = "ReaderEventNotificationSpec has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set eventNotificationStateList of type List &lt;EventNotificationState>.
   *
   * @param eventNotificationStateList to be set
   */
  public void setEventNotificationStateList(
    final List<EventNotificationState> eventNotificationStateList) {
    this.eventNotificationStateList = eventNotificationStateList;
  }

  // end setter
  //getters
  /**
   * get eventNotificationStateList of type List &lt;EventNotificationState> .
   *
   * @return List &lt;EventNotificationState>
   */
  public List<EventNotificationState> getEventNotificationStateList() {
    return eventNotificationStateList;
  }

  // end getters
  //add methods
  /**
   * add element eventNotificationState of type EventNotificationState .
   *
   * @param eventNotificationState of type EventNotificationState
   */
  public void addToEventNotificationStateList(
    EventNotificationState eventNotificationState) {
    if (this.eventNotificationStateList == null) {
      this.eventNotificationStateList = new LinkedList<EventNotificationState>();
    }

    this.eventNotificationStateList.add(eventNotificationState);
  }

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
    return "ReaderEventNotificationSpec";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "ReaderEventNotificationSpec: ";
    result = result.replaceFirst(", ", "");

    return result;
  }
}
