package com.test.es.entity;

import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@Document(indexName = "employee")
public class EmployeeInfoSearchDTO {

    @Field(type = FieldType.Text)
    private String id;

    @Field(type = FieldType.Text)
    private String name;

    @Field(type = FieldType.Text)
    private String code;

    @Field(type = FieldType.Text)
    private String job;

    @Field(type = FieldType.Text)
    private String type;

    @Field(type = FieldType.Text)
    private String jobSeq;

    @Field(type = FieldType.Text)
    private String jobLevel;

    @Field(type = FieldType.Text)
    private String nation;

    @Field(type = FieldType.Text)
    private String sex;

    @Field(type = FieldType.Text)
    private String culture;

    @Field(type = FieldType.Text)
    private String face;

    @Field(type = FieldType.Text)
    private String birthDate;

    @Field(type = FieldType.Text)
    private String idNumber;

    @Field(type = FieldType.Text)
    private String nativePlace;

    @Field(type = FieldType.Text)
    private String residenceProperties;

    @Field(type = FieldType.Text)
    private String employmentSituation;

    @Field(type = FieldType.Text)
    private String pkCorp;

    @Field(type = FieldType.Text)
    private String workTime;

    @Field(type = FieldType.Text)
    private String joinTime;

    @Field(type = FieldType.Text)
    private String technicalTitle;

    @Field(type = FieldType.Text)
    private String cardNumber;

    @Field(type = FieldType.Text)
    private String mealCard;

    @Field(type = FieldType.Text)
    private String mealAllowance;

    @Field(type = FieldType.Text)
    private String payGrade;

    @Field(type = FieldType.Text)
    private String oaNumber;

    @Field(type = FieldType.Text)
    private String mobile;

    @Field(type = FieldType.Text)
    private String landline;

    @Field(type = FieldType.Text)
    private String email;

    @Field(type = FieldType.Text)
    private String qq;

    @Field(type = FieldType.Text)
    private String wechat;

    @Field(type = FieldType.Text)
    private String pkDept;

    @Field(type = FieldType.Text)
    private String deptName;

    @Field(type = FieldType.Text)
    private String pkArea;

    @Field(type = FieldType.Text)
    private String areaName;

    @Field(type = FieldType.Text)
    private String corpName;

    @Field(type = FieldType.Text)
    private String leaveTime;
}
