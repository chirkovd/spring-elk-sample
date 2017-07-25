FROM logstash:5.4.2

# add custom config
COPY ./config/logstash.conf /config-dir/logstash.conf

# add templates
COPY ./templates/ /config-dir/templates/