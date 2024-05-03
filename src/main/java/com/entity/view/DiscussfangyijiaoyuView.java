package com.entity.view;

import com.entity.DiscussfangyijiaoyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 防疫教育评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-03 00:04:15
 */
@TableName("discussfangyijiaoyu")
public class DiscussfangyijiaoyuView  extends DiscussfangyijiaoyuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussfangyijiaoyuView(){
	}
 
 	public DiscussfangyijiaoyuView(DiscussfangyijiaoyuEntity discussfangyijiaoyuEntity){
 	try {
			BeanUtils.copyProperties(this, discussfangyijiaoyuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
