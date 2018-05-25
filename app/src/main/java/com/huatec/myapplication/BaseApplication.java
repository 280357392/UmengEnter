package com.huatec.myapplication;

import android.app.Application;

import com.umeng.commonsdk.UMConfigure;
import com.umeng.socialize.PlatformConfig;


public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        UMConfigure.init(this,"5a12384aa40fa3551f0001d1"
                ,"umeng", UMConfigure.DEVICE_TYPE_PHONE,"");//58edcfeb310c93091c000be2 5965ee00734be40b580001a0

    }

//    //各个平台的配置，建议放在全局Application或者程序入口
    {
        //微信
        PlatformConfig.setWeixin("wxdc1e388c3822c80b", "3baf1193c85774b3fd9d18447d76cab0");
        //新浪微博
        PlatformConfig.setSinaWeibo("3921700954", "04b48b094faeb16683c32669824ebdad","http://sns.whalecloud.com");
        //QQ登录
        PlatformConfig.setQQZone("100424468", "c7394704798a158208a74ab60104f0ba");
        //支付宝
        PlatformConfig.setAlipay("2015111700822536");
    }
}
