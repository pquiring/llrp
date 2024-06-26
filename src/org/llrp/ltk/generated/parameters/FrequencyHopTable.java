/*
 *
 * This file was generated by LLRP Code Generator
 * see http://llrp-toolkit.cvs.sourceforge.net/llrp-toolkit/
 * for more information
 * Generated on: Sun Apr 08 14:14:10 EDT 2012;
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
import org.llrp.ltk.types.BitList;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedByte;
import org.llrp.ltk.types.UnsignedIntegerArray;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;

/**
 * This parameter carries the frequency hop table parameters. This is used for Readers operating in regions with frequency hopping regulatory requirements. If the Reader is capable
 * of storing multiple hop tables, the Reader may send all of them to the Client.HopTableID which is the index of the frequency hop table returned by the Reader.This is followed by
 * a list of the frequencies (in kKHhz) in hop table order. The one-based position of a frequency in the list is defined as its ChannelIndex (i.e. the first frequency is referred
 * to as ChannelIndex one).
 *
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=50&view=fit">LLRP Specification Section 9.2.4.1.2.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=134&view=fit">LLRP Specification Section 16.2.3.4.1.2.1</a>}
 *
 *
 */
/**
 * This parameter carries the frequency hop table parameters. This is used for Readers operating in regions with frequency hopping regulatory requirements. If the Reader is capable
 * of storing multiple hop tables, the Reader may send all of them to the Client.HopTableID which is the index of the frequency hop table returned by the Reader.This is followed by
 * a list of the frequencies (in kKHhz) in hop table order. The one-based position of a frequency in the list is defined as its ChannelIndex (i.e. the first frequency is referred
 * to as ChannelIndex one).
 *
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=50&view=fit">LLRP Specification Section 9.2.4.1.2.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=134&view=fit">LLRP Specification Section 16.2.3.4.1.2.1</a>}
 *
 * .
 */
public class FrequencyHopTable extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(147);
  private static final Logger LOGGER = Logger.getLogger(FrequencyHopTable.class);
  protected UnsignedByte hopTableID;
  protected BitList reserved0 = new BitList(8);
  protected UnsignedIntegerArray frequency;

  /**
   * empty constructor to create new parameter.
   */
  public FrequencyHopTable() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public FrequencyHopTable(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public FrequencyHopTable(Element element)
    throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (hopTableID == null) {
      LOGGER.warn(" hopTableID not set");
      throw new MissingParameterException(
        " hopTableID not set  for Parameter of Type FrequencyHopTable");
    }

    resultBits.append(hopTableID.encodeBinary());
    resultBits.append(reserved0.encodeBinary());

    if (frequency == null) {
      LOGGER.warn(" frequency not set");
      throw new MissingParameterException(
        " frequency not set  for Parameter of Type FrequencyHopTable");
    }

    resultBits.append(frequency.encodeBinary());

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

    if (hopTableID == null) {
      LOGGER.warn(" hopTableID not set");
      throw new MissingParameterException(" hopTableID not set");
    } else {
      element.addContent(hopTableID.encodeXML("HopTableID", ns));
    }

    //element.addContent(reserved0.encodeXML("reserved",ns));
    if (frequency == null) {
      LOGGER.warn(" frequency not set");
      throw new MissingParameterException(" frequency not set");
    } else {
      element.addContent(frequency.encodeXML("Frequency", ns));
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
    hopTableID = new UnsignedByte(binary.subList(position,
      UnsignedByte.length()));
    position += UnsignedByte.length();
    position += reserved0.length();
    // array. first 16 bits indicate length of array
    fieldCount = new UnsignedShort(binary.subList(position,
      UnsignedShort.length())).toShort();
    tempLength = (UnsignedIntegerArray.length() * fieldCount)
      + UnsignedShort.length();
    frequency = new UnsignedIntegerArray(binary.subList(position, tempLength));
    position += tempLength;
    LOGGER.debug("decoding array of type: UnsignedIntegerArray with "
      + tempLength + " length");

    //might need padding
    // must always be blocks of 8 bites, if it is a bitlist, this might not be automatically the case
    if ((tempLength % 8) > 0) {
      position += (8 - (tempLength % 8));
      LOGGER.info("padding needed for frequency ");
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

    temp = element.getChild("HopTableID", ns);

    if (temp != null) {
      hopTableID = new UnsignedByte(temp);
    }

    element.removeChild("HopTableID", ns);
    temp = element.getChild("Frequency", ns);

    if (temp != null) {
      frequency = new UnsignedIntegerArray(temp);
    }

    element.removeChild("Frequency", ns);

    if (element.getChildren().size() > 0) {
      String message = "FrequencyHopTable has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set hopTableID of type UnsignedByte .
   *
   * @param hopTableID to be set
   */
  public void setHopTableID(final UnsignedByte hopTableID) {
    this.hopTableID = hopTableID;
  }

  /**
   * set frequency of type UnsignedIntegerArray .
   *
   * @param frequency to be set
   */
  public void setFrequency(final UnsignedIntegerArray frequency) {
    this.frequency = frequency;
  }

  // end setter
  //getters
  /**
   * get hopTableID of type UnsignedByte.
   *
   * @return type UnsignedByte to be set
   */
  public UnsignedByte getHopTableID() {
    return this.hopTableID;
  }

  /**
   * get frequency of type UnsignedIntegerArray.
   *
   * @return type UnsignedIntegerArray to be set
   */
  public UnsignedIntegerArray getFrequency() {
    return this.frequency;
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
    return "FrequencyHopTable";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "FrequencyHopTable: ";
    result += ", hopTableID: ";
    result += hopTableID;

    result += ", frequency: ";
    result += frequency;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
