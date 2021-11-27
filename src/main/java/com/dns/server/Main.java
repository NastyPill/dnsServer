package com.dns.server;

import com.dns.server.service.CommunicatorService;

import java.net.SocketException;
import java.net.UnknownHostException;

public class Main {

    public static void main(String[] args) throws SocketException, UnknownHostException {
        CommunicatorService communicatorService = new CommunicatorService();
        communicatorService.run();
    }

}
