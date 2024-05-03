package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussfangyijiaoyuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussfangyijiaoyuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussfangyijiaoyuView;


/**
 * 防疫教育评论表
 *
 * @author 
 * @email 
 * @date 2022-04-03 00:04:15
 */
public interface DiscussfangyijiaoyuService extends IService<DiscussfangyijiaoyuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussfangyijiaoyuVO> selectListVO(Wrapper<DiscussfangyijiaoyuEntity> wrapper);
   	
   	DiscussfangyijiaoyuVO selectVO(@Param("ew") Wrapper<DiscussfangyijiaoyuEntity> wrapper);
   	
   	List<DiscussfangyijiaoyuView> selectListView(Wrapper<DiscussfangyijiaoyuEntity> wrapper);
   	
   	DiscussfangyijiaoyuView selectView(@Param("ew") Wrapper<DiscussfangyijiaoyuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussfangyijiaoyuEntity> wrapper);
   	

}

