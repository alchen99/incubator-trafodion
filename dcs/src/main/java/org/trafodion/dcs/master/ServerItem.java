/**
 *(C) Copyright 2013 Hewlett-Packard Development Company, L.P.
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
package org.trafodion.dcs.master;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;

import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.Date;

import java.text.DateFormat;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.trafodion.dcs.script.ScriptManager;
import org.trafodion.dcs.script.ScriptContext;
import org.trafodion.dcs.Constants;
import org.trafodion.dcs.util.DcsConfiguration;

public class ServerItem  {
    String hostName;
    String instance;
    String isRegistered;
    String infoPort;
    Date startTime;
    String dialogueId;
    String nid;
    String pid;
    String processName;
    String ipAddress;
    String port;
    String state;
    String clientName;
    String clientIpAddress;
    String clientPort;
    String clientAppl;
    
    public void setHostname(String value) { hostName = value; }
    public String getHostname() {return hostName; }
    public void setInstance(String value) { instance = value; }
    public String getInstance() {return instance; }
    public void setIsRegistered(String value) { isRegistered = value; }
    public String getIsRegistered() {return isRegistered; }                
    public void setinfoPort(String value) { infoPort = value; }
    public String getinfoPort() {return infoPort; }
    public void setStartTime(Date value) { startTime = value; }
    public Date getStartTime() {return startTime; }                
    public void setDialogueId(String value) { dialogueId = value; }
    public String getDialogueId() {return dialogueId; }
    public void setNid(String value) { nid = value; }
    public String getNid() {return nid; }               
    public void setPid(String value) { pid = value; }
    public String getPid() {return pid; }
    public void setProcessName(String value) { processName = value; }
    public String getProcessName() {return processName; }                
    public void setIpAddress(String value) { ipAddress = value; }
    public String getIpAddress() {return ipAddress; }
    public void setPort(String value) { port = value; }
    public String getPort() {return port; }                
    public void setState(String value) { state = value; }
    public String getState() {return state; }
    public void setClientName(String value) { clientName = value; }
    public String getClientName() {return clientName; }      
    public void setClientIpAddress(String value) { clientIpAddress = value; }
    public String getClientIpAddress() {return clientIpAddress; }                             
    public void setClientPort(String value) { clientPort = value; }
    public String getClientPort() {return clientPort; }               
    public void setClientAppl(String value) { clientAppl = value; }
    public String getClientAppl() {return clientAppl; }
}

