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
package com.huawei.esdk.uc.professional.local.utils;

public abstract class Encrypt
{
    public static String getEncryptPwd(String pwd)
        throws Exception
    {
        String transmissionMode = PropertiesUtils.getValue("sensitive.information.transmission.mode");
        String result = null;
        
        if (StringUtils.isEmpty(pwd))
        {
            return pwd;
        }
        
        if ("RSA2048".equalsIgnoreCase(transmissionMode))
        {
            result = Base64Utils.encode(RSA2048Utils.encode(pwd.getBytes("UTF-8")));
        }
        else if ("AES128_fixed".equalsIgnoreCase(transmissionMode))
        {
            result = Base64Utils.encode(AESCbc128Utils.encode(pwd.getBytes("UTF-8")));
        }
        else if ("Plaintext".equalsIgnoreCase(transmissionMode))
        {
            result = pwd;
        }
        else
        {
            result = Base64Utils.encode(AES128Utils.encode(pwd.getBytes("UTF-8")));
        }
        
        return result;
    }
    
    public static String getDecryptPwd(String pwd) throws Exception
    {
        String transmissionMode = PropertiesUtils.getValue("sensitive.information.transmission.mode");
        
        if (StringUtils.isEmpty(pwd))
        {
            return pwd;
        }
        
        if ("AES128_consulted".equalsIgnoreCase(transmissionMode))
        {
            return new String(AES128Utils.decode
                (Base64Utils.getFromBASE64(pwd)), "UTF-8");
        }
        else if ("AES128_fixed".equalsIgnoreCase(transmissionMode))
        {
            return new String(AESCbc128Utils.decode
                (Base64Utils.getFromBASE64(pwd)), "UTF-8");
        }
        else
        {
            return pwd;
        }
    }
}
