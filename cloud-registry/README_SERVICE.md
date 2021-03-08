### @EnableEurekaServer
       引入配置类：EurekaServerAutoConfiguration
       参数配置类：EurekaServerConfigBeanConfiguration->EurekaServerConfigBean
     PeerAwareInstanceRegistry 接收注册请求
     PeerEurekaNodes 配置服务节点信息，这里的作用主要是为了配置Eureka的peer节点，也就是说当有收到有节点注册上来的时候，需要通知给哪些节点
     EurekaServerBootstrap 初始化Eureka-server，会同步其他注册中心的数据到当前注册中心
     FilterRegistrationBean  配置拦截器，ServletContainer里面实现了jersey框架，通过他来实现eurekaServer对外的restFull接口 
       
### 请求（https://my.oschina.net/JackieRiver/blog/1925978）
       ApplicationResource -> addInstance (注册实例)
       InstanceResource  -> renewLease(续约)
       EvictionTask -> 剔除服务
       peerEurekaNodes节点通过EurekaServerContext(new DefaultEurekaServerContext)设置
       scheduleRenewalThresholdUpdateTask -> 自我保护任务
       