package com.easysoftweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhf_6 on 2017-05-18.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
