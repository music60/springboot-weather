package com.studyjun.weather.utils;

import javax.xml.bind.*;
import java.io.Reader;
import java.io.StringReader;

public class XMLBuilder {

    /**
     * 将xml转为制定的pojo对象
     * @param clazz
     * @param xmlStr
     * @return
     */
    public static Object xml2Object(Class clazz,String xmlStr) throws Exception {
        Object xmlObject =null;
        JAXBContext context = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaler = context.createUnmarshaller();

        Reader reader = new StringReader(xmlStr);

        xmlObject= unmarshaler.unmarshal(reader);

        if (reader!=null){
            reader.close();
            reader =null;

        }
        return xmlObject;
    }
}
