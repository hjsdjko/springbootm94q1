package com.dao;

import com.entity.DiscussfangyijiaoyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussfangyijiaoyuVO;
import com.entity.view.DiscussfangyijiaoyuView;


/**
 * 防疫教育评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-03 00:04:15
 */
public interface DiscussfangyijiaoyuDao extends BaseMapper<DiscussfangyijiaoyuEntity> {
	
	List<DiscussfangyijiaoyuVO> selectListVO(@Param("ew") Wrapper<DiscussfangyijiaoyuEntity> wrapper);
	
	DiscussfangyijiaoyuVO selectVO(@Param("ew") Wrapper<DiscussfangyijiaoyuEntity> wrapper);
	
	List<DiscussfangyijiaoyuView> selectListView(@Param("ew") Wrapper<DiscussfangyijiaoyuEntity> wrapper);

	List<DiscussfangyijiaoyuView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussfangyijiaoyuEntity> wrapper);
	
	DiscussfangyijiaoyuView selectView(@Param("ew") Wrapper<DiscussfangyijiaoyuEntity> wrapper);
	

}
