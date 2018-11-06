package com.jeecg.p3.gzbargain.entity;

import java.math.BigDecimal;
import java.util.Date;

import org.jeecgframework.p3.core.utils.persistence.Entity;

/**
 * 描述：</b>WxActBargainRecord:砍价帮砍记录表<br>
 * @author junfeng.zhou
 * @since：2015年08月06日 18时46分35秒 星期四 
 * @version:1.0
 */
public class GzWxActBargainRecord implements Entity<String> {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 对应微信平台原始id
	 */
	private String jwid;
	
	/**
	 * 是否关注（ 用户是否订阅该公众号标识，值为0时，代表此用户没有关注该公众号，拉取不到其余信息。）
	 */
	private String subscribe;
	/**
	 *验证码
	 */
	private String randCode;
	public String getJwid() {
		return jwid;
	}
	public void setJwid(String jwid) {
		this.jwid = jwid;
	}
	public String getSubscribe() {
		return subscribe;
	}
	public void setSubscribe(String subscribe) {
		this.subscribe = subscribe;
	}
	public String getRandCode() {
		return randCode;
	}
	public void setRandCode(String randCode) {
		this.randCode = randCode;
	}
	@Override
	public String toString() {
		return "GzWxActBargainRecord [id=" + id + ", registrationId="
				+ registrationId + ", openid=" + openid + ", nickname="
				+ nickname + ", cutPrice=" + cutPrice + ", currPrice="
				+ currPrice + ", createTime=" + createTime + ", jwid=" + jwid
				+ ", subscribe=" + subscribe + ", randCode=" + randCode + "]";
	}
	
	
}
