package com.catface.ddd.repository.mongodb.bar;

import com.catface.ddd.common.model.Bar;
import com.catface.ddd.repository.bar.BarRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author catface
 * @since 2023/5/1
 */
@Slf4j
@Service
public class BarRepositoryImpl implements BarRepository {
    /**
     * 通过ID查找bar实体
     *
     * @param id bar实体的ID
     * @return bar实体
     */
    @Override
    public Bar findById(Long id) {
        log.info("this is mongodb bar repository");
        return new Bar(1L, "from mongodb");
    }
}
