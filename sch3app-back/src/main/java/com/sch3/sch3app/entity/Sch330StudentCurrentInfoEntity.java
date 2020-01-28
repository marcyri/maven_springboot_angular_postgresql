package com.sch3.sch3app.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "sch3_30_student_current_info", schema = "public", catalog = "nvl_sch3")
public class Sch330StudentCurrentInfoEntity {
    private int studentId;
    private int classYear;
    private String clazz;
    private int parallel;
    private String state;
    private String validation;
    private Date created;
    private int createdBy;
    private Date modified;
    private Integer modifiedBy;
    private Sch302StudentEntity sch302StudentByStudentId;
    private Sch303StudentPhotoEntity sch303StudentPhotoByStudentPhotoId;

    @Id
    @Column(name = "student_id", nullable = false)
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "class_year", nullable = false)
    public int getClassYear() {
        return classYear;
    }

    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }

    @Basic
    @Column(name = "class", nullable = false, length = 10)
    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Basic
    @Column(name = "parallel", nullable = false)
    public int getParallel() {
        return parallel;
    }

    public void setParallel(int parallel) {
        this.parallel = parallel;
    }

    @Basic
    @Column(name = "state", nullable = false)
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "validation", nullable = false)
    public String getValidation() {
        return validation;
    }

    public void setValidation(String validation) {
        this.validation = validation;
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
        Sch330StudentCurrentInfoEntity that = (Sch330StudentCurrentInfoEntity) o;
        return studentId == that.studentId &&
                classYear == that.classYear &&
                parallel == that.parallel &&
                createdBy == that.createdBy &&
                Objects.equals(clazz, that.clazz) &&
                Objects.equals(state, that.state) &&
                Objects.equals(validation, that.validation) &&
                Objects.equals(created, that.created) &&
                Objects.equals(modified, that.modified) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, classYear, clazz, parallel, state, validation, created, createdBy, modified, modifiedBy);
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
    @JoinColumn(name = "student_photo_id", referencedColumnName = "student_photo_id")
    public Sch303StudentPhotoEntity getSch303StudentPhotoByStudentPhotoId() {
        return sch303StudentPhotoByStudentPhotoId;
    }

    public void setSch303StudentPhotoByStudentPhotoId(Sch303StudentPhotoEntity sch303StudentPhotoByStudentPhotoId) {
        this.sch303StudentPhotoByStudentPhotoId = sch303StudentPhotoByStudentPhotoId;
    }
}
