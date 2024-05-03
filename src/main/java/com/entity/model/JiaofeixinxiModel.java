package com.entity.model;

import com.entity.JiaofeixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 缴费信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
public class JiaofeixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 缴费时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiaofeishijian;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 家长姓名
	 */
	
	private String jiazhangxingming;
		
	/**
	 * 书本费
	 */
	
	private Float shubenfei;
		
	/**
	 * 伙食费
	 */
	
	private Float huoshifei;
		
	/**
	 * 教学费
	 */
	
	private Float jiaoxuefei;
		
	/**
	 * 总费用
	 */
	
	private Float zongfeiyong;
		
	/**
	 * 工号
	 */
	
	private String gonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：缴费时间
	 */
	 
	public void setJiaofeishijian(Date jiaofeishijian) {
		this.jiaofeishijian = jiaofeishijian;
	}
	
	/**
	 * 获取：缴费时间
	 */
	public Date getJiaofeishijian() {
		return jiaofeishijian;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：家长姓名
	 */
	 
	public void setJiazhangxingming(String jiazhangxingming) {
		this.jiazhangxingming = jiazhangxingming;
	}
	
	/**
	 * 获取：家长姓名
	 */
	public String getJiazhangxingming() {
		return jiazhangxingming;
	}
				
	
	/**
	 * 设置：书本费
	 */
	 
	public void setShubenfei(Float shubenfei) {
		this.shubenfei = shubenfei;
	}
	
	/**
	 * 获取：书本费
	 */
	public Float getShubenfei() {
		return shubenfei;
	}
				
	
	/**
	 * 设置：伙食费
	 */
	 
	public void setHuoshifei(Float huoshifei) {
		this.huoshifei = huoshifei;
	}
	
	/**
	 * 获取：伙食费
	 */
	public Float getHuoshifei() {
		return huoshifei;
	}
				
	
	/**
	 * 设置：教学费
	 */
	 
	public void setJiaoxuefei(Float jiaoxuefei) {
		this.jiaoxuefei = jiaoxuefei;
	}
	
	/**
	 * 获取：教学费
	 */
	public Float getJiaoxuefei() {
		return jiaoxuefei;
	}
				
	
	/**
	 * 设置：总费用
	 */
	 
	public void setZongfeiyong(Float zongfeiyong) {
		this.zongfeiyong = zongfeiyong;
	}
	
	/**
	 * 获取：总费用
	 */
	public Float getZongfeiyong() {
		return zongfeiyong;
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
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
