package DesignPattern.creational.objectpool;

import java.sql.Connection;

public class MainObjectPool {
    public static void main(String args[]) {
        JDBCConnectionPool jdbcConnectionPool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb: //localhost/mydb",
                "sa", "password");
        Connection connection = jdbcConnectionPool.takeOut();
        jdbcConnectionPool.takeIn(connection);
    }
}
