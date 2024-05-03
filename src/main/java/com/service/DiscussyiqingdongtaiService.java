package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyiqingdongtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyiqingdongtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyiqingdongtaiView;


/**
 * 疫情动态评论表
 *
 * @author 
 * @email 
 * @date 2022-04-03 00:04:15
 */
public interface DiscussyiqingdongtaiService extends IService<DiscussyiqingdongtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyiqingdongtaiVO> selectListVO(Wrapper<DiscussyiqingdongtaiEntity> wrapper);
   	
   	DiscussyiqingdongtaiVO selectVO(@Param("ew") Wrapper<DiscussyiqingdongtaiEntity> wrapper);
   	
   	List<DiscussyiqingdongtaiView> selectListView(Wrapper<DiscussyiqingdongtaiEntity> wrapper);
   	
   	DiscussyiqingdongtaiView selectView(@Param("ew") Wrapper<DiscussyiqingdongtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyiqingdongtaiEntity> wrapper);
   	

}

