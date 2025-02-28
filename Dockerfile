# 第一阶段: 构建阶段
FROM swr.cn-north-4.myhuaweicloud.com/ddn-k8s/docker.io/maven:3.8.6-jdk-11-slim AS build

# 设置工作目录
WORKDIR /app

# 将整个项目的源代码复制到容器中
COPY . .


# 使用 Maven 构建项目
RUN mvn clean package -DskipTests

# 第二阶段: 运行阶段
FROM swr.cn-north-4.myhuaweicloud.com/ddn-k8s/docker.io/openjdk:11-jre-slim

# 设置工作目录
WORKDIR /app

# 将构建好的 JAR 文件分别复制到不同的目录中
COPY --from=build /app/admin/target/admin-1.0-SNAPSHOT.jar /app/admin/admin-1.0-SNAPSHOT.jar
COPY --from=build /app/common/target/common-1.0-SNAPSHOT.jar /app/common/common-1.0-SNAPSHOT.jar
COPY --from=build /app/core/target/core-1.0-SNAPSHOT.jar /app/core/core-1.0-SNAPSHOT.jar


# 设置容器启动时执行的命令
CMD ["java", "-jar", "/app/admin/admin-1.0-SNAPSHOT.jar"]
