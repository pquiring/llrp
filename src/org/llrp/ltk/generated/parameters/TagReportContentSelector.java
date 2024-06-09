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

import org.jdom.Content;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.Namespace;

import org.llrp.ltk.exceptions.InvalidLLRPMessageException;
import org.llrp.ltk.exceptions.MissingParameterException;
import org.llrp.ltk.generated.LLRPConstants;
import org.llrp.ltk.generated.interfaces.AirProtocolEPCMemorySelector;
import org.llrp.ltk.generated.parameters.C1G2EPCMemorySelector;
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
 * This parameter is used to configure the contents that are of interest in TagReportData. If enabled, the field is reported along with the tag data in the TagReportData.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=78&view=fit">LLRP Specification Section 13.2.1.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=142&view=fit">LLRP Specification Section 16.2.7.1.1</a>}
 *
 *
 */
/**
 * This parameter is used to configure the contents that are of interest in TagReportData. If enabled, the field is reported along with the tag data in the TagReportData.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=78&view=fit">LLRP Specification Section 13.2.1.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=142&view=fit">LLRP Specification Section 16.2.7.1.1</a>}
 *
 * .
 */
public class TagReportContentSelector extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(238);
  private static final Logger LOGGER = Logger.getLogger(TagReportContentSelector.class);
  protected Bit enableROSpecID;
  protected Bit enableSpecIndex;
  protected Bit enableInventoryParameterSpecID;
  protected Bit enableAntennaID;
  protected Bit enableChannelIndex;
  protected Bit enablePeakRSSI;
  protected Bit enableFirstSeenTimestamp;
  protected Bit enableLastSeenTimestamp;
  protected Bit enableTagSeenCount;
  protected Bit enableAccessSpecID;
  protected BitList reserved0 = new BitList(6);
  protected List<AirProtocolEPCMemorySelector> airProtocolEPCMemorySelectorList
    = new LinkedList<AirProtocolEPCMemorySelector>();

  /**
   * empty constructor to create new parameter.
   */
  public TagReportContentSelector() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public TagReportContentSelector(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public TagReportContentSelector(Element element)
    throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (enableROSpecID == null) {
      LOGGER.warn(" enableROSpecID not set");
      throw new MissingParameterException(
        " enableROSpecID not set  for Parameter of Type TagReportContentSelector");
    }

    resultBits.append(enableROSpecID.encodeBinary());

    if (enableSpecIndex == null) {
      LOGGER.warn(" enableSpecIndex not set");
      throw new MissingParameterException(
        " enableSpecIndex not set  for Parameter of Type TagReportContentSelector");
    }

    resultBits.append(enableSpecIndex.encodeBinary());

    if (enableInventoryParameterSpecID == null) {
      LOGGER.warn(" enableInventoryParameterSpecID not set");
      throw new MissingParameterException(
        " enableInventoryParameterSpecID not set  for Parameter of Type TagReportContentSelector");
    }

    resultBits.append(enableInventoryParameterSpecID.encodeBinary());

    if (enableAntennaID == null) {
      LOGGER.warn(" enableAntennaID not set");
      throw new MissingParameterException(
        " enableAntennaID not set  for Parameter of Type TagReportContentSelector");
    }

    resultBits.append(enableAntennaID.encodeBinary());

    if (enableChannelIndex == null) {
      LOGGER.warn(" enableChannelIndex not set");
      throw new MissingParameterException(
        " enableChannelIndex not set  for Parameter of Type TagReportContentSelector");
    }

    resultBits.append(enableChannelIndex.encodeBinary());

    if (enablePeakRSSI == null) {
      LOGGER.warn(" enablePeakRSSI not set");
      throw new MissingParameterException(
        " enablePeakRSSI not set  for Parameter of Type TagReportContentSelector");
    }

    resultBits.append(enablePeakRSSI.encodeBinary());

    if (enableFirstSeenTimestamp == null) {
      LOGGER.warn(" enableFirstSeenTimestamp not set");
      throw new MissingParameterException(
        " enableFirstSeenTimestamp not set  for Parameter of Type TagReportContentSelector");
    }

    resultBits.append(enableFirstSeenTimestamp.encodeBinary());

    if (enableLastSeenTimestamp == null) {
      LOGGER.warn(" enableLastSeenTimestamp not set");
      throw new MissingParameterException(
        " enableLastSeenTimestamp not set  for Parameter of Type TagReportContentSelector");
    }

    resultBits.append(enableLastSeenTimestamp.encodeBinary());

    if (enableTagSeenCount == null) {
      LOGGER.warn(" enableTagSeenCount not set");
      throw new MissingParameterException(
        " enableTagSeenCount not set  for Parameter of Type TagReportContentSelector");
    }

    resultBits.append(enableTagSeenCount.encodeBinary());

    if (enableAccessSpecID == null) {
      LOGGER.warn(" enableAccessSpecID not set");
      throw new MissingParameterException(
        " enableAccessSpecID not set  for Parameter of Type TagReportContentSelector");
    }

    resultBits.append(enableAccessSpecID.encodeBinary());
    resultBits.append(reserved0.encodeBinary());

    if (airProtocolEPCMemorySelectorList == null) {
      //just warn - it is optional
      LOGGER.info(" airProtocolEPCMemorySelectorList not set");
    } else {
      for (AirProtocolEPCMemorySelector field : airProtocolEPCMemorySelectorList) {
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

    if (enableROSpecID == null) {
      LOGGER.warn(" enableROSpecID not set");
      throw new MissingParameterException(" enableROSpecID not set");
    } else {
      element.addContent(enableROSpecID.encodeXML("EnableROSpecID", ns));
    }

    if (enableSpecIndex == null) {
      LOGGER.warn(" enableSpecIndex not set");
      throw new MissingParameterException(" enableSpecIndex not set");
    } else {
      element.addContent(enableSpecIndex.encodeXML("EnableSpecIndex", ns));
    }

    if (enableInventoryParameterSpecID == null) {
      LOGGER.warn(" enableInventoryParameterSpecID not set");
      throw new MissingParameterException(
        " enableInventoryParameterSpecID not set");
    } else {
      element.addContent(enableInventoryParameterSpecID.encodeXML(
        "EnableInventoryParameterSpecID", ns));
    }

    if (enableAntennaID == null) {
      LOGGER.warn(" enableAntennaID not set");
      throw new MissingParameterException(" enableAntennaID not set");
    } else {
      element.addContent(enableAntennaID.encodeXML("EnableAntennaID", ns));
    }

    if (enableChannelIndex == null) {
      LOGGER.warn(" enableChannelIndex not set");
      throw new MissingParameterException(" enableChannelIndex not set");
    } else {
      element.addContent(enableChannelIndex.encodeXML(
        "EnableChannelIndex", ns));
    }

    if (enablePeakRSSI == null) {
      LOGGER.warn(" enablePeakRSSI not set");
      throw new MissingParameterException(" enablePeakRSSI not set");
    } else {
      element.addContent(enablePeakRSSI.encodeXML("EnablePeakRSSI", ns));
    }

    if (enableFirstSeenTimestamp == null) {
      LOGGER.warn(" enableFirstSeenTimestamp not set");
      throw new MissingParameterException(
        " enableFirstSeenTimestamp not set");
    } else {
      element.addContent(enableFirstSeenTimestamp.encodeXML(
        "EnableFirstSeenTimestamp", ns));
    }

    if (enableLastSeenTimestamp == null) {
      LOGGER.warn(" enableLastSeenTimestamp not set");
      throw new MissingParameterException(
        " enableLastSeenTimestamp not set");
    } else {
      element.addContent(enableLastSeenTimestamp.encodeXML(
        "EnableLastSeenTimestamp", ns));
    }

    if (enableTagSeenCount == null) {
      LOGGER.warn(" enableTagSeenCount not set");
      throw new MissingParameterException(" enableTagSeenCount not set");
    } else {
      element.addContent(enableTagSeenCount.encodeXML(
        "EnableTagSeenCount", ns));
    }

    if (enableAccessSpecID == null) {
      LOGGER.warn(" enableAccessSpecID not set");
      throw new MissingParameterException(" enableAccessSpecID not set");
    } else {
      element.addContent(enableAccessSpecID.encodeXML(
        "EnableAccessSpecID", ns));
    }

    //element.addContent(reserved0.encodeXML("reserved",ns));
    //parameters
    if (airProtocolEPCMemorySelectorList == null) {
      LOGGER.info("airProtocolEPCMemorySelectorList not set");
    } else {
      for (AirProtocolEPCMemorySelector field : airProtocolEPCMemorySelectorList) {
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
    enableROSpecID = new Bit(binary.subList(position, Bit.length()));
    position += Bit.length();
    enableSpecIndex = new Bit(binary.subList(position, Bit.length()));
    position += Bit.length();
    enableInventoryParameterSpecID = new Bit(binary.subList(position,
      Bit.length()));
    position += Bit.length();
    enableAntennaID = new Bit(binary.subList(position, Bit.length()));
    position += Bit.length();
    enableChannelIndex = new Bit(binary.subList(position, Bit.length()));
    position += Bit.length();
    enablePeakRSSI = new Bit(binary.subList(position, Bit.length()));
    position += Bit.length();
    enableFirstSeenTimestamp = new Bit(binary.subList(position, Bit.length()));
    position += Bit.length();
    enableLastSeenTimestamp = new Bit(binary.subList(position, Bit.length()));
    position += Bit.length();
    enableTagSeenCount = new Bit(binary.subList(position, Bit.length()));
    position += Bit.length();
    enableAccessSpecID = new Bit(binary.subList(position, Bit.length()));
    position += Bit.length();
    position += reserved0.length();

    // list of parameters
    airProtocolEPCMemorySelectorList = new LinkedList<AirProtocolEPCMemorySelector>();
    LOGGER.debug("decoding parameter airProtocolEPCMemorySelectorList ");

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

      //choiceRef
      if ((type != null) && type.equals(C1G2EPCMemorySelector.TYPENUM)) {
        if (binary.get(position)) {
          // length can statically be determined for TV Parameters
          tempLength = C1G2EPCMemorySelector.length();
        }

        airProtocolEPCMemorySelectorList.add(new C1G2EPCMemorySelector(
          binary.subList(position, tempLength)));
        LOGGER.debug(
          "adding C1G2EPCMemorySelector to airProtocolEPCMemorySelectorList ");
        position += tempLength;
        atLeastOnce = true;
      }

      if (!atLeastOnce) {
        //no parameter matched therefore we jump out of the loop
        break;
      }
    }

    //if list is still empty no parameter matched
    if (airProtocolEPCMemorySelectorList.isEmpty()) {
      LOGGER.info(
        "encoded message does not contain parameter for optional airProtocolEPCMemorySelectorList");
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

    temp = element.getChild("EnableROSpecID", ns);

    if (temp != null) {
      enableROSpecID = new Bit(temp);
    }

    element.removeChild("EnableROSpecID", ns);
    temp = element.getChild("EnableSpecIndex", ns);

    if (temp != null) {
      enableSpecIndex = new Bit(temp);
    }

    element.removeChild("EnableSpecIndex", ns);
    temp = element.getChild("EnableInventoryParameterSpecID", ns);

    if (temp != null) {
      enableInventoryParameterSpecID = new Bit(temp);
    }

    element.removeChild("EnableInventoryParameterSpecID", ns);
    temp = element.getChild("EnableAntennaID", ns);

    if (temp != null) {
      enableAntennaID = new Bit(temp);
    }

    element.removeChild("EnableAntennaID", ns);
    temp = element.getChild("EnableChannelIndex", ns);

    if (temp != null) {
      enableChannelIndex = new Bit(temp);
    }

    element.removeChild("EnableChannelIndex", ns);
    temp = element.getChild("EnablePeakRSSI", ns);

    if (temp != null) {
      enablePeakRSSI = new Bit(temp);
    }

    element.removeChild("EnablePeakRSSI", ns);
    temp = element.getChild("EnableFirstSeenTimestamp", ns);

    if (temp != null) {
      enableFirstSeenTimestamp = new Bit(temp);
    }

    element.removeChild("EnableFirstSeenTimestamp", ns);
    temp = element.getChild("EnableLastSeenTimestamp", ns);

    if (temp != null) {
      enableLastSeenTimestamp = new Bit(temp);
    }

    element.removeChild("EnableLastSeenTimestamp", ns);
    temp = element.getChild("EnableTagSeenCount", ns);

    if (temp != null) {
      enableTagSeenCount = new Bit(temp);
    }

    element.removeChild("EnableTagSeenCount", ns);
    temp = element.getChild("EnableAccessSpecID", ns);

    if (temp != null) {
      enableAccessSpecID = new Bit(temp);
    }

    element.removeChild("EnableAccessSpecID", ns);

    //choices - must check all possible subtypes
    //list of Choice Type Parameter
    airProtocolEPCMemorySelectorList = new LinkedList<AirProtocolEPCMemorySelector>();
    // for each possible subtype get all childs
    tempList = element.getChildren("C1G2EPCMemorySelector", ns);

    for (Element e : tempList) {
      airProtocolEPCMemorySelectorList.add(new C1G2EPCMemorySelector(e));
      LOGGER.debug(
        "adding C1G2EPCMemorySelector to airProtocolEPCMemorySelectorList ");
      atLeastOnce = true;
    }

    element.removeChildren("C1G2EPCMemorySelector", ns);

    if (!atLeastOnce) {
      LOGGER.info(
        "TagReportContentSelector misses optional parameter of type airProtocolEPCMemorySelectorList");
    }

    atLeastOnce = false;

    if (element.getChildren().size() > 0) {
      String message = "TagReportContentSelector has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set enableROSpecID of type Bit .
   *
   * @param enableROSpecID to be set
   */
  public void setEnableROSpecID(final Bit enableROSpecID) {
    this.enableROSpecID = enableROSpecID;
  }

  /**
   * set enableSpecIndex of type Bit .
   *
   * @param enableSpecIndex to be set
   */
  public void setEnableSpecIndex(final Bit enableSpecIndex) {
    this.enableSpecIndex = enableSpecIndex;
  }

  /**
   * set enableInventoryParameterSpecID of type Bit .
   *
   * @param enableInventoryParameterSpecID to be set
   */
  public void setEnableInventoryParameterSpecID(
    final Bit enableInventoryParameterSpecID) {
    this.enableInventoryParameterSpecID = enableInventoryParameterSpecID;
  }

  /**
   * set enableAntennaID of type Bit .
   *
   * @param enableAntennaID to be set
   */
  public void setEnableAntennaID(final Bit enableAntennaID) {
    this.enableAntennaID = enableAntennaID;
  }

  /**
   * set enableChannelIndex of type Bit .
   *
   * @param enableChannelIndex to be set
   */
  public void setEnableChannelIndex(final Bit enableChannelIndex) {
    this.enableChannelIndex = enableChannelIndex;
  }

  /**
   * set enablePeakRSSI of type Bit .
   *
   * @param enablePeakRSSI to be set
   */
  public void setEnablePeakRSSI(final Bit enablePeakRSSI) {
    this.enablePeakRSSI = enablePeakRSSI;
  }

  /**
   * set enableFirstSeenTimestamp of type Bit .
   *
   * @param enableFirstSeenTimestamp to be set
   */
  public void setEnableFirstSeenTimestamp(final Bit enableFirstSeenTimestamp) {
    this.enableFirstSeenTimestamp = enableFirstSeenTimestamp;
  }

  /**
   * set enableLastSeenTimestamp of type Bit .
   *
   * @param enableLastSeenTimestamp to be set
   */
  public void setEnableLastSeenTimestamp(final Bit enableLastSeenTimestamp) {
    this.enableLastSeenTimestamp = enableLastSeenTimestamp;
  }

  /**
   * set enableTagSeenCount of type Bit .
   *
   * @param enableTagSeenCount to be set
   */
  public void setEnableTagSeenCount(final Bit enableTagSeenCount) {
    this.enableTagSeenCount = enableTagSeenCount;
  }

  /**
   * set enableAccessSpecID of type Bit .
   *
   * @param enableAccessSpecID to be set
   */
  public void setEnableAccessSpecID(final Bit enableAccessSpecID) {
    this.enableAccessSpecID = enableAccessSpecID;
  }

  /**
   * set airProtocolEPCMemorySelectorList of type List &lt;AirProtocolEPCMemorySelector>.
   *
   * @param airProtocolEPCMemorySelectorList to be set
   */
  public void setAirProtocolEPCMemorySelectorList(
    final List<AirProtocolEPCMemorySelector> airProtocolEPCMemorySelectorList) {
    this.airProtocolEPCMemorySelectorList = airProtocolEPCMemorySelectorList;
  }

  // end setter
  //getters
  /**
   * get enableROSpecID of type Bit.
   *
   * @return type Bit to be set
   */
  public Bit getEnableROSpecID() {
    return this.enableROSpecID;
  }

  /**
   * get enableSpecIndex of type Bit.
   *
   * @return type Bit to be set
   */
  public Bit getEnableSpecIndex() {
    return this.enableSpecIndex;
  }

  /**
   * get enableInventoryParameterSpecID of type Bit.
   *
   * @return type Bit to be set
   */
  public Bit getEnableInventoryParameterSpecID() {
    return this.enableInventoryParameterSpecID;
  }

  /**
   * get enableAntennaID of type Bit.
   *
   * @return type Bit to be set
   */
  public Bit getEnableAntennaID() {
    return this.enableAntennaID;
  }

  /**
   * get enableChannelIndex of type Bit.
   *
   * @return type Bit to be set
   */
  public Bit getEnableChannelIndex() {
    return this.enableChannelIndex;
  }

  /**
   * get enablePeakRSSI of type Bit.
   *
   * @return type Bit to be set
   */
  public Bit getEnablePeakRSSI() {
    return this.enablePeakRSSI;
  }

  /**
   * get enableFirstSeenTimestamp of type Bit.
   *
   * @return type Bit to be set
   */
  public Bit getEnableFirstSeenTimestamp() {
    return this.enableFirstSeenTimestamp;
  }

  /**
   * get enableLastSeenTimestamp of type Bit.
   *
   * @return type Bit to be set
   */
  public Bit getEnableLastSeenTimestamp() {
    return this.enableLastSeenTimestamp;
  }

  /**
   * get enableTagSeenCount of type Bit.
   *
   * @return type Bit to be set
   */
  public Bit getEnableTagSeenCount() {
    return this.enableTagSeenCount;
  }

  /**
   * get enableAccessSpecID of type Bit.
   *
   * @return type Bit to be set
   */
  public Bit getEnableAccessSpecID() {
    return this.enableAccessSpecID;
  }

  /**
   * get airProtocolEPCMemorySelectorList of type List &lt;AirProtocolEPCMemorySelector> .
   *
   * @return List &lt;AirProtocolEPCMemorySelector>
   */
  public List<AirProtocolEPCMemorySelector> getAirProtocolEPCMemorySelectorList() {
    return airProtocolEPCMemorySelectorList;
  }

  // end getters
  //add methods
  /**
   * add element airProtocolEPCMemorySelector of type AirProtocolEPCMemorySelector .
   *
   * @param airProtocolEPCMemorySelector of type AirProtocolEPCMemorySelector
   */
  public void addToAirProtocolEPCMemorySelectorList(
    AirProtocolEPCMemorySelector airProtocolEPCMemorySelector) {
    if (this.airProtocolEPCMemorySelectorList == null) {
      this.airProtocolEPCMemorySelectorList = new LinkedList<AirProtocolEPCMemorySelector>();
    }

    this.airProtocolEPCMemorySelectorList.add(airProtocolEPCMemorySelector);
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
    return "TagReportContentSelector";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "TagReportContentSelector: ";
    result += ", enableROSpecID: ";
    result += enableROSpecID;
    result += ", enableSpecIndex: ";
    result += enableSpecIndex;
    result += ", enableInventoryParameterSpecID: ";
    result += enableInventoryParameterSpecID;
    result += ", enableAntennaID: ";
    result += enableAntennaID;
    result += ", enableChannelIndex: ";
    result += enableChannelIndex;
    result += ", enablePeakRSSI: ";
    result += enablePeakRSSI;
    result += ", enableFirstSeenTimestamp: ";
    result += enableFirstSeenTimestamp;
    result += ", enableLastSeenTimestamp: ";
    result += enableLastSeenTimestamp;
    result += ", enableTagSeenCount: ";
    result += enableTagSeenCount;
    result += ", enableAccessSpecID: ";
    result += enableAccessSpecID;

    result = result.replaceFirst(", ", "");

    return result;
  }
}
