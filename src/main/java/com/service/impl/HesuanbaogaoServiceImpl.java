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


import com.dao.HesuanbaogaoDao;
import com.entity.HesuanbaogaoEntity;
import com.service.HesuanbaogaoService;
import com.entity.vo.HesuanbaogaoVO;
import com.entity.view.HesuanbaogaoView;

@Service("hesuanbaogaoService")
public class HesuanbaogaoServiceImpl extends ServiceImpl<HesuanbaogaoDao, HesuanbaogaoEntity> implements HesuanbaogaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HesuanbaogaoEntity> page = this.selectPage(
                new Query<HesuanbaogaoEntity>(params).getPage(),
                new EntityWrapper<HesuanbaogaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HesuanbaogaoEntity> wrapper) {
		  Page<HesuanbaogaoView> page =new Query<HesuanbaogaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HesuanbaogaoVO> selectListVO(Wrapper<HesuanbaogaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HesuanbaogaoVO selectVO(Wrapper<HesuanbaogaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HesuanbaogaoView> selectListView(Wrapper<HesuanbaogaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HesuanbaogaoView selectView(Wrapper<HesuanbaogaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
