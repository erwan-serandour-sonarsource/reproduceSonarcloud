package org.example;

import java.util.concurrent.CompletableFuture;

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
    if(x==0) {
      return 0;
    }
    throw new IllegalArgumentException();
  }

  public CompletableFuture<String> runSensitivityAnalysisAsync(String resultUuid, GetFuture f) {
    try {
      if (resultUuid != null) {
        return null; // 1st return
      }


      CompletableFuture<String> future = f.getFuture();

      return future; // 2nd return
    } finally {
      doSometing();
    }
  }

  private void doSometing(){
    System.out.println("something");
  }





}
