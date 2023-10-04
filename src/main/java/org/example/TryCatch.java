package org.example;

public class TryCatch {

  public boolean someMethod(int x) {  // FP raised
    try {
      someExceptionalMethod(x);
    } catch (IllegalArgumentException e) {
      return false;
    }
    return true;
  }

  private int someExceptionalMethod(int x) {

    throw new IllegalArgumentException();
  }



}
