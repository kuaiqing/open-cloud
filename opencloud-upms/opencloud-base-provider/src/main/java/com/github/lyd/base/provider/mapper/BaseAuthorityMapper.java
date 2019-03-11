package com.github.lyd.base.provider.mapper;

import com.github.lyd.base.client.model.BaseAuthorityDto;
import com.github.lyd.base.client.model.entity.BaseAuthority;
import com.github.lyd.common.mapper.CrudMapper;
import com.github.lyd.common.security.OpenGrantedAuthority;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BaseAuthorityMapper extends CrudMapper<BaseAuthority> {

    /**
     * 查询权限列表
     *
     * @param params
     * @return
     */
    List<OpenGrantedAuthority> selectAuthority(Map params);

    /**
     * 查询权限列表详情
     *
     * @param params
     * @return
     */
    List<BaseAuthorityDto> selectBaseAuthorityDto(Map params);
}
