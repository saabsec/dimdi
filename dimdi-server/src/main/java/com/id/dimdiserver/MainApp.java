package com.id.dimdiserver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!.
 */
/**
 * @author mgrabova
 *
 */
@SpringBootApplication
public class MainApp {
  
  /** The logger. */
  static Logger logger = LogManager.getLogger(MainApp.class);
  
  /**
   * Prints the DIMDI.
   */
  private static void printDIMDI() {
    logger.info("===================================================");
    logger.info("=   DIMDI  v0.0.1                                 =");
    logger.info("===================================================");
  }
  
  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    printDIMDI();
    DatabaseConnection.getConnectionWithDatabase();
    SpringApplication.run(MainApp.class, args);
  }
}
