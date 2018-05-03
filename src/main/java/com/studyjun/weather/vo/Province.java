package com.studyjun.weather.vo;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "province")
@XmlAccessorType(XmlAccessType.FIELD)
public class Province {

    @XmlAttribute(name = "id")
    private String id;

    @XmlAttribute(name = "name")
    private String name;

    @XmlElement(name = "city")
    private List<City> cities;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<City> getCities() {
        return cities;
    }

    public void setCities(List<City> cities) {
        this.cities = cities;
    }
}
