package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FangyijiaoyuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FangyijiaoyuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FangyijiaoyuView;


/**
 * 防疫教育
 *
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public interface FangyijiaoyuService extends IService<FangyijiaoyuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FangyijiaoyuVO> selectListVO(Wrapper<FangyijiaoyuEntity> wrapper);
   	
   	FangyijiaoyuVO selectVO(@Param("ew") Wrapper<FangyijiaoyuEntity> wrapper);
   	
   	List<FangyijiaoyuView> selectListView(Wrapper<FangyijiaoyuEntity> wrapper);
   	
   	FangyijiaoyuView selectView(@Param("ew") Wrapper<FangyijiaoyuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FangyijiaoyuEntity> wrapper);
   	

}

