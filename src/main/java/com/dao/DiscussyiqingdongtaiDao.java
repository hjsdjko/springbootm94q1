package com.dao;

import com.entity.DiscussyiqingdongtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyiqingdongtaiVO;
import com.entity.view.DiscussyiqingdongtaiView;


/**
 * 疫情动态评论表
 * 
 * @author 
 * @email 
 * @date 2022-04-03 00:04:15
 */
public interface DiscussyiqingdongtaiDao extends BaseMapper<DiscussyiqingdongtaiEntity> {
	
	List<DiscussyiqingdongtaiVO> selectListVO(@Param("ew") Wrapper<DiscussyiqingdongtaiEntity> wrapper);
	
	DiscussyiqingdongtaiVO selectVO(@Param("ew") Wrapper<DiscussyiqingdongtaiEntity> wrapper);
	
	List<DiscussyiqingdongtaiView> selectListView(@Param("ew") Wrapper<DiscussyiqingdongtaiEntity> wrapper);

	List<DiscussyiqingdongtaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyiqingdongtaiEntity> wrapper);
	
	DiscussyiqingdongtaiView selectView(@Param("ew") Wrapper<DiscussyiqingdongtaiEntity> wrapper);
	

}
