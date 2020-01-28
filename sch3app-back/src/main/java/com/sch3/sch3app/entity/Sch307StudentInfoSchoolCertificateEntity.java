package com.sch3.sch3app.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "sch3_07_student_info_school_certificate", schema = "public", catalog = "nvl_sch3")
public class Sch307StudentInfoSchoolCertificateEntity {
    private int studentInfoSchoolCertificateId;
    private String infoSchoolSerial;
    private String infoSchoolNumber;
    private Date infoSchoolDateIssuing;
    private Date created;
    private Integer createdBy;
    private Date modified;
    private Integer modifiedBy;
    private Collection<Sch333StudentInfoSecondaryEntity> sch333StudentInfoSecondariesByStudentInfoSchoolCertificateId;

    @Id
    @Column(name = "student_info_school_certificate_id", nullable = false)
    public int getStudentInfoSchoolCertificateId() {
        return studentInfoSchoolCertificateId;
    }

    public void setStudentInfoSchoolCertificateId(int studentInfoSchoolCertificateId) {
        this.studentInfoSchoolCertificateId = studentInfoSchoolCertificateId;
    }

    @Basic
    @Column(name = "info_school_serial", nullable = false, length = 10)
    public String getInfoSchoolSerial() {
        return infoSchoolSerial;
    }

    public void setInfoSchoolSerial(String infoSchoolSerial) {
        this.infoSchoolSerial = infoSchoolSerial;
    }

    @Basic
    @Column(name = "info_school_number", nullable = false, length = 10)
    public String getInfoSchoolNumber() {
        return infoSchoolNumber;
    }

    public void setInfoSchoolNumber(String infoSchoolNumber) {
        this.infoSchoolNumber = infoSchoolNumber;
    }

    @Basic
    @Column(name = "info_school_date_issuing", nullable = false)
    public Date getInfoSchoolDateIssuing() {
        return infoSchoolDateIssuing;
    }

    public void setInfoSchoolDateIssuing(Date infoSchoolDateIssuing) {
        this.infoSchoolDateIssuing = infoSchoolDateIssuing;
    }

    @Basic
    @Column(name = "created", nullable = true)
    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Basic
    @Column(name = "created_by", nullable = true)
    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
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
        Sch307StudentInfoSchoolCertificateEntity that = (Sch307StudentInfoSchoolCertificateEntity) o;
        return studentInfoSchoolCertificateId == that.studentInfoSchoolCertificateId &&
                Objects.equals(infoSchoolSerial, that.infoSchoolSerial) &&
                Objects.equals(infoSchoolNumber, that.infoSchoolNumber) &&
                Objects.equals(infoSchoolDateIssuing, that.infoSchoolDateIssuing) &&
                Objects.equals(created, that.created) &&
                Objects.equals(createdBy, that.createdBy) &&
                Objects.equals(modified, that.modified) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentInfoSchoolCertificateId, infoSchoolSerial, infoSchoolNumber, infoSchoolDateIssuing, created, createdBy, modified, modifiedBy);
    }

    @OneToMany(mappedBy = "sch307StudentInfoSchoolCertificateByStudentInfoSchoolCertificateId")
    public Collection<Sch333StudentInfoSecondaryEntity> getSch333StudentInfoSecondariesByStudentInfoSchoolCertificateId() {
        return sch333StudentInfoSecondariesByStudentInfoSchoolCertificateId;
    }

    public void setSch333StudentInfoSecondariesByStudentInfoSchoolCertificateId(Collection<Sch333StudentInfoSecondaryEntity> sch333StudentInfoSecondariesByStudentInfoSchoolCertificateId) {
        this.sch333StudentInfoSecondariesByStudentInfoSchoolCertificateId = sch333StudentInfoSecondariesByStudentInfoSchoolCertificateId;
    }
}
