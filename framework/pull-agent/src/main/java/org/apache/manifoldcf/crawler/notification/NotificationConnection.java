/* $Id$ */

/**
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements. See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License. You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.apache.manifoldcf.crawler.notification;

import org.apache.manifoldcf.core.interfaces.*;
import org.apache.manifoldcf.crawler.interfaces.*;
import java.util.*;

/** An instance of this class represents a persistently-stored notification connection description.
* This is the paper object meant for editing and manipulation.
*/
public class NotificationConnection implements INotificationConnection
{
  public static final String _rcsid = "@(#)$Id$";

  // data
  protected boolean isNew = true;
  protected String name = null;
  protected String description = null;
  protected String className = null;
  protected ConfigParams configParams = new ConfigParams();
  protected int maxCount = 100;

  /** Constructor.
  */
  public NotificationConnection()
  {
  }

  /** Clone this object.
  *@return the cloned object.
  */
  public NotificationConnection duplicate()
  {
    NotificationConnection rval = new NotificationConnection();
    rval.isNew = isNew;
    rval.name = name;
    rval.description = description;
    rval.className = className;
    rval.maxCount = maxCount;
    rval.configParams = configParams.duplicate();
    return rval;
  }

  /** Set 'isnew' condition.
  *@param isnew true if this is a new instance.
  */
  @Override
  public void setIsNew(boolean isnew)
  {
    this.isNew = isnew;
  }
  
  /** Get 'isnew' condition.
  *@return true if this is a new connection, false otherwise.
  */
  @Override
  public boolean getIsNew()
  {
    return isNew;
  }

  /** Set name.
  *@param name is the name.
  */
  @Override
  public void setName(String name)
  {
    this.name = name;
  }

  /** Get name.
  *@return the name
  */
  @Override
  public String getName()
  {
    return name;
  }

  /** Set description.
  *@param description is the description.
  */
  @Override
  public void setDescription(String description)
  {
    this.description = description;
  }

  /** Get description.
  *@return the description
  */
  @Override
  public String getDescription()
  {
    return description;
  }

  /** Set the class name.
  *@param className is the class name.
  */
  @Override
  public void setClassName(String className)
  {
    this.className = className;
  }

  /** Get the class name.
  *@return the class name
  */
  @Override
  public String getClassName()
  {
    return className;
  }

  /** Get the configuration parameters.
  *@return the map.  Can be modified.
  */
  @Override
  public ConfigParams getConfigParams()
  {
    return configParams;
  }

  /** Set the maximum size of the connection pool.
  *@param maxCount is the maximum connection count per JVM.
  */
  @Override
  public void setMaxConnections(int maxCount)
  {
    this.maxCount = maxCount;
  }

  /** Get the maximum size of the connection pool.
  *@return the maximum size.
  */
  @Override
  public int getMaxConnections()
  {
    return maxCount;
  }

}
