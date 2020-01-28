package com.sch3.sch3app.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "sch3_34_student_info_third", schema = "public", catalog = "nvl_sch3")
public class Sch334StudentInfoThirdEntity {
    private int studentId;
    private Date created;
    private int createdBy;
    private Date modified;
    private Integer modifiedBy;
    private Sch302StudentEntity sch302StudentByStudentId;
    private Sch308StudentInfoSpecialEntity sch308StudentInfoSpecialByStudentInfoSpecialId;

    @Id
    @Column(name = "student_id", nullable = false)
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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
        Sch334StudentInfoThirdEntity that = (Sch334StudentInfoThirdEntity) o;
        return studentId == that.studentId &&
                createdBy == that.createdBy &&
                Objects.equals(created, that.created) &&
                Objects.equals(modified, that.modified) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, created, createdBy, modified, modifiedBy);
    }

    @OneToOne
    @JoinColumn(name = "student_id", referencedColumnName = "student_id", nullable = false)
    public Sch302StudentEntity getSch302StudentByStudentId() {
        return sch302StudentByStudentId;
    }

    public void setSch302StudentByStudentId(Sch302StudentEntity sch302StudentByStudentId) {
        this.sch302StudentByStudentId = sch302StudentByStudentId;
    }

    @ManyToOne
    @JoinColumn(name = "student_info_special_id", referencedColumnName = "student_info_special_id")
    public Sch308StudentInfoSpecialEntity getSch308StudentInfoSpecialByStudentInfoSpecialId() {
        return sch308StudentInfoSpecialByStudentInfoSpecialId;
    }

    public void setSch308StudentInfoSpecialByStudentInfoSpecialId(Sch308StudentInfoSpecialEntity sch308StudentInfoSpecialByStudentInfoSpecialId) {
        this.sch308StudentInfoSpecialByStudentInfoSpecialId = sch308StudentInfoSpecialByStudentInfoSpecialId;
    }
}
