package com.entity.view;

import com.entity.YouerqingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 幼儿请假
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
@TableName("youerqingjia")
public class YouerqingjiaView  extends YouerqingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YouerqingjiaView(){
	}
 
 	public YouerqingjiaView(YouerqingjiaEntity youerqingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, youerqingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
