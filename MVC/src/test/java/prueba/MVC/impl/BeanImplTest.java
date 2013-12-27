package prueba.MVC.impl;

import junit.framework.TestCase;
import prueba.MVC.Bean;

public class BeanImplTest extends TestCase {

    public void testBeanIsABean() {
	Bean aBean = new BeanImpl();
        assertTrue(aBean.isABean());
    }

}