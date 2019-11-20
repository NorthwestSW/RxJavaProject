package com.supcon.scanlib.qrcode;

import android.graphics.PointF;

import com.google.zxing.BarcodeFormat;

/**
 * 作者:王浩
 * 创建时间:2018/6/15
 * 描述:
 */
public class ScanResult {
    String result;
    PointF[] resultPoints;
    public BarcodeFormat format;

    public ScanResult(String result) {
        this.result = result;
    }

    public ScanResult(String result, BarcodeFormat format) {
        this.result = result;
        this.format = format;
    }

    public ScanResult(String result, PointF[] resultPoints) {
        this.result = result;
        this.resultPoints = resultPoints;
    }
}
