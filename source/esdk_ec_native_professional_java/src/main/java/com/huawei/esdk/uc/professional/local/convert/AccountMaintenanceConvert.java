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

import com.huawei.esdk.uc.professional.local.bean.AccountInfo;
import com.huawei.esdk.uc.professional.local.bean.DeptKeyInfo;
import com.huawei.esdk.uc.professional.local.bean.south.Account;
import com.huawei.esdk.uc.professional.local.bean.south.DepartmentRequest;
import com.huawei.esdk.uc.professional.local.constant.UCConstant;
import com.huawei.esdk.uc.professional.local.utils.StringUtils;

public class AccountMaintenanceConvert
{
    /** 
     * Bean Native转Rest 
     * @author wangxiaobo/wWX233376
     * @param deptInfo
     * @return DepartmentRequest
     * @see com.huawei.esdk.uc.professional.local.convert.AccountMaintenanceConvert
     */
    public DepartmentRequest addDeptNative2Rest(DeptKeyInfo deptInfo)
    {
        DepartmentRequest departmentRequest = new DepartmentRequest();
        departmentRequest.setUserId(UCConstant.USERID);
        
        departmentRequest.setDepartmentId(deptInfo.getDeptId());
        departmentRequest.setParentId(deptInfo.getParentDeptId());
        departmentRequest.setDepartmentName(deptInfo.getDeptName());
        
        return departmentRequest;
    }
    
    /**
     * UC2.0版本账号信息转换为EC3.0账号信息
     * @param accountInfo
     * @return Account
     */
    public Account convertAccountInfo2Account(AccountInfo accountInfo)
    {
        Account account = new Account();
        //登录名称使用uc账号
        account.setLoginName(accountInfo.getUcAccount());
        
        //账号类型统一填写2-UC账号
        if (StringUtils.isEmpty(accountInfo.getAccountType()))
        {
            accountInfo.setAccountType("2");
        }
        account.setAccountType(accountInfo.getAccountType());
        //        account.setAccountId(accountInfo.getAccountId());
        account.setName(accountInfo.getName());
        account.setStaffNum(accountInfo.getStaffNo());
        account.setSex(accountInfo.getGender());
        account.setHomePhone(accountInfo.getHomePhone());
        account.setCellPhone(accountInfo.getMobilePhone());
        account.setOfficePhone(accountInfo.getOfficePhone());
        account.setShortPhone(accountInfo.getShortPhone());
        account.setOtherPhone(accountInfo.getOtherPhone());
        account.setOtherphone2(accountInfo.getOtherPhone2());
        account.setFax(accountInfo.getFax());
        account.setEmail(accountInfo.getEmail());
        account.setAddr(accountInfo.getAddress());
        account.setTitle(accountInfo.getTitle());
        account.setDepartmentId(accountInfo.getDeptId());
        if (StringUtils.isEmpty(accountInfo.getLevel()))
        {
            accountInfo.setLevel("1");
        }
        account.setUserLevel(accountInfo.getLevel());
        if (StringUtils.isEmpty(accountInfo.getRoleId()))
        {
            accountInfo.setRoleId("1");
        }
        account.setRoleId(accountInfo.getRoleId());
        
        //EC3.0新增
        //显示状态 0 正常 4 异常
        if (StringUtils.isEmpty(accountInfo.getUserstate()))
        {
            accountInfo.setUserstate("0");
        }
        account.setUserState(accountInfo.getUserstate());
        account.setNotesMail(accountInfo.getNotesmail());
        account.setZip(accountInfo.getZipcode());
        account.setBirthday(accountInfo.getBirthday());
        account.setDes(accountInfo.getDes());
        account.setWebsite(accountInfo.getWebsite());
        
        account.setAccountId(accountInfo.getAccountId());
        
        account.setqPinyin(accountInfo.getPinyin());
        account.setjPinyin(accountInfo.getSimplePinyin());
        
        return account;
    }
}
