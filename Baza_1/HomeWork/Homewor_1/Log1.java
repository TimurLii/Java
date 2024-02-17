package Baza_1.HomeWork.Homewor_1;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log1 {
    public static void main(String[] args) throws IOException {
        Logger log = Logger.getLogger(Log1.class.getName());
        FileHandler handler = new FileHandler("log123.txt", true);
        SimpleFormatter formatter = new SimpleFormatter();
        handler.setFormatter(formatter);
        log.addHandler(handler);
        log.info("Пример сообщения для логирования");
    }

    public static void kaKA(int num1, int num2) {

    }
}
