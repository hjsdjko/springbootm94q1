package com.dao;

import com.entity.RuxiaodengjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RuxiaodengjiVO;
import com.entity.view.RuxiaodengjiView;


/**
 * 入校登记
 * 
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public interface RuxiaodengjiDao extends BaseMapper<RuxiaodengjiEntity> {
	
	List<RuxiaodengjiVO> selectListVO(@Param("ew") Wrapper<RuxiaodengjiEntity> wrapper);
	
	RuxiaodengjiVO selectVO(@Param("ew") Wrapper<RuxiaodengjiEntity> wrapper);
	
	List<RuxiaodengjiView> selectListView(@Param("ew") Wrapper<RuxiaodengjiEntity> wrapper);

	List<RuxiaodengjiView> selectListView(Pagination page,@Param("ew") Wrapper<RuxiaodengjiEntity> wrapper);
	
	RuxiaodengjiView selectView(@Param("ew") Wrapper<RuxiaodengjiEntity> wrapper);
	

}
