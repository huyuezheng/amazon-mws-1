/*******************************************************************************
 * Copyright 2009-2016 Amazon Services. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 *
 * You may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at: http://aws.amazon.com/apache2.0
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License.
 *******************************************************************************
 * Confirm Preorder Response
 * API Version: 2010-10-01
 * Library Version: 2016-10-05
 * Generated: Wed Oct 05 06:15:34 PDT 2016
 */
package com.amazonservices.mws.FulfillmentInboundShipment.model;

import javax.xml.bind.annotation.*;

import com.amazonservices.mws.client.*;

/**
 * ConfirmPreorderResponse complex type.
 *
 * XML schema:
 *
 * <pre>
 * &lt;complexType name="ConfirmPreorderResponse"&gt;
 *    &lt;complexContent&gt;
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *          &lt;sequence&gt;
 *             &lt;element name="ConfirmPreorderResult" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}ConfirmPreorderResult" minOccurs="0"/&gt;
 *             &lt;element name="ResponseMetadata" type="{http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/}ResponseMetadata" minOccurs="0"/&gt;
 *          &lt;/sequence&gt;
 *       &lt;/restriction&gt;
 *    &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ConfirmPreorderResponse", propOrder={
    "confirmPreorderResult",
    "responseMetadata"
})
@XmlRootElement(name = "ConfirmPreorderResponse")
public class ConfirmPreorderResponse extends AbstractMwsObject implements MWSResponse {

    @XmlElement(name="ConfirmPreorderResult")
    private ConfirmPreorderResult confirmPreorderResult;

    @XmlElement(name="ResponseMetadata")
    private ResponseMetadata responseMetadata;

    @XmlTransient
    private ResponseHeaderMetadata responseHeaderMetadata;

    /**
     * Get the value of ConfirmPreorderResult.
     *
     * @return The value of ConfirmPreorderResult.
     */
    public ConfirmPreorderResult getConfirmPreorderResult() {
        return confirmPreorderResult;
    }

    /**
     * Set the value of ConfirmPreorderResult.
     *
     * @param confirmPreorderResult
     *            The new value to set.
     */
    public void setConfirmPreorderResult(ConfirmPreorderResult confirmPreorderResult) {
        this.confirmPreorderResult = confirmPreorderResult;
    }

    /**
     * Check to see if ConfirmPreorderResult is set.
     *
     * @return true if ConfirmPreorderResult is set.
     */
    public boolean isSetConfirmPreorderResult() {
        return confirmPreorderResult != null;
    }

    /**
     * Set the value of ConfirmPreorderResult, return this.
     *
     * @param confirmPreorderResult
     *             The new value to set.
     *
     * @return This instance.
     */
    public ConfirmPreorderResponse withConfirmPreorderResult(ConfirmPreorderResult confirmPreorderResult) {
        this.confirmPreorderResult = confirmPreorderResult;
        return this;
    }

    /**
     * Get the value of ResponseMetadata.
     *
     * @return The value of ResponseMetadata.
     */
    public ResponseMetadata getResponseMetadata() {
        return responseMetadata;
    }

    /**
     * Set the value of ResponseMetadata.
     *
     * @param responseMetadata
     *            The new value to set.
     */
    public void setResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
    }

    /**
     * Check to see if ResponseMetadata is set.
     *
     * @return true if ResponseMetadata is set.
     */
    public boolean isSetResponseMetadata() {
        return responseMetadata != null;
    }

    /**
     * Set the value of ResponseMetadata, return this.
     *
     * @param responseMetadata
     *             The new value to set.
     *
     * @return This instance.
     */
    public ConfirmPreorderResponse withResponseMetadata(ResponseMetadata responseMetadata) {
        this.responseMetadata = responseMetadata;
        return this;
    }

    /**
     * Get the value of ResponseHeaderMetadata.
     *
     * @return The value of ResponseHeaderMetadata.
     */
    public ResponseHeaderMetadata getResponseHeaderMetadata() {
        return responseHeaderMetadata;
    }

    /**
     * Set the value of ResponseHeaderMetadata.
     *
     * @param responseHeaderMetadata
     *            The new value to set.
     */
    public void setResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
    }

    /**
     * Check to see if ResponseHeaderMetadata is set.
     *
     * @return true if ResponseHeaderMetadata is set.
     */
    public boolean isSetResponseHeaderMetadata() {
        return responseHeaderMetadata != null;
    }

    /**
     * Set the value of ResponseHeaderMetadata, return this.
     *
     * @param responseHeaderMetadata
     *             The new value to set.
     *
     * @return This instance.
     */
    public ConfirmPreorderResponse withResponseHeaderMetadata(ResponseHeaderMetadata responseHeaderMetadata) {
        this.responseHeaderMetadata = responseHeaderMetadata;
        return this;
    }

    /**
     * Read members from a MwsReader.
     *
     * @param r
     *      The reader to read from.
     */
    @Override
    public void readFragmentFrom(MwsReader r) {
        confirmPreorderResult = r.read("ConfirmPreorderResult", ConfirmPreorderResult.class);
        responseMetadata = r.read("ResponseMetadata", ResponseMetadata.class);
    }

    /**
     * Write members to a MwsWriter.
     *
     * @param w
     *      The writer to write to.
     */
    @Override
    public void writeFragmentTo(MwsWriter w) {
        w.write("ConfirmPreorderResult", confirmPreorderResult);
        w.write("ResponseMetadata", responseMetadata);
    }

    /**
     * Write tag, xmlns and members to a MwsWriter.
     *
     * @param w
     *         The Writer to write to.
     */
    @Override
    public void writeTo(MwsWriter w) {
        w.write("http://mws.amazonaws.com/FulfillmentInboundShipment/2010-10-01/", "ConfirmPreorderResponse",this);
    }


    /** Value constructor. */
    public ConfirmPreorderResponse(ConfirmPreorderResult confirmPreorderResult,ResponseMetadata responseMetadata) {
        this.confirmPreorderResult = confirmPreorderResult;
        this.responseMetadata = responseMetadata;
    }

    /** Default constructor. */
    public ConfirmPreorderResponse() {
        super();
    }

}
