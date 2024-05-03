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


import com.dao.DiscussfangyijiaoyuDao;
import com.entity.DiscussfangyijiaoyuEntity;
import com.service.DiscussfangyijiaoyuService;
import com.entity.vo.DiscussfangyijiaoyuVO;
import com.entity.view.DiscussfangyijiaoyuView;

@Service("discussfangyijiaoyuService")
public class DiscussfangyijiaoyuServiceImpl extends ServiceImpl<DiscussfangyijiaoyuDao, DiscussfangyijiaoyuEntity> implements DiscussfangyijiaoyuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussfangyijiaoyuEntity> page = this.selectPage(
                new Query<DiscussfangyijiaoyuEntity>(params).getPage(),
                new EntityWrapper<DiscussfangyijiaoyuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussfangyijiaoyuEntity> wrapper) {
		  Page<DiscussfangyijiaoyuView> page =new Query<DiscussfangyijiaoyuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussfangyijiaoyuVO> selectListVO(Wrapper<DiscussfangyijiaoyuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussfangyijiaoyuVO selectVO(Wrapper<DiscussfangyijiaoyuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussfangyijiaoyuView> selectListView(Wrapper<DiscussfangyijiaoyuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussfangyijiaoyuView selectView(Wrapper<DiscussfangyijiaoyuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
