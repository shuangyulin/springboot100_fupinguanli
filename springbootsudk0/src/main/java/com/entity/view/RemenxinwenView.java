package com.entity.view;

import com.entity.RemenxinwenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 热门新闻
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-07 09:32:05
 */
@TableName("remenxinwen")
public class RemenxinwenView  extends RemenxinwenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RemenxinwenView(){
	}
 
 	public RemenxinwenView(RemenxinwenEntity remenxinwenEntity){
 	try {
			BeanUtils.copyProperties(this, remenxinwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
