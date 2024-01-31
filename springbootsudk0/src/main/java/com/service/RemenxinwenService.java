package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RemenxinwenEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RemenxinwenVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RemenxinwenView;


/**
 * 热门新闻
 *
 * @author 
 * @email 
 * @date 2021-05-07 09:32:05
 */
public interface RemenxinwenService extends IService<RemenxinwenEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RemenxinwenVO> selectListVO(Wrapper<RemenxinwenEntity> wrapper);
   	
   	RemenxinwenVO selectVO(@Param("ew") Wrapper<RemenxinwenEntity> wrapper);
   	
   	List<RemenxinwenView> selectListView(Wrapper<RemenxinwenEntity> wrapper);
   	
   	RemenxinwenView selectView(@Param("ew") Wrapper<RemenxinwenEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RemenxinwenEntity> wrapper);
   	
}

