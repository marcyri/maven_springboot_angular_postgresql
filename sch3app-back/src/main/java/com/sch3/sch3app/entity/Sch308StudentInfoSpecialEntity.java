package com.sch3.sch3app.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "sch3_08_student_info_special", schema = "public", catalog = "nvl_sch3")
public class Sch308StudentInfoSpecialEntity {
    private int studentInfoSpecialId;
    private String questionnaireCode;
    private String notes;
    private String specialNeeds;
    private String areSanatoriumSpecialNeeds;
    private String customField1;
    private String customField2;
    private String customField3;
    private Date created;
    private int createdBy;
    private Date modified;
    private Integer modifiedBy;
    private Collection<Sch334StudentInfoThirdEntity> sch334StudentInfoThirdsByStudentInfoSpecialId;

    @Id
    @Column(name = "student_info_special_id", nullable = false)
    public int getStudentInfoSpecialId() {
        return studentInfoSpecialId;
    }

    public void setStudentInfoSpecialId(int studentInfoSpecialId) {
        this.studentInfoSpecialId = studentInfoSpecialId;
    }

    @Basic
    @Column(name = "questionnaire_code", nullable = true, length = 10)
    public String getQuestionnaireCode() {
        return questionnaireCode;
    }

    public void setQuestionnaireCode(String questionnaireCode) {
        this.questionnaireCode = questionnaireCode;
    }

    @Basic
    @Column(name = "notes", nullable = true, length = -1)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Basic
    @Column(name = "special_needs", nullable = true, length = 255)
    public String getSpecialNeeds() {
        return specialNeeds;
    }

    public void setSpecialNeeds(String specialNeeds) {
        this.specialNeeds = specialNeeds;
    }

    @Basic
    @Column(name = "are_sanatorium_special_needs", nullable = true, length = 255)
    public String getAreSanatoriumSpecialNeeds() {
        return areSanatoriumSpecialNeeds;
    }

    public void setAreSanatoriumSpecialNeeds(String areSanatoriumSpecialNeeds) {
        this.areSanatoriumSpecialNeeds = areSanatoriumSpecialNeeds;
    }

    @Basic
    @Column(name = "custom_field_1", nullable = true, length = 255)
    public String getCustomField1() {
        return customField1;
    }

    public void setCustomField1(String customField1) {
        this.customField1 = customField1;
    }

    @Basic
    @Column(name = "custom_field_2", nullable = true, length = 255)
    public String getCustomField2() {
        return customField2;
    }

    public void setCustomField2(String customField2) {
        this.customField2 = customField2;
    }

    @Basic
    @Column(name = "custom_field_3", nullable = true, length = 255)
    public String getCustomField3() {
        return customField3;
    }

    public void setCustomField3(String customField3) {
        this.customField3 = customField3;
    }

    @Basic
    @Column(name = "created", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Basic
    @Column(name = "created_by", nullable = false)
    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "modified", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    @Basic
    @Column(name = "modified_by", nullable = true)
    public Integer getModifiedBy() {
        return modifiedBy;
    }

    public void setModifiedBy(Integer modifiedBy) {
        this.modifiedBy = modifiedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sch308StudentInfoSpecialEntity that = (Sch308StudentInfoSpecialEntity) o;
        return studentInfoSpecialId == that.studentInfoSpecialId &&
                createdBy == that.createdBy &&
                Objects.equals(questionnaireCode, that.questionnaireCode) &&
                Objects.equals(notes, that.notes) &&
                Objects.equals(specialNeeds, that.specialNeeds) &&
                Objects.equals(areSanatoriumSpecialNeeds, that.areSanatoriumSpecialNeeds) &&
                Objects.equals(customField1, that.customField1) &&
                Objects.equals(customField2, that.customField2) &&
                Objects.equals(customField3, that.customField3) &&
                Objects.equals(created, that.created) &&
                Objects.equals(modified, that.modified) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentInfoSpecialId, questionnaireCode, notes, specialNeeds, areSanatoriumSpecialNeeds, customField1, customField2, customField3, created, createdBy, modified, modifiedBy);
    }

    @OneToMany(mappedBy = "sch308StudentInfoSpecialByStudentInfoSpecialId")
    public Collection<Sch334StudentInfoThirdEntity> getSch334StudentInfoThirdsByStudentInfoSpecialId() {
        return sch334StudentInfoThirdsByStudentInfoSpecialId;
    }

    public void setSch334StudentInfoThirdsByStudentInfoSpecialId(Collection<Sch334StudentInfoThirdEntity> sch334StudentInfoThirdsByStudentInfoSpecialId) {
        this.sch334StudentInfoThirdsByStudentInfoSpecialId = sch334StudentInfoThirdsByStudentInfoSpecialId;
    }
}
