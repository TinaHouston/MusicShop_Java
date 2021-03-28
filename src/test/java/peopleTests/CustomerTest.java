package peopleTests;

import intruments.Guitar;
import intruments.InstrumentType;
import intruments.Piano;
import miscItems.MusicBook;
import org.junit.Before;
import org.junit.Test;
import people.Customer;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer poorCustomer;
    Customer richCustomer;
    Guitar guitar;
    Piano piano;
    MusicBook musicBook;

    @Before
    public void before(){
        poorCustomer = new Customer("Tina", 100.00);
        richCustomer = new Customer("Abbie", 1000.00);
        guitar = new Guitar("Wood", "Brown", InstrumentType.STRING, 6);
        piano = new Piano("Wood", "Black", InstrumentType.GRAND_PIANO, 88);
        musicBook = new MusicBook("Piano Book");
    }

    @Test
    public void canGetName(){
        assertEquals("Tina", poorCustomer.getName());
    }

    @Test
    public void canGetWallet(){
        assertEquals(1000.00, richCustomer.getWallet(), 0.01);
    }

    @Test
    public void canGetPurchasedProductCount(){
        assertEquals(0, poorCustomer.getPurchasedCount());
    }

    @Test
    public void canAddProductToBasket(){
        poorCustomer.addPurchasedProduct(piano);
        poorCustomer.addPurchasedProduct(musicBook);
        assertEquals(2, poorCustomer.getPurchasedCount());
    }

    @Test
    public void canBuyProducts(){
        richCustomer.buyProduct(piano);
        richCustomer.buyProduct(musicBook);
        assertEquals(2, richCustomer.getPurchasedCount());
        assertEquals(538.00, richCustomer.getWallet(), 0.01);
    }

    @Test
    public void cantBuyProductIfNotEnoughMoney(){
        poorCustomer.buyProductIfEnoughMoney(piano);
        poorCustomer.buyProductIfEnoughMoney(piano);
        poorCustomer.buyProductIfEnoughMoney(piano);
        assertEquals(100.00, poorCustomer.getWallet(), 0.01);
    }
}
