# micro-service-test
### springboot中 tomcat 加载
链接：https://www.cnblogs.com/zrbcool/p/11480675.html
ConfigurationClassPostProcessor > 
SpringFactoriesLoader.loadFactoryNames 读取spring.factories
onRefresh->ServletWebServerFactory 加载tomcat
TomcatServletWebServerFactory->AbstractServletWebServerFactory
