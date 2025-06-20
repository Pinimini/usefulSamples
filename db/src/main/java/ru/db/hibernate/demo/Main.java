package ru.db.hibernate.demo;

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
    public static void main(String[] args) throws LiquibaseException, SQLException {

        try (
                Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/useful_samples", "admin", "admin");
                JdbcConnection jdbcConnection = new JdbcConnection(connection);
                Database correctDatabaseImplementation = DatabaseFactory.getInstance().findCorrectDatabaseImplementation(jdbcConnection);

        ) {
            new CommandScope(UpdateCommandStep.COMMAND_NAME)
                    .addArgumentValue(DbUrlConnectionCommandStep.DATABASE_ARG, correctDatabaseImplementation)
                    .addArgumentValue(UpdateCommandStep.CHANGELOG_FILE_ARG, "changelog.xml")
                    .execute();
        }


        SessionFactory sessionFactory = HibernateUtils.buildSessionFactory(Client.class, Avatar.class, NickName.class);
        log.info("session");
        try (Session session = sessionFactory.openSession()) {

            log.info("session = {}", session);
            Client client = new Client();


            Avatar avatar = new Avatar();

            //NickName nickName = new NickName(0, client, avatar);

/*            Set<Avatar> avatars = new HashSet<>();
            avatars.add(avatar);*/

            //avatar.setNickName(nickName);
            client.setAvatars(avatar);

            session.getTransaction().begin();
            session.save(client);
            session.getTransaction().commit();

            session.getTransaction().begin();
            Avatar avatar2 = new Avatar();
            client.setAvatars(avatar2);
            session.merge(client);
            session.getTransaction().commit();
        }
    }
}