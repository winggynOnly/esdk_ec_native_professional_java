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

import java.util.ArrayList;
import java.util.List;

import com.huawei.esdk.uc.professional.local.bean.ContactNumberBase;
import com.huawei.esdk.uc.professional.local.bean.DepartmentInfo;
import com.huawei.esdk.uc.professional.local.bean.DeptInfoBase;
import com.huawei.esdk.uc.professional.local.bean.PageInfo;
import com.huawei.esdk.uc.professional.local.bean.QueryMode;
import com.huawei.esdk.uc.professional.local.bean.QueryResultList;
import com.huawei.esdk.uc.professional.local.bean.StaffInfo;
import com.huawei.esdk.uc.professional.local.bean.UCSDKResponse;
import com.huawei.esdk.uc.professional.local.bean.south.QueryEnterpriseRequest;
import com.huawei.esdk.uc.professional.local.bean.south.QueryEnterpriseResponse;
import com.huawei.esdk.uc.professional.local.bean.south.QueryPersonInfoResponse;
import com.huawei.esdk.uc.professional.local.constant.ResultCode;
import com.huawei.esdk.uc.professional.local.exception.ECException;

public class UserProfileCorpListConvert
{
    /*public QueryEnterpriseRequest queryDeptInfoNative2Rest(String departmentId, String pageCount, String pageNum)
        throws ECException
    {
        if (null == departmentId)
        {
            throw new ECException(ResultCode.SDK_PARAM_NOT_COMPLETE_ERRORCODE,
                ResultCode.SDK_PARAM_NOT_COMPLETE_ERRORDESC);
        }
        
        if (null == pageNum)
        {
            pageNum = "1";
        }
        
        if (null == pageCount)
        {
            pageCount = "5";
        }
        
        QueryEnterpriseRequest request = new QueryEnterpriseRequest();
        request.setDepartmentId(departmentId);
        request.setPageCount(pageCount);
        request.setPageNum(pageNum);
        
        return request;
    }
    
    public UCSDKResponse<DeptInfo> queryDeptInfoRest2Native(QueryEnterpriseResponse response)
    {
        if (null == response)
        {
            return null;
        }
        
        UCSDKResponse<DeptInfo> result = new UCSDKResponse<DeptInfo>();
        result.setResultCode(Integer.parseInt(response.getResultCode()));
        
        DeptInfo deptInfo = new DeptInfo();
        
        if (null != response.getEnterpriseList() && null != response.getEnterpriseList().getDepartments()
            && 0 < response.getEnterpriseList().getDepartments().size())
        {
            deptInfo.setDeptId(response.getEnterpriseList().getDeptId());
            deptInfo.setName(response.getEnterpriseList().getDepartments().get(0).getDeptName());
        }
        
        result.setResult(deptInfo);
        
        return result;
    }*/
    
    public QueryEnterpriseRequest getQueryEnterpriseRequest(String departmentId, String pageNum, String pageCount)
    {
        QueryEnterpriseRequest queryEnterpriseRequest = new QueryEnterpriseRequest();
        queryEnterpriseRequest.setDepartmentId(departmentId);
        queryEnterpriseRequest.setPageNum(pageNum);
        queryEnterpriseRequest.setPageCount(pageCount);//String.valueOf(Integer.MAX_VALUE)
        
        return queryEnterpriseRequest;
    }
    
    public QueryEnterpriseRequest queryDeptListInfoNative2Rest(String deptId, QueryMode queryMode)
        throws ECException
    {
        if (null == deptId || null == queryMode.getMode() || null == queryMode.getOffset()
            || null == queryMode.getPageNum() || null == queryMode.getPageSize())
        {
            throw new ECException(ResultCode.SDK_PARAM_NOT_COMPLETE_ERRORCODE,
                ResultCode.SDK_PARAM_NOT_COMPLETE_ERRORDESC);
        }
        
        QueryEnterpriseRequest request = new QueryEnterpriseRequest();
        request.setDepartmentId(deptId);
        request.setPageCount(String.valueOf(queryMode.getPageSize()));
        request.setPageNum(String.valueOf(queryMode.getPageNum()));
        
        return request;
    }
    
    public UCSDKResponse<QueryResultList<DeptInfoBase>> queryDeptListInfoRest2Native(QueryEnterpriseResponse response)
    {
        if (null == response)
        {
            return null;
        }
        
        UCSDKResponse<QueryResultList<DeptInfoBase>> result = new UCSDKResponse<QueryResultList<DeptInfoBase>>();
        result.setResultCode(Integer.parseInt(response.getResultCode()));
        
        QueryResultList<DeptInfoBase> queryResultList = new QueryResultList<DeptInfoBase>();
        
        if (null != response.getEnterpriseList() && null != response.getEnterpriseList().getDepartments()
            && 0 < response.getEnterpriseList().getDepartments().size())
        {
            PageInfo pageInfo = new PageInfo();
            pageInfo.setPageSize(Integer.parseInt(response.getEnterpriseList().getDeptSum()));
            queryResultList.setPageInfo(pageInfo);
            
            List<DeptInfoBase> resultInfos = new ArrayList<DeptInfoBase>();
            
            for (DepartmentInfo departmentInfo : response.getEnterpriseList().getDepartments())
            {
                DeptInfoBase deptInfoBase = new DeptInfoBase();
                deptInfoBase.setParentDeptId(response.getEnterpriseList().getDeptId());
                deptInfoBase.setDeptId(departmentInfo.getDeptId());
                deptInfoBase.setDeptName(departmentInfo.getDeptName());
                
                resultInfos.add(deptInfoBase);
            }
            
            queryResultList.setResultInfos(resultInfos);
        }
        
        result.setResult(queryResultList);
        
        return result;
    }
    
    public UCSDKResponse<StaffInfo> queryStaffInfoRest2Native(QueryPersonInfoResponse response)
    {
        if (null == response)
        {
            return null;
        }
        
        UCSDKResponse<StaffInfo> result = new UCSDKResponse<StaffInfo>();
        result.setResultCode(Integer.parseInt(response.getResultCode()));
        
        if (null != response.getPersonInfo())
        {
            StaffInfo staffInfo = new StaffInfo();
            staffInfo.setStaffId(response.getPersonInfo().getStaffId());
            staffInfo.setUcNumber(response.getPersonInfo().getStaffAccount());
            staffInfo.setStaffNumber(response.getPersonInfo().getStaffNO());
            staffInfo.setStaffName(response.getPersonInfo().getName());
            staffInfo.setZipcode(response.getPersonInfo().getZip());
            staffInfo.setAddress(response.getPersonInfo().getAddr());
            staffInfo.setSex(response.getPersonInfo().getSex());
            staffInfo.setDeptName(response.getPersonInfo().getCredit());
            staffInfo.setEmail(response.getPersonInfo().getEmail());
            staffInfo.setHomePhone(response.getPersonInfo().getHomePhone());
            
            List<ContactNumberBase> mobilePhone = new ArrayList<ContactNumberBase>();
            ContactNumberBase mobileContactNumberBase = new ContactNumberBase();
            mobileContactNumberBase.setNumber(response.getPersonInfo().getMobile());
            mobilePhone.add(mobileContactNumberBase);
            staffInfo.setMobilePhone(mobilePhone);
            
            staffInfo.setContactDesc(response.getPersonInfo().getUnderwrite());
            
            List<ContactNumberBase> officePhone = new ArrayList<ContactNumberBase>();
            ContactNumberBase officeContactNumberBase = new ContactNumberBase();
            officeContactNumberBase.setNumber(response.getPersonInfo().getOfficePhone());
            officePhone.add(officeContactNumberBase);
            staffInfo.setOfficePhone(officePhone);
            
            List<ContactNumberBase> otherPhone = new ArrayList<ContactNumberBase>();
            ContactNumberBase otherContactNumberBase = new ContactNumberBase();
            otherContactNumberBase.setNumber(response.getPersonInfo().getOtherPhone());
            otherPhone.add(otherContactNumberBase);
            staffInfo.setOtherPhone(otherPhone);
            
            List<ContactNumberBase> fax = new ArrayList<ContactNumberBase>();
            ContactNumberBase faxContactNumberBase = new ContactNumberBase();
            faxContactNumberBase.setNumber(response.getPersonInfo().getFax());
            fax.add(faxContactNumberBase);
            staffInfo.setFax(fax);
            
            List<String> voip = new ArrayList<String>();
            voip.add(response.getPersonInfo().getVoip());
            staffInfo.setVoip(voip);
            
            result.setResult(staffInfo);
        }
        
        return result;
    }
}
