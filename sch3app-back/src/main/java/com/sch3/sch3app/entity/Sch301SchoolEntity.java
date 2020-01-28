package com.sch3.sch3app.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "sch3_01_school", schema = "public", catalog = "nvl_sch3")
public class Sch301SchoolEntity {
    private int schoolId;
    private String schoolName;
    private String schoolDistrict;
    private String schoolAddress;
    private Date created;
    private int createdBy;
    private Date modified;
    private Integer modifiedBy;
    private Collection<Sch332StudentInfoMainEntity> sch332StudentInfoMainsBySchoolId;

    @Id
    @Column(name = "school_id", nullable = false)
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    @Basic
    @Column(name = "school_name", nullable = false, length = 255)
    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Basic
    @Column(name = "school_district", nullable = false, length = 255)
    public String getSchoolDistrict() {
        return schoolDistrict;
    }

    public void setSchoolDistrict(String schoolDistrict) {
        this.schoolDistrict = schoolDistrict;
    }

    @Basic
    @Column(name = "school_address", nullable = false, length = 255)
    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
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
        Sch301SchoolEntity that = (Sch301SchoolEntity) o;
        return schoolId == that.schoolId &&
                createdBy == that.createdBy &&
                Objects.equals(schoolName, that.schoolName) &&
                Objects.equals(schoolDistrict, that.schoolDistrict) &&
                Objects.equals(schoolAddress, that.schoolAddress) &&
                Objects.equals(created, that.created) &&
                Objects.equals(modified, that.modified) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schoolId, schoolName, schoolDistrict, schoolAddress, created, createdBy, modified, modifiedBy);
    }

    @OneToMany(mappedBy = "sch301SchoolBySchoolId")
    public Collection<Sch332StudentInfoMainEntity> getSch332StudentInfoMainsBySchoolId() {
        return sch332StudentInfoMainsBySchoolId;
    }

    public void setSch332StudentInfoMainsBySchoolId(Collection<Sch332StudentInfoMainEntity> sch332StudentInfoMainsBySchoolId) {
        this.sch332StudentInfoMainsBySchoolId = sch332StudentInfoMainsBySchoolId;
    }
}
