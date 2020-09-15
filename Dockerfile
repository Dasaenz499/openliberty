FROM openliberty/open-liberty:full-java8-openj9-ubi

USER root
RUN ln -s /opt/ol/wlp/usr/servers /servers
USER 1001

USER root
RUN mkdir -p /servers/defaultServer/libreriasapps && chown -R 1001:0 /servers/defaultServer/libreriasapps
COPY --chown=1001:0  ./libs/*.jar /servers/defaultServer/libreriasapps/
COPY --chown=1001:0  PurchaseDService.war /config/apps/
COPY --chown=1001:0  server.xml /config/
USER 1001

ENTRYPOINT ["/opt/ol/wlp/bin/server", "run"]
CMD ["defaultServer"]
