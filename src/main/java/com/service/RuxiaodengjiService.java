package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RuxiaodengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RuxiaodengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RuxiaodengjiView;


/**
 * 入校登记
 *
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public interface RuxiaodengjiService extends IService<RuxiaodengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuxiaodengjiVO> selectListVO(Wrapper<RuxiaodengjiEntity> wrapper);
   	
   	RuxiaodengjiVO selectVO(@Param("ew") Wrapper<RuxiaodengjiEntity> wrapper);
   	
   	List<RuxiaodengjiView> selectListView(Wrapper<RuxiaodengjiEntity> wrapper);
   	
   	RuxiaodengjiView selectView(@Param("ew") Wrapper<RuxiaodengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuxiaodengjiEntity> wrapper);
   	

}

