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


import com.dao.RuxiaodengjiDao;
import com.entity.RuxiaodengjiEntity;
import com.service.RuxiaodengjiService;
import com.entity.vo.RuxiaodengjiVO;
import com.entity.view.RuxiaodengjiView;

@Service("ruxiaodengjiService")
public class RuxiaodengjiServiceImpl extends ServiceImpl<RuxiaodengjiDao, RuxiaodengjiEntity> implements RuxiaodengjiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuxiaodengjiEntity> page = this.selectPage(
                new Query<RuxiaodengjiEntity>(params).getPage(),
                new EntityWrapper<RuxiaodengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuxiaodengjiEntity> wrapper) {
		  Page<RuxiaodengjiView> page =new Query<RuxiaodengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RuxiaodengjiVO> selectListVO(Wrapper<RuxiaodengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RuxiaodengjiVO selectVO(Wrapper<RuxiaodengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RuxiaodengjiView> selectListView(Wrapper<RuxiaodengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuxiaodengjiView selectView(Wrapper<RuxiaodengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
