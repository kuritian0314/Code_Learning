package com.zwh.java.service.impl;

import com.zwh.java.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author curry
 * @package com.zwh.java.service.impl
 * @date 2021/11/16 17:44
 * @Version V1.0
 */
@Service
public class HelloImpl implements HelloService {
    @Override
    public void remove() {
        System.out.println("hello world!");
    }
}
