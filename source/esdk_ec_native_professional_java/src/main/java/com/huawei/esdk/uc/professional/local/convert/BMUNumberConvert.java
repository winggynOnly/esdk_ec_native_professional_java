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
package com.huawei.esdk.uc.professional.local.convert;

import com.huawei.esdk.uc.professional.local.bean.BindInfo;
import com.huawei.esdk.uc.professional.local.bean.NumberInfo;
import com.huawei.esdk.uc.professional.local.bean.south.Account;
import com.huawei.esdk.uc.professional.local.bean.south.AccountBind;
import com.huawei.esdk.uc.professional.local.bean.south.Sip;
import com.huawei.esdk.uc.professional.local.bean.south.SipAccount;
import com.huawei.esdk.uc.professional.local.bean.south.SipAuth;
import com.huawei.esdk.uc.professional.local.constant.UCConstant;
import com.huawei.esdk.uc.professional.local.utils.PropertiesUtils;
import com.huawei.esdk.uc.professional.local.utils.StringUtils;

public class BMUNumberConvert
{
    /** 
       * NumberInfo 转 Sip
       * @author wangxiaobo/wWX233376
       * @param numberInfo
       * @return
       * @see [类、类#方法、类#成员]
       */
    public Sip getSipByNumberInfo(NumberInfo numberInfo)
    {
        Sip sip = new Sip();
        sip.setUserId(UCConstant.USERID);
        
        SipAuth sipAuth = new SipAuth();
        
        if (StringUtils.isEmpty(numberInfo.getType()))
        {
            numberInfo.setType("0");
        }
        
        sipAuth.setType(numberInfo.getType());
        
        SipAccount sipAccount = new SipAccount();
        
        if (StringUtils.isEmpty(numberInfo.getGwIp()))
        {
            numberInfo.setGwIp(PropertiesUtils.getValue("gwIp"));
        }
        
        sipAccount.setGwIp(numberInfo.getGwIp());
        
        // 填写默认值
        sipAccount.setSubPbx("0");
        
        if (StringUtils.isEmpty(numberInfo.getJoint()))
        {
            numberInfo.setJoint("0");
        }
        
        sipAccount.setJoint(numberInfo.getJoint());
        
        //UC2.3.1 普通终端 0 <-> 1 硬终端 UC2.0
        //UC2.3.1   UC设备 2 <-> 0 软终端 UC2.0
        if (numberInfo.getTerminalType() == 0)
        {
            sipAccount.setUeType("2");
        }
        else if (numberInfo.getTerminalType() == 1)
        {
            sipAccount.setUeType("0");
        }
        sipAccount.setSipUe(numberInfo.getCorpInterNumber());
        sipAccount.setNumber(numberInfo.getCorpInterNumber());
        sipAccount.setLongNum(numberInfo.getPublicNumber());
        
        if (StringUtils.isEmpty(numberInfo.getRightLevel()))
        {
            numberInfo.setRightLevel("0");
        }
        
        sipAccount.setRightLevel(numberInfo.getRightLevel());
        
        if (StringUtils.isEmpty(numberInfo.getAddPrefix()))
        {
            numberInfo.setAddPrefix("0");
        }
        
        sipAccount.setAddPrefix(numberInfo.getAddPrefix());
        sipAccount.setSipAuth(sipAuth);
        sip.setSip(sipAccount);
        
        return sip;
    }
    
    public AccountBind getAccountBind(BindInfo bindInfo)
    {
        AccountBind accountBind = new AccountBind();
        accountBind.setUserId(UCConstant.USERID);
        Account account = new Account();
        
        account.setAccountId(bindInfo.getUcAccount());
        account.setBindNum(bindInfo.getCorpInterNumber());
        accountBind.setAccount(account);
        
        return accountBind;
    }
}
