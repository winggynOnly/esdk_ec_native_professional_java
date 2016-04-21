/**
 * Copyright 2015 Huawei Technologies Co., Ltd. All rights reserved.
 * eSDK is licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   
 * http://www.apache.org/licenses/LICENSE-2.0
 *   
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.huawei.esdk.uc.professional.local.bean.south;

public class LogAuditInfo
{
    private String messagetype;
    
    private String sendaccount;
    
    private String receiveaccount;
    
    private String sendip;
    
    private String receivetime;
    
    private String contentkey;
    
    public String getMessagetype()
    {
        return messagetype;
    }
    
    public void setMessagetype(String messagetype)
    {
        this.messagetype = messagetype;
    }
    
    public String getSendaccount()
    {
        return sendaccount;
    }
    
    public void setSendaccount(String sendaccount)
    {
        this.sendaccount = sendaccount;
    }
    
    public String getReceiveaccount()
    {
        return receiveaccount;
    }
    
    public void setReceiveaccount(String receiveaccount)
    {
        this.receiveaccount = receiveaccount;
    }
    
    public String getSendip()
    {
        return sendip;
    }
    
    public void setSendip(String sendip)
    {
        this.sendip = sendip;
    }
    
    public String getReceivetime()
    {
        return receivetime;
    }
    
    public void setReceivetime(String receivetime)
    {
        this.receivetime = receivetime;
    }
    
    public String getContentkey()
    {
        return contentkey;
    }
    
    public void setContentkey(String contentkey)
    {
        this.contentkey = contentkey;
    }
    
}
