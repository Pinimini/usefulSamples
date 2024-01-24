package ru.db.hibernate.jpql;

import liquibase.command.CommandScope;
import liquibase.command.core.UpdateCommandStep;
import liquibase.command.core.helpers.DbUrlConnectionCommandStep;
import liquibase.database.Database;
import liquibase.database.DatabaseFactory;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.db.hibernate.core.HibernateUtils;
import ru.db.hibernate.demo.model.Avatar;
import ru.db.hibernate.demo.model.Client;
import ru.db.hibernate.demo.model.NickName;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@Slf4j
public class Main {
    public static void main(String[] args) {

    }
}