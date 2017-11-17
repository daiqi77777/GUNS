package com.egzosn.pay.union.api;

import com.egzosn.pay.common.api.BasePayConfigStorage;

/**
 * 支付客户端配置存储
 * author  egan
 *
 * email egzosn@gmail.com
 * date 2016-5-18 14:09:01
 */
public class UnionPayConfigStorage extends BasePayConfigStorage {

    // 商户PID
    public volatile  String merId ;
    // 商户签约拿到的pid,partner_id的简称，合作伙伴身份等同于 partner
    public volatile  String pid ;
    //partner_id的简称，合作伙伴身份
//    public volatile  String partner ;

    // 商户收款账号
    public volatile  String seller;
    //公钥
    private volatile String aliPublicKey;
    //全渠道固定值
    public static String version = "5.0.0";

    public String getAliPublicKey() {
        return aliPublicKey;
    }

    public void setAliPublicKey(String aliPublicKey) {
        setKeyPublic(aliPublicKey);
        this.aliPublicKey = aliPublicKey;
    }



    @Override
    public String getAppid() {
        return null;
    }

    /**
     * @see #getPid()
     * @return 合作者id
     */
    @Deprecated
    @Override
    public String getPartner() {
        return pid;
    }


    /**
     * 设置合作者id
     * @see #setPid(String)
     * @param partner 合作者id
     */
    @Deprecated
    public void setPartner(String partner) {
        this.pid = partner;
    }

    @Override
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }




}