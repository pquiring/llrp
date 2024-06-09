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
import org.llrp.ltk.generated.enumerations.StatusCode;
import org.llrp.ltk.generated.parameters.FieldError;
import org.llrp.ltk.generated.parameters.ParameterError;
import org.llrp.ltk.types.LLRPBitList;
import org.llrp.ltk.types.LLRPMessage;
import org.llrp.ltk.types.SignedShort;
import org.llrp.ltk.types.TLVParameter;
import org.llrp.ltk.types.TVParameter;
import org.llrp.ltk.types.UnsignedShort;

import java.util.LinkedList;
import java.util.List;

/**
 * The parameter type that caused this error.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=96&view=fit">LLRP Specification Section 14.2.2.2</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=152&view=fit">LLRP Specification Section 16.2.8.1.2</a>}
 *
 *
 */
/**
 * The parameter type that caused this error.
 *
 * See also {@link <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=96&view=fit">LLRP Specification Section 14.2.2.2</a>} and {@link
 * <a href="http://www.epcglobalinc.org/standards/llrp/llrp_1_0_1-standard-20070813.pdf#page=152&view=fit">LLRP Specification Section 16.2.8.1.2</a>}
 *
 * .
 */
public class ParameterError extends TLVParameter {

  public static final SignedShort TYPENUM = new SignedShort(289);
  private static final Logger LOGGER = Logger.getLogger(ParameterError.class);
  protected UnsignedShort parameterType;
  protected StatusCode errorCode;
  protected FieldError fieldError;
  protected ParameterError parameterError;

  /**
   * empty constructor to create new parameter.
   */
  public ParameterError() {
  }

  /**
   * Constructor to create parameter from binary encoded parameter calls decodeBinary to decode parameter.
   *
   * @param list to be decoded
   */
  public ParameterError(LLRPBitList list) {
    decodeBinary(list);
  }

  /**
   * Constructor to create parameter from xml encoded parameter calls decodeXML to decode parameter.
   *
   * @param element to be decoded
   */
  public ParameterError(Element element) throws InvalidLLRPMessageException {
    decodeXML(element);
  }

  /**
   * {@inheritDoc}
   */
  public LLRPBitList encodeBinarySpecific() {
    LLRPBitList resultBits = new LLRPBitList();

    if (parameterType == null) {
      LOGGER.warn(" parameterType not set");
      throw new MissingParameterException(
        " parameterType not set  for Parameter of Type ParameterError");
    }

    resultBits.append(parameterType.encodeBinary());

    if (errorCode == null) {
      LOGGER.warn(" errorCode not set");
      throw new MissingParameterException(
        " errorCode not set  for Parameter of Type ParameterError");
    }

    resultBits.append(errorCode.encodeBinary());

    if (fieldError == null) {
      // optional parameter, may be null
      LOGGER.info(" fieldError not set");
    } else {
      resultBits.append(fieldError.encodeBinary());
    }

    if (parameterError == null) {
      // optional parameter, may be null
      LOGGER.info(" parameterError not set");
    } else {
      resultBits.append(parameterError.encodeBinary());
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

    if (parameterType == null) {
      LOGGER.warn(" parameterType not set");
      throw new MissingParameterException(" parameterType not set");
    } else {
      element.addContent(parameterType.encodeXML("ParameterType", ns));
    }

    if (errorCode == null) {
      LOGGER.warn(" errorCode not set");
      throw new MissingParameterException(" errorCode not set");
    } else {
      element.addContent(errorCode.encodeXML("ErrorCode", ns));
    }

    //parameters
    if (fieldError == null) {
      LOGGER.info("fieldError not set");
    } else {
      element.addContent(fieldError.encodeXML(fieldError.getClass()
        .getSimpleName(),
        ns));
    }

    if (parameterError == null) {
      LOGGER.info("parameterError not set");
    } else {
      element.addContent(parameterError.encodeXML(
        parameterError.getClass().getSimpleName(), ns));
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
    parameterType = new UnsignedShort(binary.subList(position,
      UnsignedShort.length()));
    position += UnsignedShort.length();
    errorCode = new StatusCode(binary.subList(position, StatusCode.length()));
    position += StatusCode.length();

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
        "ParameterError misses optional parameter of type FieldError");
    }

    if (binary.get(position)) {
      // length can statically be determined for TV Parameters
      tempLength = fieldError.length();
    }

    if ((type != null) && type.equals(FieldError.TYPENUM)) {
      fieldError = new FieldError(binary.subList(position, tempLength));
      position += tempLength;
      LOGGER.debug(
        " fieldError is instantiated with FieldError with length"
        + tempLength);
    } else {
      LOGGER.info(
        "ParameterError misses optional parameter of type FieldError");
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
        "ParameterError misses optional parameter of type ParameterError");
    }

    if (binary.get(position)) {
      // length can statically be determined for TV Parameters
      tempLength = parameterError.length();
    }

    if ((type != null) && type.equals(ParameterError.TYPENUM)) {
      parameterError = new ParameterError(binary.subList(position,
        tempLength));
      position += tempLength;
      LOGGER.debug(
        " parameterError is instantiated with ParameterError with length"
        + tempLength);
    } else {
      LOGGER.info(
        "ParameterError misses optional parameter of type ParameterError");
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

    temp = element.getChild("ParameterType", ns);

    if (temp != null) {
      parameterType = new UnsignedShort(temp);
    }

    element.removeChild("ParameterType", ns);
    temp = element.getChild("ErrorCode", ns);

    if (temp != null) {
      errorCode = new StatusCode(temp);
    }

    element.removeChild("ErrorCode", ns);

    //parameter - not choices - no special actions needed
    temp = element.getChild("FieldError", ns);

    if (temp != null) {
      fieldError = new FieldError(temp);
      LOGGER.info(
        "setting parameter fieldError for parameter ParameterError");
    }

    if (temp == null) {
      LOGGER.info(
        "ParameterError misses optional parameter of type fieldError");
    }

    element.removeChild("FieldError", ns);
    //parameter - not choices - no special actions needed
    temp = element.getChild("ParameterError", ns);

    if (temp != null) {
      parameterError = new ParameterError(temp);
      LOGGER.info(
        "setting parameter parameterError for parameter ParameterError");
    }

    if (temp == null) {
      LOGGER.info(
        "ParameterError misses optional parameter of type parameterError");
    }

    element.removeChild("ParameterError", ns);

    if (element.getChildren().size() > 0) {
      String message = "ParameterError has unknown element "
        + ((Element) element.getChildren().get(0)).getName();
      throw new InvalidLLRPMessageException(message);
    }
  }

  //setters
  /**
   * set parameterType of type UnsignedShort .
   *
   * @param parameterType to be set
   */
  public void setParameterType(final UnsignedShort parameterType) {
    this.parameterType = parameterType;
  }

  /**
   * set errorCode of type StatusCode .
   *
   * @param errorCode to be set
   */
  public void setErrorCode(final StatusCode errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * set fieldError of type FieldError.
   *
   * @param fieldError to be set
   */
  public void setFieldError(final FieldError fieldError) {
    this.fieldError = fieldError;
  }

  /**
   * set parameterError of type ParameterError.
   *
   * @param parameterError to be set
   */
  public void setParameterError(final ParameterError parameterError) {
    this.parameterError = parameterError;
  }

  // end setter
  //getters
  /**
   * get parameterType of type UnsignedShort.
   *
   * @return type UnsignedShort to be set
   */
  public UnsignedShort getParameterType() {
    return this.parameterType;
  }

  /**
   * get errorCode of type StatusCode.
   *
   * @return StatusCode
   */
  public StatusCode getErrorCode() {
    return errorCode;
  }

  /**
   * get fieldError of type FieldError .
   *
   * @return FieldError
   */
  public FieldError getFieldError() {
    return fieldError;
  }

  /**
   * get parameterError of type ParameterError .
   *
   * @return ParameterError
   */
  public ParameterError getParameterError() {
    return parameterError;
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
    return "ParameterError";
  }

  /**
   * return string representation. All field values but no parameters are included
   *
   * @return String
   */
  public String toString() {
    String result = "ParameterError: ";
    result += ", parameterType: ";
    result += parameterType;
    result += ", errorCode: ";
    result += errorCode;
    result = result.replaceFirst(", ", "");

    return result;
  }
}
