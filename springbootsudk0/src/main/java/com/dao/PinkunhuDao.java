package com.dao;

import com.entity.PinkunhuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PinkunhuVO;
import com.entity.view.PinkunhuView;


/**
 * 贫困户
 * 
 * @author 
 * @email 
 * @date 2021-05-07 09:32:05
 */
public interface PinkunhuDao extends BaseMapper<PinkunhuEntity> {
	
	List<PinkunhuVO> selectListVO(@Param("ew") Wrapper<PinkunhuEntity> wrapper);
	
	PinkunhuVO selectVO(@Param("ew") Wrapper<PinkunhuEntity> wrapper);
	
	List<PinkunhuView> selectListView(@Param("ew") Wrapper<PinkunhuEntity> wrapper);

	List<PinkunhuView> selectListView(Pagination page,@Param("ew") Wrapper<PinkunhuEntity> wrapper);
	
	PinkunhuView selectView(@Param("ew") Wrapper<PinkunhuEntity> wrapper);
	
}
