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
import org.llrp.ltk.generated.enumerations.ConnectionAttemptStatusType;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;

/**
 * This status report parameter establishes Reader connection status when the Client or Reader initiates a connection. See section 18.1, TCP Transport, for more details regarding
 * the use of this report.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=92&view=fit">LLRP Specification Section 13.2.6.11</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=151&view=fit">LLRP Specification Section 16.2.7.6.10</a>}
 *
 *
 */
/**
 * This status report parameter establishes Reader connection status when the Client or Reader initiates a connection. See section 18.1, TCP Transport, for more details regarding
 * the use of this report.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=92&view=fit">LLRP Specification Section 13.2.6.11</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=151&view=fit">LLRP Specification Section 16.2.7.6.10</a>}
 *
 * .
 */
public class ConnectionAttemptEvent extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(256);
  private static final Logger LOGGER = Logger.getLogger(ConnectionAttemptEvent.class);
  protected ConnectionAttemptStatusType status;

  /**
   * empty constructor to create new parameter.
   */
  public ConnectionAttemptEvent() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public ConnectionAttemptEvent(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public ConnectionAttemptEvent(Element element)
    throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (status == null) {
      LOGGER.warn(" status not set");
      throw new MissingParameterException(
        " status not set  for Parameter of Type ConnectionAttemptEvent");
    }

    resultBits.append(status.encodeBinary());

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

    if (status == null) {
      LOGGER.warn(" status not set");
      throw new MissingParameterException(" status not set");
    } else {
      element.addContent(status.encodeXML("Status", ns));
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
    status = new ConnectionAttemptStatusType(binary.subList(position,
      ConnectionAttemptStatusType.length()));
    position += ConnectionAttemptStatusType.length();
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

    temp = element.getChild("Status", ns);

    if (temp != null) {
      status = new ConnectionAttemptStatusType(temp);
    }

    element.removeChild("Status", ns);

    if (element.getChildren().size() > 0) {
      String message = "ConnectionAttemptEvent has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set status of type ConnectionAttemptStatusType .
   *
   * @param status to be set
   */
  public void setStatus(final ConnectionAttemptStatusType status) {
    this.status = status;
  }

  // end setter
  //getters
  /**
   * get status of type ConnectionAttemptStatusType.
   *
   * @return ConnectionAttemptStatusType
   */
  public ConnectionAttemptStatusType getStatus() {
    return status;
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
    return "ConnectionAttemptEvent";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "ConnectionAttemptEvent: ";
    result += ", status: ";
    result += status;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
