package com.sweetvvck.utils;

public interface Constants {

	public static final String TAG = "InfoToday";

	// city list URL
	public static final String cityListURL = "http://api.17huibao.com/v1/metadata/citylist.json";
	public static final String cityListLocationURL = "http://api.17huibao.com/v1/location/citylist.json";
	public static final String cityIdURL = "http://api.17huibao.com/v1/location/bdcity.json?cityname=";
	// home index base URL
	public static final String homeIndexBaseURL = "http://api.17huibao.com/v1/business/portal.json?cityid=";
	// home advertise base URL
	public static final String homeAdvertiseBaseURL = "http://api.17huibao.com/v1/metadata/advertise.json?city_id=";
	// home recommend url
	public static final String homeRecommendBaseURL = "http://api.17huibao.com/v1/metadata/recommend.json?city_id=";
	// category
	public static final String categoryBaseURL = "http://api.17huibao.com/v1/metadata/categorylist.json?cityid=";
	// Region
	public static final String regionBaseURL = "http://api.17huibao.com/v1/location/regionlist.json?cityid=";
	// neighbour商圈
	public static final String neighbourBaseURL = "http://api.17huibao.com/v1/location/grouplist.json?regionid=";
	// sort顺序
	public static final String sortBaseURL = "http://api.17huibao.com/v1/metadata/sort.json";
	// coupon列表
	public static final String couponListBaseURL = "http://api.17huibao.com/v1/business/searchcoupon.json?";
	// coupon详细
	public static final String couponDetailBaseURL = "http://api.17huibao.com/v1/business/coupon.json?";
	// event 详细
	public static final String eventDetailBaseURL = "http://api.17huibao.com/v1/business/event.json?";
	// today列表
	public static final String todayListBaseURL = "http://api.17huibao.com/v1/business/searchevent.json?";
	// shop
	public static final String shopListBaseURL = "http://api.17huibao.com/v1/metadata/search.json";
	// mallList
	public static final String mallListBaseUrl = "http://api.17huibao.com/v1/business/malllist.json";
	// 商圈
	public static final String mallAreaBaseUrl = "http://api.17huibao.com/v1/business/mallquan.json?cityid=";
	// 商城
	public static final String mallBaseURL = "http://api.17huibao.com/v1/metadata/search.json";
	public static final String mallMainURL = "http://api.17huibao.com/v1/business/mallinfo.json?";
	public static final String mallFloorURL = "http://api.17huibao.com/v1/business/mallfloor.json?";
	public static final String mallFloorShopURL = "http://api.17huibao.com/v1/business/mallfloorshop.json?";
	public static final String mallShopListURL = "http://api.17huibao.com/v1/business/mallshoplist.json?";
	public static final String shopURL = "http://api.17huibao.com/v1/business/shop.json?";

	// 获取收藏商铺列表
	public static final String favShopURL = "http://api.17huibao.com/v1/account/favoriteshop.json";
	// 收藏优惠券
	public static final String addFavCouponURL = "http://api.17huibao.com/v1/account/addfavorite.json";
	// 获取收藏优惠券列表
	public static final String favoriteInfoURL = "http://api.17huibao.com/v1/account/favoriteinfo.json";
	
	// 获取收藏优惠券列表
	public static final String CANCELFAVORITEINFOURL = "http://api.17huibao.com/v1/account/cancelfavorite.json";
	
	// 限时抢购
	public static final String FASH_SALE_URL = "http://api.17huibao.com/v1/business/flashbuy.json?";
	// 餐饮美食
	public static final String FOOD_INFO_URL = "http://api.17huibao.com/v1/business/mallfoodinfolist.json?";
	// 精品优惠
	public static final String RECOMMEND_INFO_URL = "http://api.17huibao.com/v1/business/mallrecommendinfolist.json?";
	// 商铺
	public static final String storeBaseURL = "http://api.17huibao.com/v1/business/shop.json";
	// 验证码
	public static final String smsAuthCodeURL = "http://api.17huibao.com/v1/sendsms/sendregsmscode.json";
	//注册短信验证码
	public static final String authCodeInputbaseUrl = "http://api.17huibao.com/v1/sendsms/smscodeverify.json";
	//获取短信找回密码的验证码
	public static final String getPsdCodeURL = "http://api.17huibao.com/v1/sendsms/sendfindpwdsmscode.json";
	public static final String getPsdBySmsURL ="http://api.17huibao.com/v1/account/findpwdbymobile.json";
	//邮件找回密码
	public static final String getPsdByMailURL="http://api.17huibao.com/v1/account/findpwdbyemail.json";
		
	// 手机注册
	public static final String registerCheckCodeUrl = "http://api.17huibao.com/v1/sendsms/sendregsmscode.json";
	public static final String registerPhoneRegUrl = "http://api.17huibao.com/v1/account/signupbymobile.json";
	public static final String registerEmailRegUrl = "http://api.17huibao.com/v1/account/signupbyemail.json";
	
	//客户端检查更新
	public static final String checkUpdateUrl = "http://api.17huibao.com/v1/metadata/checkupdate.json";
	// 登陆
	public static final String loginBaseUrl = "http://api.17huibao.com/v1/account/login.json";
	// 注销，退出
	public static final String logOutUrl = "http://api.17huibao.com/v1/account/logout.json";
	// 修改密码
	public static final String modifypwdUrl = "http://api.17huibao.com/v1/account/modifypwd.json";

	// 账户设置
	public static final String ACCOUNT_SETTING_Url = "http://api.17huibao.com/v1/account/userinfo.json";
	public static final String baiduLocKey = "D0ms2gCMwTPtCGvPN38VGlN1";
	// 推送
	public static final String BAIDU_API_KEY = "QpHGS1o52AZOEUpHeZeZv3Ly";

	// 首页参数相关
	public static final String IndexParamsAdv = "advertise";
	public static final String IndexParamsMall = "malllist";
	public static final String IndexParamsComm = "recommend";

	// 定位相关
	public static final String xmlLantitude = "lantitude";
	public static final String xmlLongitude = "longitude";
	public static final String xmlAddress = "address";
	public static final String xmlCity = "city";
	public static final String xmlCityCode = "citycode";
	// 用户唯一标示
	public static final String xmlUserSign = "usersign";

	public static final boolean DEBUG = true;
	
	//我的券包URL
	public static final String MYCOUPONURL = "http://api.17huibao.com/v1/account/myticketlist.json";
	
	//我的订单URL
	public static final String MYORDERURL = "http://api.17huibao.com/v1/account/myorderdetail.json";
	//我的订单URL
	public static final String MYORDERListURL = "http://api.17huibao.com/v1/account/myorderlist.json";
	//我的订单URL
	public static final String BINDDEVICE = "http://api.17huibao.com/v1/metadata/binddevice.json";

}
