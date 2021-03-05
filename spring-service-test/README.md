# micro-service-test
### springboot中 tomcat 加载
链接：https://www.cnblogs.com/zrbcool/p/11480675.html
ConfigurationClassPostProcessor > 
SpringFactoriesLoader.loadFactoryNames 读取spring.factories
onRefresh->ServletWebServerFactory 加载tomcat
TomcatServletWebServerFactory->AbstractServletWebServerFactory

### mvc 自动装配
WebMvcAutoConfiguration

### 参数解析 
解析参数：
AbstractMessageConverterMethodArgumentResolver->readWithMessageConverters
默认的request为RequestFacade(tomcat)
参数解析器：
HttpMessageConvertersAutoConfiguration->HttpMessageConverters

WebMvcAutoConfiguration装配
拦截器：
WebMvcAutoConfiguration->RequestMappingHandlerMapping
// 1)
if (!mappedHandler.applyPreHandle(processedRequest, response)) {
// 2)
mv = ha.handle(processedRequest, response, mappedHandler.getHandler());
// 3)
mappedHandler.applyPostHandle(processedRequest, response, mv);
