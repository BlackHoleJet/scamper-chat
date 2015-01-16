package com.mastfrog.scamper.chat.cli;

import com.mastfrog.scamper.chat.base.ScamperClient;
import java.io.IOException;

/**
 *
 * @author Tim Boudreau
 */
public class CliMain {

    public static void main(String[] args) throws IOException, InterruptedException {
        System.setProperty("io.netty.leakDetectionLevel", "disable");

        ScamperClient client = new ScamperClient(CliClient.class);
        CLI cli = client.start(CLI.class, args);
        cli.start().await();
    }
}
