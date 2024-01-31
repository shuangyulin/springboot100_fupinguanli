package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 用户应聘
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-07 09:32:05
 */
@TableName("yonghuyingpin")
public class YonghuyingpinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YonghuyingpinEntity() {
		
	}
	
	public YonghuyingpinEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 招聘标题
	 */
					
	private String zhaopinbiaoti;
	
	/**
	 * 职位
	 */
					
	private String zhiwei;
	
	/**
	 * 是否应聘
	 */
					
	private String shifouyingpin;
	
	/**
	 * 应聘原因
	 */
					
	private String yingpinyuanyin;
	
	/**
	 * 应聘时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date yingpinshijian;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：招聘标题
	 */
	public void setZhaopinbiaoti(String zhaopinbiaoti) {
		this.zhaopinbiaoti = zhaopinbiaoti;
	}
	/**
	 * 获取：招聘标题
	 */
	public String getZhaopinbiaoti() {
		return zhaopinbiaoti;
	}
	/**
	 * 设置：职位
	 */
	public void setZhiwei(String zhiwei) {
		this.zhiwei = zhiwei;
	}
	/**
	 * 获取：职位
	 */
	public String getZhiwei() {
		return zhiwei;
	}
	/**
	 * 设置：是否应聘
	 */
	public void setShifouyingpin(String shifouyingpin) {
		this.shifouyingpin = shifouyingpin;
	}
	/**
	 * 获取：是否应聘
	 */
	public String getShifouyingpin() {
		return shifouyingpin;
	}
	/**
	 * 设置：应聘原因
	 */
	public void setYingpinyuanyin(String yingpinyuanyin) {
		this.yingpinyuanyin = yingpinyuanyin;
	}
	/**
	 * 获取：应聘原因
	 */
	public String getYingpinyuanyin() {
		return yingpinyuanyin;
	}
	/**
	 * 设置：应聘时间
	 */
	public void setYingpinshijian(Date yingpinshijian) {
		this.yingpinshijian = yingpinshijian;
	}
	/**
	 * 获取：应聘时间
	 */
	public Date getYingpinshijian() {
		return yingpinshijian;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
