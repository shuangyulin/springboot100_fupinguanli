package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YonghuyingpinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YonghuyingpinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghuyingpinView;


/**
 * 用户应聘
 *
 * @author 
 * @email 
 * @date 2021-05-07 09:32:05
 */
public interface YonghuyingpinService extends IService<YonghuyingpinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YonghuyingpinVO> selectListVO(Wrapper<YonghuyingpinEntity> wrapper);
   	
   	YonghuyingpinVO selectVO(@Param("ew") Wrapper<YonghuyingpinEntity> wrapper);
   	
   	List<YonghuyingpinView> selectListView(Wrapper<YonghuyingpinEntity> wrapper);
   	
   	YonghuyingpinView selectView(@Param("ew") Wrapper<YonghuyingpinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YonghuyingpinEntity> wrapper);
   	
}

