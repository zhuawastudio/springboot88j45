package com.dao;

import com.entity.JiaoyidingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoyidingdanVO;
import com.entity.view.JiaoyidingdanView;


/**
 * 交易订单
 * 
 * @author 
 * @email 
 * @date 2023-02-15 17:45:40
 */
public interface JiaoyidingdanDao extends BaseMapper<JiaoyidingdanEntity> {
	
	List<JiaoyidingdanVO> selectListVO(@Param("ew") Wrapper<JiaoyidingdanEntity> wrapper);
	
	JiaoyidingdanVO selectVO(@Param("ew") Wrapper<JiaoyidingdanEntity> wrapper);
	
	List<JiaoyidingdanView> selectListView(@Param("ew") Wrapper<JiaoyidingdanEntity> wrapper);

	List<JiaoyidingdanView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoyidingdanEntity> wrapper);
	
	JiaoyidingdanView selectView(@Param("ew") Wrapper<JiaoyidingdanEntity> wrapper);
	

}
