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
import org.llrp.ltk.generated.enumerations.AccessSpecState;
import org.llrp.ltk.generated.enumerations.AirProtocols;
import org.llrp.ltk.generated.parameters.AccessCommand;
import org.llrp.ltk.generated.parameters.AccessReportSpec;
import org.llrp.ltk.generated.parameters.AccessSpecStopTrigger;
import org.llrp.ltk.generated.parameters.Custom;
import org.llrp.ltk.types.BitList;
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
 * This parameter carries information of the Reader access operation.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=64&view=fit">LLRP Specification Section 11.2.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=138&view=fit">LLRP Specification Section 16.2.5.1</a>}
 *
 *
 */
/**
 * This parameter carries information of the Reader access operation.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=64&view=fit">LLRP Specification Section 11.2.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=138&view=fit">LLRP Specification Section 16.2.5.1</a>}
 *
 * .
 */
public class AccessSpec extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(207);
  private static final Logger LOGGER = Logger.getLogger(AccessSpec.class);
  protected UnsignedInteger accessSpecID;
  protected UnsignedShort antennaID;
  protected AirProtocols protocolID;
  protected AccessSpecState currentState;
  protected BitList reserved0 = new BitList(7);
  protected UnsignedInteger rOSpecID;
  protected AccessSpecStopTrigger accessSpecStopTrigger;
  protected AccessCommand accessCommand;
  protected AccessReportSpec accessReportSpec;
  protected List<Custom> customList = new LinkedList<Custom>();

  /**
   * empty constructor to create new parameter.
   */
  public AccessSpec() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public AccessSpec(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public AccessSpec(Element element) throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (accessSpecID == null) {
      LOGGER.warn(" accessSpecID not set");
      throw new MissingParameterException(
        " accessSpecID not set  for Parameter of Type AccessSpec");
    }

    resultBits.append(accessSpecID.encodeBinary());

    if (antennaID == null) {
      LOGGER.warn(" antennaID not set");
      throw new MissingParameterException(
        " antennaID not set  for Parameter of Type AccessSpec");
    }

    resultBits.append(antennaID.encodeBinary());

    if (protocolID == null) {
      LOGGER.warn(" protocolID not set");
      throw new MissingParameterException(
        " protocolID not set  for Parameter of Type AccessSpec");
    }

    resultBits.append(protocolID.encodeBinary());

    if (currentState == null) {
      LOGGER.warn(" currentState not set");
      throw new MissingParameterException(
        " currentState not set  for Parameter of Type AccessSpec");
    }

    resultBits.append(currentState.encodeBinary());
    resultBits.append(reserved0.encodeBinary());

    if (rOSpecID == null) {
      LOGGER.warn(" rOSpecID not set");
      throw new MissingParameterException(
        " rOSpecID not set  for Parameter of Type AccessSpec");
    }

    resultBits.append(rOSpecID.encodeBinary());

    if (accessSpecStopTrigger == null) {
      // single parameter, may not be null
      LOGGER.warn(" accessSpecStopTrigger not set");
      throw new MissingParameterException(
        " accessSpecStopTrigger not set");
    } else {
      resultBits.append(accessSpecStopTrigger.encodeBinary());
    }

    if (accessCommand == null) {
      // single parameter, may not be null
      LOGGER.warn(" accessCommand not set");
      throw new MissingParameterException(" accessCommand not set");
    } else {
      resultBits.append(accessCommand.encodeBinary());
    }

    if (accessReportSpec == null) {
      // optional parameter, may be null
      LOGGER.info(" accessReportSpec not set");
    } else {
      resultBits.append(accessReportSpec.encodeBinary());
    }

    if (customList == null) {
      //just warn - it is optional
      LOGGER.info(" customList not set");
    } else {
      for (Custom field : customList) {
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

    if (accessSpecID == null) {
      LOGGER.warn(" accessSpecID not set");
      throw new MissingParameterException(" accessSpecID not set");
    } else {
      element.addContent(accessSpecID.encodeXML("AccessSpecID", ns));
    }

    if (antennaID == null) {
      LOGGER.warn(" antennaID not set");
      throw new MissingParameterException(" antennaID not set");
    } else {
      element.addContent(antennaID.encodeXML("AntennaID", ns));
    }

    if (protocolID == null) {
      LOGGER.warn(" protocolID not set");
      throw new MissingParameterException(" protocolID not set");
    } else {
      element.addContent(protocolID.encodeXML("ProtocolID", ns));
    }

    if (currentState == null) {
      LOGGER.warn(" currentState not set");
      throw new MissingParameterException(" currentState not set");
    } else {
      element.addContent(currentState.encodeXML("CurrentState", ns));
    }

    //element.addContent(reserved0.encodeXML("reserved",ns));
    if (rOSpecID == null) {
      LOGGER.warn(" rOSpecID not set");
      throw new MissingParameterException(" rOSpecID not set");
    } else {
      element.addContent(rOSpecID.encodeXML("ROSpecID", ns));
    }

    //parameters
    if (accessSpecStopTrigger == null) {
      LOGGER.info("accessSpecStopTrigger not set");
      throw new MissingParameterException("accessSpecStopTrigger not set");
    } else {
      element.addContent(accessSpecStopTrigger.encodeXML(
        accessSpecStopTrigger.getClass().getSimpleName(), ns));
    }

    if (accessCommand == null) {
      LOGGER.info("accessCommand not set");
      throw new MissingParameterException("accessCommand not set");
    } else {
      element.addContent(accessCommand.encodeXML(
        accessCommand.getClass().getSimpleName(), ns));
    }

    if (accessReportSpec == null) {
      LOGGER.info("accessReportSpec not set");
    } else {
      element.addContent(accessReportSpec.encodeXML(
        accessReportSpec.getClass().getSimpleName(), ns));
    }

    if (customList == null) {
      LOGGER.info("customList not set");
    } else {
      for (Custom field : customList) {
        element.addContent(field.encodeXML(field.getClass().getName()
          .replaceAll(field.getClass()
            .getPackage()
            .getName()
            + ".", ""), ns));
      }
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
    accessSpecID = new UnsignedInteger(binary.subList(position,
      UnsignedInteger.length()));
    position += UnsignedInteger.length();
    antennaID = new UnsignedShort(binary.subList(position,
      UnsignedShort.length()));
    position += UnsignedShort.length();
    protocolID = new AirProtocols(binary.subList(position,
      AirProtocols.length()));
    position += AirProtocols.length();
    currentState = new AccessSpecState(binary.subList(position,
      AccessSpecState.length()));
    position += AccessSpecState.length();
    position += reserved0.length();
    rOSpecID = new UnsignedInteger(binary.subList(position,
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
      LOGGER.warn(
        "AccessSpec misses non optional parameter of type AccessSpecStopTrigger");
      throw new MissingParameterException(
        "AccessSpec misses non optional parameter of type AccessSpecStopTrigger");
    }

    if (binary.get(position)) {
      // length can statically be determined for TV Parameters
      tempLength = accessSpecStopTrigger.length();
    }

    if ((type != null) && type.equals(AccessSpecStopTrigger.TYPENUM)) {
      accessSpecStopTrigger = new AccessSpecStopTrigger(binary.subList(
        position, tempLength));
      position += tempLength;
      LOGGER.debug(
        " accessSpecStopTrigger is instantiated with AccessSpecStopTrigger with length"
        + tempLength);
    } else {
      LOGGER.warn(
        "AccessSpec misses non optional parameter of type AccessSpecStopTrigger");
      throw new MissingParameterException(
        "AccessSpec misses non optional parameter of type AccessSpecStopTrigger");
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
      LOGGER.warn(
        "AccessSpec misses non optional parameter of type AccessCommand");
      throw new MissingParameterException(
        "AccessSpec misses non optional parameter of type AccessCommand");
    }

    if (binary.get(position)) {
      // length can statically be determined for TV Parameters
      tempLength = accessCommand.length();
    }

    if ((type != null) && type.equals(AccessCommand.TYPENUM)) {
      accessCommand = new AccessCommand(binary.subList(position,
        tempLength));
      position += tempLength;
      LOGGER.debug(
        " accessCommand is instantiated with AccessCommand with length"
        + tempLength);
    } else {
      LOGGER.warn(
        "AccessSpec misses non optional parameter of type AccessCommand");
      throw new MissingParameterException(
        "AccessSpec misses non optional parameter of type AccessCommand");
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
        "AccessSpec misses optional parameter of type AccessReportSpec");
    }

    if (binary.get(position)) {
      // length can statically be determined for TV Parameters
      tempLength = accessReportSpec.length();
    }

    if ((type != null) && type.equals(AccessReportSpec.TYPENUM)) {
      accessReportSpec = new AccessReportSpec(binary.subList(position,
        tempLength));
      position += tempLength;
      LOGGER.debug(
        " accessReportSpec is instantiated with AccessReportSpec with length"
        + tempLength);
    } else {
      LOGGER.info(
        "AccessSpec misses optional parameter of type AccessReportSpec");
    }

    // list of parameters
    customList = new LinkedList<Custom>();
    LOGGER.debug("decoding parameter customList ");

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

      // custom
      if ((type != null) && type.equals(Custom.TYPENUM)) {
        Custom cus = new Custom(binary.subList(position, tempLength));
        // custom parameters for this parameter
        // AccessSpec
        //end  parameters
        //if none matched continue wasn't called and we add just cus as we found no specific vendor implementation
        customList.add(cus);
        position += tempLength;
        atLeastOnce = true;
      }

      if (!atLeastOnce) {
        //no parameter matched therefore we jump out of the loop
        break;
      }
    }

    //if list is still empty no parameter matched
    if (customList.isEmpty()) {
      LOGGER.info(
        "encoded message does not contain parameter for optional customList");
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

    temp = element.getChild("AccessSpecID", ns);

    if (temp != null) {
      accessSpecID = new UnsignedInteger(temp);
    }

    element.removeChild("AccessSpecID", ns);
    temp = element.getChild("AntennaID", ns);

    if (temp != null) {
      antennaID = new UnsignedShort(temp);
    }

    element.removeChild("AntennaID", ns);
    temp = element.getChild("ProtocolID", ns);

    if (temp != null) {
      protocolID = new AirProtocols(temp);
    }

    element.removeChild("ProtocolID", ns);
    temp = element.getChild("CurrentState", ns);

    if (temp != null) {
      currentState = new AccessSpecState(temp);
    }

    element.removeChild("CurrentState", ns);
    temp = element.getChild("ROSpecID", ns);

    if (temp != null) {
      rOSpecID = new UnsignedInteger(temp);
    }

    element.removeChild("ROSpecID", ns);

    //parameter - not choices - no special actions needed
    temp = element.getChild("AccessSpecStopTrigger", ns);

    if (temp != null) {
      accessSpecStopTrigger = new AccessSpecStopTrigger(temp);
      LOGGER.info(
        "setting parameter accessSpecStopTrigger for parameter AccessSpec");
    }

    if (temp == null) {
      LOGGER.warn(
        "AccessSpec misses non optional parameter of type accessSpecStopTrigger");
      throw new MissingParameterException(
        "AccessSpec misses non optional parameter of type accessSpecStopTrigger");
    }

    element.removeChild("AccessSpecStopTrigger", ns);
    //parameter - not choices - no special actions needed
    temp = element.getChild("AccessCommand", ns);

    if (temp != null) {
      accessCommand = new AccessCommand(temp);
      LOGGER.info(
        "setting parameter accessCommand for parameter AccessSpec");
    }

    if (temp == null) {
      LOGGER.warn(
        "AccessSpec misses non optional parameter of type accessCommand");
      throw new MissingParameterException(
        "AccessSpec misses non optional parameter of type accessCommand");
    }

    element.removeChild("AccessCommand", ns);
    //parameter - not choices - no special actions needed
    temp = element.getChild("AccessReportSpec", ns);

    if (temp != null) {
      accessReportSpec = new AccessReportSpec(temp);
      LOGGER.info(
        "setting parameter accessReportSpec for parameter AccessSpec");
    }

    if (temp == null) {
      LOGGER.info(
        "AccessSpec misses optional parameter of type accessReportSpec");
    }

    element.removeChild("AccessReportSpec", ns);
    //parameter - not choices - no special actions needed
    //we expect a list of parameters
    customList = new LinkedList<Custom>();
    tempList = element.getChildren("Custom", ns);

    if ((tempList == null) || tempList.isEmpty()) {
      LOGGER.info(
        "AccessSpec misses optional parameter of type customList");
    } else {
      for (Element e : tempList) {
        customList.add(new Custom(e));
        LOGGER.debug("adding Custom to customList ");
      }
    }

    element.removeChildren("Custom", ns);
    //custom parameter
    tempList = element.getChildren("Custom", ns);

    for (Element e : tempList) {
      customList.add(new Custom(e));
      atLeastOnce = true;
      LOGGER.debug("adding custom parameter");
    }

    element.removeChildren("Custom", ns);

    //end custom
    if (element.getChildren().size() > 0) {
      String message = "AccessSpec has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set accessSpecID of type UnsignedInteger .
   *
   * @param accessSpecID to be set
   */
  public void setAccessSpecID(final UnsignedInteger accessSpecID) {
    this.accessSpecID = accessSpecID;
  }

  /**
   * set antennaID of type UnsignedShort .
   *
   * @param antennaID to be set
   */
  public void setAntennaID(final UnsignedShort antennaID) {
    this.antennaID = antennaID;
  }

  /**
   * set protocolID of type AirProtocols .
   *
   * @param protocolID to be set
   */
  public void setProtocolID(final AirProtocols protocolID) {
    this.protocolID = protocolID;
  }

  /**
   * set currentState of type AccessSpecState .
   *
   * @param currentState to be set
   */
  public void setCurrentState(final AccessSpecState currentState) {
    this.currentState = currentState;
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
   * set accessSpecStopTrigger of type AccessSpecStopTrigger.
   *
   * @param accessSpecStopTrigger to be set
   */
  public void setAccessSpecStopTrigger(
    final AccessSpecStopTrigger accessSpecStopTrigger) {
    this.accessSpecStopTrigger = accessSpecStopTrigger;
  }

  /**
   * set accessCommand of type AccessCommand.
   *
   * @param accessCommand to be set
   */
  public void setAccessCommand(final AccessCommand accessCommand) {
    this.accessCommand = accessCommand;
  }

  /**
   * set accessReportSpec of type AccessReportSpec.
   *
   * @param accessReportSpec to be set
   */
  public void setAccessReportSpec(final AccessReportSpec accessReportSpec) {
    this.accessReportSpec = accessReportSpec;
  }

  /**
   * set customList of type List &lt;Custom>.
   *
   * @param customList to be set
   */
  public void setCustomList(final List<Custom> customList) {
    this.customList = customList;
  }

  // end setter
  //getters
  /**
   * get accessSpecID of type UnsignedInteger.
   *
   * @return type UnsignedInteger to be set
   */
  public UnsignedInteger getAccessSpecID() {
    return this.accessSpecID;
  }

  /**
   * get antennaID of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getAntennaID() {
    return this.antennaID;
  }

  /**
   * get protocolID of type AirProtocols.
   *
   * @return AirProtocols
   */
  public AirProtocols getProtocolID() {
    return protocolID;
  }

  /**
   * get currentState of type AccessSpecState.
   *
   * @return AccessSpecState
   */
  public AccessSpecState getCurrentState() {
    return currentState;
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
   * get accessSpecStopTrigger of type AccessSpecStopTrigger .
   *
   * @return AccessSpecStopTrigger
   */
  public AccessSpecStopTrigger getAccessSpecStopTrigger() {
    return accessSpecStopTrigger;
  }

  /**
   * get accessCommand of type AccessCommand .
   *
   * @return AccessCommand
   */
  public AccessCommand getAccessCommand() {
    return accessCommand;
  }

  /**
   * get accessReportSpec of type AccessReportSpec .
   *
   * @return AccessReportSpec
   */
  public AccessReportSpec getAccessReportSpec() {
    return accessReportSpec;
  }

  /**
   * get customList of type List &lt;Custom> .
   *
   * @return List &lt;Custom>
   */
  public List<Custom> getCustomList() {
    return customList;
  }

  // end getters
  //add methods
  /**
   * add element custom of type Custom .
   *
   * @param custom of type Custom
   */
  public void addToCustomList(Custom custom) {
    if (this.customList == null) {
      this.customList = new LinkedList<Custom>();
    }

    this.customList.add(custom);
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
    return "AccessSpec";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "AccessSpec: ";
    result += ", accessSpecID: ";
    result += accessSpecID;
    result += ", antennaID: ";
    result += antennaID;
    result += ", protocolID: ";
    result += protocolID;
    result += ", currentState: ";
    result += currentState;

    result += ", rOSpecID: ";
    result += rOSpecID;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
