package com.dao;

import com.entity.FangyijiaoyuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FangyijiaoyuVO;
import com.entity.view.FangyijiaoyuView;


/**
 * 防疫教育
 * 
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public interface FangyijiaoyuDao extends BaseMapper<FangyijiaoyuEntity> {
	
	List<FangyijiaoyuVO> selectListVO(@Param("ew") Wrapper<FangyijiaoyuEntity> wrapper);
	
	FangyijiaoyuVO selectVO(@Param("ew") Wrapper<FangyijiaoyuEntity> wrapper);
	
	List<FangyijiaoyuView> selectListView(@Param("ew") Wrapper<FangyijiaoyuEntity> wrapper);

	List<FangyijiaoyuView> selectListView(Pagination page,@Param("ew") Wrapper<FangyijiaoyuEntity> wrapper);
	
	FangyijiaoyuView selectView(@Param("ew") Wrapper<FangyijiaoyuEntity> wrapper);
	

}
