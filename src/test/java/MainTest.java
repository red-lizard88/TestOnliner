import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testKatalogNaNalichieSekci() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\webDriver\\1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://catalog.onliner.by/");
        assertTrue(driver.findElement(By.xpath(
                "//span[contains(@class, 'catalog-navigation-classifier__item-title-wrapper') and contains(text(),'Электроника')]")).getText().contains("Электроника"));
        assertTrue(driver.findElement(By.xpath(
                "//span[contains(@class, 'catalog-navigation-classifier__item-title-wrapper') and contains(text(),'Компьютеры и')]")).getText().contains("Компьютеры и сети"));
        assertTrue(driver.findElement(By.xpath(
                "//span[contains(@class, 'catalog-navigation-classifier__item-title-wrapper') and contains(text(),'Бытовая техника')]")).getText().contains("Бытовая техника"));
        assertTrue(driver.findElement(By.xpath(
                "//span[contains(@class, 'catalog-navigation-classifier__item-title-wrapper') and contains(text(),'Стройка и')]")).getText().contains("Стройка и ремонт"));
        assertTrue(driver.findElement(By.xpath(
                "//span[contains(@class, 'catalog-navigation-classifier__item-title-wrapper') and contains(text(),'Дом и')]")).getText().contains("Дом и сад"));
        assertTrue(driver.findElement(By.xpath(
                "//span[contains(@class, 'catalog-navigation-classifier__item-title-wrapper') and contains(text(),'Авто и')]")).getText().contains("Авто и мото"));
        assertTrue(driver.findElement(By.xpath(
                "//span[contains(@class, 'catalog-navigation-classifier__item-title-wrapper') and contains(text(),'Красота и')]")).getText().contains("Красота и спорт"));
        assertTrue(driver.findElement(By.xpath(
                "//span[contains(@class, 'catalog-navigation-classifier__item-title-wrapper') and contains(text(),'Детям и')]")).getText().contains("Детям и мамам"));
        assertTrue(driver.findElement(By.xpath(
                "//span[contains(@class, 'catalog-navigation-classifier__item-title-wrapper') and contains(text(),'Работа и')]")).getText().contains("Работа и офис"));
        driver.quit();
    }

    @Test
    public void testKatalogKomputeriISeti() {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\webDriver\\1\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://catalog.onliner.by/");
        driver.findElement(By.xpath(
                "//span[contains(@class, 'catalog-navigation-classifier__item-title-wrapper') and contains(text(),'Компьютеры и')]")).click();

        assertTrue(driver.findElement(By.xpath(
                "//div[contains(@class, 'catalog-navigation-list__aside-title') and contains(text(),'Ноутбуки, компьютеры, мониторы')]")).getText().contains("Ноутбуки, компьютеры, мониторы"));
        assertTrue(driver.findElement(By.xpath(
                "//div[contains(@class, 'catalog-navigation-list__aside-title') and contains(text(),'Комплектующие')]")).getText().contains("Комплектующие"));
        assertTrue(driver.findElement(By.xpath(
                "//div[contains(@class, 'catalog-navigation-list__aside-title') and contains(text(),'Хранение данных')]")).getText().contains("Хранение данных"));
        assertTrue(driver.findElement(By.xpath(
                "//div[contains(@class, 'catalog-navigation-list__aside-title') and contains(text(),'Сетевое оборудование')]")).getText().contains("Сетевое оборудование"));
        driver.quit();

    }




}