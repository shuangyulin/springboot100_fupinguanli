package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PinkunhuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PinkunhuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PinkunhuView;


/**
 * 贫困户
 *
 * @author 
 * @email 
 * @date 2021-05-07 09:32:05
 */
public interface PinkunhuService extends IService<PinkunhuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PinkunhuVO> selectListVO(Wrapper<PinkunhuEntity> wrapper);
   	
   	PinkunhuVO selectVO(@Param("ew") Wrapper<PinkunhuEntity> wrapper);
   	
   	List<PinkunhuView> selectListView(Wrapper<PinkunhuEntity> wrapper);
   	
   	PinkunhuView selectView(@Param("ew") Wrapper<PinkunhuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PinkunhuEntity> wrapper);
   	
}

