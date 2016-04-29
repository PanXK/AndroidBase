package com.hwm.test.net;

import android.os.Handler;
import android.service.carrier.CarrierMessagingService;
import android.support.v4.util.ArrayMap;

import com.alibaba.fastjson.JSON;
import com.android.base.common.utils.HandlerUtil;
import com.hwm.test.AppConfig;
import com.apkfuns.logutils.LogUtils;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;
import com.zhy.http.okhttp.request.OkHttpRequest;

import okhttp3.Call;
import okhttp3.Request;

/**
 * Created by Administrator on 2015/10/9 0009.
 */
public class TestHttpReq {

    public static final String reqUrl1 = "https://api.douban.com/v2/user/googolmo";
    //public static final String reqUrl2 = "http://ixiada.153.cn:50081/exter.shtml?baseLine=400&serviceType=1007";
    //public static final String reqUrl2 = "http://110.84.128.74:8081/geyeapi/geye/getRtsp?geyeId=1590&isNeedff=1";
    public static final String reqUrl2 = "http://110.84.128.74:8081/geyeapi/geye/getRtsp";
    public static String BASE_API_URL = "http://api150.aiyouyou.paojiao.cn";
    /** 新游接口 */
    public static final String NEW_GAME = BASE_API_URL + "/v5/game/newlist.do";

    public static void request1(final Handler handler) {
        /*OkHttpClientManager.getAsyn(reqUrl1, new OkHttpClientManager.ResultCallback<String>() {

            @Override
            public void onError(Request request, Exception e) {
                HandlerUtil.sendMessage(handler, AppConfig.REQUEST_GET_FAIL);
            }

            @Override
            public void onResponse(String response) {
                HandlerUtil.sendMessage(handler, AppConfig.REQUEST_GET_SUCCESS, response.toString());
            }
        });*/
        OkHttpUtils
                .get()
                .url(reqUrl1)
                .addParams("username", "hyman")
                .addParams("password", "123")
                .build()
                .execute(new StringCallback()
                {
                    @Override
                    public void onError(Call call, Exception e) {
                        HandlerUtil.sendMessage(handler, AppConfig.REQUEST_GET_FAIL);
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        HandlerUtil.sendMessage(handler, AppConfig.REQUEST_GET_SUCCESS, response.toString());
                    }
                });

    }

    public static void request2(final Handler handler) {

        /*ArrayMap<String, String> map = new ArrayMap<String, String>();
        map.put("geyeId", "1590");
        map.put("isNeedff", "1");*/

        /*OkHttpClientManager.postAsyn(reqUrl2, map, new OkHttpClientManager.ResultCallback<String>() {
            @Override
            public void onError(Request request, Exception e) {
                HandlerUtil.sendMessage(handler, AppConfig.REQUEST_POST_FAIL);
            }

            @Override
            public void onResponse(String response) {
                HandlerUtil.sendMessage(handler, AppConfig.REQUEST_POST_SUCCESS, response);
            }
        });*/
        OkHttpUtils
                .post()
                .url(reqUrl2)
                .addParams("geyeId", "1590")
                .addParams("isNeedff", "1")
                .build()
                .execute(new StringCallback()
                {

                    @Override
                    public void onError(Call call, Exception e) {
                        HandlerUtil.sendMessage(handler, AppConfig.REQUEST_POST_FAIL);
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        HandlerUtil.sendMessage(handler, AppConfig.REQUEST_POST_SUCCESS, response);
                    }
                });


    }

    public static void request3(final Handler handler) {

        ArrayMap<String, String> map = new ArrayMap<String, String>();
        map.put("geyeId", "1590");
        map.put("isNeedff", "1");

        /*OkHttpClientManager.postAsyn(reqUrl2, map, new OkHttpClientManager.ResultCallback<TestBean>() {
            @Override
            public void onError(Request request, Exception e) {
                HandlerUtil.sendMessage(handler, AppConfig.REQUEST_POST_FAIL_FOR_BEAN);
            }

            @Override
            public void onResponse(TestBean response) {
                HandlerUtil.sendMessage(handler, AppConfig.REQUEST_POST_SUCCESS_FOR_BEAN, response);
            }
        });*/
        OkHttpUtils
                .post()
                .url(reqUrl2)
                .addParams("geyeId", "1590")
                .addParams("isNeedff", "1")
                .build()
                .execute(new StringCallback()
                {

                    @Override
                    public void onError(Call call, Exception e) {
                        HandlerUtil.sendMessage(handler, AppConfig.REQUEST_POST_FAIL_FOR_BEAN);
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        TestBean mTestBean = JSON.parseObject(response, TestBean.class);
                        HandlerUtil.sendMessage(handler, AppConfig.REQUEST_POST_SUCCESS_FOR_BEAN, mTestBean);
                    }
                });


    }

    public static void request4(final Handler handler) {

       /* ArrayMap<String, String> map = new ArrayMap<String, String>();
        map.put("geyeId", "1590");
        map.put("isNeedff", "1");*/

        /*OkHttpClientManager.postAsyn(reqUrl2, map, new OkHttpClientManager.ResultCallback<String>() {
            @Override
            public void onError(Request request, Exception e) {
                HandlerUtil.sendMessage(handler, AppConfig.REQUEST_POST_FAIL);
            }

            @Override
            public void onResponse(String response) {
                HandlerUtil.sendMessage(handler, AppConfig.REQUEST_POST_SUCCESS, response);
            }
        });*/
        OkHttpUtils
                .get()
                .url(reqUrl2)
                .addParams("geyeId", "1590")
                .addParams("isNeedff", "1")
                .build()
                .execute(new StringCallback()
                {

                    @Override
                    public void onError(Call call, Exception e) {
                        HandlerUtil.sendMessage(handler, AppConfig.REQUEST_GET_FAIL_FOR_BEAN);
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        TestBean mTestBean = JSON.parseObject(response, TestBean.class);
                        HandlerUtil.sendMessage(handler, AppConfig.REQUEST_GET_SUCCESS_FOR_BEAN, mTestBean);
                    }
                });


    }

    public static void request5(final Handler handler) {

       /* ArrayMap<String, String> map = new ArrayMap<String, String>();
        map.put("page", "1");
        map.put("limit", "12");*/

        /*OkHttpClientManager.postAsyn(reqUrl2, map, new OkHttpClientManager.ResultCallback<String>() {
            @Override
            public void onError(Request request, Exception e) {
                HandlerUtil.sendMessage(handler, AppConfig.REQUEST_POST_FAIL);
            }

            @Override
            public void onResponse(String response) {
                HandlerUtil.sendMessage(handler, AppConfig.REQUEST_POST_SUCCESS, response);
            }
        });*/

        OkHttpUtils
                .get()
                .url(NEW_GAME)
                .addParams("page", "1")
                .addParams("limit", "12")
                .build()
                .execute(new StringCallback()
                {

                    @Override
                    public void onError(Call call, Exception e) {
                        LogUtils.e(e);
                    }

                    @Override
                    public void onResponse(String response)
                    {
                        LogUtils.e(response);
                    }
                });

    }
}
