package com.apwglobal.vieschecker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckEUVatServiceTest {

    @Test
    public void testCheck() throws CheckEUVatException {
        CheckEUVatService service = new CheckEUVatService();
        CheckEUVatResponse response = service.check("HU23359783");

        assertTrue(response.isValid());
        assertEquals(response.getName(), "BELLA-IDEA KORLÁTOLT FELELŐSSÉGŰ TÁRSASÁG");
    }

}
