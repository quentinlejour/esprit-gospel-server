package fr.espritgospel.server;

import io.javalin.Javalin;

public class Main {
  public static void main(String[] args) {
    var app = Javalin.create().get("/", ctx -> ctx.result("Hello Esprit Gospel!\n")).start(8080);
  }
}
