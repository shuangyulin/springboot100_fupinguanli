package com.dao;

import com.entity.YonghuyingpinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YonghuyingpinVO;
import com.entity.view.YonghuyingpinView;


/**
 * 用户应聘
 * 
 * @author 
 * @email 
 * @date 2021-05-07 09:32:05
 */
public interface YonghuyingpinDao extends BaseMapper<YonghuyingpinEntity> {
	
	List<YonghuyingpinVO> selectListVO(@Param("ew") Wrapper<YonghuyingpinEntity> wrapper);
	
	YonghuyingpinVO selectVO(@Param("ew") Wrapper<YonghuyingpinEntity> wrapper);
	
	List<YonghuyingpinView> selectListView(@Param("ew") Wrapper<YonghuyingpinEntity> wrapper);

	List<YonghuyingpinView> selectListView(Pagination page,@Param("ew") Wrapper<YonghuyingpinEntity> wrapper);
	
	YonghuyingpinView selectView(@Param("ew") Wrapper<YonghuyingpinEntity> wrapper);
	
}
