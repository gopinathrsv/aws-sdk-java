/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.greengrass.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrass-2017-06-07/UpdateFunctionDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateFunctionDefinitionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** the unique Id of the lambda definition */
    private String functionDefinitionId;
    /** name of the definition */
    private String name;

    /**
     * the unique Id of the lambda definition
     * 
     * @param functionDefinitionId
     *        the unique Id of the lambda definition
     */

    public void setFunctionDefinitionId(String functionDefinitionId) {
        this.functionDefinitionId = functionDefinitionId;
    }

    /**
     * the unique Id of the lambda definition
     * 
     * @return the unique Id of the lambda definition
     */

    public String getFunctionDefinitionId() {
        return this.functionDefinitionId;
    }

    /**
     * the unique Id of the lambda definition
     * 
     * @param functionDefinitionId
     *        the unique Id of the lambda definition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionDefinitionRequest withFunctionDefinitionId(String functionDefinitionId) {
        setFunctionDefinitionId(functionDefinitionId);
        return this;
    }

    /**
     * name of the definition
     * 
     * @param name
     *        name of the definition
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * name of the definition
     * 
     * @return name of the definition
     */

    public String getName() {
        return this.name;
    }

    /**
     * name of the definition
     * 
     * @param name
     *        name of the definition
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateFunctionDefinitionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFunctionDefinitionId() != null)
            sb.append("FunctionDefinitionId: ").append(getFunctionDefinitionId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFunctionDefinitionRequest == false)
            return false;
        UpdateFunctionDefinitionRequest other = (UpdateFunctionDefinitionRequest) obj;
        if (other.getFunctionDefinitionId() == null ^ this.getFunctionDefinitionId() == null)
            return false;
        if (other.getFunctionDefinitionId() != null && other.getFunctionDefinitionId().equals(this.getFunctionDefinitionId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFunctionDefinitionId() == null) ? 0 : getFunctionDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public UpdateFunctionDefinitionRequest clone() {
        return (UpdateFunctionDefinitionRequest) super.clone();
    }

}
