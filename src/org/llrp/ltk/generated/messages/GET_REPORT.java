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
package org.llrp.ltk.generated.messages;

import org.apache.log4j.Logger;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;

import org.llrp.ltk.exceptions.InvalidLLRPMessageException;
import org.llrp.ltk.exceptions.MissingParameterException;
import org.llrp.ltk.generated.LLRPConstants;
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
 * This message is issued by the Client to the Reader to get the tag reports. In response to this message, the Reader SHALL return tag reports accumulated.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=76&view=fit">LLRP Specification Section 13.1.1</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=124&view=fit">LLRP Specification Section 16.1.29</a>}
 *
 *
 */
public class GET_REPORT extends LLRPMessage {

  public static final SignedShort TYPENUM = new SignedShort(60);
  private static final Logger LOGGER = Logger.getLogger(GET_REPORT.class);
  public static final String RESPONSETYPE = "";

  /**
   * empty constructor to create new message with LLRP version set to 1.0 (0x1).
   */
  public GET_REPORT() {
    setVersion(new BitList(0, 0, 1));
  }

  /**
   * Constructor to create message from binary encoded message calls decodeBinary to decode message.
   *
   * @param list to be decoded
   */
  public GET_REPORT(final LLRPBitList list)
    throws InvalidLLRPMessageException {
    decodeBinary(list.toByteArray());
  }

  /**
   * Constructor to create message from binary encoded message calls decodeBinary to decode message.
   *
   * @param byteArray representing message
   */
  public GET_REPORT(final byte[] byteArray)
    throws InvalidLLRPMessageException {
    decodeBinary(byteArray);
  }

  /**
   * Constructor to create message from xml encoded message calls decodeXML to decode message.
   *
   * @param document to be decoded
   */
  public GET_REPORT(final Document document)
    throws InvalidLLRPMessageException {
    decodeXML(document);
  }

  /**
   * {@inheritDoc}
   */
  protected LLRPBitList encodeBinarySpecific()
    throws InvalidLLRPMessageException {
    LLRPBitList resultBits = new LLRPBitList();

    return resultBits;
  }

  /**
   * {@inheritDoc}
   */
  public Document encodeXML() throws InvalidLLRPMessageException {
    try {
      Namespace ns = Namespace.getNamespace("llrp",
        LLRPConstants.LLRPNAMESPACE);

      Element root = new Element("GET_REPORT", ns);
      //	Element root = new Element("GET_REPORT");
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

      //parameters
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

      if (root.getChildren().size() > 0) {
        String message = "GET_REPORT has unknown element "
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
  // end setter
  //getters
  // end getters
  //add methods
  // end add
  @Override
  public String getResponseType() {
    return RESPONSETYPE;
  }

  @Override
  public String getName() {
    return "GET_REPORT";
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
