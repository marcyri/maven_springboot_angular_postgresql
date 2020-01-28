package com.sch3.sch3app.entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "sch3_04_student_address", schema = "public", catalog = "nvl_sch3")
public class Sch304StudentAddressEntity {
    private int studentAddressId;
    private String localityType;
    private String localityName;
    private String address;
    private String addressStreet;
    private String postCode;
    private String localityDistrict;
    private String telephone1;
    private String telephone2;
    private String telephoneMobile1;
    private String telephoneMobile2;
    private String telephoneMobile3;
    private String email1;
    private String email2;
    private Date created;
    private int createdBy;
    private Date modified;
    private Integer modifiedBy;
    private Collection<Sch332StudentInfoMainEntity> sch332StudentInfoMainsByStudentAddressId;

    @Id
    @Column(name = "student_address_id", nullable = false)
    public int getStudentAddressId() {
        return studentAddressId;
    }

    public void setStudentAddressId(int studentAddressId) {
        this.studentAddressId = studentAddressId;
    }

    @Basic
    @Column(name = "locality_type", nullable = false, length = 50)
    public String getLocalityType() {
        return localityType;
    }

    public void setLocalityType(String localityType) {
        this.localityType = localityType;
    }

    @Basic
    @Column(name = "locality_name", nullable = false, length = 100)
    public String getLocalityName() {
        return localityName;
    }

    public void setLocalityName(String localityName) {
        this.localityName = localityName;
    }

    @Basic
    @Column(name = "address", nullable = true, length = 255)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "address_street", nullable = true, length = 255)
    public String getAddressStreet() {
        return addressStreet;
    }

    public void setAddressStreet(String addressStreet) {
        this.addressStreet = addressStreet;
    }

    @Basic
    @Column(name = "post_code", nullable = true, length = 50)
    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @Basic
    @Column(name = "locality_district", nullable = false, length = 100)
    public String getLocalityDistrict() {
        return localityDistrict;
    }

    public void setLocalityDistrict(String localityDistrict) {
        this.localityDistrict = localityDistrict;
    }

    @Basic
    @Column(name = "telephone_1", nullable = true, length = 50)
    public String getTelephone1() {
        return telephone1;
    }

    public void setTelephone1(String telephone1) {
        this.telephone1 = telephone1;
    }

    @Basic
    @Column(name = "telephone_2", nullable = true, length = 50)
    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
    }

    @Basic
    @Column(name = "telephone_mobile_1", nullable = true, length = 50)
    public String getTelephoneMobile1() {
        return telephoneMobile1;
    }

    public void setTelephoneMobile1(String telephoneMobile1) {
        this.telephoneMobile1 = telephoneMobile1;
    }

    @Basic
    @Column(name = "telephone_mobile_2", nullable = true, length = 50)
    public String getTelephoneMobile2() {
        return telephoneMobile2;
    }

    public void setTelephoneMobile2(String telephoneMobile2) {
        this.telephoneMobile2 = telephoneMobile2;
    }

    @Basic
    @Column(name = "telephone_mobile_3", nullable = true, length = 50)
    public String getTelephoneMobile3() {
        return telephoneMobile3;
    }

    public void setTelephoneMobile3(String telephoneMobile3) {
        this.telephoneMobile3 = telephoneMobile3;
    }

    @Basic
    @Column(name = "email_1", nullable = true, length = 100)
    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    @Basic
    @Column(name = "email_2", nullable = true, length = 100)
    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
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
        Sch304StudentAddressEntity that = (Sch304StudentAddressEntity) o;
        return studentAddressId == that.studentAddressId &&
                createdBy == that.createdBy &&
                Objects.equals(localityType, that.localityType) &&
                Objects.equals(localityName, that.localityName) &&
                Objects.equals(address, that.address) &&
                Objects.equals(addressStreet, that.addressStreet) &&
                Objects.equals(postCode, that.postCode) &&
                Objects.equals(localityDistrict, that.localityDistrict) &&
                Objects.equals(telephone1, that.telephone1) &&
                Objects.equals(telephone2, that.telephone2) &&
                Objects.equals(telephoneMobile1, that.telephoneMobile1) &&
                Objects.equals(telephoneMobile2, that.telephoneMobile2) &&
                Objects.equals(telephoneMobile3, that.telephoneMobile3) &&
                Objects.equals(email1, that.email1) &&
                Objects.equals(email2, that.email2) &&
                Objects.equals(created, that.created) &&
                Objects.equals(modified, that.modified) &&
                Objects.equals(modifiedBy, that.modifiedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentAddressId, localityType, localityName, address, addressStreet, postCode, localityDistrict, telephone1, telephone2, telephoneMobile1, telephoneMobile2, telephoneMobile3, email1, email2, created, createdBy, modified, modifiedBy);
    }

    @OneToMany(mappedBy = "sch304StudentAddressByStudentAddressId")
    public Collection<Sch332StudentInfoMainEntity> getSch332StudentInfoMainsByStudentAddressId() {
        return sch332StudentInfoMainsByStudentAddressId;
    }

    public void setSch332StudentInfoMainsByStudentAddressId(Collection<Sch332StudentInfoMainEntity> sch332StudentInfoMainsByStudentAddressId) {
        this.sch332StudentInfoMainsByStudentAddressId = sch332StudentInfoMainsByStudentAddressId;
    }
}
