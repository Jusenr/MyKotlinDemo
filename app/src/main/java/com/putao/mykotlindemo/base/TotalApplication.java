package com.putao.mykotlindemo.base;

import android.app.Application;
import android.content.Context;

import com.putao.mykotlindemo.utils.DiskFileCacheHelper;
import com.putao.mykotlindemo.utils.SDCardUtils;

import java.io.File;

import butterknife.ButterKnife;
import okhttp3.OkHttpClient;


/**
 * Description:
 * Copyright  : Copyright (c) 2016
 * Email      : jusenr@163.com
 * Company    : 葡萄科技
 * Author     : Jusenr
 * Date       : 2016/12/27 16:05.
 */

public class TotalApplication extends Application {
    private static Context mContext;
    private static OkHttpClient mOkHttpClient;//OkHttpClient
    private static DiskFileCacheHelper mDiskFileCacheHelper;//磁盘文件缓存器
    private static String sdCardPath;//SdCard路径

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
        //ButterKnife的Debug模式
        ButterKnife.setDebug(false);
        //sdCard缓存路径
        sdCardPath = getSdCardPath();
        //OkHttp初始化
        mOkHttpClient = new OkHttpClient();
        //磁盘文件缓存器
        mDiskFileCacheHelper = DiskFileCacheHelper.get(getApplicationContext(), getLogTag());
    }

    public static Context getInstance() {
        return mContext;
    }

    public static OkHttpClient getOkHttpClient() {
        return mOkHttpClient;
    }

    public static DiskFileCacheHelper getDiskFileCacheHelper() {
        return mDiskFileCacheHelper;
    }

    public String getPackageName() {
        return "com.myself.mykotlin";
    }

    /**************************************************************************/

    protected String getLogTag() {
        return "my-kotlin";
    }

    protected String getSdCardPath() {
        return SDCardUtils.getSDCardPath() + File.separator + getLogTag();
    }

    protected String getNetworkCacheDirectoryPath() {
        return sdCardPath + File.separator + "http_cache";
    }

    protected int getNetworkCacheSize() {
        return 20 * 1024 * 1024;
    }

    protected int getNetworkCacheMaxAgeTime() {
        return 0;
    }
}
