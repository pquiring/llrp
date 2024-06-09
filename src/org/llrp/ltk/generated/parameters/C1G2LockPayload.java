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
import org.llrp.ltk.generated.enumerations.C1G2LockDataField;
import org.llrp.ltk.generated.enumerations.C1G2LockPrivilege;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;

/**
 * This parameter contains the definition of the access privilege updates (read/write/permalock) to be performed for a single location of the tag memory. The five data fields for
 * which we can define access control using the lock command are: Kill Password, Access Password, EPC memory, TID memory and User memory.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=109&view=fit">LLRP Specification Section 15.2.1.3.2.4.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=158&view=fit">LLRP Specification Section 16.3.1.3.2.4.1</a>}
 *
 *
 */
/**
 * This parameter contains the definition of the access privilege updates (read/write/permalock) to be performed for a single location of the tag memory. The five data fields for
 * which we can define access control using the lock command are: Kill Password, Access Password, EPC memory, TID memory and User memory.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=109&view=fit">LLRP Specification Section 15.2.1.3.2.4.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=158&view=fit">LLRP Specification Section 16.3.1.3.2.4.1</a>}
 *
 * .
 */
public class C1G2LockPayload extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(345);
  private static final Logger LOGGER = Logger.getLogger(C1G2LockPayload.class);
  protected C1G2LockPrivilege privilege;
  protected C1G2LockDataField dataField;

  /**
   * empty constructor to create new parameter.
   */
  public C1G2LockPayload() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public C1G2LockPayload(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public C1G2LockPayload(Element element) throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (privilege == null) {
      LOGGER.warn(" privilege not set");
      throw new MissingParameterException(
        " privilege not set  for Parameter of Type C1G2LockPayload");
    }

    resultBits.append(privilege.encodeBinary());

    if (dataField == null) {
      LOGGER.warn(" dataField not set");
      throw new MissingParameterException(
        " dataField not set  for Parameter of Type C1G2LockPayload");
    }

    resultBits.append(dataField.encodeBinary());

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

    if (privilege == null) {
      LOGGER.warn(" privilege not set");
      throw new MissingParameterException(" privilege not set");
    } else {
      element.addContent(privilege.encodeXML("Privilege", ns));
    }

    if (dataField == null) {
      LOGGER.warn(" dataField not set");
      throw new MissingParameterException(" dataField not set");
    } else {
      element.addContent(dataField.encodeXML("DataField", ns));
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
    privilege = new C1G2LockPrivilege(binary.subList(position,
      C1G2LockPrivilege.length()));
    position += C1G2LockPrivilege.length();
    dataField = new C1G2LockDataField(binary.subList(position,
      C1G2LockDataField.length()));
    position += C1G2LockDataField.length();
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

    temp = element.getChild("Privilege", ns);

    if (temp != null) {
      privilege = new C1G2LockPrivilege(temp);
    }

    element.removeChild("Privilege", ns);
    temp = element.getChild("DataField", ns);

    if (temp != null) {
      dataField = new C1G2LockDataField(temp);
    }

    element.removeChild("DataField", ns);

    if (element.getChildren().size() > 0) {
      String message = "C1G2LockPayload has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set privilege of type C1G2LockPrivilege .
   *
   * @param privilege to be set
   */
  public void setPrivilege(final C1G2LockPrivilege privilege) {
    this.privilege = privilege;
  }

  /**
   * set dataField of type C1G2LockDataField .
   *
   * @param dataField to be set
   */
  public void setDataField(final C1G2LockDataField dataField) {
    this.dataField = dataField;
  }

  // end setter
  //getters
  /**
   * get privilege of type C1G2LockPrivilege.
   *
   * @return C1G2LockPrivilege
   */
  public C1G2LockPrivilege getPrivilege() {
    return privilege;
  }

  /**
   * get dataField of type C1G2LockDataField.
   *
   * @return C1G2LockDataField
   */
  public C1G2LockDataField getDataField() {
    return dataField;
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
    return "C1G2LockPayload";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "C1G2LockPayload: ";
    result += ", privilege: ";
    result += privilege;
    result += ", dataField: ";
    result += dataField;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
