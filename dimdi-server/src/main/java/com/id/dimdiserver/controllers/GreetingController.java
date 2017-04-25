package com.id.dimdiserver.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.id.dimdiserver.models.Greeting;

/**
 * The Class GreetingController.
 */
@RestController
public class GreetingController {
  
  /** The Constant CONTENT. */
  private static final String CONTENT = "%s";
  
  /** The counter. */
  private final AtomicLong counter = new AtomicLong();
  
  /**
   * Greeting.
   *
   * @param name the name
   * @return the greeting
   */
  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam(value="name", defaultValue="Please some content") String name) {
    return new Greeting(counter.getAndIncrement(), String.format(CONTENT, name));
  }
  
}
