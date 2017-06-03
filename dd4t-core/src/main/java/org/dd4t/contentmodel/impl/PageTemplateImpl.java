/*
 * Copyright (c) 2015 SDL, Radagio & R. Oudshoorn
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dd4t.contentmodel.impl;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.dd4t.contentmodel.HasMetadata;
import org.dd4t.contentmodel.PageTemplate;

import java.io.Serializable;

public class PageTemplateImpl extends BaseRepositoryLocalItem implements PageTemplate, HasMetadata, Serializable {

    private static final long serialVersionUID = -5960304953992709902L;

    @JsonProperty ("FileExtension")
    private String fileExtension;

    /**
     * Get the file extension
     */
    @Override
    public String getFileExtension () {
        return fileExtension;
    }

    /**
     * Set the file extension
     */
    @Override
    public void setFileExtension (String fileExtension) {
        this.fileExtension = fileExtension;
    }
}
