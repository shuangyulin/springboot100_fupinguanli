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


import com.dao.ZhiyuanzhezhaopinDao;
import com.entity.ZhiyuanzhezhaopinEntity;
import com.service.ZhiyuanzhezhaopinService;
import com.entity.vo.ZhiyuanzhezhaopinVO;
import com.entity.view.ZhiyuanzhezhaopinView;

@Service("zhiyuanzhezhaopinService")
public class ZhiyuanzhezhaopinServiceImpl extends ServiceImpl<ZhiyuanzhezhaopinDao, ZhiyuanzhezhaopinEntity> implements ZhiyuanzhezhaopinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhiyuanzhezhaopinEntity> page = this.selectPage(
                new Query<ZhiyuanzhezhaopinEntity>(params).getPage(),
                new EntityWrapper<ZhiyuanzhezhaopinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhiyuanzhezhaopinEntity> wrapper) {
		  Page<ZhiyuanzhezhaopinView> page =new Query<ZhiyuanzhezhaopinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhiyuanzhezhaopinVO> selectListVO(Wrapper<ZhiyuanzhezhaopinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhiyuanzhezhaopinVO selectVO(Wrapper<ZhiyuanzhezhaopinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhiyuanzhezhaopinView> selectListView(Wrapper<ZhiyuanzhezhaopinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhiyuanzhezhaopinView selectView(Wrapper<ZhiyuanzhezhaopinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
