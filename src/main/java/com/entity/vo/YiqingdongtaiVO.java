package com.entity.vo;

import com.entity.YiqingdongtaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 疫情动态
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public class YiqingdongtaiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 新增病例
	 */
	
	private Integer xinzengbingli;
		
	/**
	 * 累计确诊
	 */
	
	private Integer leijiquezhen;
		
	/**
	 * 治愈人数
	 */
	
	private Integer zhiyurenshu;
		
	/**
	 * 死亡人数
	 */
	
	private Integer siwangrenshu;
		
	/**
	 * 登记时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjishijian;
		
	/**
	 * 封面图
	 */
	
	private String fengmiantu;
				
	
	/**
	 * 设置：新增病例
	 */
	 
	public void setXinzengbingli(Integer xinzengbingli) {
		this.xinzengbingli = xinzengbingli;
	}
	
	/**
	 * 获取：新增病例
	 */
	public Integer getXinzengbingli() {
		return xinzengbingli;
	}
				
	
	/**
	 * 设置：累计确诊
	 */
	 
	public void setLeijiquezhen(Integer leijiquezhen) {
		this.leijiquezhen = leijiquezhen;
	}
	
	/**
	 * 获取：累计确诊
	 */
	public Integer getLeijiquezhen() {
		return leijiquezhen;
	}
				
	
	/**
	 * 设置：治愈人数
	 */
	 
	public void setZhiyurenshu(Integer zhiyurenshu) {
		this.zhiyurenshu = zhiyurenshu;
	}
	
	/**
	 * 获取：治愈人数
	 */
	public Integer getZhiyurenshu() {
		return zhiyurenshu;
	}
				
	
	/**
	 * 设置：死亡人数
	 */
	 
	public void setSiwangrenshu(Integer siwangrenshu) {
		this.siwangrenshu = siwangrenshu;
	}
	
	/**
	 * 获取：死亡人数
	 */
	public Integer getSiwangrenshu() {
		return siwangrenshu;
	}
				
	
	/**
	 * 设置：登记时间
	 */
	 
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}
				
	
	/**
	 * 设置：封面图
	 */
	 
	public void setFengmiantu(String fengmiantu) {
		this.fengmiantu = fengmiantu;
	}
	
	/**
	 * 获取：封面图
	 */
	public String getFengmiantu() {
		return fengmiantu;
	}
			
}
