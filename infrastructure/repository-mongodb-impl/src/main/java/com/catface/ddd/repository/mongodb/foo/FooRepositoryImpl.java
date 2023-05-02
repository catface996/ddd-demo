package com.catface.ddd.repository.mongodb.foo;

import com.catface.ddd.common.model.Foo;
import com.catface.ddd.repository.foo.FooRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author catface
 * @since 2023/5/1
 */
@Slf4j
@Service
public class FooRepositoryImpl implements FooRepository {
    /**
     * 根据Foo Id查找Foo
     *
     * @param id foo的ID
     * @return 查找到的foo
     */
    @Override
    public Foo findById(Long id) {
        log.info("this is mongodb foo repository");
        return new Foo(1L,"from mongodb");
    }
}
