package com.text;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GreatePartyTest {
    GreateParty party = new GreateParty();

    public GreatePartyTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {

    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void test30False() {
        assertFalse(party.greatParty(30, false));
    }

    @Test
    public void test50False() {
        assertTrue(party.greatParty(50, false));
    }
}
