package com.dao;

import com.entity.ChuxiaodengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChuxiaodengjiVO;
import com.entity.view.ChuxiaodengjiView;


/**
 * 出校登记
 * 
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public interface ChuxiaodengjiDao extends BaseMapper<ChuxiaodengjiEntity> {
	
	List<ChuxiaodengjiVO> selectListVO(@Param("ew") Wrapper<ChuxiaodengjiEntity> wrapper);
	
	ChuxiaodengjiVO selectVO(@Param("ew") Wrapper<ChuxiaodengjiEntity> wrapper);
	
	List<ChuxiaodengjiView> selectListView(@Param("ew") Wrapper<ChuxiaodengjiEntity> wrapper);

	List<ChuxiaodengjiView> selectListView(Pagination page,@Param("ew") Wrapper<ChuxiaodengjiEntity> wrapper);
	
	ChuxiaodengjiView selectView(@Param("ew") Wrapper<ChuxiaodengjiEntity> wrapper);
	

}
