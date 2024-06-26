/*
*
* This file was generated by LLRP Code Generator
* see http://llrp-toolkit.cvs.sourceforge.net/llrp-toolkit/
* for more information
* Generated on: Sun Apr 08 14:14:09 EDT 2012;
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
package org.llrp.ltk.generated.messages;

import org.apache.log4j.Logger;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;

import org.llrp.ltk.exceptions.InvalidLLRPMessageException;
import org.llrp.ltk.exceptions.MissingParameterException;
import org.llrp.ltk.generated.LLRPConstants;
import org.llrp.ltk.generated.enumerations.GetReaderConfigRequestedData;
import org.llrp.ltk.generated.parameters.Custom;
import org.llrp.ltk.types.BitList;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.UnsignedInteger;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;

/**
 * This command is issued by the Client to get the current configuration information of the Reader. The Requested Data passed in the command represents the parameter(s) of interest
 * to the Client that has to be returned by the Reader.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=67&view=fit">LLRP Specification Section 12.1.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=126&view=fit">LLRP Specification Section 16.1.36</a>}
 *
 *
 */
public class GET_READER_CONFIG extends LLRPMessage {

  public static final SignedShort TYPENUM = new SignedShort(2);
  private static final Logger LOGGER = Logger.getLogger(GET_READER_CONFIG.class);
  public static final String RESPONSETYPE = "GET_READER_CONFIG_RESPONSE";
  protected UnsignedShort antennaID;
  protected GetReaderConfigRequestedData requestedData;
  protected UnsignedShort gPIPortNum;
  protected UnsignedShort gPOPortNum;
  protected List<Custom> customList = new LinkedList<Custom>();

  /**
   * empty constructor to create new message with LLRP version set to 1.0 (0x1).
   */
  public GET_READER_CONFIG() {
    setVersion(new BitList(0, 0, 1));
  }

  /**
   * Constructor to create message from binary encoded message calls decodeBinary to decode message.
   *
   * @param list to be decoded
   */
  public GET_READER_CONFIG(final LLRPBitList list)
    throws InvalidLLRPMessageException {
    decodeBinary(list.toByteArray());
  }

  /**
   * Constructor to create message from binary encoded message calls decodeBinary to decode message.
   *
   * @param byteArray representing message
   */
  public GET_READER_CONFIG(final byte[] byteArray)
    throws InvalidLLRPMessageException {
    decodeBinary(byteArray);
  }

  /**
   * Constructor to create message from xml encoded message calls decodeXML to decode message.
   *
   * @param document to be decoded
   */
  public GET_READER_CONFIG(final Document document)
    throws InvalidLLRPMessageException {
    decodeXML(document);
  }

  /**
   * {@inheritDoc}
   */
  protected LLRPBitList encodeBinarySpecific()
    throws InvalidLLRPMessageException {
    LLRPBitList resultBits = new LLRPBitList();

    if (antennaID == null) {
      LOGGER.warn(" antennaID not set");
      throw new InvalidLLRPMessageException(
        " antennaID not set  for Parameter of Type GET_READER_CONFIG");
    }

    resultBits.append(antennaID.encodeBinary());

    if (requestedData == null) {
      LOGGER.warn(" requestedData not set");
      throw new InvalidLLRPMessageException(
        " requestedData not set  for Parameter of Type GET_READER_CONFIG");
    }

    resultBits.append(requestedData.encodeBinary());

    if (gPIPortNum == null) {
      LOGGER.warn(" gPIPortNum not set");
      throw new InvalidLLRPMessageException(
        " gPIPortNum not set  for Parameter of Type GET_READER_CONFIG");
    }

    resultBits.append(gPIPortNum.encodeBinary());

    if (gPOPortNum == null) {
      LOGGER.warn(" gPOPortNum not set");
      throw new InvalidLLRPMessageException(
        " gPOPortNum not set  for Parameter of Type GET_READER_CONFIG");
    }

    resultBits.append(gPOPortNum.encodeBinary());

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
  public Document encodeXML() throws InvalidLLRPMessageException {
    try {
      Namespace ns = Namespace.getNamespace("llrp",
        LLRPConstants.LLRPNAMESPACE);

      Element root = new Element("GET_READER_CONFIG", ns);
      //	Element root = new Element("GET_READER_CONFIG");
      root.addNamespaceDeclaration(Namespace.getNamespace("llrp",
        LLRPConstants.LLRPNAMESPACE));

      if (version == null) {
        throw new InvalidLLRPMessageException("Version not set");
      } else {
        root.setAttribute("Version", version.toInteger().toString());
      }

      if (messageID == null) {
        throw new InvalidLLRPMessageException("MessageID not set");
      } else {
        root.setAttribute("MessageID", messageID.toString(10));
      }

      if (antennaID == null) {
        LOGGER.warn(" antennaID not set");
        throw new MissingParameterException(" antennaID not set");
      } else {
        root.addContent(antennaID.encodeXML("AntennaID", ns));
      }

      if (requestedData == null) {
        LOGGER.warn(" requestedData not set");
        throw new MissingParameterException(" requestedData not set");
      } else {
        root.addContent(requestedData.encodeXML("RequestedData", ns));
      }

      if (gPIPortNum == null) {
        LOGGER.warn(" gPIPortNum not set");
        throw new MissingParameterException(" gPIPortNum not set");
      } else {
        root.addContent(gPIPortNum.encodeXML("GPIPortNum", ns));
      }

      if (gPOPortNum == null) {
        LOGGER.warn(" gPOPortNum not set");
        throw new MissingParameterException(" gPOPortNum not set");
      } else {
        root.addContent(gPOPortNum.encodeXML("GPOPortNum", ns));
      }

      //parameters
      if (customList == null) {
        LOGGER.info("customList not set");
      } else {
        for (Custom field : customList) {
          root.addContent(field.encodeXML(field.getClass().getName()
            .replaceAll(field.getClass()
              .getPackage()
              .getName()
              + ".", ""), ns));
        }
      }

      Document doc = new Document(root);

      if (isValidXMLMessage(doc, LLRPConstants.LLRPMESSAGESCHEMAPATH)) {
        return doc;
      } else {
        return null;
      }
    } catch (IllegalArgumentException e) {
      throw new InvalidLLRPMessageException(e.getMessage());
    } catch (MissingParameterException e) {
      throw new InvalidLLRPMessageException(e.getMessage());
    }
  }

  /**
   * {@inheritDoc}
   */
  protected void decodeBinarySpecific(LLRPBitList binary)
    throws InvalidLLRPMessageException {
    int position = 0;
    int tempByteLength;
    int tempLength = 0;
    int count;
    SignedShort type;
    int fieldCount;
    Custom custom;
    antennaID = new UnsignedShort(binary.subList(position,
      UnsignedShort.length()));
    position += UnsignedShort.length();
    requestedData = new GetReaderConfigRequestedData(binary.subList(
      position, GetReaderConfigRequestedData.length()));
    position += GetReaderConfigRequestedData.length();
    gPIPortNum = new UnsignedShort(binary.subList(position,
      UnsignedShort.length()));
    position += UnsignedShort.length();
    gPOPortNum = new UnsignedShort(binary.subList(position,
      UnsignedShort.length()));
    position += UnsignedShort.length();

    // list of parameters
    customList = new LinkedList<Custom>();
    LOGGER.debug("decoding parameter customList ");

    while (position < binary.length()) {
      // store if one parameter matched
      boolean atLeastOnce = false;

      // look ahead to see type
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

      // custom
      if ((type != null) && type.equals(Custom.TYPENUM)) {
        Custom cus = new Custom(binary.subList(position, tempLength));
        //allowed custom parameters for this parameter
        //end allowed parameters
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
  public void decodeXML(final Document document)
    throws InvalidLLRPMessageException {
    Element temp = null;
    Custom custom;

    // child element are always in default LLRP namespace
    Namespace ns = Namespace.getNamespace(LLRPConstants.LLRPNAMESPACE);

    try {
      isValidXMLMessage(document, LLRPConstants.LLRPMESSAGESCHEMAPATH);

      Element root = (Element) document.getRootElement().clone();
      List<Element> tempList = null;

      // the version field is always 3 bit long
      // if the version attribute is not set in the LTK-XML message,
      // it is set to version 001
      String versionAttribute = root.getAttributeValue("Version");

      if (versionAttribute != null) {
        version = new BitList(3);
        version.setValue(Integer.valueOf(versionAttribute));
      } else {
        version = new BitList(0, 0, 1);
      }

      messageID = new UnsignedInteger(root.getAttributeValue("MessageID"));
      temp = root.getChild("AntennaID", root.getNamespace());

      //check if this element exist
      if (temp != null) {
        antennaID = new UnsignedShort(temp);
      } else {
        LOGGER.warn(
          "Element antennaID not provided in xml as child of "
          + root.getName());
        throw new MissingParameterException(
          "Element antennaID not provided");
      }

      root.removeChild("AntennaID", root.getNamespace());
      temp = root.getChild("RequestedData", root.getNamespace());

      //check if this element exist
      if (temp != null) {
        requestedData = new GetReaderConfigRequestedData(temp);
      } else {
        LOGGER.warn(
          "Element requestedData not provided in xml as child of "
          + root.getName());
        throw new MissingParameterException(
          "Element requestedData not provided");
      }

      root.removeChild("RequestedData", root.getNamespace());
      temp = root.getChild("GPIPortNum", root.getNamespace());

      //check if this element exist
      if (temp != null) {
        gPIPortNum = new UnsignedShort(temp);
      } else {
        LOGGER.warn(
          "Element gPIPortNum not provided in xml as child of "
          + root.getName());
        throw new MissingParameterException(
          "Element gPIPortNum not provided");
      }

      root.removeChild("GPIPortNum", root.getNamespace());
      temp = root.getChild("GPOPortNum", root.getNamespace());

      //check if this element exist
      if (temp != null) {
        gPOPortNum = new UnsignedShort(temp);
      } else {
        LOGGER.warn(
          "Element gPOPortNum not provided in xml as child of "
          + root.getName());
        throw new MissingParameterException(
          "Element gPOPortNum not provided");
      }

      root.removeChild("GPOPortNum", root.getNamespace());

      //parameter - not choices - no special actions needed
      //we expect a list of parameters
      customList = new LinkedList<Custom>();
      tempList = root.getChildren("Custom", ns);

      if ((tempList == null) || tempList.isEmpty()) {
        LOGGER.info(
          "GET_READER_CONFIG misses optional parameter of type customList");
      } else {
        for (Element e : tempList) {
          customList.add(new Custom(e));
          LOGGER.debug("adding Custom to customList ");
        }
      }

      root.removeChildren("Custom", ns);

      //custom parameter
      //end custom
      if (root.getChildren().size() > 0) {
        String message = "GET_READER_CONFIG has unknown element "
          + ((Element) root.getChildren().get(0)).getName();
        throw new InvalidLLRPMessageException(message);
      }
    } catch (IllegalArgumentException e) {
      throw new InvalidLLRPMessageException(e.getMessage());
    } catch (MissingParameterException e) {
      throw new InvalidLLRPMessageException(e.getMessage());
    }
  }

  //setters
  /**
   * set antennaID of type UnsignedShort .
   *
   * @param antennaID to be set
   */
  public void setAntennaID(final UnsignedShort antennaID) {
    this.antennaID = antennaID;
  }

  /**
   * set requestedData of type GetReaderConfigRequestedData .
   *
   * @param requestedData to be set
   */
  public void setRequestedData(
    final GetReaderConfigRequestedData requestedData) {
    this.requestedData = requestedData;
  }

  /**
   * set gPIPortNum of type UnsignedShort .
   *
   * @param gPIPortNum to be set
   */
  public void setGPIPortNum(final UnsignedShort gPIPortNum) {
    this.gPIPortNum = gPIPortNum;
  }

  /**
   * set gPOPortNum of type UnsignedShort .
   *
   * @param gPOPortNum to be set
   */
  public void setGPOPortNum(final UnsignedShort gPOPortNum) {
    this.gPOPortNum = gPOPortNum;
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
   * get antennaID of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getAntennaID() {
    return this.antennaID;
  }

  /**
   * get requestedData of type GetReaderConfigRequestedData.
   *
   * @return GetReaderConfigRequestedData
   */
  public GetReaderConfigRequestedData getRequestedData() {
    return requestedData;
  }

  /**
   * get gPIPortNum of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getGPIPortNum() {
    return this.gPIPortNum;
  }

  /**
   * get gPOPortNum of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getGPOPortNum() {
    return this.gPOPortNum;
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
  @Override
  public String getResponseType() {
    return RESPONSETYPE;
  }

  @Override
  public String getName() {
    return "GET_READER_CONFIG";
  }

  /**
   * return uniuque type number.
   *
   * @return SignedShort holding unique type number
   */
  public SignedShort getTypeNum() {
    return TYPENUM;
  }
}
