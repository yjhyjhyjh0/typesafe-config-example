# typesafe config example
Document  
https://github.com/lightbend/config

Application conf 
The convenience method ConfigFactory.load() loads the following (first-listed are higher priority):  

system properties  
application.conf (all resources on classpath with this name)  
application.json (all resources on classpath with this name)  
application.properties (all resources on classpath with this name)  
reference.conf (all resources on classpath with this name)  

Can provide config at runtime via

    -Dconfig.file=path/to/config-file
    
    
FAQ
Q1- How to dynamic load application conf?

    https://stackoverflow.com/questions/53021556/scala-read-the-configs-dynamically-during-run-time
    For applications using application.{conf,json,properties}, 
    system properties can be used to force a different config source 
        (e.g. from command line -Dconfig.file=path/to/config-file):
    
        config.resource specifies a resource name - not a basename, i.e. application.conf not application
        config.file specifies a filesystem path, again it should include the extension, not be a basename
        config.url specifies a URL
    
    These system properties specify a replacement for application.{conf,json,properties}, not an addition. 
    They only affect apps using the default ConfigFactory.load() configuration. 
    In the replacement config file, you can use include "application" to include the original default config file; 
    after the include statement you could go on to override certain settings.
