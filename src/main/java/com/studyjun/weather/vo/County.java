package com.studyjun.weather.vo;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "county")
@XmlAccessorType(XmlAccessType.FIELD)
public class County {

    @XmlAttribute(name = "id")
    private String id;

    @XmlAttribute(name = "name")
    private String name;

    @XmlAttribute(name = "weatherCode")
    private String weatherCode;

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

    public String getWeatherCode() {
        return weatherCode;
    }

    public void setWeatherCode(String weatherCode) {
        this.weatherCode = weatherCode;
    }
}
