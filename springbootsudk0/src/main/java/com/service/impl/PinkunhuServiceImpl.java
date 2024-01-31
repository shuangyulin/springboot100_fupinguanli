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


import com.dao.PinkunhuDao;
import com.entity.PinkunhuEntity;
import com.service.PinkunhuService;
import com.entity.vo.PinkunhuVO;
import com.entity.view.PinkunhuView;

@Service("pinkunhuService")
public class PinkunhuServiceImpl extends ServiceImpl<PinkunhuDao, PinkunhuEntity> implements PinkunhuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PinkunhuEntity> page = this.selectPage(
                new Query<PinkunhuEntity>(params).getPage(),
                new EntityWrapper<PinkunhuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PinkunhuEntity> wrapper) {
		  Page<PinkunhuView> page =new Query<PinkunhuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PinkunhuVO> selectListVO(Wrapper<PinkunhuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PinkunhuVO selectVO(Wrapper<PinkunhuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PinkunhuView> selectListView(Wrapper<PinkunhuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PinkunhuView selectView(Wrapper<PinkunhuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
