package com.dao;

import com.entity.JiankangdakaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangdakaVO;
import com.entity.view.JiankangdakaView;


/**
 * 健康打卡
 * 
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public interface JiankangdakaDao extends BaseMapper<JiankangdakaEntity> {
	
	List<JiankangdakaVO> selectListVO(@Param("ew") Wrapper<JiankangdakaEntity> wrapper);
	
	JiankangdakaVO selectVO(@Param("ew") Wrapper<JiankangdakaEntity> wrapper);
	
	List<JiankangdakaView> selectListView(@Param("ew") Wrapper<JiankangdakaEntity> wrapper);

	List<JiankangdakaView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangdakaEntity> wrapper);
	
	JiankangdakaView selectView(@Param("ew") Wrapper<JiankangdakaEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiankangdakaEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiankangdakaEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<JiankangdakaEntity> wrapper);
}
