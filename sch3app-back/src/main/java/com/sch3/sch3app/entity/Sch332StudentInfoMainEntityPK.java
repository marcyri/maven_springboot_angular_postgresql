package com.sch3.sch3app.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class Sch332StudentInfoMainEntityPK implements Serializable {
    private int studentId;
    private int schoolId;
    private int studentAddressId;

    @Column(name = "student_id", nullable = false)
    @Id
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Column(name = "school_id", nullable = false)
    @Id
    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    @Column(name = "student_address_id", nullable = false)
    @Id
    public int getStudentAddressId() {
        return studentAddressId;
    }

    public void setStudentAddressId(int studentAddressId) {
        this.studentAddressId = studentAddressId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sch332StudentInfoMainEntityPK that = (Sch332StudentInfoMainEntityPK) o;
        return studentId == that.studentId &&
                schoolId == that.schoolId &&
                studentAddressId == that.studentAddressId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, schoolId, studentAddressId);
    }
}
