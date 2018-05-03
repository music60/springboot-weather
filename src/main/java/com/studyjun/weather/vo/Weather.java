package com.studyjun.weather.vo;

import java.util.List;

public class Weather {


    /**
     * yesterday : {"date":"17日星期二","high":"高温 22℃","fx":"无持续风向","low":"低温 16℃","fl":"<![CDATA[<3级]]>","type":"多云"}
     * city : 深圳
     * aqi : 74
     * forecast : [{"date":"18日星期三","high":"高温 26℃","fengli":"<![CDATA[<3级]]>","low":"低温 21℃","fengxiang":"无持续风向","type":"多云"},{"date":"19日星期四","high":"高温 28℃","fengli":"<![CDATA[<3级]]>","low":"低温 22℃","fengxiang":"无持续风向","type":"多云"},{"date":"20日星期五","high":"高温 26℃","fengli":"<![CDATA[<3级]]>","low":"低温 23℃","fengxiang":"无持续风向","type":"阵雨"},{"date":"21日星期六","high":"高温 28℃","fengli":"<![CDATA[<3级]]>","low":"低温 24℃","fengxiang":"无持续风向","type":"阵雨"},{"date":"22日星期天","high":"高温 30℃","fengli":"<![CDATA[<3级]]>","low":"低温 23℃","fengxiang":"无持续风向","type":"多云"}]
     * ganmao : 天气转凉，空气湿度较大，较易发生感冒，体质较弱的朋友请注意适当防护。
     * wendu : 21
     */

    private YesterdayBean yesterday;
    private String city;
    private String aqi;
    private String ganmao;
    private String wendu;
    private List<ForecastBean> forecast;

    public YesterdayBean getYesterday() {
        return yesterday;
    }

    public void setYesterday(YesterdayBean yesterday) {
        this.yesterday = yesterday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAqi() {
        return aqi;
    }

    public void setAqi(String aqi) {
        this.aqi = aqi;
    }

    public String getGanmao() {
        return ganmao;
    }

    public void setGanmao(String ganmao) {
        this.ganmao = ganmao;
    }

    public String getWendu() {
        return wendu;
    }

    public void setWendu(String wendu) {
        this.wendu = wendu;
    }

    public List<ForecastBean> getForecast() {
        return forecast;
    }

    public void setForecast(List<ForecastBean> forecast) {
        this.forecast = forecast;
    }

    public static class YesterdayBean {
        /**
         * date : 17日星期二
         * high : 高温 22℃
         * fx : 无持续风向
         * low : 低温 16℃
         * fl : <![CDATA[<3级]]>
         * type : 多云
         */

        private String date;
        private String high;
        private String fx;
        private String low;
        private String fl;
        private String type;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getHigh() {
            return high;
        }

        public void setHigh(String high) {
            this.high = high;
        }

        public String getFx() {
            return fx;
        }

        public void setFx(String fx) {
            this.fx = fx;
        }

        public String getLow() {
            return low;
        }

        public void setLow(String low) {
            this.low = low;
        }

        public String getFl() {
            return fl;
        }

        public void setFl(String fl) {
            this.fl = fl;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class ForecastBean {
        /**
         * date : 18日星期三
         * high : 高温 26℃
         * fengli : <![CDATA[<3级]]>
         * low : 低温 21℃
         * fengxiang : 无持续风向
         * type : 多云
         */

        private String date;
        private String high;
        private String fengli;
        private String low;
        private String fengxiang;
        private String type;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getHigh() {
            return high;
        }

        public void setHigh(String high) {
            this.high = high;
        }

        public String getFengli() {
            return fengli;
        }

        public void setFengli(String fengli) {
            this.fengli = fengli;
        }

        public String getLow() {
            return low;
        }

        public void setLow(String low) {
            this.low = low;
        }

        public String getFengxiang() {
            return fengxiang;
        }

        public void setFengxiang(String fengxiang) {
            this.fengxiang = fengxiang;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    @Override
    public String toString() {
        return "Weather{" +
                "yesterday=" + yesterday +
                ", city='" + city + '\'' +
                ", aqi='" + aqi + '\'' +
                ", ganmao='" + ganmao + '\'' +
                ", wendu='" + wendu + '\'' +
                ", forecast=" + forecast +
                '}';
    }
}
