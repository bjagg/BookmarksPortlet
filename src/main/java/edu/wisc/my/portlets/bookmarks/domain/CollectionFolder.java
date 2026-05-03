/**
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package edu.wisc.my.portlets.bookmarks.domain;

import java.util.HashMap;
import java.util.Map;

import edu.wisc.my.portlets.bookmarks.domain.support.IntegerSetThreadLocal;

/**
 * <p>CollectionFolder class.</p>
 *
 * @author cbeach
 * @version $Id: $Id
 */
public class CollectionFolder extends Entry implements CollapsibleEntry {
    private static final long serialVersionUID = 1L;

    private static IntegerSetThreadLocal equalsVisitedFolder = new IntegerSetThreadLocal();
    private static IntegerSetThreadLocal hashCodeVisitedFolder = new IntegerSetThreadLocal();
    private static IntegerSetThreadLocal toStringVisitedFolder = new IntegerSetThreadLocal();

    private Map<Long, Entry> children;
    private boolean minimized = false;
    private String type;
    private String url;


    /**
     * <p>Getter for the field <code>children</code>.</p>
     *
     * @return Returns the children, will never return null.
     */
    public Map<Long, Entry> getChildren() {
    	// TODO
    	return new HashMap<Long, Entry>();
    }

    /**
     * <p>isMinimized.</p>
     *
     * @return Returns the minimized.
     */
    public boolean isMinimized() {
        return this.minimized;
    }

    /** {@inheritDoc} */
    public void setMinimized(boolean minimized) {
        this.minimized = minimized;
    }
    
	/**
	 * <p>Getter for the field <code>url</code>.</p>
	 *
	 * @return a {@link java.lang.String} object.
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <p>Setter for the field <code>url</code>.</p>
	 *
	 * @param url a {@link java.lang.String} object.
	 */
	public void setUrl(String url) {
		this.url = url;
	}
    
    
    
}
