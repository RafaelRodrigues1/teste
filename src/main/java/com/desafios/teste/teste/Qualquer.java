package com.desafios.teste.teste;

import com.desafios.teste.Execution;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
public class Qualquer {

    @Scheduled(fixedRate = 10000)
    public static void qualquer() throws InterruptedException, AWTException {
        Execution.exec();
    }
}
