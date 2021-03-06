package com.hwm.test.view.recycler.scrollview.block;

import com.android.base.block.UiBlock;
import com.hwm.test.R;
import com.hwm.test.view.banner.block.SimpleImageBanner;
import com.hwm.test.view.banner.entity.BannerModel;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/11/27 0027.
 */
public class HeaderBannerBlock extends UiBlock {

    public SimpleImageBanner mBanner;
    public List<BannerModel> mData;

    private String[] imageUrls = {
            "http://img.taodiantong.cn/v55183/infoimg/2013-07/130720115322ky.jpg",
            "http://pic30.nipic.com/20130626/8174275_085522448172_2.jpg",
            "http://pic18.nipic.com/20111215/577405_080531548148_2.jpg",
            "http://pic15.nipic.com/20110722/2912365_092519919000_2.jpg",
            "http://pic.58pic.com/58pic/12/64/27/55U58PICrdX.jpg"};


    @Override
    public int getRootViewId() {
        return R.id.banner_main_default;
    }

    @Override
    public void onViewCreated() {
        setData();
        mBanner = (SimpleImageBanner) getRootView().findViewById(R.id.banner_main_default);
        mBanner.setSource(mData);
        mBanner.startScroll();
    }

    private void setData() {
        mData = new ArrayList<>();
        for(int i=0;i<imageUrls.length;i++){
            BannerModel bm = new BannerModel();
            bm.setImageUrl(imageUrls[i]);
            bm.setTips("这是第" + i + "页");
            mData.add(bm);
        }
    }

    @Override
    public void onDestroy() {
        Glide.get(mActivity).clearMemory();
        super.onDestroy();
    }
}
