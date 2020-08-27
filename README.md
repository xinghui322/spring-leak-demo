### Reproduce Spring WebFlux Memory Leak

1. Start the application and set VM option `-Dio.netty.leakDetectionLevel=paranoid`  
2. Open file `leak-test.jmx` with [JMeter](https://jmeter.apache.org/)
3. Click start button in jmeter, and you will see the netty leak log in a minute.
    
