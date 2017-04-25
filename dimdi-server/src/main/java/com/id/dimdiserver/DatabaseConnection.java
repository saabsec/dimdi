package com.id.dimdiserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Class DatabaseConnection.
 */
public class DatabaseConnection {
  
  /** The logger. */
  static Logger logger = LogManager.getLogger(DatabaseConnection.class);
  
  /** The db url. */
  private static String dbUrl = "jdbc:derby:/Users/mgrabova/Documents/workspace/dimdi-server/Data/dimdidata;create=true";
  
  /** The conn. */
  private static Connection conn = null;
  
  /** The stmt. */
  private static Statement stmt = null;
  
  /**
   * Instantiates a new database connection.
   */
  private DatabaseConnection() {
    // Constructor.
  }
  
  /**
   * Gets the connection with database.
   *
   * @return the connection with database
   */
  public static void getConnectionWithDatabase() {
    logger.info("Trying connecting with database...");
    try {
      Class.forName("org.apache.derby.jdbc.EmbeddedDriver").newInstance();
      conn = DriverManager.getConnection(dbUrl);
      logger.info("Connection to database with SUCCESS!");
    } catch (InstantiationException|IllegalAccessException|ClassNotFoundException|SQLException e) {
      logger.error(e);
    }
  }
  
  /**
   * Shut down connection.
   */
  public static void shutDownConnection() {
    logger.info("Trying shuting down database connection...");
    try {
      if (stmt != null) {
        stmt.close();
      }
      if (conn != null) {
        DriverManager.getConnection(dbUrl + ";shutdown=true");
        conn.close();
        logger.info("Database connection closed.");
      }
    } catch (SQLException e) {
      logger.error(e);
    }
  }
  
}
