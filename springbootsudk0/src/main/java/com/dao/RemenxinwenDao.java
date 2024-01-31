package com.dao;

import com.entity.RemenxinwenEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RemenxinwenVO;
import com.entity.view.RemenxinwenView;


/**
 * 热门新闻
 * 
 * @author 
 * @email 
 * @date 2021-05-07 09:32:05
 */
public interface RemenxinwenDao extends BaseMapper<RemenxinwenEntity> {
	
	List<RemenxinwenVO> selectListVO(@Param("ew") Wrapper<RemenxinwenEntity> wrapper);
	
	RemenxinwenVO selectVO(@Param("ew") Wrapper<RemenxinwenEntity> wrapper);
	
	List<RemenxinwenView> selectListView(@Param("ew") Wrapper<RemenxinwenEntity> wrapper);

	List<RemenxinwenView> selectListView(Pagination page,@Param("ew") Wrapper<RemenxinwenEntity> wrapper);
	
	RemenxinwenView selectView(@Param("ew") Wrapper<RemenxinwenEntity> wrapper);
	
}
