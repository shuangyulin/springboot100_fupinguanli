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


import com.dao.RemenxinwenDao;
import com.entity.RemenxinwenEntity;
import com.service.RemenxinwenService;
import com.entity.vo.RemenxinwenVO;
import com.entity.view.RemenxinwenView;

@Service("remenxinwenService")
public class RemenxinwenServiceImpl extends ServiceImpl<RemenxinwenDao, RemenxinwenEntity> implements RemenxinwenService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RemenxinwenEntity> page = this.selectPage(
                new Query<RemenxinwenEntity>(params).getPage(),
                new EntityWrapper<RemenxinwenEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RemenxinwenEntity> wrapper) {
		  Page<RemenxinwenView> page =new Query<RemenxinwenView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RemenxinwenVO> selectListVO(Wrapper<RemenxinwenEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RemenxinwenVO selectVO(Wrapper<RemenxinwenEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RemenxinwenView> selectListView(Wrapper<RemenxinwenEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RemenxinwenView selectView(Wrapper<RemenxinwenEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
