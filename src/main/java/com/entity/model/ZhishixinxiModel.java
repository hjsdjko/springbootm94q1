package com.entity.model;

import com.entity.ZhishixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 知识信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public class ZhishixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
