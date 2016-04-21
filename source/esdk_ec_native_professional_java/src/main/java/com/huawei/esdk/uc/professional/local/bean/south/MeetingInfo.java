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

public class MeetingInfo
{
    private String gwIp;
    
    private String confId;
    
    private String enterPrompt;
    
    private String leavePrompt;
    
    private String amount;
    
    private String guestPwd;
    
    private String chairmanPwd;
    
    private String startTime;
    
    private String endTime;
    
    private String confMode;
    
    private String recordFlag;
    
    private String confName;
    
    private String srtpMode;
    
    private String confPrefix;
    
    // queryJoinMeeting new add begin
    // 与会者身份:0：主席 1：来宾
    private int attidentity;
    
    // 预定者帐号
    private String keeper;
    
    // 来宾入会链接
    private String guestUrl;
    
    //主席入会链接，当与会者身份为来宾时值为空
    private String chairmanUrl;
    
    // queryJoinMeeting new add end
    
    public String getConfPrefix()
    {
        return confPrefix;
    }
    
    public void setConfPrefix(String confPrefix)
    {
        this.confPrefix = confPrefix;
    }
    
    public String getGwIp()
    {
        return gwIp;
    }
    
    public void setGwIp(String gwIp)
    {
        this.gwIp = gwIp;
    }
    
    public String getConfId()
    {
        return confId;
    }
    
    public void setConfId(String confId)
    {
        this.confId = confId;
    }
    
    public String getEnterPrompt()
    {
        return enterPrompt;
    }
    
    public void setEnterPrompt(String enterPrompt)
    {
        this.enterPrompt = enterPrompt;
    }
    
    public String getLeavePrompt()
    {
        return leavePrompt;
    }
    
    public void setLeavePrompt(String leavePrompt)
    {
        this.leavePrompt = leavePrompt;
    }
    
    public String getAmount()
    {
        return amount;
    }
    
    public void setAmount(String amount)
    {
        this.amount = amount;
    }
    
    public String getGuestPwd()
    {
        return guestPwd;
    }
    
    public void setGuestPwd(String guestPwd)
    {
        this.guestPwd = guestPwd;
    }
    
    public String getChairmanPwd()
    {
        return chairmanPwd;
    }
    
    public void setChairmanPwd(String chairmanPwd)
    {
        this.chairmanPwd = chairmanPwd;
    }
    
    public String getStartTime()
    {
        return startTime;
    }
    
    public void setStartTime(String startTime)
    {
        this.startTime = startTime;
    }
    
    public String getEndTime()
    {
        return endTime;
    }
    
    public void setEndTime(String endTime)
    {
        this.endTime = endTime;
    }
    
    public String getConfMode()
    {
        return confMode;
    }
    
    public void setConfMode(String confMode)
    {
        this.confMode = confMode;
    }
    
    public String getRecordFlag()
    {
        return recordFlag;
    }
    
    public void setRecordFlag(String recordFlag)
    {
        this.recordFlag = recordFlag;
    }
    
    public String getConfName()
    {
        return confName;
    }
    
    public void setConfName(String confName)
    {
        this.confName = confName;
    }
    
    public String getSrtpMode()
    {
        return srtpMode;
    }
    
    public void setSrtpMode(String srtpMode)
    {
        this.srtpMode = srtpMode;
    }
    
    public int getAttidentity()
    {
        return attidentity;
    }
    
    public void setAttidentity(int attidentity)
    {
        this.attidentity = attidentity;
    }
    
    public String getKeeper()
    {
        return keeper;
    }
    
    public void setKeeper(String keeper)
    {
        this.keeper = keeper;
    }
    
    public String getGuestUrl()
    {
        return guestUrl;
    }
    
    public void setGuestUrl(String guestUrl)
    {
        this.guestUrl = guestUrl;
    }
    
    public String getChairmanUrl()
    {
        return chairmanUrl;
    }
    
    public void setChairmanUrl(String chairmanUrl)
    {
        this.chairmanUrl = chairmanUrl;
    }
    
}
