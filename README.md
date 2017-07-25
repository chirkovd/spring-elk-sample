# spring-elk-sample
Simple application with SpringBoot + ELK stack + Docker

# Steps to run sample

```
    # Run SpringBoot application
    mvn spring-boot:run
    
    # Start docker containers with ELK stack
    docker-compose up -d
```

# Application contains:
1. SpringBoot application with scheduled logging task
2. ELK stack:
    1) Elasticsearch 5.1.2
    2) Kibana 5.1.2
    3) Logstash:5.4.2

Application produces log messages and adds it to logs folder. Logstash added messages to Elasticsearch instance. Open [http://localhost:5601](http://localhost:5601) and check that Kibana is started correctly. Check index 'elk-sample-*'.  
