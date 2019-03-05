记录Spring学习中遇到的各种简单示例代码
##### 问题一: 
在demo文件夹内新创建的`HelloController`类，无法被访问。<br/>
请求 http://127.0.0.1:8080/hello<br/>
返回值
```
Whitelabel Error Page
This application has no explicit mapping for /error, so you are seeing this as a fallback.

Tue Mar 05 22:11:16 CST 2019
There was an unexpected error (type=Not Found, status=404).
No message available
```

**原因**<br/>
controller没有被spring 容器扫描到

**解决方案**<br/>
在启动类的上面添加`@ComponentScan(basePackages = {"com.yannis.*"})`