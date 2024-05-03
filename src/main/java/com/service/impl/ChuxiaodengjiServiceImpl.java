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


import com.dao.ChuxiaodengjiDao;
import com.entity.ChuxiaodengjiEntity;
import com.service.ChuxiaodengjiService;
import com.entity.vo.ChuxiaodengjiVO;
import com.entity.view.ChuxiaodengjiView;

@Service("chuxiaodengjiService")
public class ChuxiaodengjiServiceImpl extends ServiceImpl<ChuxiaodengjiDao, ChuxiaodengjiEntity> implements ChuxiaodengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChuxiaodengjiEntity> page = this.selectPage(
                new Query<ChuxiaodengjiEntity>(params).getPage(),
                new EntityWrapper<ChuxiaodengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChuxiaodengjiEntity> wrapper) {
		  Page<ChuxiaodengjiView> page =new Query<ChuxiaodengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChuxiaodengjiVO> selectListVO(Wrapper<ChuxiaodengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChuxiaodengjiVO selectVO(Wrapper<ChuxiaodengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChuxiaodengjiView> selectListView(Wrapper<ChuxiaodengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChuxiaodengjiView selectView(Wrapper<ChuxiaodengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
