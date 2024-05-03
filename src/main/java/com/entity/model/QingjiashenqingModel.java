package com.entity.model;

import com.entity.QingjiashenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 请假申请
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public class QingjiashenqingModel  implements Serializable {
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
	 * 请假时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date qingjiashijian;
		
	/**
	 * 回来时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huilaishijian;
		
	/**
	 * 相关地点
	 */
	
	private String xiangguandidian;
		
	/**
	 * 请假事由
	 */
	
	private String qingjiashiyou;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：请假时间
	 */
	 
	public void setQingjiashijian(Date qingjiashijian) {
		this.qingjiashijian = qingjiashijian;
	}
	
	/**
	 * 获取：请假时间
	 */
	public Date getQingjiashijian() {
		return qingjiashijian;
	}
				
	
	/**
	 * 设置：回来时间
	 */
	 
	public void setHuilaishijian(Date huilaishijian) {
		this.huilaishijian = huilaishijian;
	}
	
	/**
	 * 获取：回来时间
	 */
	public Date getHuilaishijian() {
		return huilaishijian;
	}
				
	
	/**
	 * 设置：相关地点
	 */
	 
	public void setXiangguandidian(String xiangguandidian) {
		this.xiangguandidian = xiangguandidian;
	}
	
	/**
	 * 获取：相关地点
	 */
	public String getXiangguandidian() {
		return xiangguandidian;
	}
				
	
	/**
	 * 设置：请假事由
	 */
	 
	public void setQingjiashiyou(String qingjiashiyou) {
		this.qingjiashiyou = qingjiashiyou;
	}
	
	/**
	 * 获取：请假事由
	 */
	public String getQingjiashiyou() {
		return qingjiashiyou;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
