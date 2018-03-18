package sda.orders.dao;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class CustomerDaoimplTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(CustomerDaoimpl.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @org.junit.Test
    public void findById() {
    }

    @org.junit.Test
    public void insert() {
    }

    @org.junit.Test
    public void update() {
    }

    @org.junit.Test
    public void delete() {
    }

    @Test
    public void findById1() {
    }

    @Test
    public void insert1() {
    }

    @Test
    public void update1() {
    }

    @Test
    public void delete1() {
    }
}
