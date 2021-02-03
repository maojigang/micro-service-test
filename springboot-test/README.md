### 注入初始化配置必备的对象
AnnotationConfigUtils.registerAnnotationConfigProcessors(this.registry);
  -> ConfigurationClassPostProcessor
  -> AutowiredAnnotationBeanPostProcessor
  -> CommonAnnotationBeanPostProcessor
  
 DefaultListableBeanFactory 
  -> registerBeanDefinition将bean放入map中（beanDefinitionMap）

### 执行refresh
prepareBeanFactory
   -> 添加ApplicationContextAwareProcessor
invokeBeanFactoryPostProcessors
   -> 优先注册 ConfigurationClassPostProcessor (会扫描包名下面的所有类)
            |-> 执行  postProcessBeanDefinitionRegistry
                |-> 扫描包
                |-> processImports 导入
                |-> ImportResource 导入
                    this.reader.loadBeanDefinitions(configClasses); (import解析导入)
                                            |-> registerBeanDefinitionForImportedConfigurationClass
                                            |-> loadBeanDefinitionsForBeanMethod
                                            |-> loadBeanDefinitionsFromImportedResources
                                            |-> loadBeanDefinitionsFromRegistrars
   -> beanFactory.getBeanNamesForType                        
   
  
   
   
   this.singletonObjects
   this.singletonFactories
   this.earlySingletonObjects
   this.registeredSingletons
   			   
   doCreateBean->
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
 
 
### 小标注
    ComponentScanAnnotationParser  解析扫描类
                           