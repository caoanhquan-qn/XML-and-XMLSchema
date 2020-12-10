package com.anhquancao;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

public class SAXParserDemo {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser parser = parserFactory.newSAXParser();

        SAXHandler handler = new SAXHandler();
        parser.parse(ClassLoader.getSystemResourceAsStream("DriverLicense.xml"), handler);
        System.out.println(handler.getDriversLicense().getFirstName());
        System.out.println(handler.getDriversLicense().getLastName());
        System.out.println(handler.getDriversLicense().getNumber());

    }
}
