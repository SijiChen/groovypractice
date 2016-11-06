/**
 * Created by sjchen on 11/6/16.
 */
import java.sql.*;
import groovy.sql.Sql
class DatabaseExample {
    static void main(String[] args) {
        // Creating a connection to the database
        def sql = Sql.newInstance('jdbc:mysql://localhost:3306/TESTDB',
                'root', '1234', 'com.mysql.jdbc.Driver');
        sql.connection.autoCommit = false;
        // Executing the query SELECT VERSION which gets the version of the database
        // Also using the eachROW method to fetch the result from the database

//        sql.eachRow('SELECT VERSION()'){ row ->
//            println row[0]
//        }


//        def creatTable = """CREATE TABLE EMPLOYEE (
//         FIRST_NAME CHAR(20) NOT NULL,
//         LAST_NAME CHAR(20),
//         AGE INT,
//         SEX CHAR(1),
//         INCOME FLOAT )"""
//
//        sql.execute(creatTable);

        def sqlstrInsert = """INSERT INTO EMPLOYEE(FIRST_NAME,
         LAST_NAME, AGE, SEX, INCOME) VALUES ('Mac', 'Mohan', 20, 'M', 2000)"""
        try {
            sql.execute(sqlstrInsert);
            sql.commit()
            println("Successfully committed")
        }catch(Exception ex) {
            sql.rollback()
            println("Transaction rollback")
        }

        sql.close()
    }
}
