package com.entity.view;

import com.entity.ZhiyuanzhezhaopinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 志愿者招聘
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 09:32:05
 */
@TableName("zhiyuanzhezhaopin")
public class ZhiyuanzhezhaopinView  extends ZhiyuanzhezhaopinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiyuanzhezhaopinView(){
	}
 
 	public ZhiyuanzhezhaopinView(ZhiyuanzhezhaopinEntity zhiyuanzhezhaopinEntity){
 	try {
			BeanUtils.copyProperties(this, zhiyuanzhezhaopinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
