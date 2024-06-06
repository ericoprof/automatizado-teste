package com.example.demotest.casosdetestes;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TesteInicial {

    @Test
    public void pesquisarGoogle() throws InterruptedException {

        // Configuração do caminho do ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/drive/chromedriver-linux64/chromedriver");

        // Configuração das opções do Chrome
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-debugging-port=9014");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--start-maximized");
        options.addArguments("--start-always-on-top");

        // Inicialização do ChromeDriver
        WebDriver browser = new ChromeDriver(options);
        browser.get("https://www.google.com");

        browser.findElement(By.id("APjFqb")).click();
        browser.findElement(By.id("APjFqb"))
                .sendKeys("Morsmordre", Keys.ENTER);

        // browser.close();

    }
}
