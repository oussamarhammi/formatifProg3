package com.example.finaltests2;

import org.junit.Assert;
import org.junit.Test;

public class TestService {


    @Test
    public void testPasVraimentUnTest() {
        // exemple d'utilisation du code, .
        Service service = new Service();
        int poignees = service.nombrePoigneesDeMainPour(350);
        System.out.println(poignees);
        // TODO pour qu'un test soit valide, il faut qu'il puisse échouer
    }

    @Test
    public void TestNull() {
        // exemple d'utilisation du code, .
        Service service = new Service();
        int poignees = service.nombrePoigneesDeMainPour(0);

        Assert.assertEquals(poignees, 0);
        // TODO pour qu'un test soit valide, il faut qu'il puisse échouer
    }

    @Test
    public void Test1Personne() {
        // exemple d'utilisation du code, .
        Service service = new Service();
        int poignees = service.nombrePoigneesDeMainPour(2);

        Assert.assertEquals(poignees, 1);
        // TODO pour qu'un test soit valide, il faut qu'il puisse échouer
    }

    @Test
    public void Test4Personne() {
        // exemple d'utilisation du code, .
        Service service = new Service();
        int poignees = service.nombrePoigneesDeMainPour(4);

        Assert.assertEquals(poignees, 6);
        // TODO pour qu'un test soit valide, il faut qu'il puisse échouer
    }

    @Test(expected = Exception.class)
    public void TestPersonneNeg() {
        // exemple d'utilisation du code, .
        Service service = new Service();
        int poignees = service.nombrePoigneesDeMainPour(-4);
        Assert.fail("Exception non lancée");
        // TODO pour qu'un test soit valide, il faut qu'il puisse échouer
    }
}
