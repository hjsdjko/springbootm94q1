package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 防疫教育
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
@TableName("fangyijiaoyu")
public class FangyijiaoyuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public FangyijiaoyuEntity() {
		
	}
	
	public FangyijiaoyuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 教育标题
	 */
					
	private String jiaoyubiaoti;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：教育标题
	 */
	public void setJiaoyubiaoti(String jiaoyubiaoti) {
		this.jiaoyubiaoti = jiaoyubiaoti;
	}
	/**
	 * 获取：教育标题
	 */
	public String getJiaoyubiaoti() {
		return jiaoyubiaoti;
	}
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
