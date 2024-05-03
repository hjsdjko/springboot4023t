package com.entity.model;

import com.entity.ZiyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 资源信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
public class ZiyuanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 资源类型
	 */
	
	private String ziyuanleixing;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 资源详情
	 */
	
	private String ziyuanxiangqing;
				
	
	/**
	 * 设置：资源类型
	 */
	 
	public void setZiyuanleixing(String ziyuanleixing) {
		this.ziyuanleixing = ziyuanleixing;
	}
	
	/**
	 * 获取：资源类型
	 */
	public String getZiyuanleixing() {
		return ziyuanleixing;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
				
	
	/**
	 * 设置：资源详情
	 */
	 
	public void setZiyuanxiangqing(String ziyuanxiangqing) {
		this.ziyuanxiangqing = ziyuanxiangqing;
	}
	
	/**
	 * 获取：资源详情
	 */
	public String getZiyuanxiangqing() {
		return ziyuanxiangqing;
	}
			
}
