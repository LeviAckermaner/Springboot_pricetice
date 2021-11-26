package com.example.springboot.config;

import com.example.springboot.pojo.Student;
import org.springframework.context.annotation.*;

/**
 * @author shishuaiyang
 * @date 2021/11/25-下午4:37
 */

/**
 * @Configuration表示这个类做为Spring的配置文件来使用，可以代替xml文件。
 */
@Configuration
@ImportResource(value = "classpath:applicationContext.xml")
@ComponentScan(basePackages = "com.example.springboot.pojo")
@PropertySource(value = "classpath:config.properties")
public class SpringConfig {
    /**
     * @bean表示这个方法返回的对象将会注入到Spring容器中，交给Spring进行管理，我们可以通过@bean的name属性指定
     * 返回对象在Spring容器中的名称。
     * @return
     */
    @Bean
    public Student createStudent(){
        Student student = new Student();
        student.setId(2);
        student.setName("tao");
        student.setAge(20);
        return student;
    }
}
