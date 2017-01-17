package com.apwglobal.vieschecker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckEUVatServiceTest {

    @Test
    public void testCheck() throws CheckEUVatException {
        CheckEUVatService service = new CheckEUVatService();
        CheckEUVatResponse response = service.check("LU 26375245");

        assertTrue(response.isValid());
        assertEquals(response.getName(), "AMAZON EUROPE CORE S.A R.L.");
    }

}
