package com.easysoftweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhf_6 on 2017-05-18.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public  Sport sport;

    @SerializedName("uv")
    public UltraViolet ultraviolet;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
    public class UltraViolet{
        @SerializedName("txt")
        public String info;
    }
}
