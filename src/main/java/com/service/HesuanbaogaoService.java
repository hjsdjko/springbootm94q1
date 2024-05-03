package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HesuanbaogaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HesuanbaogaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HesuanbaogaoView;


/**
 * 核酸报告
 *
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public interface HesuanbaogaoService extends IService<HesuanbaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HesuanbaogaoVO> selectListVO(Wrapper<HesuanbaogaoEntity> wrapper);
   	
   	HesuanbaogaoVO selectVO(@Param("ew") Wrapper<HesuanbaogaoEntity> wrapper);
   	
   	List<HesuanbaogaoView> selectListView(Wrapper<HesuanbaogaoEntity> wrapper);
   	
   	HesuanbaogaoView selectView(@Param("ew") Wrapper<HesuanbaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HesuanbaogaoEntity> wrapper);
   	

}

