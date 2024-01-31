package com.entity.view;

import com.entity.YonghuyingpinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 用户应聘
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 09:32:05
 */
@TableName("yonghuyingpin")
public class YonghuyingpinView  extends YonghuyingpinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YonghuyingpinView(){
	}
 
 	public YonghuyingpinView(YonghuyingpinEntity yonghuyingpinEntity){
 	try {
			BeanUtils.copyProperties(this, yonghuyingpinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
