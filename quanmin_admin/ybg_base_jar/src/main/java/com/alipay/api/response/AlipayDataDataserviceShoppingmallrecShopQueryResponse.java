package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ShopRec;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.shoppingmallrec.shop.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-15 19:53:06
 */
public class AlipayDataDataserviceShoppingmallrecShopQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3213993319167154642L;

	/** 
	 * 本次推荐的id, 开发者埋点需带入此参数
	 */
	@ApiField("recommend_id")
	private String recommendId;

	/** 
	 * 本次请求的全局唯一标识, 支持英文字母和数字, 由开发者自行定义,和入参request_id一致
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 推荐的商铺列表, 有序
	 */
	@ApiListField("shop_recommend_list")
	@ApiField("shop_rec")
	private List<ShopRec> shopRecommendList;

	public void setRecommendId(String recommendId) {
		this.recommendId = recommendId;
	}
	public String getRecommendId( ) {
		return this.recommendId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setShopRecommendList(List<ShopRec> shopRecommendList) {
		this.shopRecommendList = shopRecommendList;
	}
	public List<ShopRec> getShopRecommendList( ) {
		return this.shopRecommendList;
	}

}
