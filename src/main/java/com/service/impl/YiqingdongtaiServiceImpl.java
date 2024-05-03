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


import com.dao.YiqingdongtaiDao;
import com.entity.YiqingdongtaiEntity;
import com.service.YiqingdongtaiService;
import com.entity.vo.YiqingdongtaiVO;
import com.entity.view.YiqingdongtaiView;

@Service("yiqingdongtaiService")
public class YiqingdongtaiServiceImpl extends ServiceImpl<YiqingdongtaiDao, YiqingdongtaiEntity> implements YiqingdongtaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YiqingdongtaiEntity> page = this.selectPage(
                new Query<YiqingdongtaiEntity>(params).getPage(),
                new EntityWrapper<YiqingdongtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YiqingdongtaiEntity> wrapper) {
		  Page<YiqingdongtaiView> page =new Query<YiqingdongtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YiqingdongtaiVO> selectListVO(Wrapper<YiqingdongtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YiqingdongtaiVO selectVO(Wrapper<YiqingdongtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YiqingdongtaiView> selectListView(Wrapper<YiqingdongtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YiqingdongtaiView selectView(Wrapper<YiqingdongtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
