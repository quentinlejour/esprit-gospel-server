package fr.espritgospel.server;

import fr.espritgospel.server.domain.entity.Address;
import io.javalin.Javalin;

public class Main {
  public static void main(String[] args) {
    var app = Javalin.create().get("/", ctx -> ctx.result("Hello Esprit Gospel!\n")).start(8080);
  }
}
