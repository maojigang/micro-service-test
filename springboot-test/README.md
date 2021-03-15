### 注入初始化配置必备的对象
AnnotationConfigUtils.registerAnnotationConfigProcessors(this.registry);
  -> ConfigurationClassPostProcessor
  -> AutowiredAnnotationBeanPostProcessor
  -> CommonAnnotationBeanPostProcessor
  
 DefaultListableBeanFactory 
  -> registerBeanDefinition将bean放入map中（beanDefinitionMap）

### 执行refresh
prepareBeanFactory  
   -> 添加ApplicationContextAwareProcessor(为所有实现bean的aware赋值)
invokeBeanFactoryPostProcessors
   -> 优先注册 ConfigurationClassPostProcessor (会扫描包名下面的所有类，将解析的类放入configClasses中)
            |-> 执行  postProcessBeanDefinitionRegistry (主要方法[invokeBeanDefinitionRegistryPostProcessors])
                |-> 扫描包
                |-> processInterfaces 解析bean注解
                |-> processImports 导入
                |-> ImportResource 导入
                    this.reader.loadBeanDefinitions(configClasses); (import解析导入)
                                            |-> registerBeanDefinitionForImportedConfigurationClass
                                            |-> loadBeanDefinitionsForBeanMethod
                                            |-> loadBeanDefinitionsFromImportedResources
                                            |-> loadBeanDefinitionsFromRegistrars
                      (加载Resource) loadBeanDefinitionsFromImportedResources(configClass.getImportedResources());
                	  (加载Import) loadBeanDefinitionsFromRegistrars(configClass.getImportBeanDefinitionRegistrars());
                
   -> beanFactory.getBeanNamesForType                        
   
  
   
   
   this.singletonObjects
   this.singletonFactories
   this.earlySingletonObjects
   this.registeredSingletons
   			   
   doCreateBean->
            -> dependsOn 判断是否有依赖
            -> createBeanInstance(创建)
            -> applyMergedBeanDefinitionPostProcessors  调用实现 MergedBeanDefinitionPostProcessor 的方法 postProcessMergedBeanDefinition
            -> populateBean 
            -> initializeBean 调用实现 BeanPostProcessor
                    |->  invokeAwareMethods (如果bean实现了 
                                            BeanNameAware、
                                            BeanClassLoaderAware、
                                            BeanFactoryAware、
                                            ApplicationContextAware、
                                            MessageSourceAware 会调用对应的方法)
                    |-> postProcessBeforeInitialization
                                        同上有此操作             
                    |-> invokeInitMethods 
                    |-> postProcessAfterInitialization
                            如果bean实现了ApplicationListener会加入applicationContext中
 - - - - -   
 
 判断（full or liter [Component、ComponentScan、Import、ImportResource]）
       ConfigurationClassUtils.isConfigurationCandidate(memberClass.getMetadata())
 针对@Configuration中的bean生成代理对象enhanceConfigurationClasses
 
 parser.parse(candidates) 中 processDeferredImportSelectors -> grouping.getImports()
        getCandidateConfigurations 去加载spring.factories
### 小标注
    ComponentScanAnnotationParser  解析扫描类
                           