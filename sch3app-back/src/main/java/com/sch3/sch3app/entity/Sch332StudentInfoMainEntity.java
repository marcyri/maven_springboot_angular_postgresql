package com.sch3.sch3app.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "sch3_32_student_info_main", schema = "public", catalog = "nvl_sch3")
@IdClass(Sch332StudentInfoMainEntityPK.class)
public class Sch332StudentInfoMainEntity {
    private int studentId;
    private int schoolId;
    private int studentAddressId;
    private Date created;
    private int createdBy;
    private Date modified;
    private Integer modifiedBy;
    private Sch302StudentEntity sch302StudentByStudentId;
    private Sch301SchoolEntity sch301SchoolBySchoolId;
    private Sch304StudentAddressEntity sch304StudentAddressByStudentAddressId;

    @Id
    @Column(name = "student_id", nullable = false)
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Id
    @Column(name = "school_id", nullable = false)
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    @Id
    @Column(name = "student_address_id", nullable = false)
    public int getStudentAddressId() {
        return studentAddressId;
    }

    public void setStudentAddressId(int studentAddressId) {
        this.studentAddressId = studentAddressId;
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
        Sch332StudentInfoMainEntity that = (Sch332StudentInfoMainEntity) o;
        return studentId == that.studentId &&
                schoolId == that.schoolId &&
                studentAddressId == that.studentAddressId &&
                createdBy == that.createdBy &&
                Objects.equals(created, that.created) &&
                Objects.equals(modified, that.modified) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId,
                schoolId, studentAddressId,
                created, createdBy, modified, modifiedBy);
    }

    @ManyToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id", nullable = false, insertable=false, updatable=false)
    public Sch302StudentEntity getSch302StudentByStudentId() {
        return sch302StudentByStudentId;
    }

    public void setSch302StudentByStudentId(Sch302StudentEntity sch302StudentByStudentId) {
        this.sch302StudentByStudentId = sch302StudentByStudentId;
    }

    @ManyToOne
    @JoinColumn(name = "school_id", referencedColumnName = "school_id", nullable = false, insertable=false, updatable=false)
    public Sch301SchoolEntity getSch301SchoolBySchoolId() {
        return sch301SchoolBySchoolId;
    }

    public void setSch301SchoolBySchoolId(Sch301SchoolEntity sch301SchoolBySchoolId) {
        this.sch301SchoolBySchoolId = sch301SchoolBySchoolId;
    }

    @ManyToOne
    @JoinColumn(name = "student_address_id", referencedColumnName = "student_address_id", nullable = false, insertable=false, updatable=false)
    public Sch304StudentAddressEntity getSch304StudentAddressByStudentAddressId() {
        return sch304StudentAddressByStudentAddressId;
    }

    public void setSch304StudentAddressByStudentAddressId(Sch304StudentAddressEntity sch304StudentAddressByStudentAddressId) {
        this.sch304StudentAddressByStudentAddressId = sch304StudentAddressByStudentAddressId;
    }
}
