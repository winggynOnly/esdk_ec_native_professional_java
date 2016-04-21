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

import java.util.List;

import com.huawei.esdk.uc.professional.local.bean.RestResponse;
import com.huawei.esdk.uc.professional.local.bean.south.QueryUCListPresenceRequest;
import com.huawei.esdk.uc.professional.local.bean.south.QueryUCListPresenceResponse;
import com.huawei.esdk.uc.professional.local.bean.south.QueryUCListPresenceResultResponse;
import com.huawei.esdk.uc.professional.local.bean.south.UserState;
import com.huawei.esdk.uc.professional.local.resource.PresenceResource;
import com.huawei.esdk.uc.professional.local.service.PresenceServiceEx;

public class PresenceServiceExImpl implements PresenceServiceEx
{
    private PresenceResource presenceResource = new PresenceResource();
    
    private static PresenceServiceExImpl instance = null;
    
    public static synchronized PresenceServiceExImpl getInstance()
    {
        if (null == instance)
        {
            instance = new PresenceServiceExImpl();
        }
        return instance;
    }
    
    @Override
    public RestResponse<String> queryUCListPresenceAsyn(QueryUCListPresenceRequest queryUCListPresenceRequest)
    {
        RestResponse<String> result = new RestResponse<String>();
        QueryUCListPresenceResponse res = presenceResource.queryUCListPresenceAsyn(queryUCListPresenceRequest);
        result.setResult(res.getMsgId());
        result.setResultCode(res.getResultCode());
        result.setResultContext(res.getResultContext());
        return result;
    }
    
    //    @Override
    //    public RestResponse<String> queryUCPresenceAsyn(QueryUCPresenceRequest queryUCPresenceRequest)
    //    {
    //        RestResponse<String> result = new RestResponse<String>();
    //        QueryUCPresenceResponse res = presenceResource.queryUCPresenceAsyn(queryUCPresenceRequest);
    //        result.setResult(res.getMsgId());
    //        result.setResultCode(res.getResultCode());
    //        result.setResultContext(res.getResultContext());
    //        return result;
    //    }
    
    //    @Override
    //    public RestResponse<UserState> getQueryUCPresenceAsynResult(String msgId)
    //    {
    //        RestResponse<UserState> result = new RestResponse<UserState>();
    //        QueryUCPresenceResultResponse res = presenceResource.getQueryUCPresenceAsynResult(msgId);
    //        result.setResult(res.getUserStates());
    //        result.setResultCode(res.getResultCode());
    //        result.setResultContext(res.getResultContext());
    //        return result;
    //    }
    
    @Override
    public RestResponse<List<UserState>> getQueryUCListPresenceAsynResult(String msgId)
    {
        RestResponse<List<UserState>> result = new RestResponse<List<UserState>>();
        QueryUCListPresenceResultResponse res = presenceResource.getQueryUCListPresenceAsynResult(msgId);
        result.setResult(res.getUserStates());
        result.setResultCode(res.getResultCode());
        result.setResultContext(res.getResultContext());
        return result;
    }
    
}
