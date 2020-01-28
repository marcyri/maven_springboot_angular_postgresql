package com.sch3.sch3app.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "sch3_03_student_photo", schema = "public", catalog = "nvl_sch3")
public class Sch303StudentPhotoEntity {
    private int studentPhotoId;
    private String studentPhotoPath;
    private Date created;
    private int createdBy;
    private Date modified;
    private Integer modifiedBy;
    private Collection<Sch330StudentCurrentInfoEntity> sch330StudentCurrentInfosByStudentPhotoId;
    private Collection<Sch331StudentCurrentInfoHistoryEntity> sch331StudentCurrentInfoHistoriesByStudentPhotoId;

    @Id
    @Column(name = "student_photo_id", nullable = false)
    public int getStudentPhotoId() {
        return studentPhotoId;
    }

    public void setStudentPhotoId(int studentPhotoId) {
        this.studentPhotoId = studentPhotoId;
    }

    @Basic
    @Column(name = "student_photo_path", nullable = false, length = 255)
    public String getStudentPhotoPath() {
        return studentPhotoPath;
    }

    public void setStudentPhotoPath(String studentPhotoPath) {
        this.studentPhotoPath = studentPhotoPath;
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
        Sch303StudentPhotoEntity that = (Sch303StudentPhotoEntity) o;
        return studentPhotoId == that.studentPhotoId &&
                createdBy == that.createdBy &&
                Objects.equals(studentPhotoPath, that.studentPhotoPath) &&
                Objects.equals(created, that.created) &&
                Objects.equals(modified, that.modified) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentPhotoId, studentPhotoPath, created, createdBy, modified, modifiedBy);
    }

    @OneToMany(mappedBy = "sch303StudentPhotoByStudentPhotoId")
    public Collection<Sch330StudentCurrentInfoEntity> getSch330StudentCurrentInfosByStudentPhotoId() {
        return sch330StudentCurrentInfosByStudentPhotoId;
    }

    public void setSch330StudentCurrentInfosByStudentPhotoId(Collection<Sch330StudentCurrentInfoEntity> sch330StudentCurrentInfosByStudentPhotoId) {
        this.sch330StudentCurrentInfosByStudentPhotoId = sch330StudentCurrentInfosByStudentPhotoId;
    }

    @OneToMany(mappedBy = "sch303StudentPhotoByStudentPhotoId")
    public Collection<Sch331StudentCurrentInfoHistoryEntity> getSch331StudentCurrentInfoHistoriesByStudentPhotoId() {
        return sch331StudentCurrentInfoHistoriesByStudentPhotoId;
    }

    public void setSch331StudentCurrentInfoHistoriesByStudentPhotoId(Collection<Sch331StudentCurrentInfoHistoryEntity> sch331StudentCurrentInfoHistoriesByStudentPhotoId) {
        this.sch331StudentCurrentInfoHistoriesByStudentPhotoId = sch331StudentCurrentInfoHistoriesByStudentPhotoId;
    }
}
