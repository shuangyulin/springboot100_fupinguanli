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


import com.dao.YonghuyingpinDao;
import com.entity.YonghuyingpinEntity;
import com.service.YonghuyingpinService;
import com.entity.vo.YonghuyingpinVO;
import com.entity.view.YonghuyingpinView;

@Service("yonghuyingpinService")
public class YonghuyingpinServiceImpl extends ServiceImpl<YonghuyingpinDao, YonghuyingpinEntity> implements YonghuyingpinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YonghuyingpinEntity> page = this.selectPage(
                new Query<YonghuyingpinEntity>(params).getPage(),
                new EntityWrapper<YonghuyingpinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YonghuyingpinEntity> wrapper) {
		  Page<YonghuyingpinView> page =new Query<YonghuyingpinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YonghuyingpinVO> selectListVO(Wrapper<YonghuyingpinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YonghuyingpinVO selectVO(Wrapper<YonghuyingpinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YonghuyingpinView> selectListView(Wrapper<YonghuyingpinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YonghuyingpinView selectView(Wrapper<YonghuyingpinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
