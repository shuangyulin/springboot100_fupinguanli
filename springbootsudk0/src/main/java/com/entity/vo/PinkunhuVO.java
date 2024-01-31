package com.entity.vo;

import com.entity.PinkunhuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 贫困户
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-07 09:32:05
 */
public class PinkunhuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 家庭成员
	 */
	
	private String jiatingchengyuan;
		
	/**
	 * 成员人数
	 */
	
	private Integer chengyuanrenshu;
		
	/**
	 * 家庭住址
	 */
	
	private String jiatingzhuzhi;
		
	/**
	 * 家庭状况
	 */
	
	private String jiatingzhuangkuang;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 人均收入
	 */
	
	private Integer renjunshouru;
		
	/**
	 * 详细介绍
	 */
	
	private String xiangxijieshao;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：家庭成员
	 */
	 
	public void setJiatingchengyuan(String jiatingchengyuan) {
		this.jiatingchengyuan = jiatingchengyuan;
	}
	
	/**
	 * 获取：家庭成员
	 */
	public String getJiatingchengyuan() {
		return jiatingchengyuan;
	}
				
	
	/**
	 * 设置：成员人数
	 */
	 
	public void setChengyuanrenshu(Integer chengyuanrenshu) {
		this.chengyuanrenshu = chengyuanrenshu;
	}
	
	/**
	 * 获取：成员人数
	 */
	public Integer getChengyuanrenshu() {
		return chengyuanrenshu;
	}
				
	
	/**
	 * 设置：家庭住址
	 */
	 
	public void setJiatingzhuzhi(String jiatingzhuzhi) {
		this.jiatingzhuzhi = jiatingzhuzhi;
	}
	
	/**
	 * 获取：家庭住址
	 */
	public String getJiatingzhuzhi() {
		return jiatingzhuzhi;
	}
				
	
	/**
	 * 设置：家庭状况
	 */
	 
	public void setJiatingzhuangkuang(String jiatingzhuangkuang) {
		this.jiatingzhuangkuang = jiatingzhuangkuang;
	}
	
	/**
	 * 获取：家庭状况
	 */
	public String getJiatingzhuangkuang() {
		return jiatingzhuangkuang;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：人均收入
	 */
	 
	public void setRenjunshouru(Integer renjunshouru) {
		this.renjunshouru = renjunshouru;
	}
	
	/**
	 * 获取：人均收入
	 */
	public Integer getRenjunshouru() {
		return renjunshouru;
	}
				
	
	/**
	 * 设置：详细介绍
	 */
	 
	public void setXiangxijieshao(String xiangxijieshao) {
		this.xiangxijieshao = xiangxijieshao;
	}
	
	/**
	 * 获取：详细介绍
	 */
	public String getXiangxijieshao() {
		return xiangxijieshao;
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
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
