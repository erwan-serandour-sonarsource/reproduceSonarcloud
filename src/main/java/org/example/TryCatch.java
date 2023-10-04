package org.example;

import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class TryCatch {

  public boolean someMethod(GetFuture g) {  // FP raised
    try {
      g.someExceptionalMethod();
    } catch (IllegalArgumentException e) {
      return false;
    }
    return true;
  }





}
