package com.entity.view;

import com.entity.YuanliaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 原料信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-18 15:04:01
 */
@TableName("yuanliaoxinxi")
public class YuanliaoxinxiView  extends YuanliaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanliaoxinxiView(){
	}
 
 	public YuanliaoxinxiView(YuanliaoxinxiEntity yuanliaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yuanliaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
