package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.FangyijiaoyuDao;
import com.entity.FangyijiaoyuEntity;
import com.service.FangyijiaoyuService;
import com.entity.vo.FangyijiaoyuVO;
import com.entity.view.FangyijiaoyuView;

@Service("fangyijiaoyuService")
public class FangyijiaoyuServiceImpl extends ServiceImpl<FangyijiaoyuDao, FangyijiaoyuEntity> implements FangyijiaoyuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FangyijiaoyuEntity> page = this.selectPage(
                new Query<FangyijiaoyuEntity>(params).getPage(),
                new EntityWrapper<FangyijiaoyuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FangyijiaoyuEntity> wrapper) {
		  Page<FangyijiaoyuView> page =new Query<FangyijiaoyuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FangyijiaoyuVO> selectListVO(Wrapper<FangyijiaoyuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FangyijiaoyuVO selectVO(Wrapper<FangyijiaoyuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FangyijiaoyuView> selectListView(Wrapper<FangyijiaoyuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FangyijiaoyuView selectView(Wrapper<FangyijiaoyuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
