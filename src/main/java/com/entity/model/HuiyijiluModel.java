package com.entity.model;

import com.entity.HuiyijiluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 会议记录
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
public class HuiyijiluModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 会议时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huiyishijian;
		
	/**
	 * 会议内容
	 */
	
	private String huiyineirong;
		
	/**
	 * 会议心得
	 */
	
	private String huiyixinde;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
				
	
	/**
	 * 设置：会议时间
	 */
	 
	public void setHuiyishijian(Date huiyishijian) {
		this.huiyishijian = huiyishijian;
	}
	
	/**
	 * 获取：会议时间
	 */
	public Date getHuiyishijian() {
		return huiyishijian;
	}
				
	
	/**
	 * 设置：会议内容
	 */
	 
	public void setHuiyineirong(String huiyineirong) {
		this.huiyineirong = huiyineirong;
	}
	
	/**
	 * 获取：会议内容
	 */
	public String getHuiyineirong() {
		return huiyineirong;
	}
				
	
	/**
	 * 设置：会议心得
	 */
	 
	public void setHuiyixinde(String huiyixinde) {
		this.huiyixinde = huiyixinde;
	}
	
	/**
	 * 获取：会议心得
	 */
	public String getHuiyixinde() {
		return huiyixinde;
	}
				
	
	/**
	 * 设置：工号
	 */
	 
	public void setGonghao(String gonghao) {
		this.gonghao = gonghao;
	}
	
	/**
	 * 获取：工号
	 */
	public String getGonghao() {
		return gonghao;
	}
				
	
	/**
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
			
}
