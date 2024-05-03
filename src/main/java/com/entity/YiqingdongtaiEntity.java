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
 * 疫情动态
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
@TableName("yiqingdongtai")
public class YiqingdongtaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YiqingdongtaiEntity() {
		
	}
	
	public YiqingdongtaiEntity(T t) {
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
	 * 城市地区
	 */
					
	private String chengshidiqu;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	/**
	 * 封面图
	 */
					
	private String fengmiantu;
	
	
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
	 * 设置：城市地区
	 */
	public void setChengshidiqu(String chengshidiqu) {
		this.chengshidiqu = chengshidiqu;
	}
	/**
	 * 获取：城市地区
	 */
	public String getChengshidiqu() {
		return chengshidiqu;
	}
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
