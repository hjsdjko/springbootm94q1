package com.entity.vo;

import com.entity.JiankangdakaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 健康打卡
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public class JiankangdakaVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 身体情况
	 */
	
	private String shentiqingkuang;
		
	/**
	 * 体温
	 */
	
	private Float tiwen;
		
	/**
	 * 是否发热
	 */
	
	private String shifoufare;
		
	/**
	 * 是否咳嗽
	 */
	
	private String shifoukesou;
		
	/**
	 * 接触史
	 */
	
	private String jiechushi;
		
	/**
	 * 打卡时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dakashijian;
		
	/**
	 * 打卡地点
	 */
	
	private String dakadidian;
		
	/**
	 * 健康码
	 */
	
	private String jiankangma;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：身体情况
	 */
	 
	public void setShentiqingkuang(String shentiqingkuang) {
		this.shentiqingkuang = shentiqingkuang;
	}
	
	/**
	 * 获取：身体情况
	 */
	public String getShentiqingkuang() {
		return shentiqingkuang;
	}
				
	
	/**
	 * 设置：体温
	 */
	 
	public void setTiwen(Float tiwen) {
		this.tiwen = tiwen;
	}
	
	/**
	 * 获取：体温
	 */
	public Float getTiwen() {
		return tiwen;
	}
				
	
	/**
	 * 设置：是否发热
	 */
	 
	public void setShifoufare(String shifoufare) {
		this.shifoufare = shifoufare;
	}
	
	/**
	 * 获取：是否发热
	 */
	public String getShifoufare() {
		return shifoufare;
	}
				
	
	/**
	 * 设置：是否咳嗽
	 */
	 
	public void setShifoukesou(String shifoukesou) {
		this.shifoukesou = shifoukesou;
	}
	
	/**
	 * 获取：是否咳嗽
	 */
	public String getShifoukesou() {
		return shifoukesou;
	}
				
	
	/**
	 * 设置：接触史
	 */
	 
	public void setJiechushi(String jiechushi) {
		this.jiechushi = jiechushi;
	}
	
	/**
	 * 获取：接触史
	 */
	public String getJiechushi() {
		return jiechushi;
	}
				
	
	/**
	 * 设置：打卡时间
	 */
	 
	public void setDakashijian(Date dakashijian) {
		this.dakashijian = dakashijian;
	}
	
	/**
	 * 获取：打卡时间
	 */
	public Date getDakashijian() {
		return dakashijian;
	}
				
	
	/**
	 * 设置：打卡地点
	 */
	 
	public void setDakadidian(String dakadidian) {
		this.dakadidian = dakadidian;
	}
	
	/**
	 * 获取：打卡地点
	 */
	public String getDakadidian() {
		return dakadidian;
	}
				
	
	/**
	 * 设置：健康码
	 */
	 
	public void setJiankangma(String jiankangma) {
		this.jiankangma = jiankangma;
	}
	
	/**
	 * 获取：健康码
	 */
	public String getJiankangma() {
		return jiankangma;
	}
			
}
