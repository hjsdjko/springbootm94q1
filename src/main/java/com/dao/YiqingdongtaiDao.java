package com.dao;

import com.entity.YiqingdongtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YiqingdongtaiVO;
import com.entity.view.YiqingdongtaiView;


/**
 * 疫情动态
 * 
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public interface YiqingdongtaiDao extends BaseMapper<YiqingdongtaiEntity> {
	
	List<YiqingdongtaiVO> selectListVO(@Param("ew") Wrapper<YiqingdongtaiEntity> wrapper);
	
	YiqingdongtaiVO selectVO(@Param("ew") Wrapper<YiqingdongtaiEntity> wrapper);
	
	List<YiqingdongtaiView> selectListView(@Param("ew") Wrapper<YiqingdongtaiEntity> wrapper);

	List<YiqingdongtaiView> selectListView(Pagination page,@Param("ew") Wrapper<YiqingdongtaiEntity> wrapper);
	
	YiqingdongtaiView selectView(@Param("ew") Wrapper<YiqingdongtaiEntity> wrapper);
	

}
