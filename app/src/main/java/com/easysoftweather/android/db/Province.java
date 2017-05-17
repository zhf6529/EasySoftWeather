package com.easysoftweather.android.db;

import org.litepal.crud.DataSupport;;

/**
 * Created by zhf_6 on 2017-05-17.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;
    private int provinecCode;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getProvinceName(){
        return provinceName;
    }
    public void setProvinceName(String provinceName){
        this.provinceName = provinceName;
    }
    public int getProvinecCode(){
        return provinecCode;
    }
    public void setProvinecCode(int provinecCode){
        this.provinecCode = provinecCode;
    }
}
