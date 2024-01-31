package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhiyuanzhezhaopinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhiyuanzhezhaopinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhiyuanzhezhaopinView;


/**
 * 志愿者招聘
 *
 * @author 
 * @email 
 * @date 2021-05-07 09:32:05
 */
public interface ZhiyuanzhezhaopinService extends IService<ZhiyuanzhezhaopinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhiyuanzhezhaopinVO> selectListVO(Wrapper<ZhiyuanzhezhaopinEntity> wrapper);
   	
   	ZhiyuanzhezhaopinVO selectVO(@Param("ew") Wrapper<ZhiyuanzhezhaopinEntity> wrapper);
   	
   	List<ZhiyuanzhezhaopinView> selectListView(Wrapper<ZhiyuanzhezhaopinEntity> wrapper);
   	
   	ZhiyuanzhezhaopinView selectView(@Param("ew") Wrapper<ZhiyuanzhezhaopinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhiyuanzhezhaopinEntity> wrapper);
   	
}

