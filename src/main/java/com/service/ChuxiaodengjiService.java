package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChuxiaodengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChuxiaodengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChuxiaodengjiView;


/**
 * 出校登记
 *
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
public interface ChuxiaodengjiService extends IService<ChuxiaodengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChuxiaodengjiVO> selectListVO(Wrapper<ChuxiaodengjiEntity> wrapper);
   	
   	ChuxiaodengjiVO selectVO(@Param("ew") Wrapper<ChuxiaodengjiEntity> wrapper);
   	
   	List<ChuxiaodengjiView> selectListView(Wrapper<ChuxiaodengjiEntity> wrapper);
   	
   	ChuxiaodengjiView selectView(@Param("ew") Wrapper<ChuxiaodengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChuxiaodengjiEntity> wrapper);
   	

}

