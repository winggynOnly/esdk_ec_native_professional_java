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
package com.huawei.esdk.uc.professional.local.serviceImpl;

import com.huawei.esdk.uc.professional.local.bean.RestResponse;
import com.huawei.esdk.uc.professional.local.bean.south.LogAuditInfoList;
import com.huawei.esdk.uc.professional.local.bean.south.QueryLogAuditRequest;
import com.huawei.esdk.uc.professional.local.bean.south.QueryLogAuditResponse;
import com.huawei.esdk.uc.professional.local.resource.LogAuditResource;
import com.huawei.esdk.uc.professional.local.service.LogAuditServiceEx;

public class LogAuditServiceExImpl implements LogAuditServiceEx
{
    private LogAuditResource logAuditResource = new LogAuditResource();
    
    private static LogAuditServiceExImpl instance = null;
    
    public static synchronized LogAuditServiceExImpl getInstance()
    {
        if (null == instance)
        {
            instance = new LogAuditServiceExImpl();
        }
        return instance;
    }
    
    @Override
    public RestResponse<LogAuditInfoList> queryLogAudit(QueryLogAuditRequest request)
    {
        RestResponse<LogAuditInfoList> result = new RestResponse<LogAuditInfoList>();
        QueryLogAuditResponse res = logAuditResource.queryLogAudit(request);
        result.setResult(res.getLogAuditInfoList());
        result.setResultCode(res.getResultCode());
        result.setResultContext(res.getResultContext());
        return result;
    }
}
