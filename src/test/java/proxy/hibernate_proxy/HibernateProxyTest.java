package proxy.hibernate_proxy;

import org.testng.annotations.Test;

public class HibernateProxyTest {

  @Test
  public void givenPaymentReceipt_whenAccessingPayment_thenVerifyType() {
    PaymentReceipt paymentReceipt = entityManager.find(PaymentReceipt.class, 3L);
    Assert.assertTrue(paymentReceipt.getPayment() instanceof HibernateProxy);
  }
}
