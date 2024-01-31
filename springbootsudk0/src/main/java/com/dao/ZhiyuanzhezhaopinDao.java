package com.dao;

import com.entity.ZhiyuanzhezhaopinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhiyuanzhezhaopinVO;
import com.entity.view.ZhiyuanzhezhaopinView;


/**
 * 志愿者招聘
 * 
 * @author 
 * @email 
 * @date 2021-05-07 09:32:05
 */
public interface ZhiyuanzhezhaopinDao extends BaseMapper<ZhiyuanzhezhaopinEntity> {
	
	List<ZhiyuanzhezhaopinVO> selectListVO(@Param("ew") Wrapper<ZhiyuanzhezhaopinEntity> wrapper);
	
	ZhiyuanzhezhaopinVO selectVO(@Param("ew") Wrapper<ZhiyuanzhezhaopinEntity> wrapper);
	
	List<ZhiyuanzhezhaopinView> selectListView(@Param("ew") Wrapper<ZhiyuanzhezhaopinEntity> wrapper);

	List<ZhiyuanzhezhaopinView> selectListView(Pagination page,@Param("ew") Wrapper<ZhiyuanzhezhaopinEntity> wrapper);
	
	ZhiyuanzhezhaopinView selectView(@Param("ew") Wrapper<ZhiyuanzhezhaopinEntity> wrapper);
	
}
