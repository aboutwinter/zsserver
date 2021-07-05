package com.company;

import  java.io.*;
import  java.net.*;
import  java.nio.charset.*;
import java.security.Key;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.interfaces.RSAPublicKey;
import  java.util.*;

import static com.company.RsaTools.GetKeyPair;

public class Main {
/*
    public static void main(String[] args) throws IOException {
	    try (ServerSocket s = new ServerSocket(10000)){
                    try(Socket incoming = s.accept())
                    {
                        InputStream instream = incoming.getInputStream();
                        OutputStream outputStream = incoming.getOutputStream();
                        try(Scanner in = new Scanner(instream, String.valueOf(StandardCharsets.UTF_8)))
                        {
                            PrintWriter out = new PrintWriter(new OutputStreamWriter(outputStream,StandardCharsets.UTF_8),true);
                            out.println("Hello!Enter BYE to exit");
                            boolean done = false;
                            while (!done&&in.hasNextLine())
                            {
                                String line = in.nextLine();
                                out.println("Echo:"+ line);
                                if(line.trim().equals("BYE")) done=true;
                            }
                        }
                    }
        }
    }*/
    public static void main(String[] args)
    {
        KeyPair kp=RsaTools.GetKeyPair();
        String s = RsaTools.RsaSign("cakin",kp);
        RsaTools.VerifySignature("cakin", (RSAPublicKey) kp.getPublic(),s);
    }
}
