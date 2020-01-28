package com.sch3.sch3app.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "sch3_06_student_info_certificate", schema = "public", catalog = "nvl_sch3")
public class Sch306StudentInfoCertificateEntity {
    private int studentInfoCertificateId;
    private String certificateSerial;
    private String certificateNumber;
    private String certificateIssuingAuthorityCode;
    private String certificateIssuingAuthority;
    private Date certificateDateIssuing;
    private Date created;
    private int createdBy;
    private Date modified;
    private Integer modifiedBy;
    private Collection<Sch333StudentInfoSecondaryEntity> sch333StudentInfoSecondariesByStudentInfoCertificateId;

    @Id
    @Column(name = "student_info_certificate_id", nullable = false)
    public int getStudentInfoCertificateId() {
        return studentInfoCertificateId;
    }

    public void setStudentInfoCertificateId(int studentInfoCertificateId) {
        this.studentInfoCertificateId = studentInfoCertificateId;
    }

    @Basic
    @Column(name = "certificate_serial", nullable = false, length = 10)
    public String getCertificateSerial() {
        return certificateSerial;
    }

    public void setCertificateSerial(String certificateSerial) {
        this.certificateSerial = certificateSerial;
    }

    @Basic
    @Column(name = "certificate_number", nullable = false, length = 10)
    public String getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(String certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    @Basic
    @Column(name = "certificate_issuing_authority_code", nullable = false, length = 10)
    public String getCertificateIssuingAuthorityCode() {
        return certificateIssuingAuthorityCode;
    }

    public void setCertificateIssuingAuthorityCode(String certificateIssuingAuthorityCode) {
        this.certificateIssuingAuthorityCode = certificateIssuingAuthorityCode;
    }

    @Basic
    @Column(name = "certificate_issuing_authority", nullable = false, length = 255)
    public String getCertificateIssuingAuthority() {
        return certificateIssuingAuthority;
    }

    public void setCertificateIssuingAuthority(String certificateIssuingAuthority) {
        this.certificateIssuingAuthority = certificateIssuingAuthority;
    }

    @Basic
    @Column(name = "certificate_date_issuing", nullable = true)
    public Date getCertificateDateIssuing() {
        return certificateDateIssuing;
    }

    public void setCertificateDateIssuing(Date certificateDateIssuing) {
        this.certificateDateIssuing = certificateDateIssuing;
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
        Sch306StudentInfoCertificateEntity that = (Sch306StudentInfoCertificateEntity) o;
        return studentInfoCertificateId == that.studentInfoCertificateId &&
                createdBy == that.createdBy &&
                Objects.equals(certificateSerial, that.certificateSerial) &&
                Objects.equals(certificateNumber, that.certificateNumber) &&
                Objects.equals(certificateIssuingAuthorityCode, that.certificateIssuingAuthorityCode) &&
                Objects.equals(certificateIssuingAuthority, that.certificateIssuingAuthority) &&
                Objects.equals(certificateDateIssuing, that.certificateDateIssuing) &&
                Objects.equals(created, that.created) &&
                Objects.equals(modified, that.modified) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentInfoCertificateId, certificateSerial, certificateNumber, certificateIssuingAuthorityCode, certificateIssuingAuthority, certificateDateIssuing, created, createdBy, modified, modifiedBy);
    }

    @OneToMany(mappedBy = "sch306StudentInfoCertificateByStudentInfoCertificateId")
    public Collection<Sch333StudentInfoSecondaryEntity> getSch333StudentInfoSecondariesByStudentInfoCertificateId() {
        return sch333StudentInfoSecondariesByStudentInfoCertificateId;
    }

    public void setSch333StudentInfoSecondariesByStudentInfoCertificateId(Collection<Sch333StudentInfoSecondaryEntity> sch333StudentInfoSecondariesByStudentInfoCertificateId) {
        this.sch333StudentInfoSecondariesByStudentInfoCertificateId = sch333StudentInfoSecondariesByStudentInfoCertificateId;
    }
}
