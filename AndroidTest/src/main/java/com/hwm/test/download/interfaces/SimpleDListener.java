package com.hwm.test.download.interfaces;

import com.hwm.test.download.bizs.DLInfo;

public class SimpleDListener implements IDListener {

    @Override
    public void onPrepare(DLInfo info) {

    }

    @Override
    public void onStart(DLInfo info) {

    }
    //public void onStart(String fileName, String appName, String realUrl, int fileLength) {

    //}

    @Override
    public void onProgress(DLInfo info) {

    }
    //public void onProgress(int progress) {

    //}

    @Override
    public void onStop(DLInfo info) {

    }
    //public void onStop(int progress) {

    //}

    @Override
    public void onFinish(DLInfo info) {

    }

    @Override
    public void onError(int status, String error, DLInfo info) {

    }
}