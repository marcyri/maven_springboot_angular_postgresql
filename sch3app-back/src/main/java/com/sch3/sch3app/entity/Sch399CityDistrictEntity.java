package com.sch3.sch3app.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sch3_99_city_district", schema = "public", catalog = "nvl_sch3")
public class Sch399CityDistrictEntity {
    private int cityDistrictId;
    private String cityName;
    private String districtName;

    @Id
    @Column(name = "city_district_id", nullable = false)
    public int getCityDistrictId() {
        return cityDistrictId;
    }

    public void setCityDistrictId(int cityDistrictId) {
        this.cityDistrictId = cityDistrictId;
    }

    @Basic
    @Column(name = "city_name", nullable = false, length = -1)
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Basic
    @Column(name = "district_name", nullable = false, length = -1)
    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sch399CityDistrictEntity that = (Sch399CityDistrictEntity) o;
        return cityDistrictId == that.cityDistrictId &&
                Objects.equals(cityName, that.cityName) &&
                Objects.equals(districtName, that.districtName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityDistrictId, cityName, districtName);
    }
}
