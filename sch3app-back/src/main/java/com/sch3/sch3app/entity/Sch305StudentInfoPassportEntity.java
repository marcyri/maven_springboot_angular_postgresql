package com.sch3.sch3app.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "sch3_05_student_info_passport", schema = "public", catalog = "nvl_sch3")
public class Sch305StudentInfoPassportEntity {
    private int studentInfoPassportId;
    private String vatid;
    private String passportSerial;
    private String passportNumber;
    private String passportIssuingAuthorityCode;
    private String passportIssuingAuthority;
    private Date passportDateIssuing;
    private Date created;
    private int createdBy;
    private Date modified;
    private Integer modifiedBy;
    private Collection<Sch333StudentInfoSecondaryEntity> sch333StudentInfoSecondariesByStudentInfoPassportId;

    @Id
    @Column(name = "student_info_passport_id", nullable = false)
    public int getStudentInfoPassportId() {
        return studentInfoPassportId;
    }

    public void setStudentInfoPassportId(int studentInfoPassportId) {
        this.studentInfoPassportId = studentInfoPassportId;
    }

    @Basic
    @Column(name = "vatid", nullable = true, length = 20)
    public String getVatid() {
        return vatid;
    }

    public void setVatid(String vatid) {
        this.vatid = vatid;
    }

    @Basic
    @Column(name = "passport_serial", nullable = false, length = 10)
    public String getPassportSerial() {
        return passportSerial;
    }

    public void setPassportSerial(String passportSerial) {
        this.passportSerial = passportSerial;
    }

    @Basic
    @Column(name = "passport_number", nullable = false, length = 10)
    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    @Basic
    @Column(name = "passport_issuing_authority_code", nullable = true, length = 10)
    public String getPassportIssuingAuthorityCode() {
        return passportIssuingAuthorityCode;
    }

    public void setPassportIssuingAuthorityCode(String passportIssuingAuthorityCode) {
        this.passportIssuingAuthorityCode = passportIssuingAuthorityCode;
    }

    @Basic
    @Column(name = "passport_issuing_authority", nullable = false, length = 255)
    public String getPassportIssuingAuthority() {
        return passportIssuingAuthority;
    }

    public void setPassportIssuingAuthority(String passportIssuingAuthority) {
        this.passportIssuingAuthority = passportIssuingAuthority;
    }

    @Basic
    @Column(name = "passport_date_issuing", nullable = true)
    public Date getPassportDateIssuing() {
        return passportDateIssuing;
    }

    public void setPassportDateIssuing(Date passportDateIssuing) {
        this.passportDateIssuing = passportDateIssuing;
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
        Sch305StudentInfoPassportEntity that = (Sch305StudentInfoPassportEntity) o;
        return studentInfoPassportId == that.studentInfoPassportId &&
                createdBy == that.createdBy &&
                Objects.equals(vatid, that.vatid) &&
                Objects.equals(passportSerial, that.passportSerial) &&
                Objects.equals(passportNumber, that.passportNumber) &&
                Objects.equals(passportIssuingAuthorityCode, that.passportIssuingAuthorityCode) &&
                Objects.equals(passportIssuingAuthority, that.passportIssuingAuthority) &&
                Objects.equals(passportDateIssuing, that.passportDateIssuing) &&
                Objects.equals(created, that.created) &&
                Objects.equals(modified, that.modified) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentInfoPassportId, vatid, passportSerial, passportNumber, passportIssuingAuthorityCode, passportIssuingAuthority, passportDateIssuing, created, createdBy, modified, modifiedBy);
    }

    @OneToMany(mappedBy = "sch305StudentInfoPassportByStudentInfoPasId")
    public Collection<Sch333StudentInfoSecondaryEntity> getSch333StudentInfoSecondariesByStudentInfoPassportId() {
        return sch333StudentInfoSecondariesByStudentInfoPassportId;
    }

    public void setSch333StudentInfoSecondariesByStudentInfoPassportId(Collection<Sch333StudentInfoSecondaryEntity> sch333StudentInfoSecondariesByStudentInfoPassportId) {
        this.sch333StudentInfoSecondariesByStudentInfoPassportId = sch333StudentInfoSecondariesByStudentInfoPassportId;
    }
}
