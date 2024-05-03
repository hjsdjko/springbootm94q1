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


import com.dao.DiscussyiqingdongtaiDao;
import com.entity.DiscussyiqingdongtaiEntity;
import com.service.DiscussyiqingdongtaiService;
import com.entity.vo.DiscussyiqingdongtaiVO;
import com.entity.view.DiscussyiqingdongtaiView;

@Service("discussyiqingdongtaiService")
public class DiscussyiqingdongtaiServiceImpl extends ServiceImpl<DiscussyiqingdongtaiDao, DiscussyiqingdongtaiEntity> implements DiscussyiqingdongtaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyiqingdongtaiEntity> page = this.selectPage(
                new Query<DiscussyiqingdongtaiEntity>(params).getPage(),
                new EntityWrapper<DiscussyiqingdongtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyiqingdongtaiEntity> wrapper) {
		  Page<DiscussyiqingdongtaiView> page =new Query<DiscussyiqingdongtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyiqingdongtaiVO> selectListVO(Wrapper<DiscussyiqingdongtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyiqingdongtaiVO selectVO(Wrapper<DiscussyiqingdongtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyiqingdongtaiView> selectListView(Wrapper<DiscussyiqingdongtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyiqingdongtaiView selectView(Wrapper<DiscussyiqingdongtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
