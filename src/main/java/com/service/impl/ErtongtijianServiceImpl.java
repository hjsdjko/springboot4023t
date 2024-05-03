package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ErtongtijianDao;
import com.entity.ErtongtijianEntity;
import com.service.ErtongtijianService;
import com.entity.vo.ErtongtijianVO;
import com.entity.view.ErtongtijianView;

@Service("ertongtijianService")
public class ErtongtijianServiceImpl extends ServiceImpl<ErtongtijianDao, ErtongtijianEntity> implements ErtongtijianService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ErtongtijianEntity> page = this.selectPage(
                new Query<ErtongtijianEntity>(params).getPage(),
                new EntityWrapper<ErtongtijianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ErtongtijianEntity> wrapper) {
		  Page<ErtongtijianView> page =new Query<ErtongtijianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ErtongtijianVO> selectListVO(Wrapper<ErtongtijianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ErtongtijianVO selectVO(Wrapper<ErtongtijianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ErtongtijianView> selectListView(Wrapper<ErtongtijianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ErtongtijianView selectView(Wrapper<ErtongtijianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
