package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YiqingdongtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YiqingdongtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YiqingdongtaiView;


/**
 * 疫情动态
 *
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public interface YiqingdongtaiService extends IService<YiqingdongtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YiqingdongtaiVO> selectListVO(Wrapper<YiqingdongtaiEntity> wrapper);
   	
   	YiqingdongtaiVO selectVO(@Param("ew") Wrapper<YiqingdongtaiEntity> wrapper);
   	
   	List<YiqingdongtaiView> selectListView(Wrapper<YiqingdongtaiEntity> wrapper);
   	
   	YiqingdongtaiView selectView(@Param("ew") Wrapper<YiqingdongtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YiqingdongtaiEntity> wrapper);
   	

}

