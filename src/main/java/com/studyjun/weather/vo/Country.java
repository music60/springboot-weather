package com.studyjun.weather.vo;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "China")
@XmlAccessorType(XmlAccessType.FIELD)

public class Country {

    @XmlElement(name = "province")
    private List<Province> provinces;

    public List<Province> getProvinces() {
        return provinces;
    }

    public void setProvinces(List<Province> provinces) {
        this.provinces = provinces;
    }
}
