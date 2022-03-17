##### Spring框架使用DI实现IoC

通过spring框架，只需要提供要使用的对象名称就可以了，从容器中获取名称对应的对象。spring底层使用的反射机制，通过反射创建对象，给属性赋值。

```
创建对象的方式：
1.new
2.反射
3.序列化和反序列化
```



#### Spring的开发步骤

1. 导入坐标
2. 创建Bean
3. 创建applicationContext.xml
4. 在配置文件中进行配置
5. 创建ApplicationContext对象getBean

### Bean标签的范围配置

**scope：**

singleton：默认的，单例的

prototype：多例的



