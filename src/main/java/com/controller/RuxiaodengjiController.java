package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.RuxiaodengjiEntity;
import com.entity.view.RuxiaodengjiView;

import com.service.RuxiaodengjiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 入校登记
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-03 00:04:14
 */
@RestController
@RequestMapping("/ruxiaodengji")
public class RuxiaodengjiController {
    @Autowired
    private RuxiaodengjiService ruxiaodengjiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RuxiaodengjiEntity ruxiaodengji,
		HttpServletRequest request){
        EntityWrapper<RuxiaodengjiEntity> ew = new EntityWrapper<RuxiaodengjiEntity>();
		PageUtils page = ruxiaodengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ruxiaodengji), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RuxiaodengjiEntity ruxiaodengji, 
		HttpServletRequest request){
        EntityWrapper<RuxiaodengjiEntity> ew = new EntityWrapper<RuxiaodengjiEntity>();
		PageUtils page = ruxiaodengjiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ruxiaodengji), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RuxiaodengjiEntity ruxiaodengji){
       	EntityWrapper<RuxiaodengjiEntity> ew = new EntityWrapper<RuxiaodengjiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ruxiaodengji, "ruxiaodengji")); 
        return R.ok().put("data", ruxiaodengjiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RuxiaodengjiEntity ruxiaodengji){
        EntityWrapper< RuxiaodengjiEntity> ew = new EntityWrapper< RuxiaodengjiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ruxiaodengji, "ruxiaodengji")); 
		RuxiaodengjiView ruxiaodengjiView =  ruxiaodengjiService.selectView(ew);
		return R.ok("查询入校登记成功").put("data", ruxiaodengjiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RuxiaodengjiEntity ruxiaodengji = ruxiaodengjiService.selectById(id);
        return R.ok().put("data", ruxiaodengji);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RuxiaodengjiEntity ruxiaodengji = ruxiaodengjiService.selectById(id);
        return R.ok().put("data", ruxiaodengji);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RuxiaodengjiEntity ruxiaodengji, HttpServletRequest request){
    	ruxiaodengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ruxiaodengji);
        ruxiaodengjiService.insert(ruxiaodengji);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RuxiaodengjiEntity ruxiaodengji, HttpServletRequest request){
    	ruxiaodengji.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ruxiaodengji);
        ruxiaodengjiService.insert(ruxiaodengji);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody RuxiaodengjiEntity ruxiaodengji, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ruxiaodengji);
        ruxiaodengjiService.updateById(ruxiaodengji);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ruxiaodengjiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<RuxiaodengjiEntity> wrapper = new EntityWrapper<RuxiaodengjiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = ruxiaodengjiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
