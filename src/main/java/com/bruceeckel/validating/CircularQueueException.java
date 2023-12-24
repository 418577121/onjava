// validating/CircularQueueException.java
// (c)2021 MindView LLC: see Copyright.txt
// We make no guarantees that this code is fit for any purpose.
// Visit http://OnJava8.com for more book information.
package com.bruceeckel.validating;

public class
CircularQueueException extends RuntimeException {
  public CircularQueueException(String why) {
    super(why);
  }
}
