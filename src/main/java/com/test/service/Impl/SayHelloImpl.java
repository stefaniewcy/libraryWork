package com.test.service.Impl;

import com.test.service.SayHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class SayHelloImpl implements SayHello {
    public String say(String sth) {
        return "你输入了：" + sth;
    }
}
