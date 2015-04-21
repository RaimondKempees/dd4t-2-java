/**  
 *  Copyright 2011 Capgemini & SDL
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.dd4t.springmvc.view.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Simple container class for all rendered views for a given region.
 * 
 * @author Rogier Oudshoorn
 *
 */
public class ViewRegion {
    private List<String> componentViews;

    public ViewRegion() {

        this.componentViews = new ArrayList<String>();
    }

    public List<String> getComponentViews() {

        return componentViews;
    }

    public void setComponentViews(List<String> componentViews) {

        this.componentViews = componentViews;
    }

}
