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

/**
 * 账号信息
 *
 */
public class Account
{
    /**
     * 账号
     */
    private String accountId;
    
    /**
     * 账号类型
     */
    private String accountType;
    
    /**
     * 登录名
     */
    private String loginName;
    
    /**
     * 登录密码
     */
    private String password;
    
    /**
     * 用户姓名
     */
    private String name;
    
    /**
     * 用户性别
     */
    private String sex;
    
    /**
     * 家庭电话
     */
    private String homePhone;
    
    /**
     * 手机号码
     */
    private String cellPhone;
    
    /**
     * 办公电话
     */
    private String officePhone;
    
    /**
     * 短号
     */
    private String shortPhone;
    
    /**
     * 其它电话
     */
    private String otherPhone;
    
    /**
     * 传真号码
     */
    private String fax;
    
    /**
     * 电子邮箱
     */
    private String email;
    
    /**
     * 联系地址
     */
    private String addr;
    
    /**
     * 职务
     */
    private String title;
    
    /**
     * UC账号归属部门ID
     */
    private String departmentId;
    
    /**
     * UC账号级别ID
     */
    private String userLevel;
    
    /**
     * UC账号角色ID
     */
    private String roleId;
    
    /**
     * 旧密码
     */
    private String oldPassword;
    
    /**
     * 新密码
     */
    private String newPassword;
    
    /**
     * UC帐号绑定的SIP号码
     */
    private String bindNum;
    
    //EC3.0 new add
    private String staffNum;
    
    private String otherphone2;
    
    private String userState;
    
    private String notesMail;
    
    private String zip;
    
    private String birthday;
    
    private String des;
    
    private String website;
    
    private String qPinyin;
    
    private String jPinyin;
    
    public String getAccountType()
    {
        return accountType;
    }
    
    public void setAccountType(String accountType)
    {
        this.accountType = accountType;
    }
    
    public String getLoginName()
    {
        return loginName;
    }
    
    public void setLoginName(String loginName)
    {
        this.loginName = loginName;
    }
    
    public String getPassword()
    {
        return password;
    }
    
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getSex()
    {
        return sex;
    }
    
    public void setSex(String sex)
    {
        this.sex = sex;
    }
    
    public String getFax()
    {
        return fax;
    }
    
    public void setFax(String fax)
    {
        this.fax = fax;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getAddr()
    {
        return addr;
    }
    
    public void setAddr(String addr)
    {
        this.addr = addr;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String title)
    {
        this.title = title;
    }
    
    public String getDepartmentId()
    {
        return departmentId;
    }
    
    public void setDepartmentId(String departmentId)
    {
        this.departmentId = departmentId;
    }
    
    public String getUserLevel()
    {
        return userLevel;
    }
    
    public void setUserLevel(String userLevel)
    {
        this.userLevel = userLevel;
    }
    
    public String getRoleId()
    {
        return roleId;
    }
    
    public void setRoleId(String roleId)
    {
        this.roleId = roleId;
    }
    
    public String getAccountId()
    {
        return accountId;
    }
    
    public void setAccountId(String accountId)
    {
        this.accountId = accountId;
    }
    
    public String getOldPassword()
    {
        return oldPassword;
    }
    
    public void setOldPassword(String oldPassword)
    {
        this.oldPassword = oldPassword;
    }
    
    public String getNewPassword()
    {
        return newPassword;
    }
    
    public void setNewPassword(String newPassword)
    {
        this.newPassword = newPassword;
    }
    
    public String getBindNum()
    {
        return bindNum;
    }
    
    public void setBindNum(String bindNum)
    {
        this.bindNum = bindNum;
    }
    
    public String getHomePhone()
    {
        return homePhone;
    }
    
    public void setHomePhone(String homePhone)
    {
        this.homePhone = homePhone;
    }
    
    public String getCellPhone()
    {
        return cellPhone;
    }
    
    public void setCellPhone(String cellPhone)
    {
        this.cellPhone = cellPhone;
    }
    
    public String getOfficePhone()
    {
        return officePhone;
    }
    
    public void setOfficePhone(String officePhone)
    {
        this.officePhone = officePhone;
    }
    
    public String getShortPhone()
    {
        return shortPhone;
    }
    
    public void setShortPhone(String shortPhone)
    {
        this.shortPhone = shortPhone;
    }
    
    public String getOtherPhone()
    {
        return otherPhone;
    }
    
    public void setOtherPhone(String otherPhone)
    {
        this.otherPhone = otherPhone;
    }
    
    public String getStaffNum()
    {
        return staffNum;
    }
    
    public void setStaffNum(String staffNum)
    {
        this.staffNum = staffNum;
    }
    
    public String getOtherphone2()
    {
        return otherphone2;
    }
    
    public void setOtherphone2(String otherphone2)
    {
        this.otherphone2 = otherphone2;
    }
    
    public String getUserState()
    {
        return userState;
    }
    
    public void setUserState(String userState)
    {
        this.userState = userState;
    }
    
    public String getNotesMail()
    {
        return notesMail;
    }
    
    public void setNotesMail(String notesMail)
    {
        this.notesMail = notesMail;
    }
    
    public String getZip()
    {
        return zip;
    }
    
    public void setZip(String zip)
    {
        this.zip = zip;
    }
    
    public String getBirthday()
    {
        return birthday;
    }
    
    public void setBirthday(String birthday)
    {
        this.birthday = birthday;
    }
    
    public String getDes()
    {
        return des;
    }
    
    public void setDes(String des)
    {
        this.des = des;
    }
    
    public String getWebsite()
    {
        return website;
    }
    
    public void setWebsite(String website)
    {
        this.website = website;
    }
    
    public String getqPinyin()
    {
        return qPinyin;
    }
    
    public void setqPinyin(String qPinyin)
    {
        this.qPinyin = qPinyin;
    }
    
    public String getjPinyin()
    {
        return jPinyin;
    }
    
    public void setjPinyin(String jPinyin)
    {
        this.jPinyin = jPinyin;
    }
    
}
