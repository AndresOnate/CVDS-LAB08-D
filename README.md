# LABORATORIO 8 - INTEGRACIÓN CONCEPTOS (JSF, Spring Data, Arquitectura
por capas)

1. Agreegar las dependencias y el plugin correspondientes al POM.xml que no estaban el el laboratorio 5.

```
<dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.apache.tomcat.embed</groupId>
            <artifactId>tomcat-embed-jasper</artifactId>
            <scope>provided</scope>
        </dependency>
    </dependencies>
```

```
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <version>2.3.3.RELEASE</version>
                <executions>
                    <execution>
                        <goals>
                            <goal>repackage</goal>
                        </goals>
                    </execution>
                </executions>
            </plugin>
        </plugins>
```

2. Agregamos las clases LineChartBean, DataService y la clase Main.

3. Agregamos en el directorio src/main/webapp/ el archivo line.xhtml

```
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
		"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
	  xmlns:h="http://java.sun.com/jsf/html"
	  xmlns:p="http://primefaces.org/ui"
	  xmlns:ui="http://java.sun.com/jsf/facelets">

<h:head>
</h:head>

<h:body style="margin-left:50px">
	<h2>PrimeFaces Linear Chart Example</h2>
	<p:chart type="line" model="#{lineChartBean.lineModel}" style="height:400px;width:600px"/>
</h:body>
</html>
```
4. Ejecutamos la aplicación con el comando `mvn spring-boot:run`.

![image](https://user-images.githubusercontent.com/63562181/232957087-39c69432-7a7b-4873-9056-e21f472cf694.png)
