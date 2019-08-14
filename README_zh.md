# 榕水长社区 Spring Boot 模板

本模板使用 IntelliJ IDEA Ultimate 的 Spring Initializr 生成，可以用作榕水长社区的其他应用的服务端。

[HELP.md](HELP.md) 是由 Spring Initializr 生成的所使用的依赖的文档列表。对 Spring Boot 的运作和使用不熟悉的成员可以阅读该文档。

源码的注释中也包含了一些开发过程中的一些提示。如果你找源码迷路了，那么从[项目入口点](src/main/java/com/rongjiangcommunity/template/TemplateApplication.java)开始。

## 使用的依赖

- Developer Tools
    - Spring Boot DevTools
    - Lombok
- Web
    - Spring Web Starter
    - Spring Reactive Web
- Template Engines
    - Thymeleaf
- SQL
    - Spring Data JPA
    - MySQL Driver
- NoSQL
    - Spring Data Redis(Access+Driver)
    
## TODO
[ ] 添加 `entity` 的示例。  
[ ] 添加 `repository` 的示例。