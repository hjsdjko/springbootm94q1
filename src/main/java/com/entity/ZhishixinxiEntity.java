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
 * 知识信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
@TableName("zhishixinxi")
public class ZhishixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhishixinxiEntity() {
		
	}
	
	public ZhishixinxiEntity(T t) {
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
	 * 知识名称
	 */
					
	private String zhishimingcheng;
	
	/**
	 * 知识类型
	 */
					
	private String zhishileixing;
	
	/**
	 * 知识简介
	 */
					
	private String zhishijianjie;
	
	/**
	 * 知识内容
	 */
					
	private String zhishineirong;
	
	/**
	 * 知识图片
	 */
					
	private String zhishitupian;
	
	
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
	 * 设置：知识名称
	 */
	public void setZhishimingcheng(String zhishimingcheng) {
		this.zhishimingcheng = zhishimingcheng;
	}
	/**
	 * 获取：知识名称
	 */
	public String getZhishimingcheng() {
		return zhishimingcheng;
	}
	/**
	 * 设置：知识类型
	 */
	public void setZhishileixing(String zhishileixing) {
		this.zhishileixing = zhishileixing;
	}
	/**
	 * 获取：知识类型
	 */
	public String getZhishileixing() {
		return zhishileixing;
	}
	/**
	 * 设置：知识简介
	 */
	public void setZhishijianjie(String zhishijianjie) {
		this.zhishijianjie = zhishijianjie;
	}
	/**
	 * 获取：知识简介
	 */
	public String getZhishijianjie() {
		return zhishijianjie;
	}
	/**
	 * 设置：知识内容
	 */
	public void setZhishineirong(String zhishineirong) {
		this.zhishineirong = zhishineirong;
	}
	/**
	 * 获取：知识内容
	 */
	public String getZhishineirong() {
		return zhishineirong;
	}
	/**
	 * 设置：知识图片
	 */
	public void setZhishitupian(String zhishitupian) {
		this.zhishitupian = zhishitupian;
	}
	/**
	 * 获取：知识图片
	 */
	public String getZhishitupian() {
		return zhishitupian;
	}

}
