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
 * 职工考核
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
@TableName("zhigongkaohe")
public class ZhigongkaoheEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhigongkaoheEntity() {
		
	}
	
	public ZhigongkaoheEntity(T t) {
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
	 * 工号
	 */
					
	private String gonghao;
	
	/**
	 * 教师姓名
	 */
					
	private String jiaoshixingming;
	
	/**
	 * 考核内容
	 */
					
	private String kaoheneirong;
	
	/**
	 * 考核成绩
	 */
					
	private String kaohechengji;
	
	/**
	 * 是否通过
	 */
					
	private String shifoutongguo;
	
	/**
	 * 考核日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date kaoheriqi;
	
	
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
	 * 设置：考核内容
	 */
	public void setKaoheneirong(String kaoheneirong) {
		this.kaoheneirong = kaoheneirong;
	}
	/**
	 * 获取：考核内容
	 */
	public String getKaoheneirong() {
		return kaoheneirong;
	}
	/**
	 * 设置：考核成绩
	 */
	public void setKaohechengji(String kaohechengji) {
		this.kaohechengji = kaohechengji;
	}
	/**
	 * 获取：考核成绩
	 */
	public String getKaohechengji() {
		return kaohechengji;
	}
	/**
	 * 设置：是否通过
	 */
	public void setShifoutongguo(String shifoutongguo) {
		this.shifoutongguo = shifoutongguo;
	}
	/**
	 * 获取：是否通过
	 */
	public String getShifoutongguo() {
		return shifoutongguo;
	}
	/**
	 * 设置：考核日期
	 */
	public void setKaoheriqi(Date kaoheriqi) {
		this.kaoheriqi = kaoheriqi;
	}
	/**
	 * 获取：考核日期
	 */
	public Date getKaoheriqi() {
		return kaoheriqi;
	}

}
