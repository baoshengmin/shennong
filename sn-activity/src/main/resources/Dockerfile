FROM centos:8
# 配置环境变量，JDK的安装目录
ENV JAVA_DIR=/usr/java

# 拷贝jdk和java项目的包
COPY ./jdk-8u361-linux-x64.tar.gz $JAVA_DIR/
COPY ./sn-activity-1.0-SNAPSHOT.jar /tmp/sn-activity.jar

# 安装JDK
RUN cd $JAVA_DIR \
 && tar -xf ./jdk-8u361-linux-x64.tar.gz \
 && mv ./jdk1.8.0_361 ./java8

# 配置环境变量
ENV JAVA_HOME=$JAVA_DIR/java8
ENV PATH=$PATH:$JAVA_HOME/bin

# 声明需要暴露的端口
EXPOSE 20881
# 配置容器启动后执行的命令
ENTRYPOINT ["java","-jar","/tmp/sn-activity.jar"]
