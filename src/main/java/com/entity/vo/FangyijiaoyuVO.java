package com.entity.vo;

import com.entity.FangyijiaoyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 防疫教育
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public class FangyijiaoyuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教育类型
	 */
	
	private String jiaoyuleixing;
		
	/**
	 * 教育简介
	 */
	
	private String jiaoyujianjie;
		
	/**
	 * 教育内容
	 */
	
	private String jiaoyuneirong;
		
	/**
	 * 教育图片
	 */
	
	private String jiaoyutupian;
				
	
	/**
	 * 设置：教育类型
	 */
	 
	public void setJiaoyuleixing(String jiaoyuleixing) {
		this.jiaoyuleixing = jiaoyuleixing;
	}
	
	/**
	 * 获取：教育类型
	 */
	public String getJiaoyuleixing() {
		return jiaoyuleixing;
	}
				
	
	/**
	 * 设置：教育简介
	 */
	 
	public void setJiaoyujianjie(String jiaoyujianjie) {
		this.jiaoyujianjie = jiaoyujianjie;
	}
	
	/**
	 * 获取：教育简介
	 */
	public String getJiaoyujianjie() {
		return jiaoyujianjie;
	}
				
	
	/**
	 * 设置：教育内容
	 */
	 
	public void setJiaoyuneirong(String jiaoyuneirong) {
		this.jiaoyuneirong = jiaoyuneirong;
	}
	
	/**
	 * 获取：教育内容
	 */
	public String getJiaoyuneirong() {
		return jiaoyuneirong;
	}
				
	
	/**
	 * 设置：教育图片
	 */
	 
	public void setJiaoyutupian(String jiaoyutupian) {
		this.jiaoyutupian = jiaoyutupian;
	}
	
	/**
	 * 获取：教育图片
	 */
	public String getJiaoyutupian() {
		return jiaoyutupian;
	}
			
}
