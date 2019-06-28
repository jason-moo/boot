package com.boot.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "employeeInfo")
public class EmployeeInfoDTO {

    private String name;

    private String code;

    private String job;

    private String type;

    private String jobSeq;

    private String jobLevel;

    private String nation;

    private String sex;

    private String culture;

    private String face;

    private String birthDate;

    private String idNumber;

    private String nativePlace;

    private String residenceProperties;

    private String employmentSituation;

    private String pkCorp;

    private String workTime;

    private String joinTime;

    private String technicalTitle;

    private String cardNumber;

    private String mealCard;

    private String mealAllowance;

    private String payGrade;

    private String oaNumber;

    private String mobile;

    private String landline;

    private String email;

    private String qq;

    private String wechat;

    private String pkDept;

    private String deptName;

    private String pkArea;

    private String areaName;

    private String corpName;

    private String leaveTime;

    public String getPkOmJob() {
        return pkOmJob;
    }

    public void setPkOmJob(String pkOmJob) {
        this.pkOmJob = pkOmJob;
    }

    private String pkOmJob;

    public String getPkPsndoc() {
        return pkPsndoc;
    }

    public void setPkPsndoc(String pkPsndoc) {
        this.pkPsndoc = pkPsndoc;
    }

    private String pkPsndoc;

    public String getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getJobSeq() {
        return jobSeq;
    }

    public void setJobSeq(String jobSeq) {
        this.jobSeq = jobSeq == null ? null : jobSeq.trim();
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel == null ? null : jobLevel.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getCulture() {
        return culture;
    }

    public void setCulture(String culture) {
        this.culture = culture == null ? null : culture.trim();
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face == null ? null : face.trim();
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate == null ? null : birthDate.trim();
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace == null ? null : nativePlace.trim();
    }

    public String getResidenceProperties() {
        return residenceProperties;
    }

    public void setResidenceProperties(String residenceProperties) {
        this.residenceProperties = residenceProperties == null ? null : residenceProperties.trim();
    }

    public String getEmploymentSituation() {
        return employmentSituation;
    }

    public void setEmploymentSituation(String employmentSituation) {
        this.employmentSituation = employmentSituation == null ? null : employmentSituation.trim();
    }

    public String getPkCorp() {
        return pkCorp;
    }

    public void setPkCorp(String pkCorp) {
        this.pkCorp = pkCorp == null ? null : pkCorp.trim();
    }

    public String getWorkTime() {
        return workTime;
    }

    public void setWorkTime(String workTime) {
        this.workTime = workTime == null ? null : workTime.trim();
    }

    public String getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime == null ? null : joinTime.trim();
    }

    public String getTechnicalTitle() {
        return technicalTitle;
    }

    public void setTechnicalTitle(String technicalTitle) {
        this.technicalTitle = technicalTitle == null ? null : technicalTitle.trim();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber == null ? null : cardNumber.trim();
    }

    public String getMealCard() {
        return mealCard;
    }

    public void setMealCard(String mealCard) {
        this.mealCard = mealCard == null ? null : mealCard.trim();
    }

    public String getMealAllowance() {
        return mealAllowance;
    }

    public void setMealAllowance(String mealAllowance) {
        this.mealAllowance = mealAllowance == null ? null : mealAllowance.trim();
    }

    public String getPayGrade() {
        return payGrade;
    }

    public void setPayGrade(String payGrade) {
        this.payGrade = payGrade == null ? null : payGrade.trim();
    }

    public String getOaNumber() {
        return oaNumber;
    }

    public void setOaNumber(String oaNumber) {
        this.oaNumber = oaNumber == null ? null : oaNumber.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline == null ? null : landline.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat == null ? null : wechat.trim();
    }

    public String getPkDept() {
        return pkDept;
    }

    public void setPkDept(String pkDept) {
        this.pkDept = pkDept == null ? null : pkDept.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getPkArea() {
        return pkArea;
    }

    public void setPkArea(String pkArea) {
        this.pkArea = pkArea == null ? null : pkArea.trim();
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName == null ? null : corpName.trim();
    }
}
