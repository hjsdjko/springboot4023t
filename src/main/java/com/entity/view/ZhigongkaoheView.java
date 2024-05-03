package com.entity.view;

import com.entity.ZhigongkaoheEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 职工考核
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-18 15:04:00
 */
@TableName("zhigongkaohe")
public class ZhigongkaoheView  extends ZhigongkaoheEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhigongkaoheView(){
	}
 
 	public ZhigongkaoheView(ZhigongkaoheEntity zhigongkaoheEntity){
 	try {
			BeanUtils.copyProperties(this, zhigongkaoheEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
