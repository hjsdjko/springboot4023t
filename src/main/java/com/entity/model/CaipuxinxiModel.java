package com.entity.model;

import com.entity.CaipuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 菜谱信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-18 15:04:01
 */
public class CaipuxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date riqi;
		
	/**
	 * 时间
	 */
	
	private String shijian;
		
	/**
	 * 菜品名单
	 */
	
	private String caipinmingdan;
		
	/**
	 * 营养分析
	 */
	
	private String yingyangfenxi;
				
	
	/**
	 * 设置：日期
	 */
	 
	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}
	
	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}
				
	
	/**
	 * 设置：时间
	 */
	 
	public void setShijian(String shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public String getShijian() {
		return shijian;
	}
				
	
	/**
	 * 设置：菜品名单
	 */
	 
	public void setCaipinmingdan(String caipinmingdan) {
		this.caipinmingdan = caipinmingdan;
	}
	
	/**
	 * 获取：菜品名单
	 */
	public String getCaipinmingdan() {
		return caipinmingdan;
	}
				
	
	/**
	 * 设置：营养分析
	 */
	 
	public void setYingyangfenxi(String yingyangfenxi) {
		this.yingyangfenxi = yingyangfenxi;
	}
	
	/**
	 * 获取：营养分析
	 */
	public String getYingyangfenxi() {
		return yingyangfenxi;
	}
			
}
