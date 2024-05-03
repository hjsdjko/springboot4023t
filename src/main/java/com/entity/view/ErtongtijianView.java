package com.entity.view;

import com.entity.ErtongtijianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 儿童体检
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
@TableName("ertongtijian")
public class ErtongtijianView  extends ErtongtijianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ErtongtijianView(){
	}
 
 	public ErtongtijianView(ErtongtijianEntity ertongtijianEntity){
 	try {
			BeanUtils.copyProperties(this, ertongtijianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
