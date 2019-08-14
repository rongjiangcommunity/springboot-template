package com.rongjiangcommunity.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Project Entry Point, notified by the annotation <code>@SpringBootApplication</code>
 * The <code>main</code> method inside the class with such an annotation will be run when running this project.
 *
 * By convention, the configuration of project will be put in
 * <code><a href="../../../../resources/application.properties">/src/main/resources/application.properties</a></code>,
 * such as server port, datasource.
 *
 * The <code>.properties</code> file has the simple format of:
 * <pre>
 *     key=value
 * </pre>
 *
 * By convention, we need at least 2 keys for running this project, <code>server.port</code> and
 * <code>spring.datasource.url</code>. If we use Redis, we need another key, <code>spring.redis.host</code>.
 *
 * By convention, while this project is running, files under
 * <code><a href="../../../../resources/static">/src/main/resources/static</a></code> are directly accessible via HTTP
 * request. As we put an <a href="http://localhost:8080/index.html>index.html</a> in it, it can be found after
 * successfully running this project.
 *
 * For the "dynamic" data, we need a <code>controller</code> calling and filling a <code>template</code> as how Spring
 * Boot works. See <a href="controller/SampleController.java">controller/SampleController.java</a> for more information.
 */
@SpringBootApplication
public class TemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class, args);
    }

}
