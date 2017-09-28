module Server {
    requires API;
    requires DTO;

    requires java.sql;
    requires java.xml.ws.annotation;

    requires spring.core;
    requires spring.beans;
    requires spring.context;
    requires spring.aop;
    requires spring.web;
    requires spring.expression;

    requires spring.boot;
    requires spring.boot.autoconfigure;
}