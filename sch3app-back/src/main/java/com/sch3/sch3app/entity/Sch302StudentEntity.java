package com.sch3.sch3app.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "sch3_02_student", schema = "public", catalog = "nvl_sch3")
public class Sch302StudentEntity {
    private int studentId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String studentSex;
    private Date birthDate;
    private Date created;
    private int createdBy;
    private Date modified;
    private Integer modifiedBy;
    private Sch330StudentCurrentInfoEntity sch330StudentCurrentInfoByStudentId;
    private Sch331StudentCurrentInfoHistoryEntity sch331StudentCurrentInfoHistoryByStudentId;
    private Collection<Sch332StudentInfoMainEntity> sch332StudentInfoMainsByStudentId;
    private Sch333StudentInfoSecondaryEntity sch333StudentInfoSecondaryByStudentId;
    private Sch334StudentInfoThirdEntity sch334StudentInfoThirdByStudentId;

    @Id
    @Column(name = "student_id", nullable = false)
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "first_name", nullable = false, length = 50)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = false, length = 50)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "middle_name", nullable = true, length = 100)
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "student_sex", nullable = false)
    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    @Basic
    @Column(name = "birth_date", nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
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
        Sch302StudentEntity that = (Sch302StudentEntity) o;
        return studentId == that.studentId &&
                createdBy == that.createdBy &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(middleName, that.middleName) &&
                Objects.equals(studentSex, that.studentSex) &&
                Objects.equals(birthDate, that.birthDate) &&
                Objects.equals(created, that.created) &&
                Objects.equals(modified, that.modified) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, firstName, lastName, middleName, studentSex, birthDate, created, createdBy, modified, modifiedBy);
    }

    @OneToOne(mappedBy = "sch302StudentByStudentId")
    public Sch330StudentCurrentInfoEntity getSch330StudentCurrentInfoByStudentId() {
        return sch330StudentCurrentInfoByStudentId;
    }

    public void setSch330StudentCurrentInfoByStudentId(Sch330StudentCurrentInfoEntity sch330StudentCurrentInfoByStudentId) {
        this.sch330StudentCurrentInfoByStudentId = sch330StudentCurrentInfoByStudentId;
    }

    @OneToOne(mappedBy = "sch302StudentByStudentId")
    public Sch331StudentCurrentInfoHistoryEntity getSch331StudentCurrentInfoHistoryByStudentId() {
        return sch331StudentCurrentInfoHistoryByStudentId;
    }

    public void setSch331StudentCurrentInfoHistoryByStudentId(Sch331StudentCurrentInfoHistoryEntity sch331StudentCurrentInfoHistoryByStudentId) {
        this.sch331StudentCurrentInfoHistoryByStudentId = sch331StudentCurrentInfoHistoryByStudentId;
    }

    @OneToMany(mappedBy = "sch302StudentByStudentId")
    public Collection<Sch332StudentInfoMainEntity> getSch332StudentInfoMainsByStudentId() {
        return sch332StudentInfoMainsByStudentId;
    }

    public void setSch332StudentInfoMainsByStudentId(Collection<Sch332StudentInfoMainEntity> sch332StudentInfoMainsByStudentId) {
        this.sch332StudentInfoMainsByStudentId = sch332StudentInfoMainsByStudentId;
    }

    @OneToOne(mappedBy = "sch302StudentByStudentId")
    public Sch333StudentInfoSecondaryEntity getSch333StudentInfoSecondaryByStudentId() {
        return sch333StudentInfoSecondaryByStudentId;
    }

    public void setSch333StudentInfoSecondaryByStudentId(Sch333StudentInfoSecondaryEntity sch333StudentInfoSecondaryByStudentId) {
        this.sch333StudentInfoSecondaryByStudentId = sch333StudentInfoSecondaryByStudentId;
    }

    @OneToOne(mappedBy = "sch302StudentByStudentId")
    public Sch334StudentInfoThirdEntity getSch334StudentInfoThirdByStudentId() {
        return sch334StudentInfoThirdByStudentId;
    }

    public void setSch334StudentInfoThirdByStudentId(Sch334StudentInfoThirdEntity sch334StudentInfoThirdByStudentId) {
        this.sch334StudentInfoThirdByStudentId = sch334StudentInfoThirdByStudentId;
    }
}
