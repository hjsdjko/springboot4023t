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
 * 儿童体检
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
@TableName("ertongtijian")
public class ErtongtijianEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ErtongtijianEntity() {
		
	}
	
	public ErtongtijianEntity(T t) {
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
	 * 名称
	 */
					
	private String mingcheng;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	/**
	 * 家长姓名
	 */
					
	private String jiazhangxingming;
	
	/**
	 * 幼儿姓名
	 */
					
	private String youerxingming;
	
	/**
	 * 体重
	 */
					
	private String tizhong;
	
	/**
	 * 身高
	 */
					
	private String shengao;
	
	/**
	 * 血型
	 */
					
	private String xuexing;
	
	/**
	 * 健康状况
	 */
					
	private String jiankangzhuangkuang;
	
	/**
	 * 成长轨迹
	 */
					
	private String chengzhangguiji;
	
	/**
	 * 评价
	 */
					
	private String pingjia;
	
	/**
	 * 日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date riqi;
	
	/**
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	
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
	 * 设置：名称
	 */
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	/**
	 * 获取：名称
	 */
	public String getMingcheng() {
		return mingcheng;
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
	 * 设置：幼儿姓名
	 */
	public void setYouerxingming(String youerxingming) {
		this.youerxingming = youerxingming;
	}
	/**
	 * 获取：幼儿姓名
	 */
	public String getYouerxingming() {
		return youerxingming;
	}
	/**
	 * 设置：体重
	 */
	public void setTizhong(String tizhong) {
		this.tizhong = tizhong;
	}
	/**
	 * 获取：体重
	 */
	public String getTizhong() {
		return tizhong;
	}
	/**
	 * 设置：身高
	 */
	public void setShengao(String shengao) {
		this.shengao = shengao;
	}
	/**
	 * 获取：身高
	 */
	public String getShengao() {
		return shengao;
	}
	/**
	 * 设置：血型
	 */
	public void setXuexing(String xuexing) {
		this.xuexing = xuexing;
	}
	/**
	 * 获取：血型
	 */
	public String getXuexing() {
		return xuexing;
	}
	/**
	 * 设置：健康状况
	 */
	public void setJiankangzhuangkuang(String jiankangzhuangkuang) {
		this.jiankangzhuangkuang = jiankangzhuangkuang;
	}
	/**
	 * 获取：健康状况
	 */
	public String getJiankangzhuangkuang() {
		return jiankangzhuangkuang;
	}
	/**
	 * 设置：成长轨迹
	 */
	public void setChengzhangguiji(String chengzhangguiji) {
		this.chengzhangguiji = chengzhangguiji;
	}
	/**
	 * 获取：成长轨迹
	 */
	public String getChengzhangguiji() {
		return chengzhangguiji;
	}
	/**
	 * 设置：评价
	 */
	public void setPingjia(String pingjia) {
		this.pingjia = pingjia;
	}
	/**
	 * 获取：评价
	 */
	public String getPingjia() {
		return pingjia;
	}
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
