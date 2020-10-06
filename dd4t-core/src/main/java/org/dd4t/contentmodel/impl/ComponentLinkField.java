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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.dd4t.contentmodel.Component;
import org.dd4t.contentmodel.Field;
import org.dd4t.contentmodel.FieldType;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ComponentLinkField extends BaseField implements Field, Serializable {

    private static final long serialVersionUID = 8425734531699002178L;

    public ComponentLinkField() {
        setFieldType(FieldType.COMPONENTLINK);
    }

    @Override
    public List<Object> getValues() {
        List<Component> compValues = getLinkedComponentValues();
        List<Object> l = new LinkedList<Object>();

        for (Component c : compValues) {
            l.add(c);
        }

        return l;
    }
}