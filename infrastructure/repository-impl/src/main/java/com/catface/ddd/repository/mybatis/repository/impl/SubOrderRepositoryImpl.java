package com.catface.ddd.repository.mybatis.repository.impl;

import com.catface.ddd.repository.mybatis.entity.SubOrder;
import com.catface.ddd.repository.mybatis.mapper.SubOrderMapper;
import com.catface.ddd.repository.mybatis.repository.SubOrderRepository;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 交易子单 服务实现类
 * </p>
 *
 * @author catface
 * @since 2022-09-21
 */
@Slf4j
@Service
public class SubOrderRepositoryImpl extends ServiceImpl<SubOrderMapper, SubOrder> implements SubOrderRepository {

}
